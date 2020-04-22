/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pra;

/**
 *
 * @author Zeeshan Liaqaty
 */
public class sptest {
    public void ss(){
     splashscreen b=new splashscreen();
         //   b.setIconImage(icon);
         b.setVisible(true);

            int i;
              for(i=0;i<=100; i=i+2){
                try{
           //   Thread.sleep(80);
                b.per.setText(Integer.toString(i)+"%");
               b.progress.setValue(i);
                Thread.sleep(20); 
                }catch(Exception e){
        e.printStackTrace(); }
                
                
               if(i==100){
          b.setVisible(false);
     main1 a=new main1();  }
               
                } 
}
}