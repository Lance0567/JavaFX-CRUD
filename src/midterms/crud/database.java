/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterms.crud;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author pc
 */
public class database {
    
    public static Connection connect(){
    
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/crud", "root", "");
            return connect;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
        
    }    
    
}