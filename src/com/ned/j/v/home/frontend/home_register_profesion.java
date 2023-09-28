package com.ned.j.v.home.frontend;

import com.ned.j.v.home.backend.home_register_back;
import javax.swing.JOptionPane;

public class home_register_profesion extends javax.swing.JPanel {

    public home_register_profesion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_nProfesion = new javax.swing.JTextField();
        btn_register = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(940, 565));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Registrar Profesión");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nombre de la Profesión:");

        txt_nProfesion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btn_register.setBackground(new java.awt.Color(33, 53, 85));
        btn_register.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_register.setForeground(new java.awt.Color(255, 255, 255));
        btn_register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ned/j/v/public_proyect/guardar.png"))); // NOI18N
        btn_register.setText("Registrar");
        btn_register.setBorder(null);
        btn_register.setBorderPainted(false);
        btn_register.setFocusPainted(false);
        btn_register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_registerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_registerMouseExited(evt);
            }
        });
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(btn_register, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txt_nProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(359, 359, 359)
                        .addComponent(jLabel1)))
                .addContainerGap(210, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(88, 88, 88)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addComponent(txt_nProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(btn_register, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(200, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed
        // registrar el dato
        home_register_back hr = new home_register_back();
        String nProfesion = txt_nProfesion.getText().toUpperCase();
        
        if(txt_nProfesion.getText().length() > 0){
            hr.register_tbl_one(nProfesion, "TBL_SEXO", "SEXO_NOMBRE");
            txt_nProfesion.setText("");
        }else{
            JOptionPane.showMessageDialog(null, "El Campo no debe estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_registerActionPerformed

    private void btn_registerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registerMouseEntered
        btn_register.setBackground(new java.awt.Color(79, 112, 156));
    }//GEN-LAST:event_btn_registerMouseEntered

    private void btn_registerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registerMouseExited
       btn_register.setBackground(new java.awt.Color(33, 53, 85));
    }//GEN-LAST:event_btn_registerMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_register;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txt_nProfesion;
    // End of variables declaration//GEN-END:variables
}
