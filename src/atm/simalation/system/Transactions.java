package atm.simalation.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Transactions extends JFrame implements ActionListener{

    JLabel text;
    JButton deposit,withdrawl,fastcash,ministatement,pinchange,balanceenquiry,exit;
    String pin;
    Transactions(String pin){
        pin = this.pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 960, 1080);
        add(image);
        
        text = new JLabel("Please Select Your Transaction");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        
       
        deposit = new JButton("DEPOSIT");
        withdrawl = new JButton("CASH WITHDRAWL");
        fastcash = new JButton("FAST CASH");
        ministatement = new JButton("MINI STATEMENT");
        pinchange = new JButton("PIN CHANGE");
        balanceenquiry = new JButton("BALANCE ENQUIRY");
        exit = new JButton("EXIT");
        
        setLayout(null);
        
        text.setBounds(235,400,700,35);
        image.add(text);
        
        deposit.setBounds(170,499,150,35);
        image.add(deposit);
        
        withdrawl.setBounds(390,499,150,35);
        image.add(withdrawl);
        
        fastcash.setBounds(170,543,150,35);
        image.add(fastcash);
        
        ministatement.setBounds(390,543,150,35);
        image.add(ministatement);
        
        pinchange.setBounds(170,588,150,35);
        image.add(pinchange);
        
        balanceenquiry.setBounds(390,588,150,35);
        image.add(balanceenquiry);
        
        exit.setBounds(390,633,150,35);
        image.add(exit);
        
        
        deposit.addActionListener(this);
        withdrawl.addActionListener(this);
        fastcash.addActionListener(this);
        ministatement.addActionListener(this);
        pinchange.addActionListener(this);
        balanceenquiry.addActionListener(this);
        exit.addActionListener(this);
        
        
        setSize(960,1080);
        setLocation(500,0);
        setUndecorated(true);
        setVisible(true);
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
//        if(ae.getSource()==deposit){ 
//            setVisible(false);
//            new Deposit(pin).setVisible(true);
//        }else if(ae.getSource()==withdrawl){ 
//            setVisible(false);
//            new Withdrawl(pin).setVisible(true);
//        }else if(ae.getSource()==fastcash){ 
//            setVisible(false);
//            new FastCash(pin).setVisible(true);
//        }else if(ae.getSource()==ministatement){ 
//            new MiniStatement(pin).setVisible(true);
//        }else if(ae.getSource()==pinchange){ 
//            setVisible(false);
//            new Pin(pin).setVisible(true);
//        }else if(ae.getSource()==balanceenquiry){ 
//            this.setVisible(false);
//            new BalanceEnquiry(pin).setVisible(true);
//        }else 
if(ae.getSource()==exit){ 
            System.exit(0);
        }
    }
    
    public static void main(String[] args){
        new Transactions("").setVisible(true);
    }
}
