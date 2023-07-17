/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FrontEnd;

import DB.DBConnector;
import DB.Update;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Kairav
 */
public class Consult extends javax.swing.JFrame {

    /**
     * Creates new form Consult
     */
    public static int id;
    public static int consults;
    public static int newestconsult;

    public Consult() {
        initComponents();
        ImageIcon pic = new ImageIcon("src\\main\\resources\\pulseNew.png");
            this.setIconImage(pic.getImage());
        setSize(526, 370);
        setLocationRelativeTo(null);

        
        
        
        //connect to db
        DBConnector.connect();
        id = Integer.parseInt(Update.downloadSelected());
        
        String sql = "SELECT Firstname, Surname, Medical_Conditions, numConsult,Allergy  FROM patient WHERE PatientNumber='" + id + "';";
        try {
            ResultSet rs = DBConnector.read(sql);
            while (rs.next()) {
                fullname.setText(rs.getString("Firstname") + " " + rs.getString("Surname"));
                conditionsArea.setText("Conditions: " + rs.getString("Medical_Conditions") + "\nAllergies: " + rs.getString("Allergy"));
                consults = rs.getInt("numConsult");
                newestconsult = consults;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error in SQL query");
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exitButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        DiagnosisButton = new javax.swing.JButton();
        MedicationButton = new javax.swing.JButton();
        patientName = new javax.swing.JLabel();
        fullname = new javax.swing.JLabel();
        illnessLabel = new javax.swing.JLabel();
        medicationLabel = new javax.swing.JLabel();
        symptomsLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        symptoms = new javax.swing.JTextArea();
        illnesses = new javax.swing.JTextField();
        medication = new javax.swing.JTextField();
        LogconsultButton = new javax.swing.JButton();
        conditionsLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        conditionsArea = new javax.swing.JTextArea();
        dateField = new javax.swing.JTextField();
        dateLabel = new javax.swing.JLabel();
        NextConsultButton1 = new javax.swing.JButton();
        PreviousConsultButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoutIcon.png"))); // NOI18N
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Consultation");

        DiagnosisButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        DiagnosisButton.setText("Diagnose Patient");
        DiagnosisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiagnosisButtonActionPerformed(evt);
            }
        });

        MedicationButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        MedicationButton.setText("Perscribe Medication");
        MedicationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedicationButtonActionPerformed(evt);
            }
        });

        patientName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        patientName.setText("Patient Name:");

        fullname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        illnessLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        illnessLabel.setText("Illness:");

        medicationLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        medicationLabel.setText("Medication:");

        symptomsLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        symptomsLabel.setText("Symptoms:");

        symptoms.setColumns(20);
        symptoms.setRows(5);
        jScrollPane1.setViewportView(symptoms);

        LogconsultButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LogconsultButton.setText("Log Consult");
        LogconsultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogconsultButtonActionPerformed(evt);
            }
        });

        conditionsLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        conditionsLabel.setText("Conditions and Allergies:");

        conditionsArea.setColumns(20);
        conditionsArea.setRows(5);
        jScrollPane2.setViewportView(conditionsArea);

        dateLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dateLabel.setText("Date:");

        NextConsultButton1.setText("Next Consult");
        NextConsultButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextConsultButton1ActionPerformed(evt);
            }
        });

        PreviousConsultButton.setText("Previous Consult");
        PreviousConsultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreviousConsultButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DiagnosisButton, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MedicationButton)
                        .addGap(63, 63, 63))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(medicationLabel)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(symptomsLabel)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(32, 32, 32)
                                            .addComponent(illnessLabel)))
                                    .addComponent(patientName)
                                    .addComponent(dateLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(conditionsLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(NextConsultButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1)
                                        .addComponent(fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane1)
                                        .addComponent(medication)
                                        .addComponent(illnesses, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LogconsultButton, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(100, 100, 100)
                                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(PreviousConsultButton)))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(patientName)
                            .addComponent(fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateLabel)
                            .addComponent(PreviousConsultButton)))
                    .addComponent(NextConsultButton1))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(illnessLabel)
                    .addComponent(illnesses, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(medication, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(medicationLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(symptomsLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(conditionsLabel)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addComponent(LogconsultButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MedicationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DiagnosisButton))))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//change screen
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        Update.clearSelected();
        new Patients().setVisible(true);
        dispose();
    }//GEN-LAST:event_exitButtonActionPerformed

    private void DiagnosisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiagnosisButtonActionPerformed
        // TODO add your handling code here:
        new Diagnosis().setVisible(true);
        dispose();
    }//GEN-LAST:event_DiagnosisButtonActionPerformed

    private void MedicationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedicationButtonActionPerformed
        // TODO add your handling code here:
        new Perscribe().setVisible(true);
        dispose();
    }//GEN-LAST:event_MedicationButtonActionPerformed

    //log new consult
    private void LogconsultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogconsultButtonActionPerformed
        // TODO add your handling code here:
        String diagnosis = illnesses.getText();
        String symptom = symptoms.getText();
        String date = dateField.getText();
        String med = medication.getText();
        newestconsult = consults;

        String sql = "INSERT INTO consults (idPatient, diagnosis, medication, patientConsult, date, symptom) VALUES ('" + id + "','" + diagnosis + "','" + med + "','" + consults + "','" + date + "','" + symptom + "');";
        try {
            DB.DBConnector.update(sql);
            consults++;
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error in SQL query");
        }

        String qry = "INSERT INTO patient (numConsults) VALUES ('" + consults + "');";
        try {
            DB.DBConnector.update(qry);
            JOptionPane.showMessageDialog(rootPane, "This has been Logged");
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error in SQL query");
        }

    }//GEN-LAST:event_LogconsultButtonActionPerformed

    //view other consults
    private void NextConsultButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextConsultButton1ActionPerformed
        // TODO add your handling code here:
        consults++;
        if (consults <= newestconsult) {

            String sql = "SELECT diagnosis, medication, date, symptom FROM consults WHERE patientConsult='" + consults + "';";
            try {
                ResultSet rs = DBConnector.read(sql);
                while (rs.next()) {
                    illnesses.setText(rs.getString("diagnosis"));
                    medication.setText(rs.getString("medication"));
                    symptoms.setText(rs.getString("symptom"));
                    dateField.setText(rs.getString("date"));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error in SQL query");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "This is the newest consult.Click ok to log a new one");
            illnesses.setText("");
            medication.setText("");
            symptoms.setText("");
            dateField.setText("");
        }
    }//GEN-LAST:event_NextConsultButton1ActionPerformed

    private void PreviousConsultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreviousConsultButtonActionPerformed
        // TODO add your handling code here:
        consults--;
        if (consults > 0) {
            String sql = "SELECT diagnosis, medication, date, symptom FROM consults WHERE patientConsult='" + consults + "';";
            try {
                ResultSet rs = DBConnector.read(sql);
                while (rs.next()) {
                    illnesses.setText(rs.getString("diagnosis"));
                    medication.setText(rs.getString("medication"));
                    symptoms.setText(rs.getString("symptom"));
                    dateField.setText(rs.getString("date"));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error in SQL query");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "This is the oldest consult");
        }
    }//GEN-LAST:event_PreviousConsultButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Consult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DiagnosisButton;
    private javax.swing.JButton LogconsultButton;
    private javax.swing.JButton MedicationButton;
    private javax.swing.JButton NextConsultButton1;
    private javax.swing.JButton PreviousConsultButton;
    private javax.swing.JTextArea conditionsArea;
    private javax.swing.JLabel conditionsLabel;
    private javax.swing.JTextField dateField;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel fullname;
    private javax.swing.JLabel illnessLabel;
    private javax.swing.JTextField illnesses;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField medication;
    private javax.swing.JLabel medicationLabel;
    private javax.swing.JLabel patientName;
    private javax.swing.JTextArea symptoms;
    private javax.swing.JLabel symptomsLabel;
    // End of variables declaration//GEN-END:variables
}
