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
import javax.swing.JOptionPane;

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
        jComboBox_dia = new javax.swing.JComboBox<>();
        jComboBox_mes = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(940, 565));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Registrar Persona");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nombres:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        txt_nombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(33, 53, 85)));
        add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 240, 32));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Apellido Paterno:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, -1, -1));

        txt_apellidoP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_apellidoP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(33, 53, 85)));
        add(txt_apellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 210, 32));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Apellido Materno");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, -1, -1));

        txt_apellidoM.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_apellidoM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(33, 53, 85)));
        add(txt_apellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 220, 32));

        jCheck_ac.setBackground(new java.awt.Color(255, 255, 255));
        jCheck_ac.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheck_ac.setText("Apellido de Caso/a");
        jCheck_ac.setFocusPainted(false);
        jCheck_ac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheck_acActionPerformed(evt);
            }
        });
        add(jCheck_ac, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        txt_apellidoC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_apellidoC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(33, 53, 85)));
        txt_apellidoC.setEnabled(false);
        add(txt_apellidoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 240, 32));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Año:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, -1, -1));

        txt_yy.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_yy.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(33, 53, 85)));
        add(txt_yy, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, 100, 32));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Fecha de Nacimiento:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, -1, -1));

        jCheck_nt.setBackground(new java.awt.Color(255, 255, 255));
        jCheck_nt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheck_nt.setText("Numero de Telefono:");
        jCheck_nt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheck_ntActionPerformed(evt);
            }
        });
        add(jCheck_nt, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 210, -1, -1));

        txt_numeroT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_numeroT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(33, 53, 85)));
        txt_numeroT.setEnabled(false);
        add(txt_numeroT, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 250, 210, 32));

        jCheck_email.setBackground(new java.awt.Color(255, 255, 255));
        jCheck_email.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheck_email.setText("Correo Electronico:");
        jCheck_email.setFocusPainted(false);
        jCheck_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheck_emailActionPerformed(evt);
            }
        });
        add(jCheck_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, -1));

        txt_email.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(33, 53, 85)));
        txt_email.setEnabled(false);
        add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 220, 32));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Género:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, -1, -1));

        jComboBox_sexo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox_sexo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(33, 53, 85)));
        add(jComboBox_sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 150, 30));

        jButton1.setBackground(new java.awt.Color(33, 53, 85));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ned/j/v/public_proyect/next.png"))); // NOI18N
        jButton1.setText("Siguiente");
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
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, 160, 50));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Etnia:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, -1, -1));

        jComboBox_etnia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox_etnia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(33, 53, 85)));
        add(jComboBox_etnia, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, 180, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Profesión:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 310, -1, -1));

        jComboBox_profesion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox_profesion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(33, 53, 85)));
        add(jComboBox_profesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 350, 180, 30));

        jComboBox_dia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox_dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Día", "01", "02", "03", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBox_dia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(33, 53, 85)));
        add(jComboBox_dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 80, 30));

        jComboBox_mes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox_mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mes", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        jComboBox_mes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(33, 53, 85)));
        add(jComboBox_mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 80, 30));
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
        String dia = "";
        String mes = "";
        
        //vefiricarValores
        boolean fecha_rellena = false;
        boolean numeroTVer = txt_numeroT.getText().matches("\\d+");
        boolean yearsVer = txt_yy.getText().matches("\\d+");
        boolean validado = false;
        
        //camposNorequeridos
        boolean apellidoC_rellena = false;
        boolean numeroT_rellena = false;
        boolean correo_rellena = false;
        boolean mostrarmsj = true;
        
        home_datosPersona.persona_nombre = txt_nombre.getText().toUpperCase();
        home_datosPersona.persona_apellidop = txt_apellidoP.getText().toUpperCase();
        home_datosPersona.persona_apellidom = txt_apellidoM.getText().toUpperCase();
        
        if (!jCheck_ac.isSelected()){
            home_datosPersona.persona_apellidoc = usersDT.defaultD;
            apellidoC_rellena = true;
        }else{
            if(txt_apellidoC.getText().length() > 0){
                home_datosPersona.persona_apellidoc = txt_apellidoC.getText().toUpperCase();
                apellidoC_rellena = true;
            }else{
                apellidoC_rellena = false;
            }
        }
        
        switch (jComboBox_mes.getSelectedIndex()){
            case 1:
                mes = "01";
                break;
            case 2:
                mes = "02";
                break;
            case 3:
                mes = "03";
                break;
            case 4:
                mes = "04";
                break;
            case 5:
                mes = "05";
                break;
            case 6:
                mes = "06";
                break;
            case 7:
                mes = "07";
                break;
            case 8:
                mes = "08";
                break;
            case 9:
                mes = "09";
                break;
            case 10:
                mes = "10";
                break;
            case 11:
                mes = "11";
                break;             
            case 12:
                mes = "12";
                break;
            default:
                mes = "01";
                break;
        }
        
        
        if ((jComboBox_dia.getSelectedIndex() == 0) || (jComboBox_mes.getSelectedIndex() == 0) || !yearsVer){
            if (!yearsVer){
                JOptionPane.showMessageDialog(null, "El campo año de la fecha de nacimiento solo debe contener números", "Error", JOptionPane.ERROR_MESSAGE);
                mostrarmsj = false;
            }
            fecha_rellena = false;
        }else{
            dia = jComboBox_dia.getSelectedItem().toString();
            fecha_rellena = true;
        }
        
        FechaNa = txt_yy.getText() + "-" + mes + "-" + dia;
        home_datosPersona.persona_fechaN = FechaNa;
        
        if (!jCheck_nt.isSelected()){
            home_datosPersona.persona_numeroT = "0";
            numeroT_rellena = true;
        }else{
            if(txt_numeroT.getText().length() > 0){
                if(numeroTVer){
                    numeroT_rellena = true;
                    home_datosPersona.persona_numeroT = txt_numeroT.getText().toUpperCase();
                }else{
                    numeroT_rellena = false;
                    JOptionPane.showMessageDialog(null, "El campo Número de telefono solo debe contener números", "Error", JOptionPane.ERROR_MESSAGE);
                    mostrarmsj = false;
                }
            }else{
                numeroT_rellena = false;
            }
        }
        
        if (!jCheck_email.isSelected()){
            home_datosPersona.persona_email = usersDT.defaultD;
            correo_rellena = true;
        }else{
            if(txt_email.getText().length() > 0){
                correo_rellena = true;
                home_datosPersona.persona_email = txt_email.getText().toUpperCase();
            }else{
                correo_rellena = false;
            } 
        }
        
        home_datosPersona.persona_sexo = SexoID_.get(jComboBox_sexo.getSelectedIndex());
        home_datosPersona.persona_etnia = EtniaID_.get(jComboBox_etnia.getSelectedIndex());
        home_datosPersona.persona_profesion = ProfesionID_.get(jComboBox_profesion.getSelectedIndex());
        
        if ((txt_nombre.getText().length() > 0) && (txt_apellidoP.getText().length() > 0) && (txt_apellidoM.getText().length() > 0)
                && (apellidoC_rellena) && (fecha_rellena) && (numeroT_rellena) && (correo_rellena)){
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
        }else{
            if(mostrarmsj){
            JOptionPane.showMessageDialog(null, "Complete todos los campos Requeridos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setBackground(new java.awt.Color(79, 112, 156));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBackground(new java.awt.Color(33, 53, 85));
    }//GEN-LAST:event_jButton1MouseExited
    
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
    private javax.swing.JComboBox<String> jComboBox_dia;
    private javax.swing.JComboBox<String> jComboBox_etnia;
    private javax.swing.JComboBox<String> jComboBox_mes;
    private javax.swing.JComboBox<String> jComboBox_profesion;
    private javax.swing.JComboBox<String> jComboBox_sexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_apellidoC;
    private javax.swing.JTextField txt_apellidoM;
    private javax.swing.JTextField txt_apellidoP;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_numeroT;
    private javax.swing.JTextField txt_yy;
    // End of variables declaration//GEN-END:variables
}
