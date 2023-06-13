
package bankmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;

public class SignupOne extends JFrame{
    
    JTextField nametext,fnametext,emailtext,citytext,pintext,addresstext;
    JComboBox drop;
    JDateChooser date;
    JRadioButton male,female,trans,single,married,divorced;
    ButtonGroup radiogroup,maritalgroup;
    JButton next;
    
    //create the constructor
    SignupOne(){
        //creating a random form number.
        Random ran = new Random();
        long random = Math.abs((ran.nextLong()%9000L)+1000L);
        
        String [] states ={"Andhra Pradesh","Arunachal Pradesh","Assam",
        "Bihar","Chattisgarh","Goa","Gujrat","Haryana","Himachal Pradesh",
        "Jharkhand","Karnataka","Kerala","Madhya Pradesh","Maharastra","Manipur",
        "Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan","Sikkim",
        "Tamil Nadu","Telengana","Tripura","Uttar Pradesh","Uttarakhand","West Bengal",
        "Andaman Nicobar","Chandigarh","Dadra Nagar Haveli","Daman Diu","Jammu Kashmir",
        "Ladakh","Lakshadeep","Delhi","Puducherry"};
        //Creating the labels.
        JLabel formno = new JLabel("Application Form No. "+random);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        JLabel personalDetails = new JLabel("Page 1 : Personal Details");
        personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        personalDetails.setBounds(290,80,400,30);
        add(personalDetails);
        
        JLabel name = new JLabel("Name :");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        nametext = new JTextField();
        nametext.setFont(new Font("Raleway",Font.BOLD,14));
        nametext.setBounds(300, 140, 400, 30);
        add(nametext);
        
        JLabel fname = new JLabel("Father's Name :");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        fnametext = new JTextField();
        fnametext.setFont(new Font("Raleway",Font.BOLD,14));
        fnametext.setBounds(300,190,400,30);
        add(fnametext);
        
        JLabel dob = new JLabel("Date of Birth :");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,150,30);
        add(dob);
        date = new JDateChooser();
        date.setFont(new Font("Raleway",Font.BOLD,14));
        date.setForeground(Color.BLACK);
        date.setBounds(300, 240, 400, 30);
        add(date);
        
        JLabel sex = new JLabel("Gender :");
        sex.setFont(new Font("Raleway",Font.BOLD,20));
        sex.setBounds(100,290,150,30);
        add(sex);
        male=new JRadioButton("Male");
        male.setBounds(300, 290, 70, 30);
        male.setBackground(Color.WHITE);
        add(male);
        female=new JRadioButton("Female");
        female.setBounds(400, 290, 70, 30);
        female.setBackground(Color.WHITE);
        add(female);
        trans=new JRadioButton("Transgender");
        trans.setBounds(500, 290, 100, 30);
        trans.setBackground(Color.WHITE);
        add(trans);
        radiogroup = new ButtonGroup();
        radiogroup.add(male);
        radiogroup.add(female);
        radiogroup.add(trans);
        
        JLabel email = new JLabel("Email :");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,340,150,30);
        add(email);
        emailtext = new JTextField();
        emailtext.setFont(new Font("Raleway",Font.BOLD,14));
        emailtext.setBounds(300, 340, 400, 30);
        add(emailtext);
        
        JLabel marital = new JLabel("Marital Status :");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,390,150,30);
        add(marital);
        single=new JRadioButton("Single");
        single.setBounds(300,390,100,30);
        single.setBackground(Color.WHITE);
        add(single);
        married=new JRadioButton("Married");
        married.setBounds(430, 390, 100, 30);
        married.setBackground(Color.WHITE);
        add(married);
        divorced=new JRadioButton("Divorced");
        divorced.setBounds(560, 390, 100, 30);
        divorced.setBackground(Color.WHITE);
        add(divorced);
        maritalgroup = new ButtonGroup();
        maritalgroup.add(single);
        maritalgroup.add(married);
        maritalgroup.add(divorced);
        
        JLabel address = new JLabel("Address :");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,150,30);
        add(address);
        addresstext = new JTextField();
        addresstext.setFont(new Font("Raleway",Font.BOLD,14));
        addresstext.setBounds(300, 440, 400, 30);
        add(addresstext);
        
        JLabel city = new JLabel("City :");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,150,30);
        add(city);
        citytext = new JTextField();
        citytext.setFont(new Font("Raleway",Font.BOLD,14));
        citytext.setBounds(300, 490, 400, 30);
        add(citytext);
        
        JLabel state = new JLabel("State :");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,150,30);
        add(state);
        drop = new JComboBox<>(states);
        drop.setFont(new Font("Raleway",Font.BOLD,14));
        drop.setBackground(Color.WHITE);
        drop.setForeground(Color.BLACK);
        drop.setBounds(300, 540, 400, 30);
        add(drop);
        
        JLabel pincode = new JLabel("PIN Code :");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,150,30);
        add(pincode);
        pintext = new JTextField();
        pintext.setFont(new Font("Raleway",Font.BOLD,14));
        pintext.setBounds(300, 590, 400, 30);
        add(pintext);
        
        //Adding Button
        next = new JButton("NEXT");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620, 660, 80, 30);
        add(next);
        
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setTitle("SignUp Form");
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String args[]){
        new SignupOne();
    }
}
