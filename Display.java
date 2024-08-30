// Display.java
// This is for my Project21astv100.java 
// Janee Yeak
// 10 June 2021

package Project21astv100;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.event.*; 

public class Display extends JPanel implements ActionListener
{   

   int state = 0;
   JButton b1;
   JButton b2;
   JButton b3;
   JButton b4;
   JButton b5;
   JButton b6;
   JButton b7;
   JButton b8;
   JButton b9;
   JButton b10;
   JButton b11;
   
   Dino dino;
   Timer timer;
   int counter;

   public Display() // Constructor:
   {      
      // Use the layout manager, FlowLayout.
      setLayout(new FlowLayout());
   
      // Create Button.
      JButton b1 = new JButton("Run");
      JButton b2 = new JButton("Jump");
      JButton b3 = new JButton("Die");
      JButton b4 = new JButton("Birthday Mode");
      JButton b5 = new JButton("Normal Mode");
      JButton b6 = new JButton("Iron Man");
      JButton b7 = new JButton("Bugs Bunny");
      JButton b8 = new JButton("Darth Vader");
      JButton b9 = new JButton("Winnie the Pooh");
      JButton b10 = new JButton("Zero Suit Samus");
      JButton b11 = new JButton("Barney the Dinosaur");

      dino = new Dino();
      
      // Set the action command for the Button.
      add(b1);
      add(b2);
      add(b3);
      add(b4);
      add(b5);
      add(b6);
      add(b7);
      add(b8);
      add(b9);
      add(b10);
      add(b11);

            
      // Add ActionListeners.
      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
      b4.addActionListener(this);
      b5.addActionListener(this);
      b6.addActionListener(this);
      b7.addActionListener(this);
      b8.addActionListener(this);
      b9.addActionListener(this);
      b10.addActionListener(this);
      b11.addActionListener(this);

           
        Timer timer = new Timer(80, new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            counter++; // Increments x and y coordinates which position the shape.
            repaint();  // Clears the graphic on the JPanel and explicitly
                        // calls paintComponent() to redraw graphics on JPanel.
         }
      });
      timer.start(); 
      
      
   } 

   public void paintComponent(Graphics g) 
   {
      super.paintComponent(g); 
      Graphics2D g2d = (Graphics2D)g;
      g2d.setColor(new Color(240,248,255));  // alice blue
      g2d.fillRect(0, 0, 1024, 768);
      
      if (this.state == 0)
      {
         dino.standingPos(g2d);
      }
      else if(this.state == 1) // Run
      {
         g2d.setColor(Color.darkGray);
        
         if (counter % 2 == 0)
            dino.drawPos1(g2d);
         else 
            dino.drawPos2(g2d);
      }
      else if(this.state == 2) // Jump
      {
         dino.jump(g2d);
         
         if(dino.getCounter() == 200)
         {
            dino.setY(225);
            dino.setCounter(0);
            this.state = 0;
            dino.notJumping();
         }
         repaint();
      }
      else if(this.state == 3) // Die
      {
         dino.drawDeadPos(g2d);
         repaint();
      }
      else if(this.state == 4) // Setting to Birthday Mode
      {
         dino.happyBirthday();
         dino.standingPos(g2d);
         repaint();
      }
      else if(this.state == 5) // Setting to Normal Mode
      {
         dino.normal();
         dino.standingPos(g2d);
         repaint();
      }
      else if(this.state == 6) // Iron Man
      {
         dino.ironMan();    // Setting the iron man variable to true
         dino.ironMan(g2d); // Drawing the dino - iron man suit!!!
         g2d.setColor(Color.black);
         
         Font tr = new Font("Lucida Handwriting", Font.PLAIN, 35);

         g2d.setFont(tr);
         g2d.drawString("TO INFINITY AND", 300, 200); 
         Font font = new Font("Lucida Handwriting", Font.PLAIN, 95);
         g2d.setFont(font);
         g2d.drawString("BEYOND!", 300, 300);
         repaint();
         
         if(dino.getCountIM() == 305)
         {
            dino.setCountIM(0);
            this.state = 0;
            dino.notFlying();
            dino.setY(225);
         }
      }
      else if(this.state == 7) // Bugs Bunny
      {
         dino.bugsBunny(g2d);
         g2d.setColor(Color.black);
         Font font = new Font("Marker Felt", Font.PLAIN, 35); 
         g2d.setFont(font);
         g2d.drawString("What's up, Doc?", 300, 200);
         repaint();
      }
      else if(this.state == 8) // Darth Vader
      {
         dino.darthVader(g2d);
         g2d.setColor(Color.black);
         Font font = new Font("Stencil", Font.PLAIN, 50); 
         g2d.setFont(font);
         g2d.drawString("Together,", 300, 200); 
         Font font2 = new Font("Stencil", Font.PLAIN, 45); 
         g2d.setFont(font2);
         g2d.drawString("we can rule the", 300, 250);
         g2d.setFont(font);
         g2d.drawString("Galaxy!", 300, 300);
         repaint();
      }
      else if(this.state == 9) // Winnie The Pooh
      {
         dino.winnieThePooh(g2d);
         Font font = new Font("Desdemona", Font.PLAIN, 40);
         g2d.setFont(font);
         g2d.setColor(Color.black);
         g2d.drawString("People say nothing", 300, 200);
         g2d.drawString("is impossible, but", 300, 250);
         g2d.drawString("I do nothing everyday.", 300, 300); 
 
         repaint();
      }
      else if(this.state == 10)  // Zero Suit Samus
      {
         dino.zeroSuitSamus(g2d);
         Font font = new Font("Cracked", Font.PLAIN, 100);
         g2d.setColor(new Color(238, 219, 0)); // Turbo Yellow
         g2d.setFont(font);
         g2d.drawString("1", 400, 200);
         Font font2 = new Font("Cracked", Font.PLAIN, 45); 
         g2d.setFont(font2);
         g2d.setColor(Color.black);
         g2d.drawString("ZERO SUIT SAMUS", 300, 250); 
         repaint();
      }
      else if(this.state == 11) // Barney the Dinosaur
      {
         dino.barney(g2d);
         
         Font font = new Font("American Typewriter", Font.PLAIN, 45); 
         g2d.setFont(font);
         g2d.setColor(Color.black);
         g2d.drawString("And remember,", 300, 200);
         g2d.drawString("I love you!", 300, 250);
         
         repaint();
      }
   }
  
   public void actionPerformed(ActionEvent e)    {

      if(e.getActionCommand().equals("Run"))                  { this.state = 1; }
      else if(e.getActionCommand().equals("Jump"))            { this.state = 2; }
      else if(e.getActionCommand().equals("Die"))             { this.state = 3; }
      else if(e.getActionCommand().equals("Birthday Mode"))   { this.state = 4; }
      else if(e.getActionCommand().equals("Normal Mode"))     { this.state = 5; }
      else if(e.getActionCommand().equals("Iron Man"))        { this.state = 6; }
      else if(e.getActionCommand().equals("Bugs Bunny"))      { this.state = 7; }
      else if(e.getActionCommand().equals("Darth Vader"))     { this.state = 8; }
      else if(e.getActionCommand().equals("Winnie the Pooh")) { this.state = 9; }
      else if(e.getActionCommand().equals("Zero Suit Samus")) { this.state = 10;}
      else if(e.getActionCommand().equals("Barney the Dinosaur")) { this.state = 11; }
   }

}


