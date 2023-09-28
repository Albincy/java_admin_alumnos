package com.ned.j.v.home.frontend;

import com.ned.j.v.home.backend.home_register_back;
import javax.swing.JOptionPane;

public class home_register_ciclo extends javax.swing.JPanel {

    public home_register_ciclo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_nCiclo = new javax.swing.JTextField();
        btn_register = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(940, 565));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Registrar Ciclo Escolar");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nuevo Ciclo:");

        txt_nCiclo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(335, 335, 335))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txt_nCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(351, 351, 351)
                        .addComponent(btn_register, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(210, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addGap(73, 73, 73)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txt_nCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(btn_register, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(214, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed
        // registrar el dato
        home_register_back hr = new home_register_back();
        String nCiclo = txt_nCiclo.getText().toUpperCase();
        
        if(txt_nCiclo.getText().length() > 0){
            hr.register_tbl_one(nCiclo, "TBL_CICLOS", "CICLOS_NOMBRE");
            txt_nCiclo.setText("");
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
    private javax.swing.JTextField txt_nCiclo;
    // End of variables declaration//GEN-END:variables
}
