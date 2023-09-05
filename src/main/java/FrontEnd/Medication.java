/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FrontEnd;

import javax.swing.JOptionPane;
import Backend.DB.SelectedOption;
import Backend.DB.DBConnector;
import Backend.DB.Medicine;
import javax.swing.ImageIcon;

/**
 *
 * @author Kairav
 */
public class Medication extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    String selected;

    public Medication() {
        initComponents();
        ImageIcon pic = new ImageIcon("src\\main\\resources\\pulseNew.png");
        this.setIconImage(pic.getImage());
        setSize(600,440);
        setLocationRelativeTo(null);

        DBConnector.connect();
        String[] medication = Medicine.loadMedicationList();

        //populates the list with medication
        MedicationList.setListData(medication);

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
        editButton = new javax.swing.JButton();
        listLabel = new javax.swing.JLabel();
        PatientList = new javax.swing.JScrollPane();
        MedicationList = new javax.swing.JList<>();
        filterInput = new javax.swing.JTextField();
        instruction = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        newMedicationButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(526, 350));

        titleLabel.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        titleLabel.setText("Doctor Information Terminal");

        editButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        editButton.setText("Update/View");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        listLabel.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        listLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        listLabel.setText("List Of Medication");

        MedicationList.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        PatientList.setViewportView(MedicationList);

        filterInput.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        filterInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filterInputKeyReleased(evt);
            }
        });

        instruction.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        instruction.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        instruction.setText("Search a Medication");

        logoutButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kairav\\OneDrive\\Pictures\\logoutIcon.png")); // NOI18N
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        newMedicationButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        newMedicationButton.setText("Add Medication");
        newMedicationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newMedicationButtonActionPerformed(evt);
            }
        });

        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deleteIcon.png"))); // NOI18N
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(editButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(newMedicationButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(PatientList, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(instruction, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(filterInput, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(listLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(75, 75, 75)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(titleLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(titleLabel)
                .addGap(32, 32, 32)
                .addComponent(instruction)
                .addGap(18, 18, 18)
                .addComponent(filterInput, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(listLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PatientList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(editButton)
                        .addComponent(newMedicationButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//update DB
    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:

        selected = MedicationList.getSelectedValue();
        if (selected == null) {
            JOptionPane.showMessageDialog(null, "Select An option first.");
        } else {
            SelectedOption.uploadSelected(selected);
            new MedicationUpdate().setVisible(true);
            dispose();
        }

    }//GEN-LAST:event_editButtonActionPerformed

//change screen
    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void newMedicationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newMedicationButtonActionPerformed
        // TODO add your handling code here
        new MedicationAdd().setVisible(true);
        dispose();

    }//GEN-LAST:event_newMedicationButtonActionPerformed

    //search
    private void filterInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filterInputKeyReleased
        // TODO add your handling code here:
        String[] medication = Medicine.searchMed(filterInput.getText(), "medicationName");
        MedicationList.setListData(medication);

    }//GEN-LAST:event_filterInputKeyReleased

//delete from DB
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        selected = MedicationList.getSelectedValue();
        if (selected == null) {
            JOptionPane.showMessageDialog(null, "Select An option first.");
        } else {
            JOptionPane.showMessageDialog(rootPane, selected + " has been deleted");
            Medicine.deleteMed(selected);
            String names[] = Medicine.loadMedicationList();
            MedicationList.setListData(names);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> MedicationList;
    private javax.swing.JScrollPane PatientList;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField filterInput;
    private javax.swing.JLabel instruction;
    private javax.swing.JLabel listLabel;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton newMedicationButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
