package frontend;

import backend.AdminRole;
import javax.swing.JOptionPane;
import java.lang.RuntimeException;

public class AddTrainerWindow extends javax.swing.JFrame {

    private AdminRoleWindow prevWindow;
    private AdminRole admin;
    
    public AddTrainerWindow(AdminRoleWindow prevWindow, AdminRole admin) {
        initComponents();
        this.prevWindow = prevWindow;
        this.admin = admin;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputName = new javax.swing.JTextField();
        javax.swing.JLabel lblName = new javax.swing.JLabel();
        javax.swing.JLabel lblId = new javax.swing.JLabel();
        inputId = new javax.swing.JTextField();
        inputSpeciality = new javax.swing.JTextField();
        javax.swing.JLabel lblSpeciality = new javax.swing.JLabel();
        javax.swing.JLabel lblEmail = new javax.swing.JLabel();
        inputEmail = new javax.swing.JTextField();
        inputPhoneNumber = new javax.swing.JTextField();
        javax.swing.JLabel lblPhoneNumber = new javax.swing.JLabel();
        Add = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Trainer");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(474, 469));
        setResizable(false);
        setSize(new java.awt.Dimension(474, 469));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        inputName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputName.setMaximumSize(new java.awt.Dimension(56, 18));
        inputName.setMinimumSize(new java.awt.Dimension(56, 18));
        inputName.setPreferredSize(new java.awt.Dimension(56, 18));
        inputName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNameActionPerformed(evt);
            }
        });

        lblName.setBackground(new java.awt.Color(102, 255, 153));
        lblName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblName.setForeground(new java.awt.Color(0, 0, 0));
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("Name");
        lblName.setToolTipText("");
        lblName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblName.setOpaque(true);

        lblId.setBackground(new java.awt.Color(102, 255, 153));
        lblId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblId.setForeground(new java.awt.Color(0, 0, 0));
        lblId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblId.setText("Id");
        lblId.setToolTipText("");
        lblId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblId.setMaximumSize(new java.awt.Dimension(56, 18));
        lblId.setMinimumSize(new java.awt.Dimension(56, 18));
        lblId.setOpaque(true);
        lblId.setPreferredSize(new java.awt.Dimension(56, 18));

        inputId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputId.setMaximumSize(new java.awt.Dimension(56, 18));
        inputId.setMinimumSize(new java.awt.Dimension(56, 18));
        inputId.setPreferredSize(new java.awt.Dimension(56, 18));
        inputId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIdActionPerformed(evt);
            }
        });

        inputSpeciality.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputSpeciality.setMaximumSize(new java.awt.Dimension(56, 18));
        inputSpeciality.setMinimumSize(new java.awt.Dimension(56, 18));
        inputSpeciality.setPreferredSize(new java.awt.Dimension(56, 18));
        inputSpeciality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSpecialityActionPerformed(evt);
            }
        });

        lblSpeciality.setBackground(new java.awt.Color(102, 255, 153));
        lblSpeciality.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSpeciality.setForeground(new java.awt.Color(0, 0, 0));
        lblSpeciality.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSpeciality.setText("Speciality");
        lblSpeciality.setToolTipText("");
        lblSpeciality.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblSpeciality.setOpaque(true);

        lblEmail.setBackground(new java.awt.Color(102, 255, 153));
        lblEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(0, 0, 0));
        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmail.setText("Email");
        lblEmail.setToolTipText("");
        lblEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblEmail.setMaximumSize(new java.awt.Dimension(56, 18));
        lblEmail.setMinimumSize(new java.awt.Dimension(56, 18));
        lblEmail.setOpaque(true);
        lblEmail.setPreferredSize(new java.awt.Dimension(56, 18));

        inputEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputEmail.setMaximumSize(new java.awt.Dimension(56, 18));
        inputEmail.setMinimumSize(new java.awt.Dimension(56, 18));
        inputEmail.setPreferredSize(new java.awt.Dimension(56, 18));
        inputEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputEmailActionPerformed(evt);
            }
        });

        inputPhoneNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputPhoneNumber.setMaximumSize(new java.awt.Dimension(56, 18));
        inputPhoneNumber.setMinimumSize(new java.awt.Dimension(56, 18));
        inputPhoneNumber.setPreferredSize(new java.awt.Dimension(56, 18));
        inputPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPhoneNumberActionPerformed(evt);
            }
        });

        lblPhoneNumber.setBackground(new java.awt.Color(102, 255, 153));
        lblPhoneNumber.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPhoneNumber.setForeground(new java.awt.Color(0, 0, 0));
        lblPhoneNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPhoneNumber.setText("Phone Number");
        lblPhoneNumber.setToolTipText("");
        lblPhoneNumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblPhoneNumber.setOpaque(true);

        Add.setBackground(new java.awt.Color(0, 0, 0));
        Add.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Add.setForeground(new java.awt.Color(204, 204, 204));
        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSpeciality, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inputName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputPhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputSpeciality, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblEmail, lblId, lblName, lblPhoneNumber, lblSpeciality});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputId, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSpeciality, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputSpeciality, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {inputEmail, inputId, inputName, inputPhoneNumber, inputSpeciality, lblEmail, lblId, lblName, lblPhoneNumber, lblSpeciality});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inputNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNameActionPerformed

    private void inputIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputIdActionPerformed

    private void inputSpecialityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSpecialityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputSpecialityActionPerformed

    private void inputEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputEmailActionPerformed

    private void inputPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPhoneNumberActionPerformed
    
    private void resetFields() {
        inputId.setText("");
        inputName.setText("");
        inputEmail.setText("");
        inputSpeciality.setText("");
        inputPhoneNumber.setText("");
    }
    
    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        String trainerId = inputId.getText().strip();
        String name = inputName.getText().strip();
        String email = inputEmail.getText().strip();
        String speciality = inputSpeciality.getText().strip();
        String phoneNumber = inputPhoneNumber.getText().strip();
        
        if(trainerId.equals("") || name.equals("") || email.equals("") || speciality.equals("") || phoneNumber.equals(""))
            JOptionPane.showMessageDialog(this, "Some fields are Empty!", "Error", JOptionPane.ERROR_MESSAGE);
        else {
            try {
                admin.addTrainer(trainerId, name, email, speciality, phoneNumber);
                JOptionPane.showMessageDialog(this, "The Trainer with Id = " + trainerId + " has been successfully added");
                resetFields();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_AddActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        prevWindow.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JTextField inputId;
    private javax.swing.JTextField inputName;
    private javax.swing.JTextField inputPhoneNumber;
    private javax.swing.JTextField inputSpeciality;
    // End of variables declaration//GEN-END:variables
}
