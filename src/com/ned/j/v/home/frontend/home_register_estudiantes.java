package com.ned.j.v.home.frontend;

import com.ned.j.v.data.conectionDB;
import com.ned.j.v.home.backend.home_datosPersona;
import com.ned.j.v.home.backend.home_register_back;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class home_register_estudiantes extends javax.swing.JPanel {

    private String Id_persona = "PERSONAS";
    ArrayList<String> CarreraID_ = new ArrayList<>();
    ArrayList<String> anoCarreraID_ = new ArrayList<>();
    
    public home_register_estudiantes() {
        initComponents();
        obtenerCarrera();
        ObteneranoCarrera();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_ncui = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox_carrera = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jComboBox_anoCarrera = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txt_codEstd = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(940, 565));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("Datos de Estudiante");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Numero CUI:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        txt_ncui.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(txt_ncui, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 310, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Asignar Carrera:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, -1, -1));

        jComboBox_carrera.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(jComboBox_carrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 310, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Asignar Año de Carrera:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, -1, -1));

        jComboBox_anoCarrera.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(jComboBox_anoCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 310, 40));

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
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, 240, 60));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Codigo Estudiante:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, -1, -1));

        txt_codEstd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(txt_codEstd, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 310, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // registro
        if(txt_ncui.getText().length() > 0){
        home_register_back hr = new home_register_back();
        hr.register_tbl_personas(home_datosPersona.persona_nombre, home_datosPersona.persona_apellidop, home_datosPersona.persona_apellidom, 
                home_datosPersona.persona_apellidoc, home_datosPersona.persona_fechaN, home_datosPersona.persona_numeroT, 
                home_datosPersona.persona_email, home_datosPersona.persona_sexo, home_datosPersona.persona_etnia, home_datosPersona.persona_profesion);
        
        //Obtener el ID que se acaba de guardar
        obtenerID();
        
        //Guardamos estudiante
        hr.register_tbl_estudiante(txt_ncui.getText().toUpperCase(), txt_codEstd.getText().toUpperCase(), Id_persona, CarreraID_.get(jComboBox_carrera.getSelectedIndex()) 
                , anoCarreraID_.get(jComboBox_anoCarrera.getSelectedIndex()));
       
        JOptionPane.showMessageDialog(null, "Se registro un estudiante", "Registro Estudiante", JOptionPane.INFORMATION_MESSAGE);
        
        //Regresar a la pagina de registros
        home_register windows_rs = new home_register();
        windows_rs.setSize(940, 565);
        windows_rs.setLocation(0,0);
        
        home_w.jpanel_container.removeAll();
        home_w.jpanel_container.add(windows_rs, BorderLayout.CENTER);
        home_w.jpanel_container.revalidate();
        home_w.jpanel_container.repaint();
        }else{
            JOptionPane.showMessageDialog(null, "El campo CUI no debe estar vacío", "Error", JOptionPane.INFORMATION_MESSAGE);
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
    
    private void obtenerCarrera(){
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int column;
        
        try {
            Connection connection_ = conectionDB.getConnection();
            ps = connection_.prepareStatement("SELECT * FROM TBL_CARRERA WHERE CARRERA_ESTATUS = '1'");    
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            column = rsmd.getColumnCount();
            
             while(rs.next()){
                Object[] carrera_ = new Object[column];
                
                 for(int i=1; i<2; i++){
                     carrera_[i] = rs.getObject(i+1);
                     jComboBox_carrera.addItem(carrera_[i].toString());
                 }               
                 CarreraID_.add(rs.getObject(1).toString());
             }
            
        } catch (SQLException e) {
             System.out.println("ERROR: " + e);
        }
    }
    
    private void ObteneranoCarrera(){
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int column;
        
        try {
            Connection connection_ = conectionDB.getConnection();
            ps = connection_.prepareStatement("SELECT * FROM TBL_ANO_CARRERA WHERE ANO_CARRERA_ESTATUS = '1'");    
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            column = rsmd.getColumnCount();
            
             while(rs.next()){
                Object[] carrera_ = new Object[column];
                
                 for(int i=1; i<2; i++){
                     carrera_[i] = rs.getObject(i+1);
                     jComboBox_anoCarrera.addItem(carrera_[i].toString());
                 }               
                 anoCarreraID_.add(rs.getObject(1).toString());
             }
            
        } catch (SQLException e) {
             System.out.println("ERROR: " + e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox_anoCarrera;
    private javax.swing.JComboBox<String> jComboBox_carrera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txt_codEstd;
    private javax.swing.JTextField txt_ncui;
    // End of variables declaration//GEN-END:variables
}
