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
import static weapon.taculation.dungeon.wpn_slctn;

/**
 *
 * @author samad
 */
public class room extends JFrame {
 JFrame roomf = new JFrame();
 private JLabel slct = new JLabel("Select Weapon");
 private JButton w_type1;
 private JButton w_type2;
 private JButton w_type3;
 private JButton w_type4;
 private JButton w_type5;
 private JButton quit = new JButton("Quit");

 private String s = "4.jpg"; ///////////////////////////////////////////////////////////////////////////////////////////////
 private ImageIcon i = new ImageIcon(s);
 private JLabel back = new JLabel(i);
 private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

 Font fontbutton;
 Font fonthead;

 room() {

  fonthead = new Font("Arial Rounded", Font.ITALIC, 20);
  fontbutton = new Font("Comic Sans MS", Font.ITALIC, 16);

  switch (wpn_slctn) {
   case "Assault Rifles":
    this.w_type5 = new JButton("AKS-74U");
    this.w_type4 = new JButton("M4 Caribine");
    this.w_type3 = new JButton("H&K G3");
    this.w_type2 = new JButton("M16A1");
    this.w_type1 = new JButton("AK 47");

    break;
   case "Revolver":
    this.w_type5 = new JButton("Ruger LCR");
    this.w_type4 = new JButton("S&W Schofield");
    this.w_type3 = new JButton("R.S RedHawk");
    this.w_type2 = new JButton("Webley Mk IV");
    this.w_type1 = new JButton("Renington 1858");

    break;
   case "Shotguns":
    this.w_type5 = new JButton("Browning auto 5");
    this.w_type4 = new JButton("Mossberg 500");
    this.w_type3 = new JButton("Bennelli M4");
    this.w_type2 = new JButton("Remington 870");
    this.w_type1 = new JButton("Siaga 12K");

    break;
   case "Machine Guns":
    this.w_type5 = new JButton("Maxim Gun");
    this.w_type4 = new JButton("Bren LMG");
    this.w_type3 = new JButton("MG42");
    this.w_type2 = new JButton("HK 1909");
    this.w_type1 = new JButton("MG34");

    break;
   case "Pistols":
    this.w_type5 = new JButton("Desert Eagle");
    this.w_type4 = new JButton("Bretta 92");
    this.w_type3 = new JButton("Lugar");
    this.w_type2 = new JButton("M1911");
    this.w_type1 = new JButton("Glock 19");

    break;
   default:
    throw new AssertionError();
  }



  roomf.setLayout(null);
  roomf.setExtendedState(JFrame.MAXIMIZED_BOTH);
  roomf.setSize(screenSize);
  roomf.setUndecorated(true); ////////////////////////////////////////////////////////////////////////////////////

  back.setBounds(0, 0, roomf.getWidth(), roomf.getHeight());
  slct.setBounds(550, 50, 200, 75);
  w_type1.setBounds(550, 100, 200, 55);
  w_type2.setBounds(550, 200, 200, 55);
  w_type3.setBounds(550, 300, 200, 55);
  w_type4.setBounds(550, 400, 200, 55);
  w_type5.setBounds(550, 500, 200, 55);
  quit.setBounds(roomf.getWidth() - 200, 0, 200, 55);
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


  roomf.add(slct);
  roomf.add(w_type1);
  roomf.add(w_type2);
  roomf.add(w_type3);
  roomf.add(w_type4);
  roomf.add(w_type5);
  roomf.add(quit);
  roomf.add(back);

  roomf.setDefaultCloseOperation(3);
  roomf.setVisible(true);
 }

 class eve_dgn_t_rm implements ActionListener {
  @Override
  public void actionPerformed(ActionEvent ae) {


   assault_rifles a;
   shotguns sh;
   machine_guns m;
   pistols p;
   revolvers s;




   String act = ae.getActionCommand();
   wpn_slctn = act;
   switch (act) {

    /*
    
       ASSAULT RIFLES
       */

    case "M4 Caribine":
     System.out.println(wpn_slctn);

     a = new assault_rifles();
//     roomf.dispose();
     break;
    case "H&K G3":
     System.out.println(wpn_slctn);

     a = new assault_rifles();
//     roomf.dispose();
     break;
    case "M16A1":
     System.out.println(wpn_slctn);

     a = new assault_rifles();
//     roomf.dispose();
     break;
    case "AK 47":
     System.out.println(wpn_slctn);

     a = new assault_rifles();
//     roomf.dispose();
     break;
    case "AKS-74U":
     System.out.println(wpn_slctn);

     a = new assault_rifles();
//     roomf.dispose();
     break;

     /*
      
     Revolver
     */

    case "Ruger LCR":
     System.out.println(wpn_slctn);
     s = new revolvers();
//     roomf.dispose();
     break;
    case "S&W Schofield":
     System.out.println(wpn_slctn);
     s = new revolvers();
//     roomf.dispose();
     break;
    case "R.S RedHawk":
     System.out.println(wpn_slctn);
     s = new revolvers();
//     roomf.dispose();
     break;
    case "Webley Mk IV":
     System.out.println(wpn_slctn);
     s = new revolvers();
//     roomf.dispose();
     break;
    case "Renington 1858":
     System.out.println(wpn_slctn);
     s = new revolvers();
//     roomf.dispose();
     break;



     /*

     SHOTGUNS
     */


    case "Browning auto 5":
     System.out.println(wpn_slctn);
     sh = new shotguns();
//     roomf.dispose();
     break;
    case "Mossberg 500":
     System.out.println(wpn_slctn);
     sh = new shotguns();
//     roomf.dispose();
     break;
    case "Bennelli M4":
     System.out.println(wpn_slctn);
     sh = new shotguns();
//     roomf.dispose();
     break;
    case "Remington 870":
     System.out.println(wpn_slctn);
     sh = new shotguns();
//     roomf.dispose();
     break;
    case "Siaga 12K":
     System.out.println(wpn_slctn);
     sh = new shotguns();
//     roomf.dispose();
     break;

     /*
     
     MACHINE GUNS
     */


    case "Maxim Gun":
     System.out.println(wpn_slctn);
     m = new machine_guns();
//     roomf.dispose();
     break;
    case "Bren LMG":
     System.out.println(wpn_slctn);
     m = new machine_guns();
//     roomf.dispose();
     break;
    case "MG42":
     System.out.println(wpn_slctn);
     m = new machine_guns();
//     roomf.dispose();
     break;
    case "HK 1909":
     System.out.println(wpn_slctn);
     m = new machine_guns();
//     roomf.dispose();
     break;
    case "MG34":
     System.out.println(wpn_slctn);
     m = new machine_guns();
//     roomf.dispose();
     break;

     /*

     PISTOLS
     */

    case "Desert Eagle":
     System.out.println(wpn_slctn);
     p = new pistols();
//     roomf.dispose();
     break;
    case "Bretta 92":
     System.out.println(wpn_slctn);
     p = new pistols();
//     roomf.dispose();
     break;
    case "Lugar":
     System.out.println(wpn_slctn);
     p = new pistols();
//     roomf.dispose();
     break;
    case "M1911":
     System.out.println(wpn_slctn);
     p = new pistols();
//     roomf.dispose();
     break;
    case "Glock 19":
     System.out.println(wpn_slctn);
     p = new pistols();
//     roomf.dispose();
     break;




    case "Quit":
     System.exit(0);
    default:
     break;
   }
  }
 }
}