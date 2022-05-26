package com.company;
import javax.swing.*;

import org.jfree.ui.RefineryUtilities;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import org.jfree.ui.RefineryUtilities;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import org.jfree.ui.RefineryUtilities;
import com.company.GUIRunner;
import defaultp.Main;



public class GUIRunner extends JInternalFrame implements ActionListener {
    JFrame bruh = new JFrame("Stream Study Group 2");
    WebscrapingSomeData data = new WebscrapingSomeData();
    boolean y=false;
    Main cheese = new Main();
    public GUIRunner() throws IOException {

        //sets up frame
        bruh.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bruh.getContentPane().setLayout(null);
        
        String y = data.WebscrapingSomeData();
        JTextArea textfield = new JTextArea();
        textfield.setFont(new Font("arial",Font.PLAIN,20));
        textfield.setText(y);
		textfield.setEditable(false);
		textfield.setBounds(350, 10, 1300, 550);
		bruh.getContentPane().add(textfield);
        //sets up panel
        
        //
      //putting up name and buttons
        JButton SvC=new JButton("Salinity vs Conductivity Statistics");  
        SvC.setBounds(50,100,300,50);  
        bruh.getContentPane().add(SvC);  
        SvC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	String y="";
				try {
					y = Main.calcs();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            	JFrame frame = new JFrame("Salinity vs Conductivity Statistics");
            	JTextArea text = new JTextArea();
                text.setFont(new Font("arial",Font.PLAIN,20));
                text.setText(y);
        		text.setEditable(false);
        		text.setBounds(350, 10, 1300, 550);
        		frame.getContentPane().add(text);

                frame.setSize(1200,1200);
                frame.setVisible(true);  
            }
        });
        JButton showData = new JButton("Data Acquired");
        showData.setBounds(50,200,300,50); 
        bruh.getContentPane().add(showData);
        showData.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	try {
					Main.Chort();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
        });
        bruh.setSize(2000,1200);
        bruh.setVisible(true);  
    }
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	public static void makeWork() {
		
		
	}
}
