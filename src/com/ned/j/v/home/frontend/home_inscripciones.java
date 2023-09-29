package com.ned.j.v.home.frontend;

import com.ned.j.v.data.conectionDB;
import com.ned.j.v.home.backend.home_datosPersona;
import com.ned.j.v.home.backend.home_register_back;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class home_inscripciones extends javax.swing.JPanel {

    ArrayList<String> CicloID_ = new ArrayList<>();
    ArrayList<String> AnoCarreraID_ = new ArrayList<>();
    String IDEstudiante = "";
    
    public home_inscripciones() {
        initComponents();
        obtenerCiclo();
        ObteneranoCarrera();
        jLabel_ano_carrera.setVisible(false);
        jComboBox_ano_Carrera.setVisible(false);
        jButton2.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_cui = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox_ciclo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton_si = new javax.swing.JRadioButton();
        jRadioButton_no = new javax.swing.JRadioButton();
        jComboBox_ano_Carrera = new javax.swing.JComboBox<>();
        jLabel_ano_carrera = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(940, 660));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Inscripcion de estudiantes");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Numero de CUI del Estudiante:");

        txt_cui.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Ciclo de la Inscripción:");

        jButton1.setBackground(new java.awt.Color(33, 53, 85));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ned/j/v/public_proyect/asignar.png"))); // NOI18N
        jButton1.setText("Inscribir estudiante");
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

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Primer Ingreso:");

        jRadioButton_si.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton_si.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton_si.setSelected(true);
        jRadioButton_si.setText("Si");
        jRadioButton_si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_siActionPerformed(evt);
            }
        });

        jRadioButton_no.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton_no.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton_no.setText("No");
        jRadioButton_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_noActionPerformed(evt);
            }
        });

        jComboBox_ano_Carrera.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel_ano_carrera.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_ano_carrera.setText("Año de Ingreso:");

        jButton2.setBackground(new java.awt.Color(33, 53, 85));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Comprobar");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButton_si)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton_no)))
                                .addGap(167, 167, 167)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_ano_carrera)
                                    .addComponent(jComboBox_ano_Carrera, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_cui, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))
                            .addComponent(jComboBox_ciclo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(332, 332, 332)
                        .addComponent(jButton1)))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cui, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel_ano_carrera))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox_ano_Carrera, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButton_si)
                        .addComponent(jRadioButton_no)))
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jComboBox_ciclo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        if(txt_cui.getText().length() > 0){
            if(jRadioButton_si.isSelected()){
                home_register_back hr = new home_register_back();
                buscarEstudiante(txt_cui.getText().toUpperCase());

                hr.register_tbl_two(home_datosPersona.estudiante_CUI, CicloID_.get(jComboBox_ciclo.getSelectedIndex()), "TBL_INSCRIPCION", "INSCRIPCION_ESTUDIANTE", "INSCRIPCION_CICLO");
                JOptionPane.showMessageDialog(null, "Se inscricio un estudiante", "Inscripción", JOptionPane.INFORMATION_MESSAGE);
                txt_cui.setText("");
            }

            if(jRadioButton_no.isSelected()){
                obtnerIDEstudiante(txt_cui.getText());
                funcionUpdate(txt_cui.getText(), "ESTUDIANTE_ANO_CARRERA" ,AnoCarreraID_.get(jComboBox_ano_Carrera.getSelectedIndex()));
                funcionUpdate_2(IDEstudiante, "INSCRIPCION_CICLO", CicloID_.get(jComboBox_ciclo.getSelectedIndex()));
                JOptionPane.showMessageDialog(null, "Se inscricio un estudiante", "Inscripción", JOptionPane.INFORMATION_MESSAGE);
                txt_cui.setText("");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Complete el campo CUI", "Error:", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setBackground(new java.awt.Color(79, 112, 156));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
       jButton1.setBackground(new java.awt.Color(33, 53, 85));
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setBackground(new java.awt.Color(79, 112, 156));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
       jButton2.setBackground(new java.awt.Color(33, 53, 85));
    }//GEN-LAST:event_jButton2MouseExited

    private void jRadioButton_siActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_siActionPerformed
        jRadioButton_no.setSelected(false);
        jLabel_ano_carrera.setVisible(false);
        jComboBox_ano_Carrera.setVisible(false);
        jButton2.setVisible(false);
    }//GEN-LAST:event_jRadioButton_siActionPerformed

    private void jRadioButton_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_noActionPerformed
        jRadioButton_si.setSelected(false);
        jLabel_ano_carrera.setVisible(true);
        jComboBox_ano_Carrera.setVisible(true);
        jButton2.setVisible(true);
    }//GEN-LAST:event_jRadioButton_noActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        home_datosPersona.estudiante_CUI = txt_cui.getText();
        home_inscripciones_comprobar dialog = new home_inscripciones_comprobar(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void obtenerCiclo(){
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int column;
        
        try {
            Connection connection_ = conectionDB.getConnection();
            ps = connection_.prepareStatement("SELECT * FROM TBL_CICLOS");    
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            column = rsmd.getColumnCount();
            
             while(rs.next()){
                Object[] sexo_ = new Object[column];
                
                 for(int i=1; i<2; i++){
                     sexo_[i] = rs.getObject(i+1);
                     jComboBox_ciclo.addItem(sexo_[i].toString());
                 }               
                 CicloID_.add(rs.getObject(1).toString());
             }
            
        } catch (SQLException e) {
             System.out.println("ERROR: " + e);
        }
    }
    
    private void buscarEstudiante(String CUI){
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int column;
        
        try {
            Connection connection_ = conectionDB.getConnection();
            ps = connection_.prepareStatement("SELECT * FROM F_BUSCAR_ESTUDIANTE_CUI('"+CUI+"')");    
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            
            while(rs.next()){
                home_datosPersona.estudiante_CUI = rs.getString(1);
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
            ps = connection_.prepareStatement("SELECT * FROM TBL_ANO_CARRERA");    
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            column = rsmd.getColumnCount();
            
             while(rs.next()){
                Object[] carrera_ = new Object[column];
                
                 for(int i=1; i<2; i++){
                     carrera_[i] = rs.getObject(i+1);
                     jComboBox_ano_Carrera.addItem(carrera_[i].toString());
                 }               
                 AnoCarreraID_.add(rs.getObject(1).toString());
             }
            
        } catch (SQLException e) {
             System.out.println("ERROR: " + e);
        }
    }
    
    private void funcionUpdate(String estudent, String Campo, String ano_carrera){
        PreparedStatement ps;
        String InsertSQL = "UPDATE TBL_ESTUDIANTE SET "+Campo+"=? WHERE ESTUDIANTE_CUI =?";
        
        try {
            Connection connection_ = conectionDB.getConnection();
            ps = connection_.prepareStatement(InsertSQL);
            ps.setString(1, ano_carrera);
            ps.setString(2, estudent);
            ps.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void funcionUpdate_2(String estudent, String Campo, String ciclo){
        PreparedStatement ps;
        String InsertSQL = "UPDATE TBL_INSCRIPCION SET "+Campo+"=? WHERE INSCRIPCION_ESTUDIANTE =?";
        
        try {
            Connection connection_ = conectionDB.getConnection();
            ps = connection_.prepareStatement(InsertSQL);
            ps.setString(1, ciclo);
            ps.setString(2, estudent);
            ps.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void obtnerIDEstudiante(String Cui){
        PreparedStatement ps;
        ResultSet rs;
        
        try {
            Connection connection_ = conectionDB.getConnection();
            ps = connection_.prepareStatement("SELECT * FROM F_BUSCAR_ESTUDIANTE_CUI('"+Cui+"')");    
            rs = ps.executeQuery();
            
             while(rs.next()){
                IDEstudiante = rs.getString(1);
             }          
            
        } catch (SQLException e) {
             System.out.println("ERROR: " + e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox_ano_Carrera;
    private javax.swing.JComboBox<String> jComboBox_ciclo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_ano_carrera;
    private javax.swing.JRadioButton jRadioButton_no;
    private javax.swing.JRadioButton jRadioButton_si;
    private javax.swing.JTextField txt_cui;
    // End of variables declaration//GEN-END:variables
}
