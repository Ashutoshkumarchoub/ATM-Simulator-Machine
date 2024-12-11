
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener{
    long random;
    JTextField nameTextField, fnameTextField, mnameTextField, dobTextField, emailTextField, addressTextField, stateTextField, pinTextField;
    JButton next;
    JRadioButton male, female, other, married, unmarried, others;
    JDateChooser dateChooser;
    
    SignupOne(){
        
        setLayout(null);
        
        Random ran=new Random();
        random = Math.abs((ran.nextLong() % 9000L) + 1000L);
        
        JLabel formno=new JLabel("APPLICATION FORM NO. : "+random);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);
        
        JLabel personalDetails=new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personalDetails.setBounds(290, 80, 280, 30);
        add(personalDetails);
        
        JLabel name=new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);
        
        nameTextField= new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        nameTextField.setBounds(300, 140, 400, 30);
        add(nameTextField);
        
        JLabel fname=new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);
        
        fnameTextField= new JTextField();
        fnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        fnameTextField.setBounds(300, 190, 400, 30);
        add(fnameTextField);
        
        JLabel mname=new JLabel("Mother's Name:");
        mname.setFont(new Font("Raleway", Font.BOLD, 20));
        mname.setBounds(100, 240, 200, 30);
        add(mname);
        
        mnameTextField= new JTextField();
        mnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        mnameTextField.setBounds(300, 240, 400, 30);
        add(mnameTextField);
        
        JLabel dob=new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 290, 200, 30);
        add(dob);
        
        dateChooser=new JDateChooser();
        dateChooser.setBounds(300, 290, 400, 30);
        dateChooser.setForeground(Color.black);
        add(dateChooser);
        
        JLabel gender=new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 340, 200, 30);
        add(gender);
        
        male=new JRadioButton("Male");
        male.setBounds(300, 340, 60, 30);
        male.setBackground(Color.LIGHT_GRAY);
        add(male);
        
        female=new JRadioButton("Female");
        female.setBounds(450, 340, 120, 30);
        female.setBackground(Color.LIGHT_GRAY);
        add(female);
        
        other=new JRadioButton("Others");
        other.setBounds(630, 340, 120, 30);
        other.setBackground(Color.LIGHT_GRAY);
        add(other);
        
        ButtonGroup gendergroup=new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        gendergroup.add(other);
        
        JLabel email=new JLabel("Email Address:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 390, 200, 30);
        add(email);
        
        emailTextField= new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        emailTextField.setBounds(300, 390, 400, 30);
        add(emailTextField);
        
        JLabel marital=new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100, 440, 200, 30);
        add(marital);
        
        married=new JRadioButton("Married");
        married.setBounds(300, 440, 100, 30);
        married.setBackground(Color.LIGHT_GRAY);
        add(married);
        
        unmarried=new JRadioButton("Unmarried");
        unmarried.setBounds(450, 440, 100, 30);
        unmarried.setBackground(Color.LIGHT_GRAY);
        add(unmarried);
        
        others=new JRadioButton("Others");
        others.setBounds(630, 440, 100, 30);
        others.setBackground(Color.LIGHT_GRAY);
        add(others);
        
        ButtonGroup maritalgroup=new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(others);
        
        JLabel address=new JLabel("Address:");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 490, 200, 30);
        add(address);
        
        addressTextField= new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        addressTextField.setBounds(300, 490, 400, 30);
        add(addressTextField);
        
        JLabel state=new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 540, 200, 30);
        add(state);
        
        stateTextField= new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        stateTextField.setBounds(300, 540, 400, 30);
        add(stateTextField);
        
        JLabel pincode=new JLabel("Pin code:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);
        
        pinTextField= new JTextField();
        pinTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        pinTextField.setBounds(300, 590, 400, 30);
        add(pinTextField);
        
        next=new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80,30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.LIGHT_GRAY);
        
        setSize(850,800);
        setLocation(350,0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        String formno = ""+random; //long
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String mname = mnameTextField.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender = "Male";
        } else if(female.isSelected()){
            gender = "Female";
        } else if(other.isSelected()){
            gender = "Others";
        }
        String email = emailTextField.getText();
        String marital = null;
        if(married.isSelected()){
            marital = "Married";
        } else if(unmarried.isSelected()){
            marital = "Unmarried";
        } else if(others.isSelected()){
            marital = "Others";
        }
        String address = addressTextField.getText();
        String state = stateTextField.getText();
        String pin = pinTextField.getText();
        
        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is Required");
            } else {
                Conn c =new Conn();
                String query = "insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+mname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+state+"', '"+pin+"')";
                c.s.executeUpdate(query);
                
                setVisible(false);
                new SignupTwo(formno).setVisible(true);
                
            }
        } catch(Exception e){
            System.out.println(e);
        }
    }
    
    
    public static void main(String args[]) {
        new SignupOne();
    }
}
