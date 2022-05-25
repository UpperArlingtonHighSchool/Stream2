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
    boolean y=false;
    Main cheese = new Main();
    public GUIRunner() {

        //sets up frame
        
        bruh.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bruh.getContentPane().setLayout(null);
        
       
        //sets up panel
        
        //
      //putting up name and buttons
        JButton SvC=new JButton("Salinity vs Conductivity");  
        //JButton SvC = new JButton("Salinity vs Conductivity");
        SvC.setBounds(50,100,200,50);  
        bruh.getContentPane().add(SvC);  
        SvC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	Main.Chort();
            }
        });
        JButton showData = new JButton("Data Acquired");
        showData.setBounds(50,100,200,50); 
        //bruh.getContentPane().add(showData);
        showData.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        bruh.setSize(840,460);
        bruh.setVisible(true);  
    }
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	public static void makeWork() {
		
		
	}
}
