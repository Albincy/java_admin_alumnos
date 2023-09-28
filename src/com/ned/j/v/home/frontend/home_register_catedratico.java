package com.ned.j.v.home.frontend;

import com.ned.j.v.data.conectionDB;
import com.ned.j.v.home.backend.home_datosPersona;
import com.ned.j.v.home.backend.home_register_back;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class home_register_catedratico extends javax.swing.JPanel {

    private String Id_persona = "PERSONAS";
    
    public home_register_catedratico() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_ndpi = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(940, 565));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Datos de Catedratico:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Numero DPI:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));

        txt_ndpi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(txt_ndpi, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 310, 40));

        jButton1.setBackground(new java.awt.Color(33, 53, 85));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ned/j/v/public_proyect/guardar.png"))); // NOI18N
        jButton1.setText("Guardar Registro");
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
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 240, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // registro catedratico
         boolean soloNumeros = txt_ndpi.getText().matches("\\d+");
        
        if(soloNumeros){      
        home_register_back hr = new home_register_back();
        hr.register_tbl_personas(home_datosPersona.persona_nombre, home_datosPersona.persona_apellidop, home_datosPersona.persona_apellidom, 
                home_datosPersona.persona_apellidoc, home_datosPersona.persona_fechaN, home_datosPersona.persona_numeroT, 
                home_datosPersona.persona_email, home_datosPersona.persona_sexo, home_datosPersona.persona_etnia, home_datosPersona.persona_profesion);
        
        //Obtener el ID que se acaba de guardar
        obtenerID();
        
        //Guardamos catedratico
        hr.register_tbl_two(txt_ndpi.getText().toUpperCase(), Id_persona, "TBL_CATEDRATICO", "CATEDRATICO_DPI", "CATEDRATICO_PERSONA");
        
        JOptionPane.showMessageDialog(null, "Se registro un catedrático", "Registro Catedrático", JOptionPane.INFORMATION_MESSAGE);
        
        //Regresar a la pagina de registros
        home_register windows_rs = new home_register();
        windows_rs.setSize(940, 565);
        windows_rs.setLocation(0,0);
        
        home_w.jpanel_container.removeAll();
        home_w.jpanel_container.add(windows_rs, BorderLayout.CENTER);
        home_w.jpanel_container.revalidate();
        home_w.jpanel_container.repaint();
        }else{
             JOptionPane.showMessageDialog(null, "El campo DPI solo debe contener números", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setBackground(new java.awt.Color(79, 112, 156));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBackground(new java.awt.Color(33, 53, 85));
    }//GEN-LAST:event_jButton1MouseExited
    
    private void obtenerID(){
        PreparedStatement ps;
        ResultSet rs;
        
        try {
            Connection connection_ = conectionDB.getConnection();
            ps = connection_.prepareStatement("SELECT current_value FROM sys.sequences WHERE name = 'SQ_ID_INCREMENTAL_PERSONAS'");    
            rs = ps.executeQuery();
            
             while(rs.next()){
                Id_persona = Id_persona + rs.getString(1);
             }          
             System.out.println(Id_persona);
            
        } catch (SQLException e) {
             System.out.println("ERROR: " + e);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txt_ndpi;
    // End of variables declaration//GEN-END:variables
}
