// Project21ast100.java
// Janee Yeak
// 10 June 2021

// This program displays a variety of skins for the ever classic Chrome dinosaur. Now he can
// be Iron Man, Bugs Bunny, Darth Vader, Winnie the Pooh, Zero Suit Samus, and Barney the Dinosaur.
// There is also a birthday mode in which the dino dons a hat (taken from the
// 10th anniversary version of the chrome dino in which he was given a hat). 
// Other than that, he can do the classic run, jump, and die. 
// This Project only shows the different modes of my dinosaur. It does not actually run
// a dino game


package Project21astv100;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*; 


public class Project21astv100 
{
   public static void main(String[] args) {
      // Create the frame on the event dispatching thread.
      SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            new Project21astv100();
         }
      });
   }
   
   public Project21astv100() // Constructor.
   {
      JFrame jfrm = new JFrame("Change the Dino");
      jfrm.setSize(800, 600);
      jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
      jfrm.add(new Display());
      jfrm.setVisible(true);
   }

   
}
