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
                System.out.println("added data");
                JOptionPane.showMessageDialog(null, "Dato registrado con éxito", "Registro", JOptionPane.INFORMATION_MESSAGE);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
