package com.ned.j.v.home.frontend;

import com.ned.j.v.data.usersDT;
import java.awt.BorderLayout;
import java.awt.Toolkit;

public class home_w extends javax.swing.JFrame {

    public home_w() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/ned/j/v/public_proyect/icon.png")));
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
        jSeparator1 = new javax.swing.JSeparator();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jpanel_container = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Adminitración de Alumnos");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpanel_menu.setBackground(new java.awt.Color(33, 53, 85));
        jpanel_menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_username.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        label_username.setForeground(new java.awt.Color(255, 255, 255));
        label_username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_username.setText("UserName");
        jpanel_menu.add(label_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 220, -1));

        jButton1.setBackground(new java.awt.Color(79, 112, 156));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ned/j/v/public_proyect/add.png"))); // NOI18N
        jButton1.setText("Registrar");
        jButton1.setBorder(null);
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
        jpanel_menu.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 226, 38));

        jButton2.setBackground(new java.awt.Color(79, 112, 156));
        jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ned/j/v/public_proyect/carrera.png"))); // NOI18N
        jButton2.setText("Carreras");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setFocusPainted(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jpanel_menu.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 224, 230, 38));

        jButton3.setBackground(new java.awt.Color(79, 112, 156));
        jButton3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ned/j/v/public_proyect/materia.png"))); // NOI18N
        jButton3.setText("Materias");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setFocusPainted(false);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jpanel_menu.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 275, 230, 38));

        jSeparator1.setBackground(new java.awt.Color(79, 112, 156));
        jSeparator1.setForeground(new java.awt.Color(79, 112, 156));
        jpanel_menu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 250, 10));

        jButton4.setBackground(new java.awt.Color(79, 112, 156));
        jButton4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ned/j/v/public_proyect/estudent.png"))); // NOI18N
        jButton4.setText("Estudiantes");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setFocusPainted(false);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jpanel_menu.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 348, 230, 41));

        jButton5.setBackground(new java.awt.Color(79, 112, 156));
        jButton5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ned/j/v/public_proyect/profesor.png"))); // NOI18N
        jButton5.setText("Catedráticos");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setFocusPainted(false);
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jpanel_menu.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 402, 230, 41));

        jButton6.setBackground(new java.awt.Color(79, 112, 156));
        jButton6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ned/j/v/public_proyect/calificaciones.png"))); // NOI18N
        jButton6.setText("Calificaciones");
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setFocusPainted(false);
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton6MouseExited(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jpanel_menu.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 456, 230, 41));

        jButton7.setBackground(new java.awt.Color(79, 112, 156));
        jButton7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ned/j/v/public_proyect/inscripcion.png"))); // NOI18N
        jButton7.setText("Inscripciones");
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setFocusPainted(false);
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton7MouseExited(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jpanel_menu.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 510, 230, 41));

        jButton8.setBackground(new java.awt.Color(79, 112, 156));
        jButton8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ned/j/v/public_proyect/configuraciones.png"))); // NOI18N
        jButton8.setText("Ajustes");
        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);
        jButton8.setFocusPainted(false);
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton8MouseExited(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jpanel_menu.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 610, 120, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ned/j/v/public_proyect/usuario_.png"))); // NOI18N
        jpanel_menu.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(79, 112, 156));
        jSeparator2.setForeground(new java.awt.Color(79, 112, 156));
        jpanel_menu.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 331, 250, 10));

        getContentPane().add(jpanel_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 670));

        jpanel_container.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("Pantalla de Inicio");

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setText("Versión: 1.0");

        javax.swing.GroupLayout jpanel_containerLayout = new javax.swing.GroupLayout(jpanel_container);
        jpanel_container.setLayout(jpanel_containerLayout);
        jpanel_containerLayout.setHorizontalGroup(
            jpanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_containerLayout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(jLabel2))
            .addGroup(jpanel_containerLayout.createSequentialGroup()
                .addGap(860, 860, 860)
                .addComponent(jLabel1))
        );
        jpanel_containerLayout.setVerticalGroup(
            jpanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_containerLayout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jLabel2)
                .addGap(331, 331, 331)
                .addComponent(jLabel1))
        );

        getContentPane().add(jpanel_container, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 950, 670));

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

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Estudiantes
        home_estudiantes windows_estudent = new home_estudiantes();
        windows_estudent.setSize(940, 660);
        windows_estudent.setLocation(0,0);
        
        jpanel_container.removeAll();
        jpanel_container.add(windows_estudent, BorderLayout.CENTER);
        jpanel_container.revalidate();
        jpanel_container.repaint();    
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Catedraticos
        home_catedraticos windows_catedratico = new home_catedraticos();
        windows_catedratico.setSize(940, 660);
        windows_catedratico.setLocation(0,0);
        
        jpanel_container.removeAll();
        jpanel_container.add(windows_catedratico, BorderLayout.CENTER);
        jpanel_container.revalidate();
        jpanel_container.repaint(); 
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // Inscripciones
        home_inscripciones windows_inscripciones = new home_inscripciones();
        windows_inscripciones.setSize(940, 660);
        windows_inscripciones.setLocation(0,0);
        
        jpanel_container.removeAll();
        jpanel_container.add(windows_inscripciones, BorderLayout.CENTER);
        jpanel_container.revalidate();
        jpanel_container.repaint(); 
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setBackground(new java.awt.Color(89, 125, 174));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBackground(new java.awt.Color(79, 112, 156));
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setBackground(new java.awt.Color(89, 125, 174));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setBackground(new java.awt.Color(79, 112, 156));
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
         jButton3.setBackground(new java.awt.Color(89, 125, 174));
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        jButton3.setBackground(new java.awt.Color(79, 112, 156));
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        jButton4.setBackground(new java.awt.Color(89, 125, 174));
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        jButton4.setBackground(new java.awt.Color(79, 112, 156));
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        jButton5.setBackground(new java.awt.Color(89, 125, 174));
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        jButton5.setBackground(new java.awt.Color(79, 112, 156));
    }//GEN-LAST:event_jButton5MouseExited

    private void jButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseEntered
        jButton6.setBackground(new java.awt.Color(89, 125, 174));
    }//GEN-LAST:event_jButton6MouseEntered

    private void jButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseExited
        jButton6.setBackground(new java.awt.Color(79, 112, 156));
    }//GEN-LAST:event_jButton6MouseExited

    private void jButton7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseEntered
        jButton7.setBackground(new java.awt.Color(89, 125, 174));
    }//GEN-LAST:event_jButton7MouseEntered

    private void jButton7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseExited
        jButton7.setBackground(new java.awt.Color(79, 112, 156));
    }//GEN-LAST:event_jButton7MouseExited

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        home_ajustes windows_ajustes = new home_ajustes();
        windows_ajustes.setSize(940, 660);
        windows_ajustes.setLocation(0,0);
        
        jpanel_container.removeAll();
        jpanel_container.add(windows_ajustes, BorderLayout.CENTER);
        jpanel_container.revalidate();
        jpanel_container.repaint(); 
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseEntered
        jButton8.setBackground(new java.awt.Color(89, 125, 174));
    }//GEN-LAST:event_jButton8MouseEntered

    private void jButton8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseExited
       jButton8.setBackground(new java.awt.Color(79, 112, 156));
    }//GEN-LAST:event_jButton8MouseExited

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        home_calificaciones windows_calificaciones = new home_calificaciones();
        windows_calificaciones.setSize(940, 660);
        windows_calificaciones.setLocation(0,0);
        
        jpanel_container.removeAll();
        jpanel_container.add(windows_calificaciones, BorderLayout.CENTER);
        jpanel_container.revalidate();
        jpanel_container.repaint(); 
    }//GEN-LAST:event_jButton6ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public static javax.swing.JPanel jpanel_container;
    private javax.swing.JPanel jpanel_menu;
    private javax.swing.JLabel label_username;
    // End of variables declaration//GEN-END:variables
}
