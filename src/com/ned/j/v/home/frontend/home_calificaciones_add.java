package com.ned.j.v.home.frontend;

import com.ned.j.v.data.conectionDB;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class home_calificaciones_add extends javax.swing.JDialog {

    ArrayList<String> MateriaID_ = new ArrayList<>();
    ArrayList<String> CicloID_ = new ArrayList<>();
    String IDanoCarra = "";
    String IDCarrera = "";
    String IDEstudent = "";
    String validNotaExist = "";
    String NotaIngredaResto = "";
    boolean validado = false;
    
    public home_calificaciones_add(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/ned/j/v/public_proyect/icon.png")));
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_cui = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
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

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Añadir Calificación");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("CUI Estudiante:");

        txt_cui.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton1.setBackground(new java.awt.Color(33, 53, 85));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ned/j/v/public_proyect/asignar.png"))); // NOI18N
        jButton1.setText("Obtener Datos");
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

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Materias:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Unidad de la calificación:");

        jComboBox_unidad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox_unidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unidad I", "Unidad II", "Unidad III", "Unidad IV" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Ciclo:");

        jComboBox_ciclos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Calificación de la Unidad");

        jButton2.setBackground(new java.awt.Color(33, 53, 85));
        jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ned/j/v/public_proyect/prueba.png"))); // NOI18N
        jButton2.setText("Subir Calificación");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jComboBox_materias, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox_unidad, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jComboBox_ciclos, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_cui)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_nota, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cui, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox_unidad, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(jComboBox_materias, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox_ciclos, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(34, 34, 34)
                .addComponent(jLabel6)
                .addGap(36, 36, 36)
                .addComponent(txt_nota, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        obtenerValorAnoCarrera(txt_cui.getText());
        obtenerValorCarrera(txt_cui.getText());
        obtenerIDEstudent(txt_cui.getText());
        
        if(IDanoCarra == ""){
            JOptionPane.showMessageDialog(null, "Estudiante No entontrado", "Error", JOptionPane.ERROR_MESSAGE);
        }else{ 
            jComboBox_materias.removeAllItems();
            jComboBox_ciclos.removeAllItems();
            MateriaID_ = new ArrayList<>();
            CicloID_ = new ArrayList<>();
            
            obtenerMateria(IDanoCarra, IDCarrera);
            obtenerCiclo();
            validado = true;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        boolean soloNumeros = txt_nota.getText().matches("\\d+");
        int nota = Integer.parseInt(txt_nota.getText());
        
        if(validado ){
            if(soloNumeros){
                
                validDatoExist(IDEstudent, MateriaID_.get(jComboBox_materias.getSelectedIndex()), CicloID_.get(jComboBox_ciclos.getSelectedIndex()));
                
                switch (jComboBox_unidad.getSelectedItem().toString()){
                case "Unidad I":
                    if(validNotaExist == ""){
                        funcionUnidadI(IDEstudent, MateriaID_.get(jComboBox_materias.getSelectedIndex()), CicloID_.get(jComboBox_ciclos.getSelectedIndex()), nota);
                        JOptionPane.showMessageDialog(null, "Calificación ingresada", "Calificación Subida", JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null, "Esta materia ya contiene una calificación", "Error", JOptionPane.ERROR_MESSAGE);
                        validNotaExist = "";
                    }
                    break;
                case "Unidad II":
                    validnotaresto(IDEstudent, MateriaID_.get(jComboBox_materias.getSelectedIndex()), CicloID_.get(jComboBox_ciclos.getSelectedIndex()), "CALIFICACIONES_UNIDAD_II");                    
                    System.err.println(NotaIngredaResto);
                    if(NotaIngredaResto.equals("0")){
                       funcionUnidadResto(IDEstudent, MateriaID_.get(jComboBox_materias.getSelectedIndex()), CicloID_.get(jComboBox_ciclos.getSelectedIndex()), nota, "CALIFICACIONES_UNIDAD_II");
                       JOptionPane.showMessageDialog(null, "Calificación ingresada", "Calificación Subida", JOptionPane.INFORMATION_MESSAGE); 
                    }else{
                        JOptionPane.showMessageDialog(null, "Esta materia ya contiene una calificación", "Error", JOptionPane.ERROR_MESSAGE);
                        NotaIngredaResto = "";
                    }
                    break;
                case "Unidad III":
                    validnotaresto(IDEstudent, MateriaID_.get(jComboBox_materias.getSelectedIndex()), CicloID_.get(jComboBox_ciclos.getSelectedIndex()), "CALIFICACIONES_UNIDAD_III");
                    if(NotaIngredaResto.equals("0")){
                        funcionUnidadResto(IDEstudent, MateriaID_.get(jComboBox_materias.getSelectedIndex()), CicloID_.get(jComboBox_ciclos.getSelectedIndex()), nota, "CALIFICACIONES_UNIDAD_III");
                        JOptionPane.showMessageDialog(null, "Calificación ingresada", "Calificación Subida", JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null, "Esta materia ya contiene una calificación", "Error", JOptionPane.ERROR_MESSAGE);
                        NotaIngredaResto = "";
                    }
                    break;
                case "Unidad IV":
                    validnotaresto(IDEstudent, MateriaID_.get(jComboBox_materias.getSelectedIndex()), CicloID_.get(jComboBox_ciclos.getSelectedIndex()), "CALIFICACIONES_UNIDAD_IV");
                    if(NotaIngredaResto.equals("0")){
                        funcionUnidadResto(IDEstudent, MateriaID_.get(jComboBox_materias.getSelectedIndex()), CicloID_.get(jComboBox_ciclos.getSelectedIndex()), nota, "CALIFICACIONES_UNIDAD_IV");
                        JOptionPane.showMessageDialog(null, "Calificación ingresada", "Calificación Subida", JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null, "Esta materia ya contiene una calificación", "Error", JOptionPane.ERROR_MESSAGE);
                        NotaIngredaResto = "";
                    }
                    break;
                }
            }else{
                JOptionPane.showMessageDialog(null, "La calificación solo debe contener números", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Obtenga Datos del Estudiante", "Error", JOptionPane.ERROR_MESSAGE);
        }       
    }//GEN-LAST:event_jButton2ActionPerformed

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
     
     private void obtenerValorCarrera(String Cui){
        PreparedStatement ps;
        ResultSet rs;
        
        try {
            Connection connection_ = conectionDB.getConnection();
            ps = connection_.prepareStatement("SELECT ESTUDIANTE_CARRERA FROM TBL_ESTUDIANTE WHERE ESTUDIANTE_CUI = '"+Cui+"'");    
            rs = ps.executeQuery();
            
             while(rs.next()){
                IDCarrera = rs.getString(1);
             }          
            
        } catch (SQLException e) {
             System.out.println("ERROR: " + e);
        }
     }
     
     private void obtenerMateria(String ano_carrera, String carrera){
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int column;
        
        try {
            Connection connection_ = conectionDB.getConnection();
            ps = connection_.prepareStatement("SELECT MATERIAS_COD, MATERIAS_NOMBRE FROM TBL_MATERIAS WHERE MATERIAS_ANO_CARRERA = '"+ano_carrera+"' AND MATERIAS_CARRERA = '"+carrera+"' AND MATERIAS_ESTATUS = '1'");    
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
     
     private void validDatoExist(String estudent, String materia, String ciclo){
        PreparedStatement ps;
        ResultSet rs;
        
        try {
            Connection connection_ = conectionDB.getConnection();
            ps = connection_.prepareStatement("SELECT CALIFICACIONES_COD FROM TBL_CALIFICACIONES WHERE CALIFICACIONES_ESTUDIANTE = '"+estudent+"' AND CALIFICACIONES_MATERIA = '"+materia+"' AND" +
                " CALIFICACIONES_CICLO = '"+ciclo+"'");    
            rs = ps.executeQuery();
            
             while(rs.next()){
                validNotaExist = rs.getString(1);
             }          
            
        } catch (SQLException e) {
             System.out.println("ERROR: " + e);
        }
     }
     
     private void funcionUnidadI(String estudent, String materia, String ciclo, int not){
        PreparedStatement ps;
        ResultSet rs;
        String InsertSQL = "INSERT TBL_CALIFICACIONES (CALIFICACIONES_ESTUDIANTE, CALIFICACIONES_MATERIA, CALIFICACIONES_ANO_CARRERA, CALIFICACIONES_CICLO, CALIFICACIONES_UNIDAD_I, CALIFICACIONES_UNIDAD_II, CALIFICACIONES_UNIDAD_III, CALIFICACIONES_UNIDAD_IV) " +
                            "VALUES (?,?,?,?,?,?,?,?)";
        
        try {
            Connection connection_ = conectionDB.getConnection();
            ps = connection_.prepareStatement(InsertSQL);
            ps.setString(1, estudent);
            ps.setString(2, materia);
            ps.setString(3, IDanoCarra);
            ps.setString(4, ciclo);
            ps.setInt(5, not);
            ps.setInt(6, 0);
            ps.setInt(7, 0);
            ps.setInt(8, 0);
            ps.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
     }
     
     private void funcionUnidadResto(String estudent, String materia, String ciclo, int not, String Campo){
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
     
     private void validnotaresto(String estudent, String materia, String ciclo, String Campo){
        PreparedStatement ps;
        ResultSet rs;
        
        try {
            Connection connection_ = conectionDB.getConnection();
            ps = connection_.prepareStatement("SELECT "+Campo+" FROM TBL_CALIFICACIONES WHERE CALIFICACIONES_ESTUDIANTE = '"+estudent+"'" +
            " AND CALIFICACIONES_MATERIA = '"+materia+"' AND CALIFICACIONES_CICLO = '"+ciclo+"'");    
            rs = ps.executeQuery();
            
             while(rs.next()){
                NotaIngredaResto = rs.getString(1);
             }          
            
        } catch (SQLException e) {
             System.out.println("ERROR: " + e);
        }
     }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
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
    private javax.swing.JTextField txt_cui;
    private javax.swing.JTextField txt_nota;
    // End of variables declaration//GEN-END:variables
}
