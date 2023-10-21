package com.ned.j.v.home.frontend;

import com.ned.j.v.data.conectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;

public class home_estudiantes extends javax.swing.JPanel {
    
    ArrayList<String> CarreraID_ = new ArrayList<>();
    
    public home_estudiantes() {
        initComponents();
        mostrartabla();
        obtenerCarrera();
        jComboBox_carrera.setVisible(false);
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
        jButton3 = new javax.swing.JButton();
        jRadio_carrera = new javax.swing.JRadioButton();
        jComboBox_carrera = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(960, 660));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Estudiantes");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        txt_estudiantes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(txt_estudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 67, 640, 40));

        jButton1.setBackground(new java.awt.Color(33, 53, 85));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ned/j/v/public_proyect/lupa.png"))); // NOI18N
        jButton1.setText("Buscar Estudiante");
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
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 70, 230, 40));

        tbl_estudiante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombres", "Apellido Paterno", "Apellido Materno", "CUI", "Codigo Estudiante", "Correo", "Numero Telefono", "Sexo", "Carrera", "Año Carrera", "Ciclo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_estudiante);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 887, -1));

        jButton2.setBackground(new java.awt.Color(33, 53, 85));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ned/j/v/public_proyect/actualizar.png"))); // NOI18N
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
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 140, -1, 34));

        jRadioButton_inscritos.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton_inscritos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton_inscritos.setText("Estudiantes Inscritos");
        jRadioButton_inscritos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_inscritosActionPerformed(evt);
            }
        });
        add(jRadioButton_inscritos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jButton3.setBackground(new java.awt.Color(33, 53, 85));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ned/j/v/public_proyect/copy.png"))); // NOI18N
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
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 140, 60, -1));

        jRadio_carrera.setBackground(new java.awt.Color(255, 255, 255));
        jRadio_carrera.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadio_carrera.setText("Carrera");
        jRadio_carrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadio_carreraActionPerformed(evt);
            }
        });
        add(jRadio_carrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));

        jComboBox_carrera.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(jComboBox_carrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 180, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(jRadio_carrera.isSelected()){
            if(jRadioButton_inscritos.isSelected()){
                buscarEstudiante_has_carrera("F_BUSCAR_ESTUDIANTE_SII_HAS_CARRERA", CarreraID_.get(jComboBox_carrera.getSelectedIndex()));
            }else{
                buscarEstudiante_has_carrera("F_BUSCAR_ESTUDIANTE_NOI_HAS_CARRERA", CarreraID_.get(jComboBox_carrera.getSelectedIndex()));
            }
        }else{
            // actualizar
            mostrartabla();
        }
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

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        jButton3.setBackground(new java.awt.Color(79, 112, 156));
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        jButton3.setBackground(new java.awt.Color(33, 53, 85));
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        copiarTextoSeleccionado();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jRadio_carreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadio_carreraActionPerformed
       if(jRadio_carrera.isSelected()){
            jComboBox_carrera.setVisible(true);
        }else{
            jComboBox_carrera.setVisible(false);
        }
    }//GEN-LAST:event_jRadio_carreraActionPerformed
    
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
    
    private void buscarEstudiante_has_carrera(String sql, String carrera){
        DefaultTableModel modeloTable = (DefaultTableModel) tbl_estudiante.getModel();
        modeloTable.setRowCount(0);
        
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int column;
        
        try {
            Connection connection_ = conectionDB.getConnection();
            ps = connection_.prepareStatement("SELECT * FROM "+sql+"('"+carrera+"')");    
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
    
    private void obtenerCarrera(){
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int column;
        
        try {
            Connection connection_ = conectionDB.getConnection();
            ps = connection_.prepareStatement("SELECT * FROM TBL_CARRERA");    
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
    
    private void copiarTextoSeleccionado(){
        int fila = tbl_estudiante.getSelectedRow();
        String Cui = tbl_estudiante.getValueAt(fila, 3).toString();
        
        //obtener el portapapeles
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection seleccion = new StringSelection(Cui);
        clipboard.setContents(seleccion, null);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox_carrera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton_inscritos;
    private javax.swing.JRadioButton jRadio_carrera;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_estudiante;
    private javax.swing.JTextField txt_estudiantes;
    // End of variables declaration//GEN-END:variables
}
