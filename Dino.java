// Dino.java
// This is for my Project21astv100
// 10 June 2021
// Janee

package Project21astv100;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dino
{
	private int tlX;	
	private int tlY, origY;	
	private int size;	
   private int beginning, size2, begin, size22, reallyLame;
   private boolean jumping;
   private boolean minus;
   private boolean birthdayMode;
   private int counting, counterIM;
   private boolean ironMan;
   
	public Dino()
	{
		tlX = 150;
      tlY = 225;
		size = 30;
      origY = 225;
      jumping = false;
      minus = false;
      counting = 0;
      counterIM = 0;
      ironMan = false;
      Timer timer = new Timer(1, new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         
            if (ironMan)
            {
               tlY--;
               counterIM++;
               if (tlY < -80)
               {
                 ironMan = false;
                 tlY = origY;
              }
            }

            else if (jumping && counting < 100)
            { 
               tlY-=2;
               counting+=2; 
               ironMan = false; 
            }
            else if (jumping && counting >= 100)
            { 
               tlY+=2;  
               counting+=2; 
               ironMan = false; 
            }
          }
      });
      timer.start();
	}

   public void setX(int x) {  tlX = x;         }
   public void setY(int y) {  tlY = y;         }
   public void setS(int s) {  size = s;        }
   public void notJumping(){  jumping = false; }
   public void ironMan()   {  ironMan = true;  }
   public void notFlying() {  ironMan = false; }
   public int getCounter() {  return counting; }
   public void setCounter(int c) { counting = c;}
   public int getCountIM() {  return counterIM; }
   public void setCountIM(int c){ counterIM = c;}
   public void happyBirthday() {  birthdayMode = true; }
   public void normal() { birthdayMode = false; }

   public void standingPos(Graphics2D g2d)
	{
      if (jumping)
         ironMan = false;
      if(!jumping && !ironMan)
         tlY = origY;
            
      g2d.setColor(Color.darkGray);
      
      g2d.fillRect(tlX, tlY, 21, 3); // ridge on head
      g2d.fillRect(tlX-7, tlY + 22, 17, 15); // main body part 1
      g2d.fillRect(tlX-11, tlY+ 25, 19, 15); // main body part 2
      g2d.fillRect(tlX-14, tlY+ 28, 19, 15); // main body part 3
      g2d.fillRect(tlX-17, tlY+ 31, 19, 15); // main body part 4
      g2d.fillRect(tlX-19, tlY + 33, 2, 15); // thing between tail and body 1 (right)
      g2d.fillRect(tlX-22, tlY + 33, 3, 13); // thing between tail and body 2 (left)
      g2d.fillRect(tlX-25, tlY + 31, 3, 13); // tail part 1
      g2d.fillRect(tlX-28, tlY + 28, 3, 13); // tail part 2
      g2d.fillRect(tlX-30, tlY + 24, 2, 14); // tail part 3
      g2d.fillRect(tlX+ 10, tlY + 26, 6, 3); // hand
      g2d.fillRect(tlX+ 13, tlY + 26, 3, 6); // fingers
      g2d.fillRect(tlX-17, tlY + 46, 3, 10); // left leg
      g2d.fillRect(tlX- 17, tlY + 53, 6, 3); // left toe or foot, whatever
      g2d.fillRect(tlX- 4, tlY + 46, 3, 10); // right leg
      g2d.fillRect(tlX - 4, tlY + 53, 6, 3); // right toe or foot, whatever
      g2d.fillRect(tlX- 14, tlY + 46, 3, 4); // thingy between legs part 1 (left to right)
      g2d.fillRect(tlX- 11, tlY + 46, 2, 2); // thingy between legs part 2 (left to right)
      g2d.fillRect(tlX - 6, tlY + 46, 2, 2); // thingy between legs part 3 (left to right)      
      g2d.fillRect(tlX-3, tlY + 3, 27, 19);  // main head

      
      g2d.setColor(Color.white);
      g2d.fillOval(tlX + 2, tlY + 4, 3, 3); // eye
      
      g2d.setColor(new Color(240,248,255));  // alice blue
      g2d.fillRect(tlX + 13, tlY + 16, 15, 3); // mouth
      g2d.fillRect(tlX + 20, tlY + 19, 8, 3); // hole
      
      if(birthdayMode) { drawJumpingHat(g2d); }

      
	}
     
   public void drawPos1(Graphics2D g2d)
	{
      jumping = false;
      minus = false;
      ironMan = false;
      tlY = origY;
      
      g2d.setColor(Color.darkGray);
      g2d.fillRect(tlX, tlY, 21, 3); // ridge on head
      g2d.fillRect(tlX-3, tlY + 3, 27, 19);  // main head
      g2d.fillRect(tlX-7, tlY + 22, 17, 15); // main body part 1
      g2d.fillRect(tlX-11, tlY+ 25, 19, 15); // main body part 2
      g2d.fillRect(tlX-14, tlY+ 28, 19, 15); // main body part 3
      g2d.fillRect(tlX-17, tlY+ 31, 19, 15); // main body part 4
      g2d.fillRect(tlX-19, tlY + 33, 2, 15); // thing between tail and body 1 (right)
      g2d.fillRect(tlX-22, tlY + 33, 3, 13); // thing between tail and body 2 (left)
      g2d.fillRect(tlX-25, tlY + 31, 3, 13); // tail part 1
      g2d.fillRect(tlX-28, tlY + 28, 3, 13); // tail part 2
      g2d.fillRect(tlX-30, tlY + 24, 2, 14); // tail part 3
      g2d.fillRect(tlX+ 10, tlY + 26, 6, 3); // hand
      g2d.fillRect(tlX+ 13, tlY + 26, 3, 6); // fingers
      
      g2d.fillRect(tlX-17, tlY + 46, 3, 10); // left leg
      g2d.fillRect(tlX- 17, tlY + 53, 6, 3); // left toe or foot, whatever
      g2d.fillRect(tlX - 4, tlY + 46, 3, 5); // right leg (modified)
      g2d.fillRect(tlX - 4, tlY + 48, 5, 3); // right toe or foot, whatever (modified)
      g2d.fillRect(tlX- 14, tlY + 46, 3, 4); // thingy between legs part 1 (left to right)
      g2d.fillRect(tlX- 11, tlY + 46, 2, 2); // thingy between legs part 2 (left to right)
      
      g2d.setColor(Color.white);
      g2d.fillOval(tlX + 2, tlY + 4, 3, 3); // eye
      
      g2d.setColor(new Color(240,248,255));  // alice blue
      g2d.fillRect(tlX + 13, tlY + 16, 15, 3); // mouth
      g2d.fillRect(tlX + 20, tlY + 19, 8, 3); // hole
      
      if(birthdayMode) { drawHat1(g2d); }
      
	}

   public void drawPos2(Graphics2D g2d)
	{      
		jumping =  false;
      minus = false;
      ironMan = false;
      tlY = origY;
      
      g2d.setColor(Color.darkGray);
      g2d.fillRect(tlX, tlY, 21, 3); // ridge on head
      g2d.fillRect(tlX-3, tlY + 3, 27, 19);  // main head
      g2d.fillRect(tlX-7, tlY + 22, 17, 15); // main body part 1
      g2d.fillRect(tlX-11, tlY+ 25, 19, 15); // main body part 2
      g2d.fillRect(tlX-14, tlY+ 28, 19, 15); // main body part 3
      g2d.fillRect(tlX-17, tlY+ 31, 19, 15); // main body part 4
      g2d.fillRect(tlX-19, tlY + 33, 2, 15); // thing between tail and body 1 (right)
      g2d.fillRect(tlX-22, tlY + 33, 3, 13); // thing between tail and body 2 (left)
      g2d.fillRect(tlX-25, tlY + 31, 3, 13); // tail part 1
      g2d.fillRect(tlX-28, tlY + 28, 3, 13); // tail part 2
      g2d.fillRect(tlX-30, tlY + 24, 2, 14); // tail part 3
      g2d.fillRect(tlX+ 10, tlY + 26, 6, 3); // hand
      g2d.fillRect(tlX+ 13, tlY + 26, 3, 6); // fingers
      
      g2d.fillRect(tlX- 19, tlY + 46, 6, 3); // left leg part 1 (modified) 
      g2d.fillRect(tlX- 16, tlY + 48, 6, 3); // left leg part 2 (modified)
      g2d.fillRect(tlX- 4, tlY + 46, 3, 10); // right leg
      g2d.fillRect(tlX - 4, tlY + 53, 6, 3); // right toe or foot, whatever
      g2d.fillRect(tlX - 6, tlY + 46, 2, 2); // thingy between legs part 3 (left to right)
      
      g2d.setColor(Color.white);
      g2d.fillRect(tlX + 13, tlY + 16, 15, 3); // mouth
      g2d.fillRect(tlX + 20, tlY + 19, 8, 3); // hole
      g2d.fillOval(tlX + 2, tlY + 4, 3, 3); // eye
      
      g2d.setColor(new Color(240,248,255));  // alice blue
      g2d.fillRect(tlX + 13, tlY + 16, 15, 3); // mouth
      g2d.fillRect(tlX + 20, tlY + 19, 8, 3); // hole
      
      if(birthdayMode) { drawHat2(g2d); }

	}
   
   public void drawDeadPos(Graphics2D g2d)
	{
      ironMan = false;
      jumping = false;
      tlY = origY;
      
      g2d.setColor(Color.darkGray);
      g2d.fillRect(tlX, tlY, 21, 3); // ridge on head
      g2d.fillRect(tlX-3, tlY + 3, 27, 19);  // main head
      g2d.fillRect(tlX-7, tlY + 22, 17, 15); // main body part 1
      g2d.fillRect(tlX-11, tlY+ 25, 19, 15); // main body part 2
      g2d.fillRect(tlX-14, tlY+ 28, 19, 15); // main body part 3
      g2d.fillRect(tlX-17, tlY+ 31, 19, 15); // main body part 4
      g2d.fillRect(tlX-19, tlY + 33, 2, 15); // thing between tail and body 1 (right)
      g2d.fillRect(tlX-22, tlY + 33, 3, 13); // thing between tail and body 2 (left)
      g2d.fillRect(tlX-25, tlY + 31, 3, 13); // tail part 1
      g2d.fillRect(tlX-28, tlY + 28, 3, 13); // tail part 2
      g2d.fillRect(tlX-30, tlY + 24, 2, 14); // tail part 3
      g2d.fillRect(tlX+ 10, tlY + 26, 6, 3); // hand
      g2d.fillRect(tlX+ 13, tlY + 26, 3, 6); // fingers
      g2d.fillRect(tlX-17, tlY + 46, 3, 10); // left leg
      g2d.fillRect(tlX- 17, tlY + 53, 6, 3); // left toe or foot, whatever
      g2d.fillRect(tlX- 4, tlY + 46, 3, 10); // right leg
      g2d.fillRect(tlX - 4, tlY + 53, 6, 3); // right toe or foot, whatever
      g2d.fillRect(tlX- 14, tlY + 46, 3, 4); // thingy between legs part 1 (left to right)
      g2d.fillRect(tlX- 11, tlY + 46, 2, 2); // thingy between legs part 2 (left to right)
      g2d.fillRect(tlX - 6, tlY + 46, 2, 2); // thingy between legs part 3 (left to right)
      
      g2d.setColor(Color.white);
      g2d.fillRect(tlX + 2, tlY + 4, 6, 6); // eye
      
      g2d.setColor(new Color(240,248,255));  // alice blue
      g2d.fillRect(tlX + 20, tlY + 19, 8, 3); // hole

      g2d.setColor(Color.darkGray);
      g2d.fillRect(tlX + 3, tlY +  5, 4, 4); // Eye (very tiny one)
      
      if(birthdayMode) { drawDeadHat(g2d); }
	}

  	public void erase(Graphics2D g2d)
	{
      g2d.setColor(new Color(240,248,255));  // alice blue
		g2d.fillRect(tlX - 28, tlY, 40, 60); // a big white box
  	}
   
   public void jump(Graphics2D g2d)
   {
      standingPos(g2d);      
      jumping = true; 
      minus = false;
      
      if (birthdayMode) {  drawJumpingHat(g2d); }
   }
   
   private void drawHat1(Graphics2D g2d)
   {
      g2d.setColor(new Color(77, 197, 214));//(102, 153,	204)); // Picton blue
            
      g2d.fillRect(tlX+3, tlY-4, 12, 4); // first birthday layer
      g2d.fillRect(tlX+5, tlY-8, 8, 4); // second birthday layer
      g2d.fillRect(tlX+7, tlY-12, 4, 4); // third birthday layer
      g2d.fillRect(tlX+8, tlY-15, 2, 3); // thing at the top
      
      g2d.setColor(new Color(255,51,204)); // Razzle Dazzle Rose  
      g2d.fillRect(tlX+8, tlY-19, 2, 4);   // top                   
      g2d.fillRect(tlX+3, tlY-17, 2, 4);     // left down           
      g2d.fillRect(tlX+5, tlY-19, 4, 2);   // left connecter.
      g2d.fillRect(tlX+1, tlY-13, 2, 2);   // left end tip.
      
      g2d.fillRect(tlX+6, tlY-21, 2, 2);   // little protruding thing
      g2d.fillRect(tlX, tlY-23, 6, 2);   // top flying thing

   } 
   private void drawHat2(Graphics2D g2d)
   {
      g2d.setColor(new Color(77, 197, 214));//(102, 153,	204)); // Picton blue
         
      g2d.fillRect(tlX+3, tlY-4, 12, 4); // first birthday layer
      g2d.fillRect(tlX+5, tlY-8, 8, 4); // second birthday layer
      g2d.fillRect(tlX+7, tlY-12, 4, 4); // third birthday layer
      g2d.fillRect(tlX+8, tlY-15, 2, 3); // thing at the top
      
      g2d.setColor(new Color(255,51,204)); // Razzle Dazzle Rose 
      g2d.fillRect(tlX+8, tlY-19, 2, 4);   // top
      g2d.fillRect(tlX+3, tlY-19, 6, 2);   // left connecter.
      g2d.fillRect(tlX, tlY-17, 3, 2);     // left end tip.
      g2d.fillRect(tlX+10, tlY-21, 2, 2);  // little protruding thing.
      g2d.fillRect(tlX+8, tlY-25, 2, 4);   // top little protruding thing.
      g2d.fillRect(tlX+6, tlY-27, 2, 2);   // final little block at the very top.
      
   }
   private void drawJumpingHat(Graphics2D g2d)
   {    
      g2d.setColor(new Color(77, 197, 214));//(102, 153,	204)); // Picton blue
      
      g2d.fillRect(tlX+3, tlY-4, 12, 4); // first birthday layer
      g2d.fillRect(tlX+5, tlY-8, 8, 4); // second birthday layer
      g2d.fillRect(tlX+7, tlY-12, 4, 4); // third birthday layer
      g2d.fillRect(tlX+8, tlY-15, 2, 3); // thing at the top
      
      g2d.setColor(new Color(255,51,204)); // Razzle Dazzle Rose 
      g2d.fillRect(tlX+8, tlY-19, 2, 4); // top
      g2d.fillRect(tlX+3, tlY-19, 2, 6); // left down
      g2d.fillRect(tlX+5, tlY-21, 3, 2); // left connecter.
      g2d.fillRect(tlX+13, tlY-19, 2, 6); // right down
      g2d.fillRect(tlX+10, tlY-21, 3, 2); // right connecter.      
   }
   
   private void drawDeadHat(Graphics2D g2d)
   {
      g2d.setColor(new Color(77, 197, 214));//(102, 153,	204)); // Picton blue
      
      g2d.fillRect(tlX+3, tlY-4, 12, 4); // first birthday layer
      g2d.fillRect(tlX+5, tlY-8, 8, 4); // second birthday layer
      g2d.fillRect(tlX+7, tlY-12, 4, 4); // third birthday layer
      g2d.fillRect(tlX+8, tlY-15, 2, 3); // thing at the top 
      
      g2d.setColor(new Color(255,51,204)); // Razzle Dazzle Rose
      
      g2d.fillRect(tlX+8, tlY-19, 2, 4); // top
      g2d.fillRect(tlX+6, tlY-21, 2, 2); // left bottom square first.
      g2d.fillRect(tlX+4, tlY-23, 2, 2); // left bottom square second.
      g2d.fillRect(tlX+2, tlY-27, 2, 4); // left top rect.
      
      g2d.fillRect(tlX+10, tlY-21, 2, 2); // right bottom square first
      g2d.fillRect(tlX+12, tlY-23, 2, 2); // right bottom square second
      g2d.fillRect(tlX+14, tlY-27, 2, 4); // right top rect. 

   }
   
   private void drawIronMan(Graphics2D g2d)
   {
      g2d.setColor(new Color(255, 119, 0));   // Fire Orange
      g2d.fillOval(tlX+ 13, tlY + 32, 3, 10); // Hand Boosters
       
      g2d.fillOval(tlX- 17, tlY + 56, 6, 20); // Left Foot Boosters
      g2d.fillOval(tlX - 4, tlY + 56, 6, 20); // Right Foot Boosters.
   
   }
   
    public void ironMan(Graphics2D g2d)
	 {
      if (jumping)
         jumping = false;
               
      drawIronMan(g2d);
            
      g2d.setColor(new Color (218, 31, 40)); // Maximium red

      g2d.fillRect(tlX, tlY, 21, 3); // ridge on head
      g2d.fillRect(tlX-7, tlY + 22, 17, 15); // main body part 1
      g2d.fillRect(tlX-11, tlY+ 25, 19, 15); // main body part 2
      g2d.fillRect(tlX-14, tlY+ 28, 19, 15); // main body part 3
      g2d.fillRect(tlX-17, tlY+ 31, 19, 15); // main body part 4
      g2d.fillRect(tlX-19, tlY + 33, 2, 15); // thing between tail and body 1 (right)
      g2d.fillRect(tlX-22, tlY + 33, 3, 13); // thing between tail and body 2 (left)
      g2d.fillRect(tlX-25, tlY + 31, 3, 13); // tail part 1
      g2d.fillRect(tlX-28, tlY + 28, 3, 13); // tail part 2
      g2d.fillRect(tlX-30, tlY + 24, 2, 14); // tail part 3
      g2d.fillRect(tlX+ 10, tlY + 26, 6, 3); // hand
      g2d.fillRect(tlX+ 13, tlY + 26, 3, 6); // fingers
      g2d.fillRect(tlX-17, tlY + 46, 3, 10); // left leg
      g2d.fillRect(tlX- 17, tlY + 53, 6, 3); // left toe or foot, whatever
      g2d.fillRect(tlX- 4, tlY + 46, 3, 10); // right leg
      g2d.fillRect(tlX - 4, tlY + 53, 6, 3); // right toe or foot, whatever
      g2d.fillRect(tlX- 14, tlY + 46, 3, 4); // thingy between legs part 1 (left to right)
      g2d.fillRect(tlX- 11, tlY + 46, 2, 2); // thingy between legs part 2 (left to right)
      g2d.fillRect(tlX - 6, tlY + 46, 2, 2); // thingy between legs part 3 (left to right)
            
      g2d.fillRect(tlX-3, tlY + 3, 27, 19);  // main head
      
      g2d.setColor(new Color(252, 225, 84)); // Mustard.
      g2d.fillRect(tlX +13, tlY +3, 11, 17); // Mask.
      g2d.fillRect(tlX+15, tlY, 6, 3); // ridge on head
      
      g2d.setColor(new Color(118, 12, 16)); // UP Marroon
      g2d.fillOval(tlX+10, tlY +7, 7,  7);  // main head

      g2d.setColor(Color.white);
      g2d.fillOval(tlX + 2, tlY + 4, 3, 3); // eye
      
      g2d.setColor(new Color(240,248,255));  // alice blue
      g2d.fillRect(tlX + 13, tlY + 16, 15, 3); // mouth
      g2d.fillRect(tlX + 20, tlY + 19, 8, 3); // hole
      
      if(birthdayMode) { drawJumpingHat(g2d); }
      
	}
   
   public void bugsBunny(Graphics2D g2d)
	{
      jumping = false;
      ironMan = false;
      tlY = origY;
            
      g2d.setColor(new Color(153, 162, 164)); // Manatee Gray
      
      g2d.fillRect(tlX-7, tlY + 22, 17, 15); // main body part 1
      g2d.fillRect(tlX-11, tlY+ 25, 19, 15); // main body part 2
      g2d.fillRect(tlX-14, tlY+ 28, 19, 15); // main body part 3
      g2d.fillRect(tlX-17, tlY+ 31, 19, 15); // main body part 4
      g2d.fillRect(tlX-19, tlY + 33, 2, 15); // thing between tail and body 1 (right)
      g2d.fillRect(tlX-22, tlY + 33, 3, 13); // thing between tail and body 2 (left)
      g2d.fillRect(tlX-25, tlY + 31, 3, 13); // tail part 1
      g2d.fillRect(tlX-28, tlY + 28, 3, 13); // tail part 2
      g2d.fillRect(tlX-30, tlY + 24, 2, 14); // tail part 3
      g2d.fillRect(tlX+ 10, tlY + 26, 6, 3); // hand

      g2d.fillRect(tlX-17, tlY + 46, 3, 10); // left leg
      g2d.fillRect(tlX- 17, tlY + 53, 6, 3); // left toe or foot, whatever
      g2d.fillRect(tlX- 4, tlY + 46, 3, 10); // right leg
      g2d.fillRect(tlX - 4, tlY + 53, 6, 3); // right toe or foot, whatever
      g2d.fillRect(tlX- 14, tlY + 46, 3, 4); // thingy between legs part 1 (left to right)
      g2d.fillRect(tlX- 11, tlY + 46, 2, 2); // thingy between legs part 2 (left to right)
      g2d.fillRect(tlX - 6, tlY + 46, 2, 2); // thingy between legs part 3 (left to right)      
     
      g2d.fillOval(tlX-5, tlY-15, 7, 20); // OTHER EAR
      
      g2d.setColor(new Color(254, 227, 197)); // Bisque
      g2d.fillOval(tlX-3, tlY-15, 2, 17); // OTHER EAR inside
      
      g2d.setColor(new Color(153, 162, 164)); // Manatee Gray
      g2d.fillOval(tlX, tlY-15, 7, 17); // EAR
      
      g2d.setColor(new Color(254, 227, 197)); // Bisque
      g2d.fillOval(tlX+2, tlY-15, 2, 15); // EAR inside

      g2d.setColor(Color.white);
      g2d.drawOval(tlX, tlY-15, 7, 17); // OUTLINE OF THE EAR ( not OTHER EAR, EAR )
      
      g2d.setColor(new Color(153, 162, 164)); // Manatee Gray
      
      g2d.fillRect(tlX-3, tlY + 3, 27, 19);  // main head
      g2d.fillRect(tlX, tlY, 21, 3); // ridge on head

      
      g2d.setColor(Color.white);
      g2d.fillOval(tlX + 2, tlY + 4, 3, 3); // eye
      
      g2d.setColor(new Color(240,248,255));  // alice blue
      g2d.fillRect(tlX + 13, tlY + 16, 15, 3); // mouth
      g2d.fillRect(tlX + 20, tlY + 19, 8, 3); // hole

      g2d.setColor(new Color(253, 244, 220)); //  Warm White
      g2d.fillRect(tlX-8, tlY + 30, 12, 13); // lowest
      g2d.fillRect(tlX-5, tlY + 27, 12, 13); // middle
      g2d.fillRect(tlX-2, tlY + 24, 12, 13); // highest
      g2d.fillRect(tlX- 16, tlY + 54, 4, 1); // left toe or foot, whatever
      g2d.fillRect(tlX - 3, tlY + 54, 4, 1); // right toe or foot, whatever
      
      g2d.setColor(new Color(233, 105, 44));  // Carrot orange
      g2d.fillOval(tlX+ 13, tlY + 20, 7, 17); // CARROT

      g2d.setColor(Color.white);  
      g2d.fillRect(tlX + 15, tlY + 15, 5, 5); // TEETH
      
      g2d.setColor(new Color(105, 190, 40));  // Atlantis Green

      g2d.drawLine(tlX+ 16, tlY + 37, tlX+13, tlY+43); // CARROT TOP LEFT
      g2d.drawLine(tlX+ 16, tlY + 37, tlX+16, tlY+43); // CARROT TOP LEFT
      g2d.drawLine(tlX+ 16, tlY + 37, tlX+19, tlY+43); // CARROT TOP LEFT
      
      if(birthdayMode) { drawJumpingHat(g2d); } 
	}
   
   public void darthVader(Graphics2D g2d)
	{
      ironMan = false;
      jumping = false;
      tlY = 225;
      
      g2d.setColor(new Color(9, 9, 9));  // Cod Gray
      
      g2d.fillRect(tlX, tlY, 21, 3); // ridge on head
      g2d.fillRect(tlX-7, tlY + 22, 17, 15); // main body part 1
      g2d.fillRect(tlX-11, tlY+ 25, 19, 15); // main body part 2
      g2d.fillRect(tlX-14, tlY+ 28, 19, 15); // main body part 3
      g2d.fillRect(tlX-17, tlY+ 31, 19, 15); // main body part 4
      g2d.fillRect(tlX-19, tlY + 33, 2, 15); // thing between tail and body 1 (right)
      g2d.fillRect(tlX-22, tlY + 33, 3, 13); // thing between tail and body 2 (left)
      g2d.fillRect(tlX-25, tlY + 31, 3, 13); // tail part 1
      g2d.fillRect(tlX-28, tlY + 28, 3, 13); // tail part 2
      g2d.fillRect(tlX-30, tlY + 24, 2, 14); // tail part 3
      g2d.fillRect(tlX+ 10, tlY + 26, 6, 3); // hand
      g2d.fillRect(tlX+ 13, tlY + 26, 3, 6); // fingers
      g2d.fillRect(tlX-17, tlY + 46, 3, 10); // left leg
      g2d.fillRect(tlX- 17, tlY + 53, 6, 3); // left toe or foot, whatever
      g2d.fillRect(tlX- 4, tlY + 46, 3, 10); // right leg
      g2d.fillRect(tlX - 4, tlY + 53, 6, 3); // right toe or foot, whatever
      g2d.fillRect(tlX- 14, tlY + 46, 3, 4); // thingy between legs part 1 (left to right)
      g2d.fillRect(tlX- 11, tlY + 46, 2, 2); // thingy between legs part 2 (left to right)
      g2d.fillRect(tlX - 6, tlY + 46, 2, 2); // thingy between legs part 3 (left to right)      
      g2d.fillRect(tlX-3, tlY + 3, 27, 19);  // main head

      
      g2d.setColor(Color.white);
      g2d.fillOval(tlX + 2, tlY + 4, 3, 3); // eye
      
      g2d.setColor(new Color(240,248,255));  // alice blue
      g2d.fillRect(tlX + 13, tlY + 16, 15, 3); // mouth
      g2d.fillRect(tlX + 20, tlY + 19, 8, 3); // hole
      
      if(birthdayMode) { drawJumpingHat(g2d); }
      
      g2d.setColor(new Color(16, 12, 8)); // Smoky black
      
      Polygon cape = new Polygon();
      cape.addPoint(tlX-3, tlY + 22); 
      cape.addPoint(tlX- 50, tlY+50);
      cape.addPoint(tlX- 40, tlY+20);      

      g2d.fillPolygon(cape);
      
//////////////// Making the Lightsaber :) /////////   
   
      g2d.setColor(new Color(172, 172, 172)); // Silver Chalice
      Polygon handle = new Polygon();
      
      handle.addPoint(tlX+12, tlY+33);  
      handle.addPoint(tlX+17, tlY+35);
      handle.addPoint(tlX+37, tlY+15);
      handle.addPoint(tlX+32, tlY+13);
      g2d.fillPolygon(handle);

      g2d.setColor(new Color(197, 0, 0));    // Guardsman Red
      Polygon blade = new Polygon();
      blade.addPoint(tlX+37, tlY+15);
      blade.addPoint(tlX+32, tlY+13);
      blade.addPoint(tlX+68, tlY-22);      
      blade.addPoint(tlX+73, tlY-20);
      g2d.fillPolygon(blade); 
   }

   public void winnieThePooh(Graphics2D g2d)
	{
      ironMan = false;
      jumping = false;
      tlY = 225;
            
      g2d.setColor(new Color(253, 208, 35));  // lightning yellow.
      
      g2d.fillRect(tlX, tlY, 21, 3); // ridge on head
      g2d.fillRect(tlX-7, tlY + 22, 17, 15); // main body part 1
      g2d.fillRect(tlX-11, tlY+ 25, 19, 15); // main body part 2
      g2d.fillRect(tlX-14, tlY+ 28, 19, 15); // main body part 3
      g2d.fillRect(tlX-17, tlY+ 31, 19, 15); // main body part 4
      g2d.fillRect(tlX-19, tlY + 33, 2, 15); // thing between tail and body 1 (right)
      g2d.fillRect(tlX-22, tlY + 33, 3, 13); // thing between tail and body 2 (left)
      g2d.fillRect(tlX-25, tlY + 31, 3, 13); // tail part 1
      g2d.fillRect(tlX-28, tlY + 28, 3, 13); // tail part 2
      g2d.fillRect(tlX-30, tlY + 24, 2, 14); // tail part 3
      g2d.fillRect(tlX+ 10, tlY + 26, 6, 3); // hand
      g2d.fillRect(tlX+ 13, tlY + 26, 3, 6); // fingers
      g2d.fillRect(tlX-17, tlY + 46, 3, 10); // left leg
      g2d.fillRect(tlX- 17, tlY + 53, 6, 3); // left toe or foot, whatever
      g2d.fillRect(tlX- 4, tlY + 46, 3, 10); // right leg
      g2d.fillRect(tlX - 4, tlY + 53, 6, 3); // right toe or foot, whatever
      g2d.fillRect(tlX- 14, tlY + 46, 3, 4); // thingy between legs part 1 (left to right)
      g2d.fillRect(tlX- 11, tlY + 46, 2, 2); // thingy between legs part 2 (left to right)
      g2d.fillRect(tlX - 6, tlY + 46, 2, 2); // thingy between legs part 3 (left to right)      
      g2d.fillRect(tlX-3, tlY + 3, 27, 19);  // main head
      
      g2d.setColor(new Color(227, 38, 54));  // Alizarin Crimson
      g2d.fillRect(tlX-7, tlY + 22, 17, 15); // main body part 1
      g2d.fillRect(tlX-11, tlY+ 25, 19, 15); // main body part 2
      g2d.fillRect(tlX-14, tlY+ 28, 19, 15); // main body part 3
      g2d.fillRect(tlX-17, tlY+ 31, 19, 15); // main body part 4
      
      g2d.setColor(new Color(253, 208, 35));  // lightning yellow.
      Polygon bottom = new Polygon();
      
      bottom.addPoint(tlX-17, tlY+37);
      bottom.addPoint(tlX, tlY+ 50);
      bottom.addPoint(tlX-17, tlY+50);
      g2d.fillPolygon(bottom);
   
      Polygon top = new Polygon();
      top.addPoint(tlX , tlY + 22);
      top.addPoint(tlX+17, tlY+25);
      top.addPoint(tlX+17, tlY+22);
      g2d.fillPolygon(top);
      
      g2d.setColor(new Color(253, 208, 35));  // lightning yellow.
      g2d.fillOval(tlX-7, tlY-8, 13, 13); // OTHER EAR
      g2d.setColor(new Color(205, 167, 29)); //  #cda71d
      g2d.drawOval(tlX-7, tlY-8, 13, 13); // other ear's outline
      g2d.setColor(new Color(253, 208, 35));  // lightning yellow.
      g2d.fillOval(tlX, tlY-8, 13, 13); // EAR
      g2d.setColor(new Color(205, 167, 29)); //  #cda71d
      g2d.drawOval(tlX, tlY-8, 13, 13); // ear's outline
      
      g2d.setColor(new Color(253, 208, 35));  // lightning yellow.
      g2d.fillRect(tlX-3, tlY + 3, 27, 19);  // main head

      g2d.setColor(new Color(142, 179, 209)); // horizon blue
      g2d.fillOval(tlX+ 13, tlY + 25, 15, 20); // Hunny Pot

      Polygon bottomPot = new Polygon();
      bottomPot.addPoint(tlX+13, tlY+30);  // left top
      bottomPot.addPoint(tlX+17, tlY+46);  // left bottom
      bottomPot.addPoint(tlX+24, tlY+46);  // right bottom
      bottomPot.addPoint(tlX+28, tlY+30);  // right top
      g2d.fillPolygon(bottomPot);          // to give the pot a flat bottom
      
      g2d.setColor(new Color(242, 209, 107));  // Golden Sand 
      g2d.drawLine(tlX+15, tlY+30, tlX+27, tlY+30);
      
      g2d.setColor(Color.black);
      Font font = new Font("Marker Felt", Font.PLAIN, 12); 
      g2d.setFont(font);
      g2d.drawString("H", tlX+18, tlY+42);  // Label for the Hunny Pot.
            
      g2d.setColor(Color.white);
      g2d.fillOval(tlX + 2, tlY + 4, 3, 3); // eye
      
       
      g2d.setColor(new Color(240,248,255));  // alice blue
      g2d.fillRect(tlX + 13, tlY + 16, 15, 3); // mouth
      g2d.fillRect(tlX + 20, tlY + 19, 8, 3); // hole
      
      if(birthdayMode) { drawJumpingHat(g2d); } 
	}
   
  public void zeroSuitSamus(Graphics2D g2d)
	{
      ironMan = false;
      jumping = false;
      tlY = 225;
            
      g2d.setColor(new Color(128, 235, 255)); // Anakiwa
      
      g2d.fillRect(tlX, tlY, 21, 3); // ridge on head
      g2d.fillRect(tlX-7, tlY + 22, 17, 15); // main body part 1
      g2d.fillRect(tlX-11, tlY+ 25, 19, 15); // main body part 2
      g2d.fillRect(tlX-14, tlY+ 28, 19, 15); // main body part 3
      g2d.fillRect(tlX-17, tlY+ 31, 19, 15); // main body part 4
      g2d.fillRect(tlX-19, tlY + 33, 2, 15); // thing between tail and body 1 (right)
      g2d.fillRect(tlX-22, tlY + 33, 3, 13); // thing between tail and body 2 (left)
      g2d.fillRect(tlX-25, tlY + 31, 3, 13); // tail part 1
      g2d.fillRect(tlX-28, tlY + 28, 3, 13); // tail part 2
      g2d.fillRect(tlX-30, tlY + 24, 2, 14); // tail part 3
      g2d.fillRect(tlX+ 10, tlY + 26, 6, 3); // hand
      g2d.fillRect(tlX+ 13, tlY + 26, 3, 6); // fingers
      g2d.fillRect(tlX-17, tlY + 46, 3, 10); // left leg
      g2d.fillRect(tlX- 17, tlY + 53, 6, 3); // left toe or foot, whatever
      g2d.fillRect(tlX- 4, tlY + 46, 3, 10); // right leg
      g2d.fillRect(tlX - 4, tlY + 53, 6, 3); // right toe or foot, whatever
      g2d.fillRect(tlX- 14, tlY + 46, 3, 4); // thingy between legs part 1 (left to right)
      g2d.fillRect(tlX- 11, tlY + 46, 2, 2); // thingy between legs part 2 (left to right)
      g2d.fillRect(tlX - 6, tlY + 46, 2, 2); // thingy between legs part 3 (left to right)
      
      g2d.setColor(new Color(209, 179, 153)); // Cashmere      
      g2d.fillRect(tlX-3, tlY + 3, 27, 19);  // main head
      g2d.fillRect(tlX+12, tlY, 9, 3); // ridge on head

      g2d.setColor(new Color(245,241,113)); // Dolly
      g2d.fillRect(tlX, tlY, 12, 3); // ridge on head
      
      Polygon hair = new Polygon();
      hair.addPoint(tlX-3, tlY+3);
      hair.addPoint(tlX+12, tlY+3);
      hair.addPoint(tlX-3, tlY+13);
      g2d.fillPolygon(hair);
         
      Polygon ponytail = new Polygon();
      ponytail.addPoint(tlX, tlY+ 8);    // beginning point
      ponytail.addPoint(tlX-12, tlY+4);  // up point
      ponytail.addPoint(tlX-15, tlY+6);  // down left side of the ponytail
      ponytail.addPoint(tlX-15, tlY+16); // down left side of the ponytail
      ponytail.addPoint(tlX-13, tlY+20); // the middle point of the ponytail
      ponytail.addPoint(tlX-11, tlY+16); // the right side of the ponytail
      ponytail.addPoint(tlX-11, tlY+12); // the right top side of the ponytail

      g2d.fillPolygon(ponytail);

      g2d.setColor(Color.white);
      g2d.fillOval(tlX + 2, tlY + 4, 3, 3); // eye
      
      g2d.setColor(new Color(240,248,255));  // alice blue
      g2d.fillRect(tlX + 13, tlY + 16, 15, 3); // mouth
      g2d.fillRect(tlX + 20, tlY + 19, 8, 3); // hole
      
      g2d.setColor(new Color(68, 81, 114)); //  Astronaut
      g2d.fillRect(tlX-8, tlY + 30, 12, 13); // lowest
      g2d.fillRect(tlX-5, tlY + 27, 12, 13); // middle
      g2d.fillRect(tlX-2, tlY + 24, 12, 13); // highest
      
      g2d.setColor(new Color(152, 156, 153)); // Stack gray
      g2d.fillRect(tlX+ 16, tlY + 26, 3, 6); // handle of gun
      g2d.fillRect(tlX+19, tlY+26, 10, 2); // barrel of the gun
      
      g2d.setColor(new Color(138, 143, 149)); // #8a8f95
      g2d.fillRect(tlX+21, tlY+25, 6, 4); // thing on the gun
      
      if(birthdayMode) { drawJumpingHat(g2d); } 
	}
   
   public void barney(Graphics2D g2d)
	{
      ironMan = false;
      jumping = false;
      tlY = 225;
            
      g2d.setColor(new Color(187, 51, 133)); // Medium red violet #BB3385
      
      g2d.fillRect(tlX, tlY, 21, 3); // ridge on head
      g2d.fillRect(tlX-7, tlY + 22, 17, 15); // main body part 1
      g2d.fillRect(tlX-11, tlY+ 25, 19, 15); // main body part 2
      g2d.fillRect(tlX-14, tlY+ 28, 19, 15); // main body part 3
      g2d.fillRect(tlX-17, tlY+ 31, 19, 15); // main body part 4
      g2d.fillRect(tlX-19, tlY + 33, 2, 15); // thing between tail and body 1 (right)
      g2d.fillRect(tlX-22, tlY + 33, 3, 13); // thing between tail and body 2 (left)
      g2d.fillRect(tlX-25, tlY + 31, 3, 13); // tail part 1
      g2d.fillRect(tlX-28, tlY + 28, 3, 13); // tail part 2
      g2d.fillRect(tlX-30, tlY + 24, 2, 14); // tail part 3
      g2d.fillRect(tlX+ 10, tlY + 26, 6, 3); // hand
      g2d.fillRect(tlX+ 13, tlY + 26, 3, 6); // fingers
      g2d.fillRect(tlX-17, tlY + 46, 3, 10); // left leg
      g2d.fillRect(tlX- 17, tlY + 53, 6, 3); // left toe or foot, whatever
      g2d.fillRect(tlX- 4, tlY + 46, 3, 10); // right leg
      g2d.fillRect(tlX - 4, tlY + 53, 6, 3); // right toe or foot, whatever
      g2d.fillRect(tlX- 14, tlY + 46, 3, 4); // thingy between legs part 1 (left to right)
      g2d.fillRect(tlX- 11, tlY + 46, 2, 2); // thingy between legs part 2 (left to right)
      g2d.fillRect(tlX - 6, tlY + 46, 2, 2); // thingy between legs part 3 (left to right)
      g2d.fillRect(tlX-3, tlY + 3, 27, 19);  // main head      

      g2d.setColor(Color.black);
      g2d.fillOval(tlX + 2, tlY + 4, 3, 3); // eye
      
      g2d.setColor(new Color(240,248,255));  // alice blue
      g2d.fillRect(tlX + 20, tlY + 19, 8, 3); // hole
      
      g2d.setColor(Color.white); 
      g2d.fillRect(tlX + 13, tlY + 16, 15, 3); // teeth
      g2d.fillRect(tlX+10, tlY+13, 3, 6); // smile
      
      g2d.setColor(new Color(79, 121, 66)); //  Fern Green #4F7942
      g2d.fillRect(tlX-8, tlY + 30, 12, 13); // lowest
      g2d.fillRect(tlX-5, tlY + 27, 12, 13); // middle
      g2d.fillRect(tlX-2, tlY + 24, 12, 13); // highest
      
      if(birthdayMode) { drawJumpingHat(g2d); }   
	}
}