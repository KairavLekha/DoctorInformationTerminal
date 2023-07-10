/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DIT;

import DB.DBConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Backend.Methods;


/**
 *
 * @author Kairav
 */
//ColumnNames
//Illness 
//Symptoms
public class Illness extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Illness() {
        initComponents();
           
        setSize(526, 355);
        setLocationRelativeTo(null);
        
        //connect to DB 
        Methods.connect();
        String sql = "select Illness FROM illnesses ORDER BY idIllnesses;";
        try {
            ResultSet rs = DBConnector.read(sql);

            String[] illness = new String[9999];
            int i = 0;
             while (rs.next()) {
                String name = rs.getString("Illness");
                illness[i] = "Illness:" + name;
                i++;
                illnessList.setListData(illness);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error in SQL query");
        }
    }
    
    
    String Criteria = "Firstname";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        editButton = new javax.swing.JButton();
        listLabel = new javax.swing.JLabel();
        PatientList = new javax.swing.JScrollPane();
        illnessList = new javax.swing.JList<>();
        filterInput = new javax.swing.JTextField();
        logoutButton = new javax.swing.JButton();
        newIllnessButton = new javax.swing.JButton();
        instruction = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(526, 350));

        titleLabel.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        titleLabel.setText("Digital Patient Acess Terminal");

        editButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        editButton.setText("Update/View");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        listLabel.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        listLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        listLabel.setText("List Of Illnesses");

        illnessList.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        PatientList.setViewportView(illnessList);

        filterInput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        filterInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filterInputKeyReleased(evt);
            }
        });

        logoutButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kairav\\OneDrive\\Pictures\\logoutIcon.png")); // NOI18N
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        newIllnessButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        newIllnessButton.setText("Add Illness");
        newIllnessButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newIllnessButtonActionPerformed(evt);
            }
        });

        instruction.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        instruction.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        instruction.setText("Search an Illness");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(listLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(filterInput, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(instruction, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(editButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(newIllnessButton))
                                .addComponent(PatientList, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(titleLabel)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(titleLabel)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(instruction, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(filterInput, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(listLabel)
                        .addGap(18, 18, 18)
                        .addComponent(PatientList, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editButton)
                            .addComponent(newIllnessButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    //update information
    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        String selected = illnessList.getSelectedValue();
        new UpdateIllness().setVisible(true);
        dispose();
    }//GEN-LAST:event_editButtonActionPerformed

//change screen
    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        new Home().setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void newIllnessButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newIllnessButtonActionPerformed
        // TODO add your handling code here
        new AddIllness().setVisible(true);
        dispose();

    }//GEN-LAST:event_newIllnessButtonActionPerformed

    

//search
    private void filterInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filterInputKeyReleased
        // TODO add your handling code here:
        String query2 = "select firstname, surname, PatientNumber FROM Patient WHERE "+Criteria+" LIKE '%"+filterInput.getText()+"%'ORDER BY firstname;";
        try {
            ResultSet rs = DBConnector.read(query2);
            
            String[] names = new String[2144444444];
            int i = 0;
            while(rs.next()){
                String name = rs.getString("firstname");
                String surname = rs.getString("surname");
                int patientNum = rs.getInt("PatientNumber");
                names[i] ="Patient ID:"+patientNum+" "+name+ " "+surname;
                i++;
                illnessList.setListData(names);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,"Error in SQL query");
        }
    }//GEN-LAST:event_filterInputKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            DBConnector.init();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Could not find DB driver");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Could not connect to db");
        }

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Patients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Illness().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane PatientList;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField filterInput;
    private javax.swing.JList<String> illnessList;
    private javax.swing.JLabel instruction;
    private javax.swing.JLabel listLabel;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton newIllnessButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
