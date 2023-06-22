package bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PinChange extends JFrame implements ActionListener {
    String pin_number;
    JTextField pin,repin;
    JButton change,back;
    PinChange(String pin_number){
        this.pin_number=pin_number;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2= i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);

        JLabel text = new JLabel("Change Your PIN");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        text.setBounds(250,280,500,35);
        image.add(text);

        JLabel pintext = new JLabel("New PIN");
        pintext.setForeground(Color.WHITE);
        pintext.setFont(new Font("System",Font.BOLD,16));
        pintext.setBounds(165,320,180,25);
        image.add(pintext);

        pin = new JTextField();
        pin.setFont(new Font("Raleway",Font.BOLD,25));
        pin.setBounds(330,320,180,25);
        image.add(pin);

        JLabel repintext = new JLabel("Re-Enter New PIN");
        repintext.setForeground(Color.WHITE);
        repintext.setFont(new Font("System",Font.BOLD,16));
        repintext.setBounds(165,360,180,25);
        image.add(repintext);

        repin = new JTextField();
        repin.setFont(new Font("Raleway",Font.BOLD,25));
        repin.setBounds(330,360,180,25);
        image.add(repin);

        change = new JButton("CHANGE");
        change.setBounds(355,460,150,30);
        image.add(change);
        change.addActionListener(this);

        back = new JButton("BACK");
        back.setBounds(355,495,150,30);
        image.add(back);
        back.addActionListener(this);

        setSize(900,900);
        setVisible(true);
        setTitle("PIN Change");
        setLocation(300,0);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new PinChange("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==change){
            try{
                String s_pin = pin.getText();
                String s_repin = repin.getText();
                if(!s_pin.equals(s_repin)){
                    JOptionPane.showMessageDialog(null,"Entered PIN does not match");
                    return;
                }
                if(s_pin.equals("")){
                    JOptionPane.showMessageDialog(null,"Please enter new PIN");
                    return;
                }
                if(s_repin.equals("")){
                    JOptionPane.showMessageDialog(null,"Please re-enter the new PIN");
                    return;
                }

                Conn c = new Conn();
                String query1 = "update bank set pin = '"+s_repin+"' where pin = '"+pin_number+"'";
                String query2 = "update login set pin = '"+s_repin+"' where pin = '"+pin_number+"'";
                String query3 = "update signupthree set pin = '"+s_repin+"' where pin = '"+pin_number+"'";

                c.s.executeUpdate(query1);
                c.s.executeUpdate(query2);
                c.s.executeUpdate(query3);

                JOptionPane.showMessageDialog(null,"Your PIN has been changed successfully");

                setVisible(false);
                new Transactions(s_repin).setVisible(true);
            }
            catch (Exception e1){
                System.out.println(e1);
            }
        }
        else{
            setVisible(false);
            new Transactions(pin_number).setVisible(true);
        }
    }
}
