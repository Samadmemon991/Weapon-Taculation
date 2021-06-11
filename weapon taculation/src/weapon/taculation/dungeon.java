/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weapon.taculation;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author samad
 */
public class dungeon extends JFrame {
 public static String wpn_slctn = null;
 JFrame dungeonf = new JFrame();

 private JLabel slct = new JLabel("Select Weapon Type");
 private JButton w_type1 = new JButton("Assault Rifles");
 private JButton w_type2 = new JButton("Revolver");
 private JButton w_type3 = new JButton("Shotguns");
 private JButton w_type4 = new JButton("Machine Guns");
 private JButton w_type5 = new JButton("Pistols");
 private JButton quit = new JButton("Quit");

 private String s = "5.jpg"; ///////////////////////////////////////////////////////////////////////////////////////////////
 private ImageIcon i = new ImageIcon(s);
 private JLabel back = new JLabel(i);
 private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();


 Font fontbutton;
 Font fonthead;


 dungeon() {
  fonthead = new Font("Arial Rounded", Font.ITALIC, 20);
  fontbutton = new Font("Comic Sans MS", Font.ITALIC, 16);


  dungeonf.setLayout(null);
  dungeonf.setExtendedState(JFrame.MAXIMIZED_BOTH);
  dungeonf.setSize(screenSize);
  dungeonf.setUndecorated(true); ////////////////////////////////////////////////////////////////////////////////////

  back.setBounds(0, 0, dungeonf.getWidth(), dungeonf.getHeight());
  slct.setBounds(550, 50, 200, 75);
  w_type1.setBounds(550, 100, 200, 55);
  w_type2.setBounds(550, 200, 200, 55);
  w_type3.setBounds(550, 300, 200, 55);
  w_type4.setBounds(550, 400, 200, 55);
  w_type5.setBounds(550, 500, 200, 55);
  quit.setBounds(dungeonf.getWidth() - 200, 0, 200, 55);
  eve_dgn_t_rm e = new eve_dgn_t_rm();
  w_type1.addActionListener(e);
  w_type2.addActionListener(e);
  w_type3.addActionListener(e);
  w_type4.addActionListener(e);
  w_type5.addActionListener(e);
  quit.addActionListener(e);


  slct.setFont(fonthead);
  w_type1.setFont(fontbutton);
  w_type2.setFont(fontbutton);
  w_type3.setFont(fontbutton);
  w_type4.setFont(fontbutton);
  w_type5.setFont(fontbutton);
  quit.setFont(fontbutton);


  dungeonf.add(slct);
  dungeonf.add(w_type1);
  dungeonf.add(w_type2);
  dungeonf.add(w_type3);
  dungeonf.add(w_type4);
  dungeonf.add(w_type5);
  dungeonf.add(quit);
  dungeonf.add(back);

  dungeonf.setDefaultCloseOperation(3);
  dungeonf.setVisible(true);
 }

 class eve_dgn_t_rm implements ActionListener {
  @Override
  public void actionPerformed(ActionEvent ae) {
   String act = ae.getActionCommand();
   switch (act) {
    case "Assault Rifles":
     System.out.println("Assault Rifles");
     wpn_slctn = "Assault Rifles";
     room a = new room();
//     dungeonf.dispose();
     break;
    case "Revolver":
     System.out.println("Revolver");
     wpn_slctn = "Revolver";
     room s = new room();
//     dungeonf.dispose();
     break;
    case "Shotguns":
     System.out.println("Shotguns");
     wpn_slctn = "Shotguns";
     room sh = new room();
//     dungeonf.dispose();
     break;
    case "Machine Guns":
     System.out.println("Machine Guns");
     wpn_slctn = "Machine Guns";
     room m = new room();
//     dungeonf.dispose();
     break;
    case "Pistols":
     System.out.println("Pistols");
     wpn_slctn = "Pistols";
     room p = new room();
//     dungeonf.dispose();
     break;
    case "Quit":
     System.exit(0);
    default:
     break;
   }
  }
 }


}