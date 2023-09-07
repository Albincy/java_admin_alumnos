package com.ned.j.v.login.backend;

import com.ned.j.v.data.conectionDB;
import com.ned.j.v.data.usersDT;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;


public class conectionUser {
    public static boolean getaccess(String txt_user, String txt_password){
 
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int column;
        boolean accessUser = false;
        boolean accessPassword = false;
        boolean loginDone = false;
        
        try {
            Connection connection_ = conectionDB.getConnection();
            ps = connection_.prepareStatement("SELECT * FROM TBL_USUARIOS");    
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            column = rsmd.getColumnCount();
            
            while(rs.next()){
                Object[] users_ = new Object[column];
                accessUser = false;
                accessPassword = false;
                
                for(int i=1; i<4; i++){
                    users_[i] = rs.getObject(i + 1);
                    
                    if (i==1){
                        if (users_[i].equals(txt_user)){
                            accessUser = true;
                        }                     
                    }else if (i==2){
                       if (users_[i].equals(txt_password)){
                            accessPassword = true;
                        } 
                    }
                    
                    if ((accessUser) && (accessPassword) && i==3){
                         loginDone = true;
                         usersDT.userName = txt_user;
                         usersDT.password = txt_password;
                         usersDT.rol = users_[i].toString();
                         System.out.println("successful login");
                         break;
                    }
                }
                if (loginDone){
                    break;
                }
            }
            
            if (!accessUser || !accessPassword){
                System.err.println("username not found");
                return false;
            }else{
                return true;
            }
        } catch (SQLException e) {
            System.out.println("ERROR: " + e);
        }                
        return false;
    }
}
