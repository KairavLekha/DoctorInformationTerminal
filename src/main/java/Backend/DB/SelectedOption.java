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
public class SelectedOption {
    public static String downloadSelected(){
      String sql = "select identifier FROM selected;";
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
    
    public static void uploadSelected(String option){
      String sql = "UPDATE selected SET identifier='"+option+"'WHERE selectedID=1;";
        try {
            DBConnector.update(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error in SQL query");
        }   
    }
    

    
}
