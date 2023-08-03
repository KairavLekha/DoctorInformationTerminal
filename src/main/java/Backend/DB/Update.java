/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.DB;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Kairav
 */
public class Update {
    
    public static void updateIllness(String x,String y,String z) {
     String sql = "UPDATE illnesses SET Illness='"+x+"',Symptoms='"+y+"' WHERE Illness='"+z+"';";
        try {
           DBConnector.update(sql);
            JOptionPane.showMessageDialog(null,"Information Has Been Updated");
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error in SQL query");
        }
    }
        
    public static void updateMedication(String v,int w,String x,String y,String u,String z) {
         String sql = "UPDATE medication SET medicationName='"+v+"', stockRemaining='"+w+"', sideEffects='"+x+"', allergens='"+y+"', illnessTreated='"+u+"' WHERE medicationName='"+z+"';";
        try {
            DBConnector.update(sql);
            JOptionPane.showMessageDialog(null,"Information Has Been Updated");
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error in SQL query");
        }
        
    }
    
    public static void updatePatient(String s,String t,String u,String v,String w,String x,String y,int z){
          String sql = "UPDATE patient SET Firstname='"+s+"', Surname='"+t+"', Date_Of_Birth='"+u+"', Medical_Conditions='"+v+"', Phone_Number='"+w+"', Address= '"+x+"', Allergy='"+y+"' WHERE PatientNumber="+z+";";
        try {
            DBConnector.update(sql);
            JOptionPane.showMessageDialog(null,"Information Has Been Updated");
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error in SQL query");
        }
    }   
    
    public static String downloadSelected(String x){
      String sql = "select identifier FROM "+x+";";
      String id = null;
      //download
      try {
          ResultSet rs = DBConnector.read(sql);
            while (rs.next()) {
                id = rs.getString("identifier");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error in SQL query");
        }   
        return id;
    }
    
    public static void uploadSelected(String x,String y){
      String sql = "UPDATE "+y+" SET identifier='"+x+"'WHERE selectedID=1;";
        try {
            DBConnector.update(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error in SQL query");
        }   
    }
    
    public static void clearSelected(String x){
      String sql = "UPDATE "+x+" SET identifier=''WHERE selectedID=1;";
        try {
            DBConnector.update(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error in SQL query");
        }   
    }
    
}
