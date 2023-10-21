package com.ned.j.v.home.backend;

import com.ned.j.v.data.conectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class home_register_back {
    public void register_tbl_one(String nombre, String table, String campo){
        
        PreparedStatement ps;
        ResultSet rs;
        String InsertSQL = "INSERT INTO "+table+"("+campo+") "+"VALUES ('"+nombre+"')";
        
        try {
            Connection connection_ = conectionDB.getConnection();
            ps = connection_.prepareStatement(InsertSQL, Statement.RETURN_GENERATED_KEYS);
            ps.execute();
            rs = ps.getGeneratedKeys();
            
            while(rs.next()){
                rs.getString(1);
                JOptionPane.showMessageDialog(null, "Dato registrado con éxito", "Registro", JOptionPane.INFORMATION_MESSAGE);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void register_tbl_two(String dpi, String persona, String tbltable, String tblcampo, String tblcampo2){
        PreparedStatement ps;
        ResultSet rs;
        String InsertSQL = "INSERT INTO "+tbltable+"("+tblcampo+", "+tblcampo2+") "+"VALUES ('"+dpi+"', '"+persona+"')";
        
        try {
            Connection connection_ = conectionDB.getConnection();
            ps = connection_.prepareStatement(InsertSQL, Statement.RETURN_GENERATED_KEYS);
            ps.execute();
            rs = ps.getGeneratedKeys();
            
            while(rs.next()){
                rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public void register_tbl_personas(String nombres, String apellidop, String apellidom, String apellidoc, String fechaN,
            String numeroT, String email, String sexo, String etnia, String profesion){
        
        PreparedStatement ps;
        ResultSet rs;
        String InsertSQL = "INSERT INTO TBL_PERSONAS (PERSONAS_NOMBRES, PERSONAS_APELLIDOP, PERSONAS_APELLIDOM, "
        + "PERSONAS_APELLIDOC, PERSONAS_FECHA_NACI, PERSONAS_NUMERO_TEL, PERSONAS_EMAIL, PERSONAS_SEXO, PERSONAS_ETNIA, "
        + "PERSONAS_PROFESION) VALUES ('"+nombres+"', '"+apellidop+"', '"+apellidom+"', '"+apellidoc+"', '"+fechaN+"', "
        + "'"+numeroT+"', '"+email+"', '"+sexo+"', '"+etnia+"', '"+profesion+"')";
        
        try {
            Connection connection_ = conectionDB.getConnection();
            ps = connection_.prepareStatement(InsertSQL, Statement.RETURN_GENERATED_KEYS);
            ps.execute();
            rs = ps.getGeneratedKeys();
            
             while(rs.next()){
                 rs.getString(1);
             }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void register_tbl_estudiante(String cui, String codEstd, String persona, String carrera, String ano_carrera){
        PreparedStatement ps;
        ResultSet rs;
        String InsertSQL = "INSERT INTO TBL_ESTUDIANTE (ESTUDIANTE_CUI, ESTUDIANTE_COD_EST, ESTUDIANTE_PERSONA, ESTUDIANTE_CARRERA, ESTUDIANTE_ANO_CARRERA)"
                + " VALUES ('"+cui+"', '"+codEstd+"', '"+persona+"', '"+carrera+"', '"+ano_carrera+"')";
        
        try {
            Connection connection_ = conectionDB.getConnection();
            ps = connection_.prepareStatement(InsertSQL, Statement.RETURN_GENERATED_KEYS);
            ps.execute();
            rs = ps.getGeneratedKeys();
            
            while(rs.next()){
                rs.getString(1);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void register_tbl_materias(String nombre, String carrera, String ano_carrera){
        PreparedStatement ps;
        ResultSet rs;
        String InsertSQL = "INSERT INTO TBL_MATERIAS (MATERIAS_NOMBRE, MATERIAS_CARRERA, MATERIAS_ANO_CARRERA)"
                + " VALUES ('"+nombre+"', '"+carrera+"', '"+ano_carrera+"')";
        
        try {
            Connection connection_ = conectionDB.getConnection();
            ps = connection_.prepareStatement(InsertSQL, Statement.RETURN_GENERATED_KEYS);
            ps.execute();
            rs = ps.getGeneratedKeys();
            
            while(rs.next()){
                rs.getString(1);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void register_tbl_catedratico_has_materia(String catedratico, String materia, String ciclo){
        PreparedStatement ps;
        ResultSet rs;
        String InsertSQL = "INSERT INTO TBL_CATEDRATICO_HAS_MATERIAS "
                + "(CATEDRATICO_HAS_MATERIAS_CATEDRATICO, CATEDRATICO_HAS_MATERIAS_MATERIA, CATEDRATICO_HAS_MATERIAS_CICLO)"
                + " VALUES ('"+catedratico+"', '"+materia+"', '"+ciclo+"')";
        
        try {
            Connection connection_ = conectionDB.getConnection();
            ps = connection_.prepareStatement(InsertSQL, Statement.RETURN_GENERATED_KEYS);
            ps.execute();
            rs = ps.getGeneratedKeys();
            
            while(rs.next()){
                rs.getString(1);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
