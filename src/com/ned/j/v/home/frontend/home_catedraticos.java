package com.ned.j.v.home.frontend;

import com.ned.j.v.data.conectionDB;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class home_catedraticos extends javax.swing.JPanel {

    public home_catedraticos() {
        initComponents();
        loadtabla("VW_LISTADO_CATEDRATICO_SIN");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_catedraticos = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jRadioButt_catedratico = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_catedraticos = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(960, 660));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Catedráticos");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        txt_catedraticos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(txt_catedraticos, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 70, 430, 43));

        jButton1.setBackground(new java.awt.Color(33, 53, 85));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ned/j/v/public_proyect/lupa.png"))); // NOI18N
        jButton1.setText("Buscar Catedrático");
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
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 240, 43));

        jButton2.setBackground(new java.awt.Color(33, 53, 85));
        jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ned/j/v/public_proyect/asignar.png"))); // NOI18N
        jButton2.setText("Asignar Materia");
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
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 70, 200, 43));

        jRadioButt_catedratico.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButt_catedratico.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButt_catedratico.setText("Catedráticos Con materia");
        jRadioButt_catedratico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButt_catedraticoActionPerformed(evt);
            }
        });
        add(jRadioButt_catedratico, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        tbl_catedraticos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombres", "Apellido Paterno", "Apellido Materno", "Apellido Casad@", "DPI", "Fecha Nacimiento", "Correo Electronico", "Numero Telefono", "Sexo", "Profesión", "Materia", "Ciclo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_catedraticos);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 194, 910, -1));

        jButton3.setBackground(new java.awt.Color(33, 53, 85));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ned/j/v/public_proyect/actualizar.png"))); // NOI18N
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
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 150, -1, -1));

        jButton5.setBackground(new java.awt.Color(33, 53, 85));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ned/j/v/public_proyect/copy.png"))); // NOI18N
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
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 150, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        home_catedraticos_has_materia dialog = new home_catedraticos_has_materia(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButt_catedraticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButt_catedraticoActionPerformed
        // ver que tabla mostrar
        if (jRadioButt_catedratico.isSelected()){
            loadtabla("VW_LISTADO_CATEDRATICO_CON");
        }else{
            loadtabla("VW_LISTADO_CATEDRATICO_SIN");
        }
    }//GEN-LAST:event_jRadioButt_catedraticoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        loadtabla("VW_LISTADO_CATEDRATICO_SIN");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // buscar catedratico
         if (jRadioButt_catedratico.isSelected()){
            buscarcatedratico("F_BUSCAR_CATEDRATICO_CON", txt_catedraticos.getText().toUpperCase());
         }else{
            buscarcatedratico("F_BUSCAR_CATEDRATICO_SIN", txt_catedraticos.getText().toUpperCase());
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

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        jButton5.setBackground(new java.awt.Color(79, 112, 156));
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        jButton5.setBackground(new java.awt.Color(33, 53, 85));
    }//GEN-LAST:event_jButton5MouseExited

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        copiarTextoSeleccionado();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void loadtabla(String Vista){
        DefaultTableModel modeloTable = (DefaultTableModel) tbl_catedraticos.getModel();
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
    
    private void buscarcatedratico(String sql, String nombre){
        DefaultTableModel modeloTable = (DefaultTableModel) tbl_catedraticos.getModel();
        modeloTable.setRowCount(0);
        
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int column;
        
        try {
            Connection connection_ = conectionDB.getConnection();
            ps = connection_.prepareStatement("SELECT * FROM "+sql+"('"+nombre+"')");    
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
    
    private void copiarTextoSeleccionado(){
        int fila = tbl_catedraticos.getSelectedRow();
        String Cui = tbl_catedraticos.getValueAt(fila, 4).toString();
        
        //obtener el portapapeles
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection seleccion = new StringSelection(Cui);
        clipboard.setContents(seleccion, null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButt_catedratico;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_catedraticos;
    private javax.swing.JTextField txt_catedraticos;
    // End of variables declaration//GEN-END:variables
}
