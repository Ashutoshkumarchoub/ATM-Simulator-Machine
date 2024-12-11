package bank.management.system;
//to import all swing function
import javax.swing.*;
//import awt package
import java.awt.*;
//to import actionlistner(to perform button action)
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    
    JButton login, signup, clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
    
    
    Login(){
        //set the title of the frame
        setTitle("AUTOMATED TELLER MACHINE(CHOUBEY)");
        setLayout(null);
        //to set the image icon in frame
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logoatm.jpg"));
        Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label=new JLabel(i3);
        //set image location
        label.setBounds(70,10,100,100);
        add(label);
        
        JLabel text=new JLabel("Welcome to ATM(CGU)");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(200, 40, 480, 40);
        add(text);
        
        JLabel cardno=new JLabel("Card No:");
        cardno.setFont(new Font("Raleway",Font.BOLD,28));
        cardno.setBounds(120, 150, 150, 30);
        add(cardno);
        
        cardTextField=new JTextField();
        cardTextField.setBounds(300, 150, 230, 30);
        cardTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(cardTextField);
        
        JLabel pin=new JLabel("PIN:");
        pin.setFont(new Font("Raleway",Font.BOLD,28));
        pin.setBounds(120, 220, 250, 30);
        add(pin);
        
        pinTextField=new JPasswordField();
        pinTextField.setBounds(300, 220, 230, 30);
        pinTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(pinTextField);
        
        //add button
        login=new JButton("SIGN IN");
        login.setBounds(300, 300, 100, 30);
        login.addActionListener(this);
        add(login);
        
        clear=new JButton("CLEAR");
        clear.setBounds(430, 300, 100, 30);
        clear.addActionListener(this);
        add(clear);
        
        signup=new JButton("SIGN UP");
        signup.setBounds(300, 350, 230, 30);
        signup.addActionListener(this);
        add(signup);
        
        getContentPane().setBackground(Color.LIGHT_GRAY);
        //to make frame
        setSize(800,480);
        //to make frame visible
        setVisible(true);
        //to set the location of frame
        setLocation(350,200);
    }
    
    //perform action inside button
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == clear){
            cardTextField.setText("");
            pinTextField.setText("");
        } else if (ae.getSource() == login){
            Conn conn = new Conn();
            String cardnumber = cardTextField.getText();
            String pinnumber = pinTextField.getText();
            String query = "select * from login where cardnumber = '"+cardnumber+"' and pin = '"+pinnumber+"'";
            try{
                ResultSet rs = conn.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                } else{
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or Pin");
                }
            } catch (Exception e){
                System.out.println(e);
            }
        } else if (ae.getSource() == signup){
            setVisible(false);
            new SignupOne().setVisible(true);
        }
    }

    public static void main(String args[]) {
        new Login();
    }
}
