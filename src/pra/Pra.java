/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pra;
//import com.jtattoo.demo.images.ImageHelper;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.jtattoo.plaf.smart.*;
import static java.lang.Thread.sleep;

/**
 *
 * @author Zeeshan Liaqaty
 */
public class Pra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        
        
        
         try {
            
            
            // setTheme(Strihng themeName, String licenseKey, String logoString)
            com.jtattoo.plaf.acryl.AcrylLookAndFeel.setTheme("YELLOW", "INSERT YOUR LICENSE KEY HERE", "my company");
            
            // select the Look and Feel
            UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
            
            // start the demo application
            Image icon = Toolkit.getDefaultToolkit().getImage("E:\\vote.png");  
 
 // ev a=new ev();
    
   // a.ss();
     
            splashscreen b=new splashscreen();
            b.setIconImage(icon);
             
b.setVisible(true);
            int i;
              for(i=0;i<=100; i=i+2){
                try{
              Thread.sleep(80);
                b.per.setText(Integer.toString(i)+"%");
               b.progress.setValue(i);
                Thread.sleep(20); 
                }catch(Exception e){
        e.printStackTrace(); }
                
                
               if(i==100){
          b.setVisible(false);
     main1 a=new main1();  }
               
                } 

       
        } catch (Exception ex) {
            ex.printStackTrace();

        
        // TODO code application logic here
      //  pr s=new pr();
   /*   try {
          
                      Properties props = new Properties();
            
            props.put("logoString", "my company"); 
            props.put("licenseKey", "INSERT YOUR LICENSE KEY HERE");
            
            props.put("selectionBackgroundColor", "254 254 254"); 
            props.put("menuSelectionBackgroundColor", "180 240 197"); 
            
            props.put("controlColor", "218 254 230");
            props.put("controlColorLight", "218 254 230");
            props.put("controlColorDark", "180 240 197"); 

            props.put("buttonColor", "218 230 254");
            props.put("buttonColorLight", "255 255 255");
            props.put("buttonColorDark", "244 242 232");

            props.put("rolloverColor", "218 254 230"); 
            props.put("rolloverColorLight", "218 254 230"); 
            props.put("rolloverColorDark", "180 240 197"); 

            props.put("windowTitleForegroundColor", "200,20,206");
            props.put("windowTitleBackgroundColor", "256,256,156"); 
            props.put("windowTitleColorLight", "218 254 230"); 
            props.put("windowTitleColorDark", "180 240 197"); 
            props.put("windowBorderColor", "200,256,156");
            
            // set your theme
            
            
            
            SmartLookAndFeel.setCurrentTheme(props);
     
          
          
          
          
          
          
            // select Look and Feel
            UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
            // start application
            splashscreen b=new splashscreen();
            int i;
              for(i=0;i<=100; i=i+2){
                try{
              Thread.sleep(80);
                b.per.setText(Integer.toString(i)+"%");
               b.progress.setValue(i);
                Thread.sleep(20); 
                }catch(Exception e){
        e.printStackTrace(); }
                
                
               if(i==100){
          b.setVisible(false);
     main a=new main();  }
               
                } 

            
            
            
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

     */ 
      
      
      
      
      /*splashscreen b=new splashscreen();

             int i;
              for(i=0;i<=100; i=i+2){
                try{
              Thread.sleep(80);
                b.per.setText(Integer.toString(i)+"%");
               b.progress.setValue(i);
                Thread.sleep(20); 
                }catch(Exception e){
        e.printStackTrace(); }
                
                
               if(i==100){
          b.setVisible(false);
     main a=new main();  }
               
                } 
         
              }
    
     
      if(i==100){
          b.setVisible(false);
     main a=new main();   */  
    }   
}}