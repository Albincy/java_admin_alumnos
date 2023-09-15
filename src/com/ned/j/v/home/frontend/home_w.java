package com.ned.j.v.home.frontend;

import com.ned.j.v.data.usersDT;
import java.awt.BorderLayout;

public class home_w extends javax.swing.JFrame {

    public home_w() {
        initComponents();
        this.setLocationRelativeTo(null);
        String user = usersDT.userName;
        label_username.setText(user);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanel_menu = new javax.swing.JPanel();
        label_username = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jpanel_container = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_username.setText("UserName");

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Carreras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Materias");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Versión: snapshot 23W09A");

        javax.swing.GroupLayout jpanel_menuLayout = new javax.swing.GroupLayout(jpanel_menu);
        jpanel_menu.setLayout(jpanel_menuLayout);
        jpanel_menuLayout.setHorizontalGroup(
            jpanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_menuLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpanel_menuLayout.createSequentialGroup()
                .addGroup(jpanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanel_menuLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(label_username)
                        .addGap(0, 116, Short.MAX_VALUE))
                    .addGroup(jpanel_menuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel_menuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpanel_menuLayout.setVerticalGroup(
            jpanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_menuLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(label_username)
                .addGap(35, 35, 35)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 402, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        getContentPane().add(jpanel_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jpanel_container.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpanel_containerLayout = new javax.swing.GroupLayout(jpanel_container);
        jpanel_container.setLayout(jpanel_containerLayout);
        jpanel_containerLayout.setHorizontalGroup(
            jpanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 940, Short.MAX_VALUE)
        );
        jpanel_containerLayout.setVerticalGroup(
            jpanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );

        getContentPane().add(jpanel_container, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 940, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Boton de registros
        home_register windows_register = new home_register();
        windows_register.setSize(940, 660);
        windows_register.setLocation(0,0);
        
        jpanel_container.removeAll();
        jpanel_container.add(windows_register, BorderLayout.CENTER);
        jpanel_container.revalidate();
        jpanel_container.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Carreras
        home_carrera windows_carrera = new home_carrera();
        windows_carrera.setSize(940, 660);
        windows_carrera.setLocation(0,0);
        
        jpanel_container.removeAll();
        jpanel_container.add(windows_carrera, BorderLayout.CENTER);
        jpanel_container.revalidate();
        jpanel_container.repaint();    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // materias
        home_materia windows_materias = new home_materia();
        windows_materias.setSize(940, 660);
        windows_materias.setLocation(0,0);
        
        jpanel_container.removeAll();
        jpanel_container.add(windows_materias, BorderLayout.CENTER);
        jpanel_container.revalidate();
        jpanel_container.repaint();      
    }//GEN-LAST:event_jButton3ActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JPanel jpanel_container;
    private javax.swing.JPanel jpanel_menu;
    private javax.swing.JLabel label_username;
    // End of variables declaration//GEN-END:variables
}
