/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weapon.taculation;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author samad
 */
public class welc extends JFrame {
 JFrame welcome = new JFrame();
  private JPanel p = new JPanel();
  private Canvas c = new Canvas();
 private JButton enter = new JButton("Enter in the Dungeon"); ////////////////////////////////////
 private JButton quit = new JButton("Quit"); ///////////////////////////////////////////////
 private String s = "2.jpg"; ///////////////////////////////////////////////////////////////////////////////////////////////
 private ImageIcon i = new ImageIcon(s);
 private JLabel back = new JLabel(i);
 private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
Font fontbutton;


 welc() {
  /*
  SET INTRO VIDEO///playVideo(PATH, welcome , p,c);
  */
  
  fontbutton = new Font("Comic Sans MS", Font.ITALIC, 16);
  
  welcome.setLayout(null);
  welcome.setExtendedState(JFrame.MAXIMIZED_BOTH);
  welcome.setSize(screenSize);
  welcome.setUndecorated(true);////////////////////////////////////////////////////////

  back.setBounds(0, 0, welcome.getWidth(), welcome.getHeight());
  
  enter.setBounds(550, 250, 200, 55);
  quit.setBounds(550, 350, 200, 55);

  eve e = new eve();
  enter.addActionListener(e);
  quit.addActionListener(e);

  
  enter.setFont(fontbutton);
  quit.setFont(fontbutton);
  

  welcome.add(enter);
  welcome.add(quit);
  welcome.add(back);


  welcome.setDefaultCloseOperation(3);
  welcome.setVisible(true);
 
 }
 

 class eve implements ActionListener {
  @Override
  public void actionPerformed(ActionEvent ae) {
   String act = ae.getActionCommand();
   if (act.equals("Enter in the Dungeon")) {
       dungeon cl = new dungeon();
    System.out.println("entering");
//    welcome.dispose();
   } else if (act.equals("Quit")) {
    System.exit(0);
   }
  }
 }
}