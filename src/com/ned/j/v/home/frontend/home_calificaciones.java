package com.ned.j.v.home.frontend;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.ned.j.v.data.conectionDB;
import com.ned.j.v.home.backend.home_datosEdit;
import java.awt.Desktop;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class home_calificaciones extends javax.swing.JPanel {

     ArrayList<String> CiclosID_ = new ArrayList<>();
     boolean busqueda = false;
     String IDEstudent = "";
     String CarreraEstudent = "";
     String AnoCarreraEstudent = "";
    
    public home_calificaciones() {
        initComponents();
        loadtable();
        obtenerCiclos();
        
        jComboBox_ciclos.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Carreras = new javax.swing.JLabel();
        txt_calificaiones_cui = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_calificaiones = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jRadioButton_ciclos = new javax.swing.JRadioButton();
        jComboBox_ciclos = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(940, 660));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Carreras.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Carreras.setText("Calificaciones");
        add(Carreras, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 23, -1, -1));

        txt_calificaiones_cui.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_calificaiones_cui.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(33, 53, 85)));
        add(txt_calificaiones_cui, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 65, 475, 45));

        jButton1.setBackground(new java.awt.Color(33, 53, 85));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ned/j/v/public_proyect/add.png"))); // NOI18N
        jButton1.setText("Ingresar Nota");
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
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 65, -1, 45));

        tbl_calificaiones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CUI", "NOMBRES", "APELLIDO P", "APELLIDO M", "MATERIA", "CICLO", "UNIDAD I", "UNIDAD II", "UNIDAD III", "UNIDAD IV", "PROMEDIO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_calificaiones);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 178, 907, -1));

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
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(863, 128, -1, -1));

        jButton3.setBackground(new java.awt.Color(33, 53, 85));
        jButton3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ned/j/v/public_proyect/estudent.png"))); // NOI18N
        jButton3.setText("Buscar Estudiante");
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
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 65, -1, 45));

        jRadioButton_ciclos.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton_ciclos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton_ciclos.setText("Ciclos");
        jRadioButton_ciclos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_ciclosActionPerformed(evt);
            }
        });
        add(jRadioButton_ciclos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jComboBox_ciclos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(jComboBox_ciclos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 180, -1));

        jButton4.setBackground(new java.awt.Color(33, 53, 85));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ned/j/v/public_proyect/copy.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setFocusPainted(false);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 129, 60, 32));

        jButton5.setBackground(new java.awt.Color(33, 53, 85));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ned/j/v/public_proyect/editar.png"))); // NOI18N
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
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 129, -1, -1));

        jButton6.setBackground(new java.awt.Color(33, 53, 85));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ned/j/v/public_proyect/imprimir.png"))); // NOI18N
        jButton6.setBorderPainted(false);
        jButton6.setFocusPainted(false);
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton6MouseExited(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        loadtable();
        busqueda = false;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
       jButton2.setBackground(new java.awt.Color(79, 112, 156));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setBackground(new java.awt.Color(33, 53, 85));
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        home_calificaciones_add dialog = new home_calificaciones_add(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setBackground(new java.awt.Color(79, 112, 156));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBackground(new java.awt.Color(33, 53, 85));
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        jButton3.setBackground(new java.awt.Color(79, 112, 156));
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        jButton3.setBackground(new java.awt.Color(33, 53, 85));
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //LLAMAR A LA FUNCION BUSQUEDA
        if(jRadioButton_ciclos.isSelected()){
            buscarNotaCiclo(txt_calificaiones_cui.getText().toUpperCase(), CiclosID_.get(jComboBox_ciclos.getSelectedIndex()));
            busqueda = true;
        }else{
            buscarNota(txt_calificaiones_cui.getText().toUpperCase());
            busqueda = false;
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jRadioButton_ciclosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_ciclosActionPerformed
        if(jRadioButton_ciclos.isSelected()){
            jComboBox_ciclos.setVisible(true);
        }else{
            jComboBox_ciclos.setVisible(false);
        }
    }//GEN-LAST:event_jRadioButton_ciclosActionPerformed

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        jButton4.setBackground(new java.awt.Color(79, 112, 156));
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        jButton4.setBackground(new java.awt.Color(33, 53, 85));
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        jButton5.setBackground(new java.awt.Color(79, 112, 156));
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        jButton5.setBackground(new java.awt.Color(33, 53, 85));
    }//GEN-LAST:event_jButton5MouseExited

    private void jButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseEntered
       jButton6.setBackground(new java.awt.Color(79, 112, 156));
    }//GEN-LAST:event_jButton6MouseEntered

    private void jButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseExited
       jButton6.setBackground(new java.awt.Color(33, 53, 85));
    }//GEN-LAST:event_jButton6MouseExited

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       copiarTextoSeleccionado();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        editCalificacion();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(busqueda){
            Document doc = new Document();
            LocalDate fecha = LocalDate.now();
            
            String cui = tbl_calificaiones.getValueAt(0,0).toString();
            String nameC = tbl_calificaiones.getValueAt(0,1).toString();
            String last_name = tbl_calificaiones.getValueAt(0, 2).toString();
            String last_name_2 = tbl_calificaiones.getValueAt(0, 3).toString();
            String ciclo = tbl_calificaiones.getValueAt(0, 5).toString();
            int nameind = nameC.indexOf(" ");
            String name = "";
            
            obtenerIDEstudent(cui);
            obtenerCarra_and_ano(IDEstudent, cui, CiclosID_.get(jComboBox_ciclos.getSelectedIndex()));
            
            
            if(nameind != -1){
                name = nameC.substring(0, nameind);
            }else{
                name = nameC;
            }
            
            try {
                PdfWriter.getInstance(doc, new FileOutputStream("src/docts/" + name.trim() + "_" + last_name.trim() + "_" + ciclo + ".pdf"));
                doc.open();
                
                Image header = Image.getInstance("src/imge/lgIns.jpg");
                header.scaleToFit(138, 138);
                header.setAlignment(Chunk.ALIGN_CENTER);
                
                Paragraph title = new Paragraph();
                title.setAlignment(Paragraph.ALIGN_CENTER);
                title.setFont(FontFactory.getFont("Tahoma", 19, Font.BOLD, BaseColor.BLACK));
                title.add("\n \n Boleta de Registro de notas \n \n \n \n");

                
                Paragraph data = new Paragraph();
                data.setAlignment(Paragraph.ALIGN_LEFT);
                data.setFont(FontFactory.getFont("Tahoma", 12, Font.BOLD, BaseColor.BLACK));
                data.add("Nombre del estudiante:     ");
                data.setFont(FontFactory.getFont("Tahoma", 10, Font.NORMAL, BaseColor.BLACK));
                data.add(nameC + " " + last_name + " " + last_name_2 + "\n \n");

                data.setFont(FontFactory.getFont("Tahoma", 12, Font.BOLD, BaseColor.BLACK));
                data.add("CUI del estudiante:     ");
                data.setFont(FontFactory.getFont("Tahoma", 10, Font.NORMAL, BaseColor.BLACK));
                data.add(cui + "   ");
                
                data.setFont(FontFactory.getFont("Tahoma", 12, Font.BOLD, BaseColor.BLACK));
                data.add("Grado:     ");
                data.setFont(FontFactory.getFont("Tahoma", 10, Font.NORMAL, BaseColor.BLACK));
                data.add(AnoCarreraEstudent + "   ");
                
                data.setFont(FontFactory.getFont("Tahoma", 12, Font.BOLD, BaseColor.BLACK));
                data.add("Ciclo:     ");
                data.setFont(FontFactory.getFont("Tahoma", 10, Font.NORMAL, BaseColor.BLACK));
                data.add(ciclo + "\n \n");
                
                data.setFont(FontFactory.getFont("Tahoma", 12, Font.BOLD, BaseColor.BLACK));
                data.add("Carrera:     ");
                data.setFont(FontFactory.getFont("Tahoma", 10, Font.NORMAL, BaseColor.BLACK));
                data.add(CarreraEstudent + "\n \n");
                
                data.setFont(FontFactory.getFont("Tahoma", 12, Font.BOLD, BaseColor.BLACK));
                data.add("Centro educativo:     ");
                data.setFont(FontFactory.getFont("Tahoma", 10, Font.NORMAL, BaseColor.BLACK));
                data.add("INSTITUTO NACIONAL DE EDUCATIVO DIVERSIFICADA \n \n");
                
                data.setFont(FontFactory.getFont("Tahoma", 12, Font.BOLD, BaseColor.BLACK));
                data.add("Dirección del centro educativo:     ");
                data.setFont(FontFactory.getFont("Tahoma", 10, Font.NORMAL, BaseColor.BLACK));
                data.add("BARRIO NUEVO \n \n");
                 
                data.setFont(FontFactory.getFont("Tahoma", 12, Font.BOLD, BaseColor.BLACK));
                data.add("Municipio:     ");
                data.setFont(FontFactory.getFont("Tahoma", 10, Font.NORMAL, BaseColor.BLACK));
                data.add("LA UNION     ");
                
                data.setFont(FontFactory.getFont("Tahoma", 12, Font.BOLD, BaseColor.BLACK));
                data.add("Departamento:     ");
                data.setFont(FontFactory.getFont("Tahoma", 10, Font.NORMAL, BaseColor.BLACK));
                data.add("ZACAPA \n \n \n");
                
                Paragraph dt = new Paragraph();
                int year = fecha.getYear();
                int month = fecha.getMonthValue();
                int day = fecha.getDayOfMonth();
                
                dt.setAlignment(Paragraph.ALIGN_JUSTIFIED);
                dt.setFont(FontFactory.getFont("Tahoma", 12, Font.BOLD, BaseColor.BLACK));
                dt.add("\n \n Lugar y fecha:     ");
                dt.setFont(FontFactory.getFont("Tahoma", 10, Font.NORMAL, BaseColor.BLACK));
                dt.add("BARRIO NUEVO, LA UNION, ZACAPA, " + day + " " + month + " " + year);
                
                doc.add(header);
                doc.add(title);
                doc.add(data);
                
                PdfPTable tabla_notas = new PdfPTable(6);
                tabla_notas.setWidthPercentage(100);
                Font smallFont = new Font(Font.FontFamily.HELVETICA, 10);
                Font smallFontCont = new Font(Font.FontFamily.HELVETICA, 8);
                
                String[] cellContents = {
                    "Asignatura 0 Áreas curriculares",
                    "Unidad I",
                    "Unidad II",
                    "Unidad III",
                    "Unidad IV",
                    "Promedio"
                };
                
                for (String content : cellContents){
                    PdfPCell cell = new PdfPCell(new Phrase(content, smallFont));
                    cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
                    cell.setVerticalAlignment(PdfPCell.ALIGN_MIDDLE);
                    cell.setNoWrap(false);
                    cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabla_notas.addCell(cell);
                }
                     
                //recorrer tabla
                int cont =  tbl_calificaiones.getRowCount();
                
                for(int i=0; i<cont; i++){
                    PdfPCell cell1 = new PdfPCell(new Phrase(tbl_calificaiones.getValueAt(i, 4).toString(), smallFontCont));
                    PdfPCell cell2 = new PdfPCell(new Phrase(tbl_calificaiones.getValueAt(i, 6).toString(), smallFontCont));
                    PdfPCell cell3 = new PdfPCell(new Phrase(tbl_calificaiones.getValueAt(i, 7).toString(), smallFontCont));
                    PdfPCell cell4 = new PdfPCell(new Phrase(tbl_calificaiones.getValueAt(i, 8).toString(), smallFontCont));
                    PdfPCell cell5 = new PdfPCell(new Phrase(tbl_calificaiones.getValueAt(i, 9).toString(), smallFontCont));
                    PdfPCell cell6 = new PdfPCell(new Phrase(tbl_calificaiones.getValueAt(i, 10).toString(), smallFontCont));
                    
                    cell2.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
                    cell2.setVerticalAlignment(PdfPCell.ALIGN_MIDDLE);
                    cell3.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
                    cell3.setVerticalAlignment(PdfPCell.ALIGN_MIDDLE);
                    cell4.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
                    cell4.setVerticalAlignment(PdfPCell.ALIGN_MIDDLE);
                    cell5.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
                    cell5.setVerticalAlignment(PdfPCell.ALIGN_MIDDLE);
                    cell6.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
                    cell6.setVerticalAlignment(PdfPCell.ALIGN_MIDDLE);
                    
                    tabla_notas.addCell(cell1);
                    tabla_notas.addCell(cell2);
                    tabla_notas.addCell(cell3);
                    tabla_notas.addCell(cell4);
                    tabla_notas.addCell(cell5);
                    tabla_notas.addCell(cell6);
                }
                
                doc.add(tabla_notas);
                doc.add(dt);
                doc.close();
                JOptionPane.showMessageDialog(null, "Se generó un informe de calificaciones", "Completado!", JOptionPane.INFORMATION_MESSAGE);
                
                //abrir el PDF
                String filePath = "src/docts/" + name.trim() + "_" + last_name.trim() + "_" + ciclo + ".pdf";
                File pdfFile = new File(filePath);
                
                if(Desktop.isDesktopSupported() && pdfFile.exists()){
                    try {
                        Desktop.getDesktop().open(pdfFile);
                    } catch (IOException e) {
                         e.printStackTrace();
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "PDF no encontrado o operación incompatible", "Error!", JOptionPane.ERROR_MESSAGE);
                }       
                        
            } catch (DocumentException | IOException e) {
                System.err.println("Error en PDF o ruta de Imagen " + e);
                JOptionPane.showMessageDialog(null, "No se puedo generar el informe", "Error!", JOptionPane.ERROR_MESSAGE);
            }
             
        }else{
            JOptionPane.showMessageDialog(null, "Realice una busqueda de las calificaciones de un estudiante con Ciclo", "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton6ActionPerformed
    
    private void loadtable(){
        DefaultTableModel modeloTable = (DefaultTableModel) tbl_calificaiones.getModel();
        modeloTable.setRowCount(0);
        
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int column;
        
        int[] anchos = {50, 100, 70, 70, 70, 50, 20, 20, 20, 20, 20};
        
        for(int i=0; i<tbl_calificaiones.getColumnCount(); i++){
            tbl_calificaiones.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }
        
        try {
            Connection connection_ = conectionDB.getConnection();
            ps = connection_.prepareStatement("SELECT * FROM VW_LISTADO_CALIFICACIONES");    
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
    
    private void obtenerCiclos(){
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
                 CiclosID_.add(rs.getObject(1).toString());
             }
            
        } catch (SQLException e) {
             System.out.println("ERROR: " + e);
        }
    }
    
    private void buscarNota(String cui){
        DefaultTableModel modeloTable = (DefaultTableModel) tbl_calificaiones.getModel();
        modeloTable.setRowCount(0);
        
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int column;
        
        try {
            Connection connection_ = conectionDB.getConnection();
            ps = connection_.prepareStatement("SELECT * FROM F_BUSCAR_CALIFICACION_ESTUDIANTE('"+cui+"')");    
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
    
    private void buscarNotaCiclo(String cui, String ciclo){
        DefaultTableModel modeloTable = (DefaultTableModel) tbl_calificaiones.getModel();
        modeloTable.setRowCount(0);
        
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int column;
        
        try {
            Connection connection_ = conectionDB.getConnection();
            ps = connection_.prepareStatement("SELECT * FROM F_BUSCAR_CALIFICACION_ESTUDIANTE_CICLOS('"+cui+"', '"+ciclo+"')");    
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
        int fila = tbl_calificaiones.getSelectedRow();
        String Cui = tbl_calificaiones.getValueAt(fila, 0).toString();
        
        //obtener el portapapeles
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection seleccion = new StringSelection(Cui);
        clipboard.setContents(seleccion, null);
    }
    
    private void editCalificacion(){
        int fila = tbl_calificaiones.getSelectedRow();
        if (fila < 0){
            JOptionPane.showMessageDialog(null, "Seleccione una calificación", "Error!", JOptionPane.ERROR_MESSAGE);
        }else{
            home_datosEdit.calificaiones_estudiante = tbl_calificaiones.getValueAt(fila, 0).toString();
            home_calificaciones_edit dialog = new home_calificaciones_edit(new javax.swing.JFrame(), true);
            dialog.setVisible(true);
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
    
    private void obtenerCarra_and_ano(String cod, String Cui, String ciclo){
        PreparedStatement ps;
        ResultSet rs;
        
        try {
            Connection connection_ = conectionDB.getConnection();
            ps = connection_.prepareStatement("SELECT CARRERA_NOMBRE FROM TBL_ESTUDIANTE, TBL_CARRERA " + 
                                                "WHERE ESTUDIANTE_CARRERA = CARRERA_COD AND ESTUDIANTE_COD = '"+cod+"'");    
            rs = ps.executeQuery();
            
            while(rs.next()){
                CarreraEstudent = rs.getString(1);
            }          
            
        } catch (SQLException e) {
             System.out.println("ERROR: " + e);
        }
        
        try {
            Connection connection_ = conectionDB.getConnection();
            ps = connection_.prepareStatement("SELECT ANO_CARRERA_NOMBRE FROM TBL_CALIFICACIONES, TBL_ESTUDIANTE, TBL_CICLOS, TBL_ANO_CARRERA " + 
                                             "WHERE CALIFICACIONES_ESTUDIANTE = ESTUDIANTE_COD AND CALIFICACIONES_CICLO = CICLOS_COD AND "+
                                             "CALIFICACIONES_ANO_CARRERA = ANO_CARRERA_COD AND ESTUDIANTE_CUI = '"+Cui+"' AND CICLOS_COD = '"+ciclo+"' AND ESTUDIANTE_ESTATUS = '1'");
            rs = ps.executeQuery();
            
            while(rs.next()){
                AnoCarreraEstudent = rs.getString(1);
            }    
            
        } catch (Exception e) {
             System.out.println("ERROR: " + e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Carreras;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox_ciclos;
    private javax.swing.JRadioButton jRadioButton_ciclos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_calificaiones;
    private javax.swing.JTextField txt_calificaiones_cui;
    // End of variables declaration//GEN-END:variables
}
