package bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;

public class MiniStatement extends JFrame {
    String pin_number;
    MiniStatement(String pin_number){
        this.pin_number=pin_number;

        JLabel mini = new JLabel();
        mini.setBounds(20,140,400,200);
        add(mini);

        JLabel bank = new JLabel("Bank Of India");
        bank.setBounds(150,20,100,20);
        add(bank);

        JLabel card = new JLabel();
        card.setBounds(20,80,300,20);
        add(card);

        JLabel balance = new JLabel();
        balance.setBounds(30,460,300,20);
        add(balance);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from login where Pin = '"+pin_number+"'");

            while(rs.next()){
                card.setText("Card Number : "+rs.getString("CardNo").substring(0,4)+"XXXXXXXX"+rs.getString("CardNo").substring(12));
            }
        }
        catch(Exception e){
            System.out.println(e);
        }

        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from bank where Pin = '"+pin_number+"'");
            int bal=0;
            while(rs.next()){
                mini.setText(mini.getText()+"<html>"+rs.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("amount")+"<br><br><html>");
                if(rs.getString("type").equals("Deposit")){
                    bal+=Integer.parseInt(rs.getString("amount"));
                }else{
                    bal -= Integer.parseInt(rs.getString("amount"));
                }
            }
            // setting the JLabel to display the balance of your account
            balance.setText("Your account balance is Rs. "+ bal);
        }
        catch(Exception e){
            System.out.println(e);
        }

        setSize(400,600);
        setLocation(20,20);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setVisible(true);
        setTitle("Mini Statement");
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new MiniStatement("");
    }
}
