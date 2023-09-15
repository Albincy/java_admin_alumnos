package com.ned.j.v.home.frontend;

import com.ned.j.v.data.conectionDB;
import com.ned.j.v.data.usersDT;
import com.ned.j.v.home.backend.home_datosPersona;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

public class home_register_persona extends javax.swing.JPanel {
    
    ArrayList<String> SexoID_ = new ArrayList<>();
    ArrayList<String> EtniaID_ = new ArrayList<>();
    ArrayList<String> ProfesionID_ = new ArrayList<>();
    
    public home_register_persona() {
        initComponents();
        check_dataSexo();
        check_dataEtnia();
        check_dataProfesion();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_apellidoP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_apellidoM = new javax.swing.JTextField();
        jCheck_ac = new javax.swing.JCheckBox();
        txt_apellidoC = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_dd = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_mm = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_yy = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jCheck_nt = new javax.swing.JCheckBox();
        txt_numeroT = new javax.swing.JTextField();
        jCheck_email = new javax.swing.JCheckBox();
        txt_email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox_sexo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jComboBox_etnia = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jComboBox_profesion = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(940, 565));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Registrar Persona");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 13, -1, -1));

        jLabel2.setText("Nombres:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));
        add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 112, 291, 32));

        jLabel3.setText("Apellido Paterno:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, -1));
        add(txt_apellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 112, 185, 32));

        jLabel4.setText("Apellido Materno");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, -1, -1));
        add(txt_apellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 112, 185, 32));

        jCheck_ac.setBackground(new java.awt.Color(255, 255, 255));
        jCheck_ac.setText("Apellido de Caso/a");
        jCheck_ac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheck_acActionPerformed(evt);
            }
        });
        add(jCheck_ac, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 78, -1, -1));

        txt_apellidoC.setEnabled(false);
        add(txt_apellidoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 112, 185, 32));

        jLabel6.setText("Dia:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));
        add(txt_dd, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 60, 32));

        jLabel7.setText("Mes:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));
        add(txt_mm, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 60, 32));

        jLabel8.setText("Año:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, -1));
        add(txt_yy, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 90, 32));

        jLabel9.setText("Fecha de Nacimiento:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jCheck_nt.setBackground(new java.awt.Color(255, 255, 255));
        jCheck_nt.setText("Numero de Telefono:");
        jCheck_nt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheck_ntActionPerformed(evt);
            }
        });
        add(jCheck_nt, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, -1, -1));

        txt_numeroT.setEnabled(false);
        add(txt_numeroT, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 185, 32));

        jCheck_email.setBackground(new java.awt.Color(255, 255, 255));
        jCheck_email.setText("Correo Electronico:");
        jCheck_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheck_emailActionPerformed(evt);
            }
        });
        add(jCheck_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, -1, -1));

        txt_email.setEnabled(false);
        add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, 185, 32));

        jLabel5.setText("Seleccionar Sexo:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        add(jComboBox_sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 180, 30));

        jButton1.setText("Siguiente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 120, 40));

        jLabel10.setText("Seleccionar Etnia:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, -1, -1));

        add(jComboBox_etnia, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 180, 30));

        jLabel11.setText("Seleccionar Profesión:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, -1, -1));

        add(jComboBox_profesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 180, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jCheck_acActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheck_acActionPerformed
       // activar campo de apellido casaso
       if (jCheck_ac.isSelected()){
           txt_apellidoC.enable(true);
       }else{
           txt_apellidoC.enable(false);
           txt_apellidoC.setText("");
       }
    }//GEN-LAST:event_jCheck_acActionPerformed

    private void jCheck_ntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheck_ntActionPerformed
        // activar campo de numero
        if (jCheck_nt.isSelected()){
           txt_numeroT.enable(true);
        }else{
           txt_numeroT.enable(false);
           txt_numeroT.setText("");
        }
    }//GEN-LAST:event_jCheck_ntActionPerformed

    private void jCheck_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheck_emailActionPerformed
        // activar campo de email
        if (jCheck_email.isSelected()){
           txt_email.enable(true);
        }else{
           txt_email.enable(false);
           txt_email.setText("");
        }
    }//GEN-LAST:event_jCheck_emailActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Siguiente
        String FechaNa = "";
        
        home_datosPersona.persona_nombre = txt_nombre.getText().toUpperCase();
        home_datosPersona.persona_apellidop = txt_apellidoP.getText().toUpperCase();
        home_datosPersona.persona_apellidom = txt_apellidoM.getText().toUpperCase();
        
        if (!jCheck_ac.isSelected()){
            home_datosPersona.persona_apellidoc = usersDT.defaultD;
        }else{
            home_datosPersona.persona_apellidoc = txt_apellidoC.getText().toUpperCase();
        }
        
        FechaNa = txt_mm.getText() + "-" + txt_dd.getText() + "-" + txt_yy.getText();
        home_datosPersona.persona_fechaN = FechaNa;
        
        if (!jCheck_nt.isSelected()){
            home_datosPersona.persona_numeroT = "0";
        }else{
            home_datosPersona.persona_numeroT = txt_numeroT.getText().toUpperCase();
        }
        
        if (!jCheck_email.isSelected()){
            home_datosPersona.persona_email = usersDT.defaultD;
        }else{
            home_datosPersona.persona_email = txt_email.getText().toUpperCase();
        }
        
        home_datosPersona.persona_sexo = SexoID_.get(jComboBox_sexo.getSelectedIndex());
        home_datosPersona.persona_etnia = EtniaID_.get(jComboBox_etnia.getSelectedIndex());
        home_datosPersona.persona_profesion = ProfesionID_.get(jComboBox_profesion.getSelectedIndex());
        
        if (jComboBox_profesion.getSelectedItem().equals("ESTUDIANTE")){
            //Limpiamos
            home_register_estudiantes windows_estudiante = new home_register_estudiantes();
            windows_estudiante.setSize(940, 565);
            windows_estudiante.setLocation(0,0);

            home_register.jpanel_container_register.removeAll();
            home_register.jpanel_container_register.add(windows_estudiante, BorderLayout.CENTER);
            home_register.jpanel_container_register.revalidate();
            home_register.jpanel_container_register.repaint();
        }else if (jComboBox_profesion.getSelectedItem().equals("CATEDRÁTICO")){
            home_register_catedratico windows_catedratico = new home_register_catedratico();
            windows_catedratico.setSize(940, 565);
            windows_catedratico.setLocation(0,0);
            
            home_register.jpanel_container_register.removeAll();
            home_register.jpanel_container_register.add(windows_catedratico, BorderLayout.CENTER);
            home_register.jpanel_container_register.revalidate();
            home_register.jpanel_container_register.repaint();
        }
      
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void check_dataSexo(){
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int column;
        
        try {
            Connection connection_ = conectionDB.getConnection();
            ps = connection_.prepareStatement("SELECT * FROM TBL_SEXO");    
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            column = rsmd.getColumnCount();
            
             while(rs.next()){
                Object[] sexo_ = new Object[column];
                
                 for(int i=1; i<2; i++){
                     sexo_[i] = rs.getObject(i+1);
                     jComboBox_sexo.addItem(sexo_[i].toString());
                 }               
                 SexoID_.add(rs.getObject(1).toString());
             }
            
        } catch (SQLException e) {
             System.out.println("ERROR: " + e);
        }
        
    }

    private void check_dataEtnia(){
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int column;
        
        try {
            Connection connection_ = conectionDB.getConnection();
            ps = connection_.prepareStatement("SELECT * FROM TBL_ETNIA");    
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            column = rsmd.getColumnCount();
            
             while(rs.next()){
                Object[] etnia_ = new Object[column];
                
                 for(int i=1; i<2; i++){
                     etnia_[i] = rs.getObject(i+1);
                     jComboBox_etnia.addItem(etnia_[i].toString());
                 }               
                 EtniaID_.add(rs.getObject(1).toString());
             }
            
        } catch (SQLException e) {
             System.out.println("ERROR: " + e);
        }
        
    }
    
    private void check_dataProfesion(){
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int column;
        
        try {
            Connection connection_ = conectionDB.getConnection();
            ps = connection_.prepareStatement("SELECT * FROM TBL_PROFESION");    
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            column = rsmd.getColumnCount();
            
             while(rs.next()){
                Object[] etnia_ = new Object[column];
                
                 for(int i=1; i<2; i++){
                     etnia_[i] = rs.getObject(i+1);
                     jComboBox_profesion.addItem(etnia_[i].toString());
                 }               
                 ProfesionID_.add(rs.getObject(1).toString());
             }
            
        } catch (SQLException e) {
             System.out.println("ERROR: " + e);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheck_ac;
    private javax.swing.JCheckBox jCheck_email;
    private javax.swing.JCheckBox jCheck_nt;
    private javax.swing.JComboBox<String> jComboBox_etnia;
    private javax.swing.JComboBox<String> jComboBox_profesion;
    private javax.swing.JComboBox<String> jComboBox_sexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_apellidoC;
    private javax.swing.JTextField txt_apellidoM;
    private javax.swing.JTextField txt_apellidoP;
    private javax.swing.JTextField txt_dd;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_mm;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_numeroT;
    private javax.swing.JTextField txt_yy;
    // End of variables declaration//GEN-END:variables
}
