package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transactions extends JFrame implements ActionListener{
    
    JButton deposit, withdrawl, ministatement, pinchange, fastcash, balanceenquiry, exit;
    String pinnumber;
    Transactions(String pinnumber){
        this.pinnumber = pinnumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atmmachine.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 700);
        add(image);
        
        
        JLabel text = new JLabel("Please select your Transaction");
        text.setBounds(215, 210, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        image.add(text);
        
        deposit = new JButton("Deposit");
        deposit.setBounds(170, 320, 150, 25);
        deposit.addActionListener(this);
        image.add(deposit);
        
        withdrawl = new JButton("Cash Withdrawl");
        withdrawl.setBounds(355, 320, 150, 25);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        fastcash = new JButton("Fast Cash");
        fastcash.setBounds(170, 353, 150, 25);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
        ministatement = new JButton("Mini Statement");
        ministatement.setBounds(355, 353, 150, 25);
        ministatement.addActionListener(this);
        image.add(ministatement);
        
        pinchange = new JButton("Pin Change");
        pinchange.setBounds(170, 384, 150, 25);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
        balanceenquiry = new JButton("Balance Enquiry");
        balanceenquiry.setBounds(355, 384, 150, 25);
        balanceenquiry.addActionListener(this);
        image.add(balanceenquiry);
        
        exit = new JButton("Exit");
        exit.setBounds(355, 415, 150, 25);
        exit.addActionListener(this);
        image.add(exit);
        
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == exit){
            System.exit(0);
        } else if (ae.getSource() == deposit){
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        } else if(ae.getSource() == withdrawl){
            setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
        } else if(ae.getSource() == fastcash){
            setVisible(false);
            new FastCash(pinnumber).setVisible(true);
        } else if(ae.getSource() == pinchange){
            setVisible(false);
            new PinChange(pinnumber).setVisible(true);
        } else if(ae.getSource() == balanceenquiry){
            setVisible(false);
            new BalanceEnquiry(pinnumber).setVisible(true);
        } else if (ae.getSource() == ministatement){
            new MiniStatement(pinnumber).setVisible(true);
        }
    }

    public static void main(String args[]) {
        new Transactions("");
        
    }
}
