package com.ned.j.v.home.frontend;

public class home_ajustes extends javax.swing.JPanel {

    public home_ajustes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel_user = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(940, 660));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Versión: 1.0");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 634, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Software Donado");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(776, 634, -1, -1));

        jLabel_user.setBackground(new java.awt.Color(33, 53, 85));
        jLabel_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ned/j/v/public_proyect/usuario_b.png"))); // NOI18N
        add(jLabel_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 21, -1, -1));

        jButton1.setBackground(new java.awt.Color(33, 53, 85));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ned/j/v/public_proyect/user.png"))); // NOI18N
        jButton1.setText("Registrar Usuario");
        jButton1.setBorderPainted(false);
        jButton1.setFocusPainted(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 240, 45));

        jSeparator1.setBackground(new java.awt.Color(33, 53, 85));
        jSeparator1.setForeground(new java.awt.Color(33, 53, 85));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 245, 779, 22));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setBackground(new java.awt.Color(79, 112, 156));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBackground(new java.awt.Color(33, 53, 85));
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        home_ajustes_addUser dialog = new home_ajustes_addUser(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_user;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
