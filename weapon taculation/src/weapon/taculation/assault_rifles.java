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





public class assault_rifles extends JFrame {
 JFrame wprofile = new JFrame();
 
  JLabel name;
  private JButton dsmbl = new JButton("Disassemble it!!!"); 
 private JButton quit = new JButton("Quit");

 
 String w; 
ImageIcon wpnimg;
JLabel w_img_lbl;
  
 
 private String s = "1.jpg "; ///////////////////////////////////////////////////////////////////////////////////////////////
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
 
  Font fontbutton;
     Font fonthead;   
     Font fontinfo;   
  
  
  
  
 assault_rifles() {

     fonthead = new Font("Arial Rounded", Font.ITALIC, 20);
     fontbutton = new Font("Comic Sans MS", Font.ITALIC, 16);
     fontinfo = new Font("Serif", Font.BOLD, 18);
     
     

  wprofile.setLayout(null);
  wprofile.setExtendedState(JFrame.MAXIMIZED_BOTH);
  wprofile.setSize(screenSize);
  wprofile.setUndecorated(true); ////////////////////////////////////////////////////////////////////////////////////
     
  
  switch (wpn_slctn) {
        case "AKS-74U":
    
  
     w = "ak74.png";
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
        
        case "M4 Caribine":
    
  
     w = "m4 caribine.png";
     wpnimg = new ImageIcon(w);
     w_img_lbl = new JLabel(wpnimg);
     
     
     name = new JLabel(wpn_slctn);
     l1 = new JLabel("Asssault Carbine");
     l2 = new JLabel("Jim Sullivan");
     l3 = new JLabel("1994–present");
     l4 = new JLabel("700–950 round/min");
     l5 = new JLabel("7.49 lb (3.40 kg)");
     l6 = new JLabel("33 in (840 mm)");
     l7 = new JLabel("5.56×45mm");
     l8 = new JLabel("2,970 ft/s (910 m/s)");
     l9 = new JLabel("Direct impingement");
  
  
             break;
        
        case "H&K G3":
    
  
     w = "G3.png";
     wpnimg = new ImageIcon(w);
     w_img_lbl = new JLabel(wpnimg);
     
     
     name = new JLabel(wpn_slctn);
     l1 = new JLabel("Assault Battle rifle");
     l2 = new JLabel("Heckler & Koch");
     l3 = new JLabel("1959–present");
     l4 = new JLabel("500–600 rounds/min");
     l5 = new JLabel("3.1 kg (6.8 lb)");
     l6 = new JLabel("625 mm (24.6 in)");
     l7 = new JLabel("7.62×51mm");
     l8 = new JLabel("800 m/s (2,625 ft/s");
     l9 = new JLabel("Roller-delayed blowback");
  
  
             break;
        
        case "M16A1":
    
  
     w = "m16a1.png";
     wpnimg = new ImageIcon(w);
     w_img_lbl = new JLabel(wpnimg);
     
     
     name = new JLabel(wpn_slctn);
     l1 = new JLabel("Assault rifle");
     l2 = new JLabel("Eugene Stoner");
     l3 = new JLabel("1964–present");
     l4 = new JLabel("700–950 rounds/min");
     l5 = new JLabel("7.5 lb (3.40 kg)");
     l6 = new JLabel("39.5 in (1,003 mm)");
     l7 = new JLabel("5.56×45mm");
     l8 = new JLabel("3,150 ft/s");
     l9 = new JLabel("direct impingement");
  
  
             break;
        
        case "AK 47":
    
  
     w = "ak47.png";
     wpnimg = new ImageIcon(w);
     w_img_lbl = new JLabel(wpnimg);
     
     
     name = new JLabel(wpn_slctn);
     l1 = new JLabel("Assault rifle");
     l2 = new JLabel("Mikhail Kalashnikov");
     l3 = new JLabel("1949–present");
     l4 = new JLabel("600 rds/min");
     l5 = new JLabel("3.47 kg (7.7 lb)");
     l6 = new JLabel("880 mm (35 in)");
     l7 = new JLabel("7.62×39mm");
     l8 = new JLabel("715 m/s (2,350 ft/s)");
     l9 = new JLabel("Gas-operated, rotating bolt");
  
     
  
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
        case "AKS-74U":
            System.out.println(wpn_slctn);
  

     //wprofile.dispose();
    l = new player("file:///AKS-74U.mp4");
     
  
   
             break;
             
             case "M4 Caribine":
            System.out.println(wpn_slctn);
  

     //wprofile.dispose();
    l = new player("file:///M4 Carbine.mp4");
     
   
             break;
             
             case "H&K G3":
            System.out.println(wpn_slctn);
  

     //wprofile.dispose();
    l = new player("file:///H&K G3A3.mp4");
     
    
             break;
             
             case "M16A1":
            System.out.println(wpn_slctn);
  

     //wprofile.dispose();
    l = new player("file:///M16 A1.mp4");
     
    
             break;
             
             case "AK 47":
            System.out.println(wpn_slctn);
  

     //wprofile.dispose();
    l = new player("file:///AK-47.mp4");
     
    break;
             
             
        default:
            throw new AssertionError();
     }
   } 
   
   
   else if (act.equals("Quit")) {
    System.exit(0);
   }
  }
 }

 
        
}
