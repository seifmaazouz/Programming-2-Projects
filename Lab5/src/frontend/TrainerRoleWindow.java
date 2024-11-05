package frontend;

import backend.TrainerRole;

public class TrainerRoleWindow extends javax.swing.JFrame {

    private TrainerRole trainer;
    
    public TrainerRoleWindow() {
        initComponents();
        trainer = new TrainerRole();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ViewMembers = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        ViewClasses = new javax.swing.JButton();
        AddMember = new javax.swing.JButton();
        AddClass = new javax.swing.JButton();
        RegisterMember = new javax.swing.JButton();
        CancelRegistration = new javax.swing.JButton();
        ViewRegistrations = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Trainer Role");
        setMinimumSize(new java.awt.Dimension(400, 328));
        setResizable(false);

        ViewMembers.setBackground(new java.awt.Color(0, 0, 0));
        ViewMembers.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ViewMembers.setForeground(new java.awt.Color(204, 204, 204));
        ViewMembers.setText("View Members");
        ViewMembers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewMembersActionPerformed(evt);
            }
        });

        Logout.setBackground(new java.awt.Color(0, 0, 0));
        Logout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Logout.setForeground(new java.awt.Color(204, 204, 204));
        Logout.setText("Logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        ViewClasses.setBackground(new java.awt.Color(0, 0, 0));
        ViewClasses.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ViewClasses.setForeground(new java.awt.Color(204, 204, 204));
        ViewClasses.setText("View Classes");
        ViewClasses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewClassesActionPerformed(evt);
            }
        });

        AddMember.setBackground(new java.awt.Color(0, 0, 0));
        AddMember.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AddMember.setForeground(new java.awt.Color(204, 204, 204));
        AddMember.setText("Add Member");
        AddMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMemberActionPerformed(evt);
            }
        });

        AddClass.setBackground(new java.awt.Color(0, 0, 0));
        AddClass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AddClass.setForeground(new java.awt.Color(204, 204, 204));
        AddClass.setText("Add Class");
        AddClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddClassActionPerformed(evt);
            }
        });

        RegisterMember.setBackground(new java.awt.Color(0, 0, 0));
        RegisterMember.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RegisterMember.setForeground(new java.awt.Color(204, 204, 204));
        RegisterMember.setText("Register Member for Class");
        RegisterMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterMemberActionPerformed(evt);
            }
        });

        CancelRegistration.setBackground(new java.awt.Color(0, 0, 0));
        CancelRegistration.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CancelRegistration.setForeground(new java.awt.Color(204, 204, 204));
        CancelRegistration.setText("Cancel Registration");
        CancelRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelRegistrationActionPerformed(evt);
            }
        });

        ViewRegistrations.setBackground(new java.awt.Color(0, 0, 0));
        ViewRegistrations.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ViewRegistrations.setForeground(new java.awt.Color(204, 204, 204));
        ViewRegistrations.setText("View Registrations");
        ViewRegistrations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewRegistrationsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ViewRegistrations, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RegisterMember, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddClass, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewClasses, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddMember, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewMembers, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {AddMember, ViewClasses, ViewMembers});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddMember, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ViewMembers, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AddClass, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ViewClasses, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RegisterMember, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CancelRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ViewRegistrations, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ViewMembersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewMembersActionPerformed
        new ViewMembersWindow(this, trainer).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ViewMembersActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        trainer.logout();
        this.dispose();
        new MainWindow().setVisible(true);
    }//GEN-LAST:event_LogoutActionPerformed

    private void ViewClassesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewClassesActionPerformed
        new ViewClassesWindow(this, trainer).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ViewClassesActionPerformed

    private void AddMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMemberActionPerformed
        new AddMemberWindow(this, trainer).setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_AddMemberActionPerformed

    private void AddClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddClassActionPerformed
        new AddClassWindow(this, trainer).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AddClassActionPerformed

    private void RegisterMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterMemberActionPerformed
        new RegisterMemberWindow(this, trainer).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegisterMemberActionPerformed

    private void CancelRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelRegistrationActionPerformed
        new CancelRegistrationWindow(this, trainer).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CancelRegistrationActionPerformed

    private void ViewRegistrationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewRegistrationsActionPerformed
        new ViewRegistrationsWindow(this, trainer).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ViewRegistrationsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddClass;
    private javax.swing.JButton AddMember;
    private javax.swing.JButton CancelRegistration;
    private javax.swing.JButton Logout;
    private javax.swing.JButton RegisterMember;
    private javax.swing.JButton ViewClasses;
    private javax.swing.JButton ViewMembers;
    private javax.swing.JButton ViewRegistrations;
    // End of variables declaration//GEN-END:variables
}