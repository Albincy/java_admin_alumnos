package com.ned.j.v.home.frontend;

import com.ned.j.v.data.conectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class home_materia extends javax.swing.JPanel {

    public home_materia() {
        initComponents();
        loadmateria();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_materias = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_materias = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(940, 660));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Materias");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));
        add(txt_materias, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 100, 480, 38));

        jButton1.setText("Buscar Materia");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 135, 40));

        jButton2.setText("Añadir Materia");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 100, -1, 40));

        tbl_materias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Materia", "Carrera", "año Carrera", "Fecha", "Estatus"
            }
        ));
        jScrollPane1.setViewportView(tbl_materias);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 740, 460));

        jButton3.setText("actualizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 170, -1, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        loadmateria();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        buscarmateria(txt_materias.getText().toUpperCase());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        home_materia_add dialog = new home_materia_add(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void loadmateria(){
        DefaultTableModel modeloTable = (DefaultTableModel) tbl_materias.getModel();
        modeloTable.setRowCount(0);
        
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int column;
        
        try {
            Connection connection_ = conectionDB.getConnection();
            ps = connection_.prepareStatement("SELECT * FROM VW_LISTADO_MATERIAS");    
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
    
    private void buscarmateria(String materia){
        DefaultTableModel modeloTable = (DefaultTableModel) tbl_materias.getModel();
        modeloTable.setRowCount(0);
        
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int column;
        
        try {
            Connection connection_ = conectionDB.getConnection();
            ps = connection_.prepareStatement("SELECT * FROM F_BUSCAR_MATERIAS('"+materia+"')");    
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
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_materias;
    private javax.swing.JTextField txt_materias;
    // End of variables declaration//GEN-END:variables
}
