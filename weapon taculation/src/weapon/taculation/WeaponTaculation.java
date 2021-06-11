/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weapon.taculation;
import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import uk.co.caprica.vlcj.binding.LibVlc;
import uk.co.caprica.vlcj.runtime.RuntimeUtil;


/**
 *
 * @author samad
 */
public class WeaponTaculation {

    public static void main(String[] args) throws InterruptedException {
//Enter you VLC installation path here
  NativeLibrary.addSearchPath(RuntimeUtil.getLibVlcLibraryName(), "D:/vlc/");
  Native.loadLibrary(RuntimeUtil.getLibVlcLibraryName(), LibVlc.class);

  try {

   UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");


  } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
  }

  
  
     System.out.println("Running");
        player l = new player("file:///intro.mp4");
     try {
         Thread.sleep(13_500);
     } catch (InterruptedException e) {  }
       
       player q  = new player("file:///background sound.mp3");
          q.f.setVisible(false);
        welc z = new welc();

 }
}

