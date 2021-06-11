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
public class shotguns extends JFrame {
 JFrame wprofile = new JFrame();
 JLabel name;
 private JButton dsmbl = new JButton("Disassemble it!!!");
 private JButton quit = new JButton("Quit");


 String w;
 ImageIcon wpnimg;
 JLabel w_img_lbl;


 private String s = "6.jpg "; ///////////////////////////////////////////////////////////////////////////////////////////////
 private ImageIcon i = new ImageIcon(s);
 private JLabel back = new JLabel(i);
 private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();



 JLabel b1 = new JLabel("Type");
 JLabel b2 = new JLabel("Built by");
 JLabel b3 = new JLabel("Service History");
 JLabel b4 = new JLabel("Feed System");
 JLabel b5 = new JLabel("Weight");
 JLabel b6 = new JLabel("Length");
 JLabel b7 = new JLabel("Caliber");
 JLabel b8 = new JLabel("Barrel");
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




 shotguns() {


  fonthead = new Font("Arial Rounded", Font.ITALIC, 20);
  fontbutton = new Font("Comic Sans MS", Font.ITALIC, 16);
  fontinfo = new Font("Serif", Font.BOLD, 18);



  wprofile.setLayout(null);
  wprofile.setExtendedState(JFrame.MAXIMIZED_BOTH);
  wprofile.setSize(screenSize);
  wprofile.setUndecorated(true); ////////////////////////////////////////////////////////////////////////////////////



  switch (wpn_slctn) {
   case "Siaga 12K":


    w = "siaga.png";
    wpnimg = new ImageIcon(w);
    w_img_lbl = new JLabel(wpnimg);


    name = new JLabel(wpn_slctn);
    l1 = new JLabel("Shotgun");
    l2 = new JLabel("izhmash Kalashnikov");
    l3 = new JLabel("1997–present");
    l4 = new JLabel("Magzine and Drum");
    l5 = new JLabel("3.6 kg (7.9 lb)");
    l6 = new JLabel("1,145 mm (45.1 in)");
    l7 = new JLabel("12-gauge");
    l8 = new JLabel("580 mm (22.8 in)");
    l9 = new JLabel("Gas-operated, rotating bolt");


    break;

   case "Browning auto 5":


    w = "browning.png";
    wpnimg = new ImageIcon(w);
    w_img_lbl = new JLabel(wpnimg);


    name = new JLabel(wpn_slctn);
    l1 = new JLabel("Semi-automatic shotgun");
    l2 = new JLabel("John Browning");
    l3 = new JLabel("1905–1975");
    l4 = new JLabel("round tubular magazine");
    l5 = new JLabel("4.1 kilograms (9.0 lb)");
    l6 = new JLabel("127 centimetres (50 in)");
    l7 = new JLabel("12 gauge");
    l8 = new JLabel("71.1 centimetres (28.0 in)");
    l9 = new JLabel("Semi-automatic");


    break;

   case "Mossberg 500":


    w = "mosberg.png ";
    wpnimg = new ImageIcon(w);
    w_img_lbl = new JLabel(wpnimg);


    name = new JLabel(wpn_slctn);
    l1 = new JLabel("Shotgun");
    l2 = new JLabel("Oscar Frederick Mossberg");
    l3 = new JLabel("1960–present");
    l4 = new JLabel("internal tube magazine");
    l5 = new JLabel("5.25 lb (2.38 kg)");
    l6 = new JLabel("30 in (76 cm)");
    l7 = new JLabel("12 gauge");
    l8 = new JLabel("14 in (36 cm)");
    l9 = new JLabel("pump action");


    break;

   case "Bennelli M4":


    w = "benilim4.png";
    wpnimg = new ImageIcon(w);
    w_img_lbl = new JLabel(wpnimg);


    name = new JLabel(wpn_slctn);
    l1 = new JLabel("Combat shotgun");
    l2 = new JLabel("Benelli Armi SPA");
    l3 = new JLabel("1999–present");
    l4 = new JLabel("internal tube magazine");
    l5 = new JLabel("3.82 kg (8.42 lb)");
    l6 = new JLabel("885 mm (34.8 in)");
    l7 = new JLabel("12 gauge");
    l8 = new JLabel("470 mm (18.5 in");
    l9 = new JLabel("Gas-operated, rotating bolt");


    break;

   case "Remington 870":


    w = "remington.png";
    wpnimg = new ImageIcon(w);
    w_img_lbl = new JLabel(wpnimg);


    name = new JLabel(wpn_slctn);
    l1 = new JLabel("Shotgun");
    l2 = new JLabel("L.Ray Crittendon");
    l3 = new JLabel("1950–present");
    l4 = new JLabel("round tube magazine");
    l5 = new JLabel("7.0 lb (3.2 kg)");
    l6 = new JLabel("37.25 in (946 mm)");
    l7 = new JLabel("12 gauge");
    l8 = new JLabel("14 in (360 mm)");
    l9 = new JLabel("Pump-action");



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
     case "Siaga 12K":
      System.out.println(wpn_slctn);


      //wprofile.dispose();
      l = new player("file:///Shotgun/Siaga.mp4");

      break;

     case "Browning auto 5":
      System.out.println(wpn_slctn);


      //wprofile.dispose();
      l = new player("file:///Browning.mp4");


      break;
     case "Mossberg 500":
      System.out.println(wpn_slctn);


      //wprofile.dispose();
      l = new player("file:///Mossberg 500.mp4");


      break;
     case "Bennelli M4":
      System.out.println(wpn_slctn);


      //wprofile.dispose();
      l = new player("file:///Benelli M4.mp4");


      break;
     case "Remington 870":
      System.out.println(wpn_slctn);


      //wprofile.dispose();
      l = new player("file:///Remington.mp4");

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