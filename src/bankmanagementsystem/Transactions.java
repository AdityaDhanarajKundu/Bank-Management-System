package bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Transactions extends JFrame implements ActionListener {

    JButton deposit,withdrawl,fastcash,ministatement,pinchange,balance,exit;
    Transactions(){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2= i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);

        JLabel text = new JLabel("Please select your Transaction");
        text.setBounds(215,300,700,35);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);

        deposit = new JButton("Deposit");
        deposit.setBounds(170,415,150,30);
        image.add(deposit);
        deposit.addActionListener(this);

        withdrawl = new JButton("Cash Withdrawl");
        withdrawl.setBounds(355,415,150,30);
        image.add(withdrawl);
        withdrawl.addActionListener(this);

        fastcash = new JButton("Fast Cash");
        fastcash.setBounds(170, 450, 150, 30);
        image.add(fastcash);
        fastcash.addActionListener(this);

        ministatement = new JButton("Mini Statement");
        ministatement.setBounds(355, 450, 150, 30);
        image.add(ministatement);
        ministatement.addActionListener(this);

        pinchange = new JButton("PIN change");
        pinchange.setBounds(170, 485, 150, 30);
        image.add(pinchange);
        pinchange.addActionListener(this);

        balance = new JButton("Balance Enquiry");
        balance.setBounds(355, 485, 150, 30);
        image.add(balance);
        balance.addActionListener(this);

        exit = new JButton("Exit");
        exit.setBounds(355, 520, 150, 30);
        image.add(exit);
        exit.addActionListener(this);

        setSize(900,900);
        setLocation(300,0);
        setTitle("NEW ACCOUNT APPLICATION FORM- PAGE 3");
        setLayout(null);
//        setUndecorated(true);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Transactions();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==exit){
            System.exit(0);
        }
    }
}