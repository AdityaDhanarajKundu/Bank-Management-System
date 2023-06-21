package bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {
    JButton hundred,five_h,thousand,two_t,five_t,ten_t,back;
    String pin_number;
    FastCash(String pin_number){
        this.pin_number = pin_number;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2= i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);

        JLabel text = new JLabel("Select your withdraw amount");
        text.setBounds(215,300,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);

        hundred = new JButton("Rs. 100");
        hundred.setBounds(170,415,150,30);
        hundred.setFont(new Font("Raleway",Font.BOLD,16));
        image.add(hundred);
        hundred.addActionListener(this);

        five_h = new JButton("Rs. 500");
        five_h.setBounds(355,415,150,30);
        image.add(five_h);
        five_h.setFont(new Font("Raleway",Font.BOLD,16));
        five_h.addActionListener(this);

        thousand = new JButton("Rs. 1000");
        thousand.setBounds(170, 450, 150, 30);
        image.add(thousand);
        thousand.setFont(new Font("Raleway",Font.BOLD,16));
        thousand.addActionListener(this);

        two_t = new JButton("Rs. 2000");
        two_t.setBounds(355, 450, 150, 30);
        image.add(two_t);
        two_t.setFont(new Font("Raleway",Font.BOLD,16));
        two_t.addActionListener(this);

        five_t = new JButton("Rs. 5000");
        five_t.setBounds(170, 485, 150, 30);
        image.add(five_t);
        five_t.setFont(new Font("Raleway",Font.BOLD,16));
        five_t.addActionListener(this);

        ten_t = new JButton("Rs. 10000");
        ten_t.setBounds(355, 485, 150, 30);
        image.add(ten_t);
        ten_t.setFont(new Font("Raleway",Font.BOLD,16));
        ten_t.addActionListener(this);

        back = new JButton("Back");
        back.setBounds(355, 520, 150, 30);
        back.setFont(new Font("Raleway",Font.BOLD,16));
        image.add(back);
        back.addActionListener(this);

        setSize(900,900);
        setLocation(300,0);
        setTitle("Main Transaction Frame");
        setLayout(null);
//        setUndecorated(true);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new FastCash("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==back){
            setVisible(false);
            new Transactions(pin_number).setVisible(true);
        } else {
            String amount = ((JButton)e.getSource()).getText().substring(4);
            Conn c = new Conn();

            try{
                ResultSet rs = c.s.executeQuery("select * from bank where Pin = '"+pin_number+"'");
                int balance=0;

                while(rs.next()){
                    if(rs.getString("type").equals("Deposit")){
                        balance+=Integer.parseInt(rs.getString("amount"));
                    }else{
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }

                if(e.getSource()!= back && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"Insufficient Balance");
                    setVisible(false);
                    new Transactions(pin_number).setVisible(true);
                    return;
                }

                Date date = new Date();
                String query = "insert into bank values ('"+pin_number+"','"+date+"','Withdrawl','"+amount+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Rs. "+amount+" is debited successfully");

                setVisible(false);
                new Transactions(pin_number).setVisible(true);
            }
            catch(Exception e1){
                System.out.println(e1);
            }
        }
    }
}
