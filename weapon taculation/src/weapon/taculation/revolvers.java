/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weapon.taculation;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static weapon.taculation.dungeon.wpn_slctn;

/**
 *
 * @author samad
 */
public class revolvers extends JFrame {
 JFrame wprofile = new JFrame();
 
 JLabel name;
 private JButton dsmbl = new JButton("Disassemble it!!!");
 private JButton quit = new JButton("Quit");


 String w;
 ImageIcon wpnimg;
 JLabel w_img_lbl;


 private String s = "4.jpg "; ///////////////////////////////////////////////////////////////////////////////////////////////
 private ImageIcon i = new ImageIcon(s);
 private JLabel back = new JLabel(i);
 private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();


 JLabel b1 = new JLabel("Type");
 JLabel b2 = new JLabel("Built by");
 JLabel b3 = new JLabel("Service History");
 JLabel b4 = new JLabel("Rate of fire");
 JLabel b5 = new JLabel("Weight");
 JLabel b6 = new JLabel("Length");
 JLabel b7 = new JLabel("Cartridge");
JLabel b8 = new JLabel("Muzzle velocity");
 JLabel b9 = new JLabel("Type of Action");

 JLabel l1;
 JLabel l2;
 JLabel l3;
 JLabel l4;
 JLabel l5;
 JLabel l6;
 JLabel l7;
 JLabel l8;
 JLabel l9;


 eve_dgn_t_rm e;
 mevent me;
 Font fontbutton;
 Font fonthead;
 Font fontinfo;




 revolvers() {


  fonthead = new Font("Arial Rounded", Font.ITALIC, 20);
  fontbutton = new Font("Comic Sans MS", Font.ITALIC, 16);
  fontinfo = new Font("Serif", Font.BOLD, 18);



  wprofile.setLayout(null);
  wprofile.setExtendedState(JFrame.MAXIMIZED_BOTH);
  wprofile.setSize(screenSize);
  wprofile.setUndecorated(true); ////////////////////////////////////////////////////////////////////////////////////


  switch (wpn_slctn) {
   case "Renington 1858":


    w = "C:/Users/samad/Desktop/weapon taculation/weapon img/Ak74.jpg";
    wpnimg = new ImageIcon(w);
    w_img_lbl = new JLabel(wpnimg);


    name = new JLabel(wpn_slctn);
    l1 = new JLabel("Assault rifle");
    l2 = new JLabel("Mikhail Kalashnikov");
    l3 = new JLabel("1974–present");
    l4 = new JLabel("100 rounds/min");
    l5 = new JLabel("2.7 kg (6.0 lb)");
    l6 = new JLabel("735 mm (28.9 in)");
    l7 = new JLabel("5.45×39mm");
    l8 = new JLabel("735 m/s (2,411 ft/s)");
    l9 = new JLabel("Gas-operated, rotating bolt");


    break;

   case "Ruger LCR":


    w = "C:/Users/samad/Desktop/weapon taculation/wallpapers/1.jpg ";
    wpnimg = new ImageIcon(w);
    w_img_lbl = new JLabel(wpnimg);


    name = new JLabel(wpn_slctn);
    l1 = new JLabel("1");
    l2 = new JLabel("1");
    l3 = new JLabel("1");
    l4 = new JLabel("1");
    l5 = new JLabel("1");
    l6 = new JLabel("1");
    l7 = new JLabel("1");
    l8 = new JLabel("1");
    l9 = new JLabel("1");


    break;

   case "S&W Schofield":


    w = "C:/Users/samad/Desktop/weapon taculation/wallpapers/1.jpg ";
    wpnimg = new ImageIcon(w);
    w_img_lbl = new JLabel(wpnimg);


    name = new JLabel(wpn_slctn);
    l1 = new JLabel("1");
    l2 = new JLabel("1");
    l3 = new JLabel("1");
    l4 = new JLabel("1");
    l5 = new JLabel("1");
    l6 = new JLabel("1");
    l7 = new JLabel("1");
    l8 = new JLabel("1");
    l9 = new JLabel("1");


    break;

   case "R.S RedHawk":


    w = "C:/Users/samad/Desktop/weapon taculation/wallpapers/1.jpg ";
    wpnimg = new ImageIcon(w);
    w_img_lbl = new JLabel(wpnimg);


    name = new JLabel(wpn_slctn);
    l1 = new JLabel("1");
    l2 = new JLabel("1");
    l3 = new JLabel("1");
    l4 = new JLabel("1");
    l5 = new JLabel("1");
    l6 = new JLabel("1");
    l7 = new JLabel("1");
    l8 = new JLabel("1");
    l9 = new JLabel("1");


    break;

   case "Webley Mk IV":


    w = "C:/Users/samad/Desktop/weapon taculation/wallpapers/1.jpg ";
    wpnimg = new ImageIcon(w);
    w_img_lbl = new JLabel(wpnimg);


    name = new JLabel(wpn_slctn);
    l1 = new JLabel("1");
    l2 = new JLabel("1");
    l3 = new JLabel("1");
    l4 = new JLabel("1");
    l5 = new JLabel("1");
    l6 = new JLabel("1");
    l7 = new JLabel("1");
    l8 = new JLabel("1");
    l9 = new JLabel("1");



    break;



   default:
    throw new AssertionError();
  }


  b1.setBounds(10, 225, 250, 50);
  b2.setBounds(10, 265, 250, 50);
  b3.setBounds(10, 305, 250, 50);
  b4.setBounds(10, 345, 250, 50);
  b5.setBounds(10, 385, 250, 50);
  b6.setBounds(10, 425, 250, 50);
  b7.setBounds(10, 465, 250, 50);
  b8.setBounds(10, 505, 250, 50);
  b9.setBounds(10, 545, 250, 50);
  l1.setBounds(200, 225, 250, 50);
  l2.setBounds(200, 265, 250, 50);
  l3.setBounds(200, 305, 250, 50);
  l4.setBounds(200, 345, 250, 50);
  l5.setBounds(200, 385, 250, 50);
  l6.setBounds(200, 425, 250, 50);
  l7.setBounds(200, 465, 250, 50);
  l8.setBounds(200, 505, 250, 50);
  l9.setBounds(200, 545, 250, 50);
  quit.setBounds(wprofile.getWidth() - 200, 0, 200, 55);
  back.setBounds(0, 0, wprofile.getWidth(), wprofile.getHeight());
  w_img_lbl.setBounds(10, 10, 550, 180);
  name.setBounds(10, 180, 200, 50);
  dsmbl.setBounds(10, wprofile.getHeight() - 85, 200, 55);


  e = new eve_dgn_t_rm();
  dsmbl.addActionListener(e);
  quit.addActionListener(e);
  me = new mevent();
  w_img_lbl.addMouseListener(me);

  l1.setFont(fontinfo);
  l2.setFont(fontinfo);
  l3.setFont(fontinfo);
  l4.setFont(fontinfo);
  l5.setFont(fontinfo);
  l6.setFont(fontinfo);
  l7.setFont(fontinfo);
  l8.setFont(fontinfo);
  l9.setFont(fontinfo);
  b1.setFont(fontinfo);
  b2.setFont(fontinfo);
  b3.setFont(fontinfo);
  b4.setFont(fontinfo);
  b5.setFont(fontinfo);
  b6.setFont(fontinfo);
  b7.setFont(fontinfo);
  b8.setFont(fontinfo);
  b9.setFont(fontinfo);
  name.setFont(fonthead);
  dsmbl.setFont(fontbutton);
  quit.setFont(fontbutton);
  l1.setForeground(Color.white);
  l2.setForeground(Color.white);
  l3.setForeground(Color.white);
  l4.setForeground(Color.white);
  l5.setForeground(Color.white);
  l6.setForeground(Color.white);
  l7.setForeground(Color.white);
  l8.setForeground(Color.white);
  l9.setForeground(Color.white);
  b1.setForeground(Color.white);
  b2.setForeground(Color.white);
  b3.setForeground(Color.white);
  b4.setForeground(Color.white);
  b5.setForeground(Color.white);
  b6.setForeground(Color.white);
  b7.setForeground(Color.white);
  b8.setForeground(Color.white);
  b9.setForeground(Color.white);
  name.setForeground(Color.WHITE);
  
  
  wprofile.add(b1);
  wprofile.add(b2);
  wprofile.add(b3);
  wprofile.add(b4);
  wprofile.add(b5);
  wprofile.add(b6);
  wprofile.add(b7);
  wprofile.add(b8);
  wprofile.add(b9);
  wprofile.add(l1);
  wprofile.add(l2);
  wprofile.add(l3);
  wprofile.add(l4);
  wprofile.add(l5);
  wprofile.add(l6);
  wprofile.add(l7);
  wprofile.add(l8);
  wprofile.add(l9);
  wprofile.add(name);
  wprofile.add(dsmbl);
  wprofile.add(quit);
  wprofile.add(w_img_lbl);
  wprofile.add(back);

  wprofile.setDefaultCloseOperation(3);
  wprofile.setVisible(true);




 }


 class eve_dgn_t_rm implements ActionListener {
  @Override
  public void actionPerformed(ActionEvent ae) {
   String act = ae.getActionCommand();
   if (act.equals("Disassemble it!!!")) {
    System.out.println("Disassemble it!!!");
    player l;

    switch (wpn_slctn) {
     case "Renington 1858":
      System.out.println(wpn_slctn);


      //wprofile.dispose();
      l = new player("file:///Remington 1858.mp4");


      break;

     case "Ruger LCR":
      System.out.println(wpn_slctn);


      //wprofile.dispose();
      l = new player("file:///Ruger LCR.mp4");


      break;
     case "S&W Schofield":
      System.out.println(wpn_slctn);


      //wprofile.dispose();
      l = new player("file:///SW Schofield.mp4");


      break;
     case "R.S RedHawk":
      System.out.println(wpn_slctn);


      //wprofile.dispose();
      l = new player("file:///RS Redhawk.mp4");


      break;
     case "Webley Mk IV":
      System.out.println(wpn_slctn);


      //wprofile.dispose();
      l = new player("file:///Webley Mk IV.mp4");

      break;


     default:
      throw new AssertionError();
    }
   } else if (act.equals("Quit")) {
    System.exit(0);
   }
  }
 }



 class mevent implements MouseListener {

  @Override
  public void mouseClicked(MouseEvent me) {}

  @Override
  public void mousePressed(MouseEvent me) {}

  @Override
  public void mouseReleased(MouseEvent me) {}

  @Override
  public void mouseEntered(MouseEvent me) {

   player l;

   switch (wpn_slctn) {
    case "Renington 1858":
     System.out.println(wpn_slctn);


     //wprofile.dispose();
//     l = new player("file:///C:/Users/samad/Desktop/weapon taculation/disassemble it/Assault rifle/AKS-74U.mp4");


     break;

    case "Ruger LCR":
     System.out.println(wpn_slctn);


     //wprofile.dispose();
//     l = new player("file:///C:/Users/samad/Desktop/weapon taculation/disassemble it/Assault rifle/M4 Carbine.mp4");


     break;
    case "S&W Schofield":
     System.out.println(wpn_slctn);


     //wprofile.dispose();
//     l = new player("file:///C:/Users/samad/Desktop/weapon taculation/disassemble it/Assault rifle/H&K G3A3.mp4");


     break;
    case "R.S RedHawk":
     System.out.println(wpn_slctn);


     //wprofile.dispose();
//     l = new player("file:///C:/Users/samad/Desktop/weapon taculation/disassemble it/Assault rifle/M16 A1.mp4");


     break;
    case "Webley Mk IV":
     System.out.println(wpn_slctn);


     //wprofile.dispose();
//     l = new player("file:///C:/Users/samad/Desktop/weapon taculation/disassemble it/Assault rifle/AK-47.mp4");

     break;


    default:
     throw new AssertionError();
   }

  }

  @Override
  public void mouseExited(MouseEvent me) {}

 }
}