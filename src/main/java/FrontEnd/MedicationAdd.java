/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FrontEnd;

import Backend.DB.Patient;
import Backend.DB.DBConnector;
import Backend.DB.Medicine;
import javax.swing.ImageIcon;

/**
 *
 * @author Kairav
 */
public class MedicationAdd extends javax.swing.JFrame {

    /**
     * Creates new form Screen1
     */

    public MedicationAdd() {
        initComponents();
        ImageIcon pic = new ImageIcon("src\\main\\resources\\pulseNew.png");
            this.setIconImage(pic.getImage());    
        setSize(600,440);
        setLocationRelativeTo(null);
        
        DBConnector.connect();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        effectsLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        instructionLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        treatedArea = new javax.swing.JTextArea();
        subTitleLabel = new javax.swing.JLabel();
        treatedLabel = new javax.swing.JLabel();
        stockLabel = new javax.swing.JLabel();
        stockField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        allergyArea = new javax.swing.JTextArea();
        AllergyLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        sideEffectsArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        backButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kairav\\OneDrive\\Pictures\\logoutIcon.png")); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        AddButton.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        titleLabel.setText("Doctor Information Terminal");

        effectsLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        effectsLabel.setText("Side Effects:");

        nameField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        instructionLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        instructionLabel.setText("If no allergens  or Side Effects write 'N/A'");

        nameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nameLabel.setText("Name:");

        treatedArea.setColumns(20);
        treatedArea.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        treatedArea.setRows(5);
        jScrollPane3.setViewportView(treatedArea);

        subTitleLabel.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        subTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subTitleLabel.setText("Medication Information");
        subTitleLabel.setOpaque(true);

        treatedLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        treatedLabel.setText("Illnesses Treated:");

        stockLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        stockLabel.setText("Stock:");

        allergyArea.setColumns(20);
        allergyArea.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        allergyArea.setRows(5);
        jScrollPane1.setViewportView(allergyArea);

        AllergyLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AllergyLabel.setText("Allergens:");

        sideEffectsArea.setColumns(20);
        sideEffectsArea.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        sideEffectsArea.setRows(5);
        jScrollPane2.setViewportView(sideEffectsArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 257, Short.MAX_VALUE)
                .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(150, 150, 150)
                            .addComponent(instructionLabel))
                        .addComponent(subTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(100, 100, 100)
                            .addComponent(titleLabel))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(80, 80, 80)
                            .addComponent(nameLabel)
                            .addGap(17, 17, 17)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(70, 70, 70)
                            .addComponent(stockLabel)
                            .addGap(12, 12, 12)
                            .addComponent(stockField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addComponent(AllergyLabel)
                            .addGap(9, 9, 9)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(effectsLabel)
                            .addGap(12, 12, 12)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(treatedLabel)
                            .addGap(11, 11, 11)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(377, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(71, 71, 71)
                            .addComponent(instructionLabel))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(subTitleLabel))
                        .addComponent(titleLabel))
                    .addGap(34, 34, 34)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(stockLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(stockField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(AllergyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(effectsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(treatedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(88, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    //change screen
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
         new Medication().setVisible(true);
         dispose();
    }//GEN-LAST:event_backButtonActionPerformed

// add to DB
    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here:
        String name=nameField.getText();
        String allergy=allergyArea.getText();
        String sideEffects=sideEffectsArea.getText();
        String treatedIllnesses=treatedArea.getText();
        int stock=Integer.parseInt(stockField.getText());
        
        Medicine.addMed(name,allergy,sideEffects,treatedIllnesses,stock);
    }//GEN-LAST:event_AddButtonActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JLabel AllergyLabel;
    private javax.swing.JTextArea allergyArea;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel effectsLabel;
    private javax.swing.JLabel instructionLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextArea sideEffectsArea;
    private javax.swing.JTextField stockField;
    private javax.swing.JLabel stockLabel;
    private javax.swing.JLabel subTitleLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextArea treatedArea;
    private javax.swing.JLabel treatedLabel;
    // End of variables declaration//GEN-END:variables
}
