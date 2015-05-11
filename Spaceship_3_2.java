/*Description: This class is instantiated in the main class. This class constructs a GUI and also pulls information from the 
 text file created by the first program. */

//Author: Pinal Mahesh Patel
//Date: 12/1/2014

/* NOTE: I was not able to get the landing gear working properly. I tried several different approaches, but I was not successfull
in making it work as required. Once the mouse is clicked, the variable count is incremented and once the mouse is moved AFTER 
that, the landing gear appears. The case is similar for the retraction of the landing gear.
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class Spaceship_3_2 extends JPanel
{

private int count =0;
  
  //first shape of plane (main body)
  private int[] xLine = {175, 180, 160, 155, 150, 90, 80, 90, 110, 175};
  private int[] yLine={30, 25, 20, 15, 15, 15, 20, 30, 30, 30};
  private int[] xyLineRef= new int[20];
  
  // second shape of plane (tail)
  private int[] xLine2= {110, 90, 80, 65, 50, 35, 45, 55, 70, 85, 105, 110};
  private int[] yLine2={30, 30, 20, 10, 5, 5, 20, 25, 30, 35, 35, 30};
  private int[] xyLine2Ref = new int[24];
  
  // front window shape of the plane
  private int[] xLine3 ={160, 155, 150, 150, 160};
  private int[] yLine3={20, 15, 15, 20, 20};
  private int[] xyLine3Ref=new int[10];
  
  //landing gear one code
  private int[] lGearOneX = {120, 115};
  private int[] lGearOneY = {30, 35};
  private int[] gearOneRef = new int[4];
  
  // landing gear two code
  private int[] lGearTwoX = {130, 125};
  private int[] lGearTwoY = {30, 35};
  private int[] gearTwoRef = new int[4];
 

    
  
  public void setPos(){
  
    // x coordinates of the main body

      xLine[0]=xyLineRef[0]+ 175;
      xLine[1]=xyLineRef[2]+ 180;
      xLine[2]=xyLineRef[4]+ 160;                                            
      xLine[3]=xyLineRef[6]+155;
      xLine[4]=xyLineRef[8]+150;
      xLine[5]=xyLineRef[10]+90;
      xLine[6]=xyLineRef[12]+80;
      xLine[7]=xyLineRef[14]+90;
      xLine[8]=xyLineRef[16]+110;
      xLine[9]=xyLineRef[18]+175; 
        
   // y coordinates of the main body
      yLine[0]=xyLineRef[1]+ 30;
      yLine[1]=xyLineRef[3]+ 25;
      yLine[2]=xyLineRef[5]+ 20;
      yLine[3]=xyLineRef[7]+ 15;
      yLine[4]=xyLineRef[9]+ 15;
      yLine[5]=xyLineRef[11]+ 15;
      yLine[6]=xyLineRef[13]+ 20;
      yLine[7]=xyLineRef[15]+ 30;
      yLine[8]=xyLineRef[17]+ 30;
      yLine[9]=xyLineRef[19]+30;
      
      // x coordinates for the tail
        xLine2[0]=xyLine2Ref[0]+110;
        xLine2[1]=xyLine2Ref[2]+90;
        xLine2[2]=xyLine2Ref[4]+80;
        xLine2[3]=xyLine2Ref[6]+65;
        xLine2[4]=xyLine2Ref[8]+50;
        xLine2[5]=xyLine2Ref[10]+35;
        xLine2[6]=xyLine2Ref[12]+45;
        xLine2[7]=xyLine2Ref[14]+55;
        xLine2[8]=xyLine2Ref[16]+70;
        xLine2[9]=xyLine2Ref[18]+85;
        xLine2[10]=xyLine2Ref[20]+105;
        xLine2[11]=xyLine2Ref[22]+110;
        
        //y coordinates for the tail
        yLine2[0]=xyLine2Ref[1]+ 30 ;
        yLine2[1]=xyLine2Ref[3]+ 30;
        yLine2[2]=xyLine2Ref[5]+ 20;
        yLine2[3]=xyLine2Ref[7]+ 10;
        yLine2[4]=xyLine2Ref[9]+ 5;
        yLine2[5]=xyLine2Ref[11]+ 5;
        yLine2[6]=xyLine2Ref[13]+ 20;
        yLine2[7]=xyLine2Ref[15]+ 25;
        yLine2[8]=xyLine2Ref[17]+ 30;
        yLine2[9]=xyLine2Ref[19]+ 35;
        yLine2[10]=xyLine2Ref[21]+35;
        yLine2[11]=xyLine2Ref[23]+30;
        
        // x and y for the window
        xLine3[0]=xyLine3Ref[0]+160 ;
        yLine3[0]=xyLine3Ref[1]+ 20;
        xLine3[1]=xyLine3Ref[2]+ 155;
        yLine3[1]=xyLine3Ref[3]+ 15;
        xLine3[2]=xyLine3Ref[4]+ 150;
        yLine3[2]=xyLine3Ref[5]+ 15;
        xLine3[3]=xyLine3Ref[6]+ 150;
        yLine3[3]=xyLine3Ref[7]+ 20;
        xLine3[4]=xyLine3Ref[8]+ 160;
        yLine3[4]=xyLine3Ref[9]+ 20;
        
        //landing gear one
    lGearOneX[0]=gearOneRef[0]+ 120;
    lGearOneY[0]=gearOneRef[1]+ 30;
    lGearOneX[1]=gearOneRef[2]+ 115;
    lGearOneY[1]=gearOneRef[3]+ 35;
    
    //landing gear two
    lGearTwoX[0]=gearTwoRef[0]+ 130;
    lGearTwoY[0]=gearTwoRef[1]+ 30;
    lGearTwoX[1]=gearTwoRef[2]+ 125;
    lGearTwoY[1]=gearTwoRef[3]+ 35;
    



  
  }
  
  //****************************************************************************************88
    public static String[] lineDisplay(String nameOfFile, int bLine, int eLine)
  {
     String line = null;
     int presentLineNum=0;
     BufferedReader obj=null;
     
     String[] firstArray=new String[eLine-bLine];
     int count=0;
     
//Code to obtain the info on text file
     
     try
     {
          obj=new BufferedReader(new FileReader(nameOfFile));
          while(presentLineNum<=bLine){
            if(obj.readLine()==null){
                  throw new IOException("No info in file");
            } else { presentLineNum++; } 
          }
                //read until the end 
            while(presentLineNum<=eLine) {
                line = obj.readLine();
                if (line==null) {
                  //
                    break;
                }
                firstArray[count] = line;
                count++;
                presentLineNum++;
            }
     }catch(IOException ex)
     {
        System.out.println("Cannot read file.\n" + ex.getMessage());
     }finally
     {
       try
       {
         if(obj!=null)
             obj.close(); 
       } catch (IOException no){}
     }
     
     return firstArray;
    
  }


    

    final String[] secondArray=lineDisplay("info.txt",0,71);
//arrays for each label
    final String[] p1Array=lineDisplay("info.txt", 1, 10);
    final String[] p2Array=lineDisplay("info.txt",12,21);
    final String[] p3Array=lineDisplay("info.txt",23,32);
    final String[] p4Array=lineDisplay("info.txt",34,43);
    final String[] p5Array=lineDisplay("info.txt",45,54);
    final String[] p6Array=lineDisplay("info.txt",56,65);
    

    

 
//************************************************************************************************************************************************************************************Code above is experimental
  
  

   //Constructor
  public Spaceship_3_2(){ 
   setBackground(Color.black);
   setOpaque(false);
   setPreferredSize(new Dimension(1300, 450));
   addMouseMotionListener(new mList());
   addMouseListener(new mList());
   

   
   // creating and adding a label, lets see....
    JLabel fOne = new JLabel();
    Font font = new Font("Times New Roman", Font.BOLD, 15);
    fOne.setFont(font);
    fOne.setForeground(Color.WHITE);
    fOne.setBackground(new Color(0,0,0,100));
    fOne.setOpaque(true);
    fOne.setText(Arrays.toString(p1Array));
    add(fOne);
   
   // creating and adding a label, lets see....
    JLabel fTwo = new JLabel();
    fTwo.setFont(font);
    fTwo.setForeground(Color.WHITE);
    fTwo.setBackground(new Color(0,0,0,100));
    fTwo.setOpaque(true);
    fTwo.setText(Arrays.toString(p2Array));
    add(fTwo);
    
    // creating and adding a label, lets see....
    JLabel fThree = new JLabel();
    fThree.setFont(font);
    fThree.setForeground(Color.WHITE);
    fThree.setBackground(new Color(0,0,0,100));
    fThree.setOpaque(true);
    fThree.setText(Arrays.toString(p3Array));
    add(fThree);
    
    // creating and adding a label, lets see....
    JLabel fFour = new JLabel();
    fFour.setFont(font);
    fFour.setForeground(Color.WHITE);
    fFour.setBackground(new Color(0,0,0,100));
    fFour.setOpaque(true);
    fFour.setText(Arrays.toString(p4Array));
    add(fFour);
    
    // creating and adding a label, lets see....
    JLabel fFive = new JLabel();
    fFive.setFont(font);
    fFive.setForeground(Color.WHITE);
    fFive.setBackground(new Color(0,0,0,100));
    fFive.setOpaque(true);
    fFive.setText(Arrays.toString(p5Array));
    add(fFive);
    
    // creating and adding a label, lets see....
    JLabel fSix = new JLabel();
    fSix.setFont(font);
    fSix.setForeground(Color.WHITE);
    fSix.setBackground(new Color(0,0,0,100));
    fSix.setOpaque(true);
    fSix.setText(Arrays.toString(p6Array));
    add(fSix);
   

  }
  
  public void paintComponent(Graphics o){
  
   
    setPos();
    super.paintComponent(o);
   
    // main body of the plane
    o.setColor(new Color(0,255,0,90));   //0, 255, 0, 60 - green
    o.fillPolygon(xLine, yLine, xLine.length);
  
    // tail 
    o.setColor(new Color(255,128,0,90));  // 255, 128, 0, 60 - orange
    o.fillPolygon(xLine2, yLine2, xLine2.length);
    
    //window
    o.setColor(new Color(255,255,0,90));
    o.fillPolygon(xLine3, yLine3, xLine3.length);
    

    if( count%2 != 0)
    {
   
    //landing gear one darwing code   
    o.setColor(Color.red);
    o.drawPolyline(lGearOneX, lGearOneY, lGearOneX.length);
    
    // landing gear two drawing code
    o.setColor(Color.red);
    o.drawPolyline(lGearTwoX, lGearTwoY, lGearTwoX.length);
    
    }
    
    
  }
  

  
// MouseListener
       private class mList implements MouseListener, MouseMotionListener{
          
          public void mousePressed (MouseEvent event){} 
          public void mouseClicked (MouseEvent event){count++;}
          public void mouseReleased (MouseEvent event){} 
          
          public void mouseEntered (MouseEvent event)
          {
            int x = event.getX();
            int y = event.getY();
            
  
            //updating body coordinates
            for (int index = 0; index < xyLineRef.length; index+=2)
            {
              xyLineRef[index] = x;
              xyLineRef[index + 1]   = y;
            }

            
            
            //updating tail coordinates
            for (int index = 0; index < xyLine2Ref.length; index+=2)
            {
             xyLine2Ref[index] = x;
             xyLine2Ref[index + 1] = y;
            }
            
            //updating window coordinates
            for (int index = 0; index < xyLine3Ref.length; index+=2)
            {
             xyLine3Ref[index] = x;
             xyLine3Ref[index + 1] = y;
            }
            
              //updating gear one coordinates
            for (int index = 0; index < gearOneRef.length; index+=2)
            {
             gearOneRef[index] = x;
             gearOneRef[index + 1] = y;
            }

            
            // updating gear two coordinates
           for (int index = 0; index < gearTwoRef.length; index+=2)
            {
             gearTwoRef[index] = x;
             gearTwoRef[index + 1] = y;
            }      
            repaint();
           
            
          }
          
          public void mouseMoved (MouseEvent event)
          {
      
            int x = event.getX();
            int y = event.getY();
            
            //updating body coordinates
            for (int index = 0; index < xyLineRef.length; index+=2)
            {
              xyLineRef[index] = x;
              xyLineRef[index + 1]   = y;
            }

            
            
            //updating tail coordinates
            for (int index = 0; index < xyLine2Ref.length; index+=2)
            {
             xyLine2Ref[index] = x;
             xyLine2Ref[index + 1] = y;
            }
            
            //updating window coordinates
            for (int index = 0; index < xyLine3Ref.length; index+=2)
            {
             xyLine3Ref[index] = x;
             xyLine3Ref[index + 1] = y;
            }
            
              //updating gear one coordinates
            for (int index = 0; index < gearOneRef.length; index+=2)
            {
             gearOneRef[index] = x;
             gearOneRef[index + 1] = y;
            }

            
            // updating gear two coordinates
           for (int index = 0; index < gearTwoRef.length; index+=2)
            {
             gearTwoRef[index] = x;
             gearTwoRef[index + 1] = y;
            }      
            repaint();
      
          
          }
          public void mouseExited (MouseEvent event){} 
          public void mouseDragged (MouseEvent event){}
        
        } 
  
  
  


}