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
public class pistols extends JFrame {
 JFrame wprofile = new JFrame();
 
 JLabel name;
 private JButton dsmbl = new JButton("Disassemble it!!!");
 private JButton quit = new JButton("Quit");


 String w;
 ImageIcon wpnimg;
 JLabel w_img_lbl;


 private String s = "3.jpg "; ///////////////////////////////////////////////////////////////////////////////////////////////
 private ImageIcon i = new ImageIcon(s);
 private JLabel back = new JLabel(i);
 private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();


 JLabel b1 = new JLabel("Type");
 JLabel b2 = new JLabel("Built by");
 JLabel b3 = new JLabel("Service History");
 JLabel b4 = new JLabel("Effective Range");
 JLabel b5 = new JLabel("Feed System");
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

 Font fontbutton;
 Font fonthead;
 Font fontinfo;




 pistols() {


  fonthead = new Font("Arial Rounded", Font.ITALIC, 20);
  fontbutton = new Font("Comic Sans MS", Font.ITALIC, 16);
  fontinfo = new Font("Serif", Font.BOLD, 18);



  wprofile.setLayout(null);
  wprofile.setExtendedState(JFrame.MAXIMIZED_BOTH);
  wprofile.setSize(screenSize);
  wprofile.setUndecorated(true); ////////////////////////////////////////////////////////////////////////////////////


  switch (wpn_slctn) {
   case "Glock 19":


    w = "glock.png";
    wpnimg = new ImageIcon(w);
    w_img_lbl = new JLabel(wpnimg);


    name = new JLabel(wpn_slctn);
    l1 = new JLabel("Machine pistol");
    l2 = new JLabel("Gaston Glock");
    l3 = new JLabel("1982–present");
    l4 = new JLabel("4.0 in");
    l5 = new JLabel("50 m (55 yd)");
    l6 = new JLabel("Box magazine");
    l7 = new JLabel("9mm OR .45 ACP");
    l8 = new JLabel("375 m/s (1,230 ft/s)");
    l9 = new JLabel("Short recoil");


    break;

   case "Desert Eagle":


    w = "desert eagle.png ";
    wpnimg = new ImageIcon(w);
    w_img_lbl = new JLabel(wpnimg);


    name = new JLabel(wpn_slctn);
    l1 = new JLabel("Semi-Automatic Pistol");
    l2 = new JLabel("Magnum Research");
    l3 = new JLabel("1982–present");
    l4 = new JLabel("200 m");
    l5 = new JLabel("Detachable stick magazine");
    l6 = new JLabel("10.6 in (269.2 mm)");
    l7 = new JLabel(".50 to .41 Magnum");
    l8 = new JLabel("470 m/s");
    l9 = new JLabel("Gas-operated, rotating bolt");


    break;

   case "Bretta 92":


    w = "bretta.png ";
    wpnimg = new ImageIcon(w);
    w_img_lbl = new JLabel(wpnimg);


    name = new JLabel(wpn_slctn);
    l1 = new JLabel("Semi-automatic pistol");
    l2 = new JLabel("Carlo Beretta");
    l3 = new JLabel("1975–present");
    l4 = new JLabel("50 m (160 ft)");
    l5 = new JLabel("Detachable box magazine");
    l6 = new JLabel("217 millimetres (8.5 in)");
    l7 = new JLabel("9×19mm Parabellum ");
    l8 = new JLabel("381 m/s (1,250 ft/s)");
    l9 = new JLabel("SA/DA");


    break;

   case "Lugar":


    w = "luger.png ";
    wpnimg = new ImageIcon(w);
    w_img_lbl = new JLabel(wpnimg);


    name = new JLabel(wpn_slctn);
    l1 = new JLabel("Semi-automatic pistol");
    l2 = new JLabel("1900–present");
    l3 = new JLabel("Georg J. Luger");
    l4 = new JLabel("50 m (55 yd)");
    l5 = new JLabel("8-round box magazine");
    l6 = new JLabel("222 mm (8.74 in)");
    l7 = new JLabel("7.65×21mm");
    l8 = new JLabel("350–400 m/s");
    l9 = new JLabel("Toggle-locked,");


    break;

   case "M1911":


    w = "m19.png ";
    wpnimg = new ImageIcon(w);
    w_img_lbl = new JLabel(wpnimg);


    name = new JLabel(wpn_slctn);
    l1 = new JLabel("Semi-automatic pistol");
    l2 = new JLabel("John Browning");
    l3 = new JLabel("1911–present");
    l4 = new JLabel("40 m (43 yd)");
    l5 = new JLabel("7 round box magazine");
    l6 = new JLabel("8.25 in (210 mm)");
    l7 = new JLabel(".45 ACP");
    l8 = new JLabel("830 ft/s (253 m/s)");
    l9 = new JLabel("Short recoil operation");



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
     case "Glock 19":
      System.out.println(wpn_slctn);


      //wprofile.dispose();
      l = new player("file:///glock.mp4");

      break;

     case "Desert Eagle":
      System.out.println(wpn_slctn);


      //wprofile.dispose();
      l = new player("file:///desert eagle.mp4");


      break;
     case "Bretta 92":
      System.out.println(wpn_slctn);


      //wprofile.dispose();
      l = new player("file:///bretta.mp4");

      
      break;
     case "Lugar":
      System.out.println(wpn_slctn);


      //wprofile.dispose();
      l = new player("file:///luger.mp4");


      break;
     case "M1911":
      System.out.println(wpn_slctn);


      //wprofile.dispose();
      l = new player("file:///m1911.mp4");

      break;


     default:
      throw new AssertionError();
    }
   } else if (act.equals("Quit")) {
    System.exit(0);
   }
  }
 }



 
}