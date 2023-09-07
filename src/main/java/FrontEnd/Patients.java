/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FrontEnd;

import Backend.DB.DBConnector;
import Backend.Password;
import Backend.DB.SelectedOption;
import Backend.DB.Patient;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Kairav
 */
public class Patients extends javax.swing.JFrame {

    /**
     * Creates new form Patients
     */
    public Patients() {

        initComponents();
        ImageIcon pic = new ImageIcon("src\\main\\resources\\pulseNew.png");
        this.setIconImage(pic.getImage());
        setSize(600,440);
        setLocationRelativeTo(null);

        DBConnector.connect();
        String[] names = Patient.loadPatientList();
        //populates list with patients
        patientList.setListData(names);
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
        patientList = new javax.swing.JList<>();
        filterInput = new javax.swing.JTextField();
        criteriaButton = new javax.swing.JButton();
        instructionLabel = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        newPatientButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(526, 350));

        titleLabel.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        titleLabel.setText("Doctor Information Terminal");

        editButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        listLabel.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        listLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        listLabel.setText("List Of Patients");

        patientList.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        PatientList.setViewportView(patientList);

        filterInput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        filterInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filterInputKeyReleased(evt);
            }
        });

        criteriaButton.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        criteriaButton.setText("Change Search Criteria");
        criteriaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criteriaButtonActionPerformed(evt);
            }
        });

        instructionLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        instructionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        instructionLabel.setText("Search Criteria: Firstname");

        logoutButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kairav\\OneDrive\\Pictures\\logoutIcon.png")); // NOI18N
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        newPatientButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        newPatientButton.setText("Add Patient");
        newPatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPatientButtonActionPerformed(evt);
            }
        });

        viewButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        viewButton.setText("View");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
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
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(instructionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(editButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(newPatientButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(viewButton))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(PatientList, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(titleLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(filterInput, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(191, 191, 191)
                                .addComponent(listLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addComponent(criteriaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(titleLabel)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(criteriaButton)
                        .addGap(11, 11, 11)
                        .addComponent(instructionLabel)
                        .addGap(12, 12, 12)
                        .addComponent(filterInput, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(listLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PatientList, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(viewButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(newPatientButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(46, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //update information
    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        String selected = patientList.getSelectedValue();
        String id = "" + (Patient.getId(selected));
        SelectedOption.uploadSelected(id);
        new PatientUpdate().setVisible(true);

        dispose();
    }//GEN-LAST:event_editButtonActionPerformed
//change search criteria
    private void criteriaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criteriaButtonActionPerformed
        // TODO add your handling code here:

        Criteria = Patient.criteria(Criteria);
        instructionLabel.setText("Search Criteria: " + Patient.criteriaOut(Criteria));

    }//GEN-LAST:event_criteriaButtonActionPerformed
//change screen
    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed
    private void newPatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPatientButtonActionPerformed
        // TODO add your handling code here
        new PatientAdd().setVisible(true);
        dispose();

    }//GEN-LAST:event_newPatientButtonActionPerformed

//search
    private void filterInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filterInputKeyReleased
        // TODO add your handling code here:
        String[] names = Patient.searchPat(filterInput.getText(), Criteria);
        patientList.setListData(names);
    }//GEN-LAST:event_filterInputKeyReleased

    //change screen
    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // TODO add your handling code here:
        
        try {
            String selected = patientList.getSelectedValue();
            String id = "" + (Patient.getId(selected));
            SelectedOption.uploadSelected(id);
        } catch (java.lang.NullPointerException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Select An option first.");
        }
        new Consults().setVisible(true);
        dispose();
    }//GEN-LAST:event_viewButtonActionPerformed

    //delete from DB
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        try {
            String selected =  patientList.getSelectedValue();;
            int id = Patient.getId(selected);
            Patient.deletePat(selected, id);
            String names[] = Patient.loadPatientList();
            patientList.setListData(names);
     
        } catch (java.lang.NullPointerException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Select An option first.");
        }

    }//GEN-LAST:event_deleteButtonActionPerformed

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane PatientList;
    private javax.swing.JButton criteriaButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField filterInput;
    private javax.swing.JLabel instructionLabel;
    private javax.swing.JLabel listLabel;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton newPatientButton;
    private javax.swing.JList<String> patientList;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}
