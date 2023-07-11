package com.fillUp;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;

import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class MyFrame extends JFrame implements ActionListener {

 // Components of the Form
 private Container c;
 private JLabel title;
 private JButton upload;
 private JTextArea tout;
 
 public MyFrame()
 {
     setTitle("Registration Form");
     setBounds(300, 90, 900, 600);
     setDefaultCloseOperation(EXIT_ON_CLOSE);
     setResizable(false);

     c = getContentPane();
     c.setLayout(null);

     title = new JLabel("Registration Form");
     title.setFont(new Font("Arial", Font.PLAIN, 30));
     title.setSize(300, 30);
     title.setLocation(100, 30);
     c.add(title);
    
     upload = new JButton("upload");
     upload.setFont(new Font("Arial", Font.PLAIN, 15));
     upload.setSize(200, 50);
     upload.setLocation(300, 150);
     upload.addActionListener(this);
     c.add(upload);

     setVisible(true);
 }

 public void actionPerformed(ActionEvent e)
 {
if (e.getSource() == upload) {

         FileSystemView fileSystemView = FileSystemView.getFileSystemView();
 		 //Icon icon = fileSystemView.getSystemIcon(new File("C://Windows"));
         Icon icon = fileSystemView.getSystemIcon(new File("C:\\Users\\NidPatel\\Desktop\\ABS_work\\Screenshot.png"), 512, 512);
         JFileChooser filechooser = new JFileChooser(fileSystemView);
         filechooser.setAcceptAllFileFilterUsed(false);
         filechooser.showOpenDialog(this);
         filechooser.add(new JLabel(icon));
         File selectedFile = filechooser.getSelectedFile();
         tout.setText(selectedFile.toString());
         //return selectedFile;
     }
 }
}