package frontend;

import backend.TrainerRole;
import javax.swing.JOptionPane;
import java.lang.RuntimeException;
import java.time.LocalDate;

public class RegisterMemberWindow extends javax.swing.JFrame {

    private TrainerRoleWindow prevWindow;
    private TrainerRole trainer;
    
    public RegisterMemberWindow(TrainerRoleWindow prevWindow, TrainerRole trainer) {
        initComponents();
        this.prevWindow = prevWindow;
        this.trainer = trainer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputClassId = new javax.swing.JTextField();
        javax.swing.JLabel lblName = new javax.swing.JLabel();
        javax.swing.JLabel lblId = new javax.swing.JLabel();
        inputMemberId = new javax.swing.JTextField();
        javax.swing.JLabel lblEmail = new javax.swing.JLabel();
        inputRegistrationDate = new javax.swing.JTextField();
        Register = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Register Member");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(473, 297));
        setResizable(false);
        setSize(new java.awt.Dimension(473, 297));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        inputClassId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputClassId.setMaximumSize(new java.awt.Dimension(56, 18));
        inputClassId.setMinimumSize(new java.awt.Dimension(56, 18));
        inputClassId.setPreferredSize(new java.awt.Dimension(56, 18));
        inputClassId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputClassIdActionPerformed(evt);
            }
        });

        lblName.setBackground(new java.awt.Color(102, 255, 153));
        lblName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblName.setForeground(new java.awt.Color(0, 0, 0));
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("Class Id");
        lblName.setToolTipText("");
        lblName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblName.setOpaque(true);

        lblId.setBackground(new java.awt.Color(102, 255, 153));
        lblId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblId.setForeground(new java.awt.Color(0, 0, 0));
        lblId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblId.setText("Member Id");
        lblId.setToolTipText("");
        lblId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblId.setMaximumSize(new java.awt.Dimension(56, 18));
        lblId.setMinimumSize(new java.awt.Dimension(56, 18));
        lblId.setOpaque(true);
        lblId.setPreferredSize(new java.awt.Dimension(56, 18));

        inputMemberId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputMemberId.setMaximumSize(new java.awt.Dimension(56, 18));
        inputMemberId.setMinimumSize(new java.awt.Dimension(56, 18));
        inputMemberId.setPreferredSize(new java.awt.Dimension(56, 18));
        inputMemberId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputMemberIdActionPerformed(evt);
            }
        });

        lblEmail.setBackground(new java.awt.Color(102, 255, 153));
        lblEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(0, 0, 0));
        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmail.setText("Registration Date");
        lblEmail.setToolTipText("");
        lblEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblEmail.setMaximumSize(new java.awt.Dimension(56, 18));
        lblEmail.setMinimumSize(new java.awt.Dimension(56, 18));
        lblEmail.setOpaque(true);
        lblEmail.setPreferredSize(new java.awt.Dimension(56, 18));

        inputRegistrationDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputRegistrationDate.setMaximumSize(new java.awt.Dimension(56, 18));
        inputRegistrationDate.setMinimumSize(new java.awt.Dimension(56, 18));
        inputRegistrationDate.setPreferredSize(new java.awt.Dimension(56, 18));
        inputRegistrationDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputRegistrationDateActionPerformed(evt);
            }
        });

        Register.setBackground(new java.awt.Color(0, 0, 0));
        Register.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Register.setForeground(new java.awt.Color(204, 204, 204));
        Register.setText("Register");
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
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
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inputClassId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputRegistrationDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputMemberId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(Register, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblEmail, lblId, lblName});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputMemberId, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputClassId, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputRegistrationDate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Register, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {inputClassId, inputMemberId, inputRegistrationDate, lblEmail, lblId, lblName});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inputClassIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputClassIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputClassIdActionPerformed

    private void inputMemberIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputMemberIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputMemberIdActionPerformed

    private void inputRegistrationDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputRegistrationDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputRegistrationDateActionPerformed
    
    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
        String memberId = inputMemberId.getText().strip();
        String classId = inputClassId.getText().strip();
        String registrationDate = inputRegistrationDate.getText().strip();
        
        if(memberId.equals("") || classId.equals("") || registrationDate.equals(""))
            JOptionPane.showMessageDialog(this, "Some fields are Empty!", "Error", JOptionPane.ERROR_MESSAGE);
        else {
            try {
                trainer.registerMemberForClass(memberId, classId, LocalDate.parse(registrationDate));
                JOptionPane.showMessageDialog(this, "The Member with Id = " + memberId + " has successfully registered to class " + classId);
                this.dispose();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_RegisterActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        prevWindow.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Register;
    private javax.swing.JTextField inputClassId;
    private javax.swing.JTextField inputMemberId;
    private javax.swing.JTextField inputRegistrationDate;
    // End of variables declaration//GEN-END:variables
}
