/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FrontEnd;

import DB.Update;
import DB.DBConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Kairav
 */
public class MedicationUpdate extends javax.swing.JFrame {

    /**
     * Creates new form Screen1
     */
    
    public static String id;
    public MedicationUpdate() {
        initComponents();
        ImageIcon pic = new ImageIcon("src\\main\\resources\\pulseNew.png");
            this.setIconImage(pic.getImage());
        setSize(526, 365);
        setLocationRelativeTo(null);

        
        DBConnector.connect();
        id = Update.downloadSelected();

        //fills in information on selected option
        String sql = "SELECT medicationName, stockRemaining, sideEffects, allergens, illnessTreated  FROM medication WHERE medicationName='" + id + "';";
        try {
            ResultSet rs = DBConnector.read(sql);
            while (rs.next()) {
                nameField.setText(rs.getString("medicationName"));
                allergyArea.setText(rs.getString("allergens"));
                effectsArea.setText(rs.getString("sideEffects"));
                treatedArea.setText(rs.getString("illnessTreated"));
                stockField.setText(rs.getString("stockRemaining"));

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

        titleLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        nameField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        subTitleLabel = new javax.swing.JLabel();
        editButton = new javax.swing.JButton();
        stockLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        allergyArea = new javax.swing.JTextArea();
        AllergyLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        effectsArea = new javax.swing.JTextArea();
        effectsLabel = new javax.swing.JLabel();
        instructionLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        treatedArea = new javax.swing.JTextArea();
        treatedLabel = new javax.swing.JLabel();
        stockField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        titleLabel.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        titleLabel.setText("Doctor Information Terminal");

        backButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kairav\\OneDrive\\Pictures\\logoutIcon.png")); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        nameField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        nameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameLabel.setText("Name:");

        subTitleLabel.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        subTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subTitleLabel.setText("Medication Information");
        subTitleLabel.setOpaque(true);

        editButton.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        editButton.setText("Update");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        stockLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        stockLabel.setText("Stock:");

        allergyArea.setColumns(20);
        allergyArea.setRows(5);
        jScrollPane1.setViewportView(allergyArea);

        AllergyLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AllergyLabel.setText("Allergens:");

        effectsArea.setColumns(20);
        effectsArea.setRows(5);
        jScrollPane2.setViewportView(effectsArea);

        effectsLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        effectsLabel.setText("Side Effects:");

        instructionLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        instructionLabel.setText("If no allergens  or Side Effects write 'N/A'");

        treatedArea.setColumns(20);
        treatedArea.setRows(5);
        jScrollPane3.setViewportView(treatedArea);

        treatedLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        treatedLabel.setText("Illnesses Treated:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156)
                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel)
                .addGap(90, 90, 90))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(instructionLabel)
                                .addGap(0, 99, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(124, 124, 124)
                                .addComponent(stockField))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(AllergyLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(effectsLabel))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nameLabel)
                                        .addGap(190, 190, 190)
                                        .addComponent(stockLabel))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(treatedLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subTitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(instructionLabel)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(stockLabel)
                                .addComponent(nameLabel))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stockField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AllergyLabel)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(effectsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(treatedLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   //change screen
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        Update.clearSelected();
        new Medication().setVisible(true);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    //update DB
    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
    String name=nameField.getText();
    String effects= effectsArea.getText();
    String allergens=allergyArea.getText();
    String treated=treatedArea.getText();
    int stock=Integer.parseInt(stockField.getText());
    
        String sql = "UPDATE medication SET medicationName='"+name+"', stockRemaining='"+stock+"', sideEffects='"+effects+"', allergens='"+allergens+"', illnessTreated='"+treated+"' WHERE medicationName='"+id+"';";
        try {
            DB.DBConnector.update(sql);
            JOptionPane.showMessageDialog(rootPane,"Information Has Been Updated");
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error in SQL query");
        }
    }//GEN-LAST:event_editButtonActionPerformed

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
                new MedicationUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AllergyLabel;
    private javax.swing.JTextArea allergyArea;
    private javax.swing.JButton backButton;
    private javax.swing.JButton editButton;
    private javax.swing.JTextArea effectsArea;
    private javax.swing.JLabel effectsLabel;
    private javax.swing.JLabel instructionLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField stockField;
    private javax.swing.JLabel stockLabel;
    private javax.swing.JLabel subTitleLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextArea treatedArea;
    private javax.swing.JLabel treatedLabel;
    // End of variables declaration//GEN-END:variables
}
