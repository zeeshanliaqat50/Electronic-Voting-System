/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pra;

/**
 *
 * @author Zeeshan Liaqat
 */
import java.lang.*;
import java.sql.*;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
public class dbconnect {
    private Statement st;
    private Connection con;
    private ResultSet rs;
    dbconnect()
    {
        try{
        String url="jdbc:ucanaccess://E:/mplproj/evoting.mdb";
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
         con=DriverManager.getConnection(url);
         st=con.createStatement();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    void setrecord(String id,String name)    
    {
        try{
     int a=st.executeUpdate("insert into voterrecord values('"+id+"','"+name+"')");
     if(a==1)
     {
         JOptionPane.showMessageDialog(null,"Record Successully Inserted");
         
     }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Record not inserted");
            e.printStackTrace();
        }
    }
    
    int checkcnic(String a)
    {
        int c=-1;
        try{
        String q1="Select ID from voterrecord";
       rs= st.executeQuery(q1);
       // JOptionPane.showMessageDialog(null,"Entered id is"+a);
       while(rs.next()){
           if(a.contains(rs.getString(1))){
               c=c+2 ;}
      // JOptionPane.showMessageDialog(null,"ID is"+rs.getString(1));
       
       }
       if(c==-1)
        return -1; 
       else
      return 1 ; 
        
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    return 0;
    }
    
    void candRegistration(String id,String name)
    {
        
     try{
         int a=st.executeUpdate("insert into candidaterecord VALUES('"+id+"','"+name+"','"+0+"')");
     if(a==1)
     {
         JOptionPane.showMessageDialog(null,"Record Successully Inserted");
         
     }
     else
     {
         JOptionPane.showMessageDialog(null,"ERROR");
         
     }
        }
        catch(Exception e) 
        {
            JOptionPane.showMessageDialog(null,"Record not inserted");
            e.printStackTrace();
        }
   
    }
    int  checktransperency(String id)
    {
        try{
              int a= st.executeUpdate("insert into votebank values('"+id+"')");  
              return 1;
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"User with Cnic has already cast vote");
        }
        return 0;
    }
    
    int candidatebank(String name1){
        try{
            String tv=null;
            PreparedStatement p =con.prepareStatement("select TotalVotes from candidaterecord WHERE Name='"+name1+"' ");
             //rs=st.executeQuery("select TotalVotes from candidaterecord");
             rs=p.executeQuery();
           while(rs.next()){
              tv=rs.getString("TotalVotes");
        //     JOptionPane.showMessageDialog(null,tv);
           } 
    //    st.executeUpdate("insert into candidaterecord values ");
    int a=Integer.parseInt(tv);
    a++;
    String tv1=Integer.toString(a);
    int re=st.executeUpdate("UPDATE candidaterecord SET TotalVotes='"+tv1+"' WHERE Name='"+name1+"'");
      if(re==1){
          JOptionPane.showMessageDialog(null,"YOU HAVE SUCCESSFULLY CAST VOTE"); 
      
            }  
     }catch(Exception e) 
        {
            e.printStackTrace();
        }
        
        return 0;
    }
    void checkwinner(){
        
        try{
      rs=st.executeQuery("SELECT * FROM candidaterecord");
      while(rs.next()){
          System.out.println(rs.getString(1));
      }
        }catch(Exception e){}
        
        
    }
}
