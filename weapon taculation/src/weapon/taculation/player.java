/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weapon.taculation;


import javax.swing.*;
import java.awt.*;

import com.sun.jna.Native;
import com.sun.jna.*;
import com.sun.jna.NativeLibrary;
import java.util.logging.Level;
import java.util.logging.Logger;
import uk.co.caprica.vlcj.binding.LibVlc;
import uk.co.caprica.vlcj.player.MediaPlayerFactory;
import uk.co.caprica.vlcj.player.embedded.EmbeddedMediaPlayer;
import uk.co.caprica.vlcj.player.embedded.windows.Win32FullScreenStrategy;
import uk.co.caprica.vlcj.runtime.RuntimeUtil;
import uk.co.caprica.vlcj.*;
import uk.co.caprica.vlcj.binding.internal.libvlc_media_t;
import uk.co.caprica.vlcj.player.MediaPlayer;
import uk.co.caprica.vlcj.player.MediaPlayerEventAdapter;
import uk.co.caprica.vlcj.player.MediaPlayerEventListener;

public class player {
     JFrame f = new JFrame();
  EmbeddedMediaPlayer emp;

  player(String path) {
  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//  f.setBounds(100, 100, 500, 500);
  f.setExtendedState(JFrame.MAXIMIZED_BOTH);
  f.setUndecorated(true);
  f.setVisible(true);
//  f.setAlwaysOnTop(true);
  /*

      BUILDING CANVAS
  */
  Canvas c = new Canvas();
  c.setBackground(Color.DARK_GRAY);
  JPanel p = new JPanel();
  p.setLayout(new BorderLayout());
  /*
      ADDING
  */
  p.add(c);
  f.add(p);

  MediaPlayerFactory mpf = new MediaPlayerFactory();
         emp = mpf.newEmbeddedMediaPlayer(new Win32FullScreenStrategy(f));
  emp.setVideoSurface(mpf.newVideoSurface(c));
  emp.toggleFullScreen();
     
emp.setVolume(100);
  emp.prepareMedia(path);
//  meve e = new meve();
//  emp.addMediaPlayerEventListener(e);
  emp.addMediaPlayerEventListener(new MediaPlayerEventAdapter() {
      
      @Override
        public void error(MediaPlayer mediaPlayer)
        {
            System.out.println("ERR in file loading");
        }
    @Override
    public void finished(MediaPlayer mediaPlayer) {
        System.out.println("Check finish");
        f.dispose();
//        System.exit(0);
    }
});
  
  emp.start();
  emp.pause();
 
  emp.play();
 









 }

class meve implements MediaPlayerEventListener{

          @Override
          public void mediaChanged(MediaPlayer mp, libvlc_media_t l, String string) {}

          @Override
          public void opening(MediaPlayer mp) {}

          @Override
          public void buffering(MediaPlayer mp, float f) {}

          @Override
          public void playing(MediaPlayer mp) {}

          @Override
          public void paused(MediaPlayer mp) {}

          @Override
          public void stopped(MediaPlayer mp) {}

          @Override
          public void forward(MediaPlayer mp) {}

          @Override
          public void backward(MediaPlayer mp) {}

          @Override
          public void finished(MediaPlayer mp) {
          System.out.println("Finished");
              f.dispose();
          
          
          
          }

          @Override
          public void timeChanged(MediaPlayer mp, long l) {}

          @Override
          public void positionChanged(MediaPlayer mp, float f) {}

          @Override
          public void seekableChanged(MediaPlayer mp, int i) {}

          @Override
          public void pausableChanged(MediaPlayer mp, int i) {}

          @Override
          public void titleChanged(MediaPlayer mp, int i) {}

          @Override
          public void snapshotTaken(MediaPlayer mp, String string) {}

          @Override
          public void lengthChanged(MediaPlayer mp, long l) {}

          @Override
          public void videoOutput(MediaPlayer mp, int i) {}

          @Override
          public void scrambledChanged(MediaPlayer mp, int i) {}

          @Override
          public void elementaryStreamAdded(MediaPlayer mp, int i, int i1) {}

          @Override
          public void elementaryStreamDeleted(MediaPlayer mp, int i, int i1) {}

          @Override
          public void elementaryStreamSelected(MediaPlayer mp, int i, int i1) {}

          @Override
          public void corked(MediaPlayer mp, boolean bln) {}

          @Override
          public void muted(MediaPlayer mp, boolean bln) {}

          @Override
          public void volumeChanged(MediaPlayer mp, float f) {}

          @Override
          public void audioDeviceChanged(MediaPlayer mp, String string) {}

          @Override
          public void chapterChanged(MediaPlayer mp, int i) {}

          @Override
          public void error(MediaPlayer mp) {}

          @Override
          public void mediaMetaChanged(MediaPlayer mp, int i) {}

          @Override
          public void mediaSubItemAdded(MediaPlayer mp, libvlc_media_t l) {}

          @Override
          public void mediaDurationChanged(MediaPlayer mp, long l) {}

          @Override
          public void mediaParsedChanged(MediaPlayer mp, int i) {}

          @Override
          public void mediaFreed(MediaPlayer mp) {}

          @Override
          public void mediaStateChanged(MediaPlayer mp, int i) {}

          @Override
          public void mediaSubItemTreeAdded(MediaPlayer mp, libvlc_media_t l) {}

          @Override
          public void newMedia(MediaPlayer mp) {}

          @Override
          public void subItemPlayed(MediaPlayer mp, int i) {}

          @Override
          public void subItemFinished(MediaPlayer mp, int i) {}

          @Override
          public void endOfSubItems(MediaPlayer mp) {}
    
}}