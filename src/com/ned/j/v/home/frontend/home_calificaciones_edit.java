package com.ned.j.v.home.frontend;

import com.ned.j.v.data.conectionDB;
import com.ned.j.v.home.backend.home_datosEdit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class home_calificaciones_edit extends javax.swing.JDialog {

    ArrayList<String> MateriaID_ = new ArrayList<>();
    ArrayList<String> CicloID_ = new ArrayList<>();
    
    String IDanoCarra = "";
    String IDEstudent = "";
    String CuiEstudent = home_datosEdit.calificaiones_estudiante;
    
    public home_calificaciones_edit(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        jLabel2.setText("CUI ESTUDIANTE:  " + CuiEstudent);
        cargarDatosEstudent();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox_materias = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox_unidad = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jComboBox_ciclos = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txt_nota = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Editar Calificación");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 29, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("CUI Estudiante: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 91, -1, -1));

        jPanel1.add(jComboBox_materias, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 224, 39));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Materias:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Unidad de la calificación:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, -1, -1));

        jComboBox_unidad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox_unidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unidad I", "Unidad II", "Unidad III", "Unidad IV" }));
        jPanel1.add(jComboBox_unidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 252, 39));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Ciclo:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, -1, -1));

        jComboBox_ciclos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(jComboBox_ciclos, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 190, 39));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Calificación de la Unidad");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, -1, -1));
        jPanel1.add(txt_nota, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 429, 46));

        jButton2.setBackground(new java.awt.Color(33, 53, 85));
        jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ned/j/v/public_proyect/prueba.png"))); // NOI18N
        jButton2.setText("Editar Calificación");
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
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, -1, 63));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setBackground(new java.awt.Color(79, 112, 156));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setBackground(new java.awt.Color(33, 53, 85));
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        boolean soloNumeros = txt_nota.getText().matches("\\d+");
        int nota = Integer.parseInt(txt_nota.getText());
        
        if(soloNumeros){
            switch (jComboBox_unidad.getSelectedItem().toString()){
                case "Unidad I":
                    funcionEditNota(IDEstudent, MateriaID_.get(jComboBox_materias.getSelectedIndex()), CicloID_.get(jComboBox_ciclos.getSelectedIndex()), nota, "CALIFICACIONES_UNIDAD_I");
                    break;
                case "Unidad II":
                    funcionEditNota(IDEstudent, MateriaID_.get(jComboBox_materias.getSelectedIndex()), CicloID_.get(jComboBox_ciclos.getSelectedIndex()), nota, "CALIFICACIONES_UNIDAD_II");
                    break;
                case "Unidad III":
                    funcionEditNota(IDEstudent, MateriaID_.get(jComboBox_materias.getSelectedIndex()), CicloID_.get(jComboBox_ciclos.getSelectedIndex()), nota, "CALIFICACIONES_UNIDAD_III");
                    break;
                case "Unidad IV":
                    funcionEditNota(IDEstudent, MateriaID_.get(jComboBox_materias.getSelectedIndex()), CicloID_.get(jComboBox_ciclos.getSelectedIndex()), nota, "CALIFICACIONES_UNIDAD_IV");
                    break;
            }
            JOptionPane.showMessageDialog(null, "Calificación Modificada", "Calificación Modificada!", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "La calificación solo debe contener números", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
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
                     jComboBox_ciclos.addItem(sexo_[i].toString());
                 }               
                 CicloID_.add(rs.getObject(1).toString());
             }
            
        } catch (SQLException e) {
             System.out.println("ERROR: " + e);
        }
    }
    
    private void cargarDatosEstudent(){
        obtenerValorAnoCarrera(CuiEstudent);
        obtenerIDEstudent(CuiEstudent);
        obtenerMateria(IDanoCarra);
        obtenerCiclo();
    }
    
    private void obtenerValorAnoCarrera(String Cui){
        PreparedStatement ps;
        ResultSet rs;
        
        try {
            Connection connection_ = conectionDB.getConnection();
            ps = connection_.prepareStatement("SELECT ESTUDIANTE_ANO_CARRERA FROM TBL_ESTUDIANTE WHERE ESTUDIANTE_CUI = '"+Cui+"'");    
            rs = ps.executeQuery();
            
             while(rs.next()){
                IDanoCarra = rs.getString(1);
             }          
            
        } catch (SQLException e) {
             System.out.println("ERROR: " + e);
        }
     }
    
    private void obtenerIDEstudent(String Cui){
        PreparedStatement ps;
        ResultSet rs;
        
        try {
            Connection connection_ = conectionDB.getConnection();
            ps = connection_.prepareStatement("SELECT ESTUDIANTE_COD FROM TBL_ESTUDIANTE WHERE ESTUDIANTE_CUI = '"+Cui+"'");    
            rs = ps.executeQuery();
            
             while(rs.next()){
                IDEstudent = rs.getString(1);
             }          
            
        } catch (SQLException e) {
             System.out.println("ERROR: " + e);
        }
     }
    
    private void obtenerMateria(String ano_carrera){
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int column;
        
        try {
            Connection connection_ = conectionDB.getConnection();
            ps = connection_.prepareStatement("SELECT MATERIAS_COD, MATERIAS_NOMBRE FROM TBL_MATERIAS WHERE MATERIAS_ANO_CARRERA = '"+ano_carrera+"'");    
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            column = rsmd.getColumnCount();
            
             while(rs.next()){
                Object[] sexo_ = new Object[column];
                
                 for(int i=1; i<2; i++){
                     sexo_[i] = rs.getObject(i+1);
                     jComboBox_materias.addItem(sexo_[i].toString());
                 }               
                 MateriaID_.add(rs.getObject(1).toString());
             }
            
        } catch (SQLException e) {
             System.out.println("ERROR: " + e);
        }
     }
    
    private void funcionEditNota(String estudent, String materia, String ciclo, int not, String Campo){
        PreparedStatement ps;
        String InsertSQL = "UPDATE TBL_CALIFICACIONES SET "+Campo+"=? WHERE CALIFICACIONES_ESTUDIANTE =? AND " +
                            "CALIFICACIONES_MATERIA =? AND CALIFICACIONES_CICLO =?";
        
        try {
            Connection connection_ = conectionDB.getConnection();
            ps = connection_.prepareStatement(InsertSQL);
            ps.setInt(1, not);
            ps.setString(2, estudent);
            ps.setString(3, materia);
            ps.setString(4, ciclo);
            ps.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox_ciclos;
    private javax.swing.JComboBox<String> jComboBox_materias;
    private javax.swing.JComboBox<String> jComboBox_unidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_nota;
    // End of variables declaration//GEN-END:variables
}
