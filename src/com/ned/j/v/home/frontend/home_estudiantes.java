package com.ned.j.v.home.frontend;

import com.ned.j.v.data.conectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class home_estudiantes extends javax.swing.JPanel {

    public home_estudiantes() {
        initComponents();
        mostrartabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_estudiantes = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_estudiante = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jRadioButton_inscritos = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(960, 660));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Estudiantes");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));
        add(txt_estudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 67, 710, 40));

        jButton1.setText("Buscar Estudiante");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, 142, 40));

        tbl_estudiante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombres", "Apellido Paterno", "Apellido Materno", "CUI", "Correo", "Numero Telefono", "Sexo", "Profesión", "Carrera", "Año Carrera", "Ciclo"
            }
        ));
        jScrollPane1.setViewportView(tbl_estudiante);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 167, 887, -1));

        jButton2.setText("actualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 120, -1, 34));

        jRadioButton_inscritos.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton_inscritos.setText("Estudiantes Inscritos");
        jRadioButton_inscritos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_inscritosActionPerformed(evt);
            }
        });
        add(jRadioButton_inscritos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // actualizar
        mostrartabla();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton_inscritosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_inscritosActionPerformed
        // ver que tabla mostrar
        mostrartabla();
    }//GEN-LAST:event_jRadioButton_inscritosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // buscar estudiante
        if (jRadioButton_inscritos.isSelected()){
            buscarEstudiante("F_BUSCAR_ESTUDIANTE_SII", txt_estudiantes.getText().toUpperCase());
        }else{
            buscarEstudiante("F_BUSCAR_ESTUDIANTE_NOI", txt_estudiantes.getText().toUpperCase());
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void loadtable(String Vista){
        DefaultTableModel modeloTable = (DefaultTableModel) tbl_estudiante.getModel();
        modeloTable.setRowCount(0);
        
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int column;
        
        try {
            Connection connection_ = conectionDB.getConnection();
            ps = connection_.prepareStatement("SELECT * FROM " + Vista);    
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            column = rsmd.getColumnCount();
            
             while(rs.next()){
                int cont = 1;
                Object[] fila = new Object[column];
                for(int i=0; i<column; i++){
                    fila[i] = rs.getObject(cont);
                    cont ++;
                } 
                modeloTable.addRow(fila);
             }
            
        } catch (SQLException e) {
             System.out.println("ERROR: " + e);
        }
    }
    
    private void mostrartabla(){
        if (jRadioButton_inscritos.isSelected()){
           loadtable("VW_LISTADO_ESTUDIANTES_SII");
        }else{
           loadtable("VW_LISTADO_ESTUDIANTES_NOI");
        }
    }
    
    private void buscarEstudiante(String sql, String cui){
        DefaultTableModel modeloTable = (DefaultTableModel) tbl_estudiante.getModel();
        modeloTable.setRowCount(0);
        
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int column;
        
        try {
            Connection connection_ = conectionDB.getConnection();
            ps = connection_.prepareStatement("SELECT * FROM "+sql+"('"+cui+"')");    
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            column = rsmd.getColumnCount();
            
             while(rs.next()){
                int cont = 1;
                Object[] fila = new Object[column];
                for(int i=0; i<column; i++){
                    fila[i] = rs.getObject(cont);
                    cont ++;
                } 
                modeloTable.addRow(fila);
             }
            
        } catch (SQLException e) {
             System.out.println("ERROR: " + e);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton_inscritos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_estudiante;
    private javax.swing.JTextField txt_estudiantes;
    // End of variables declaration//GEN-END:variables
}
