/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo78.acesodatos;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {
    private static final String URL="jdbc:mariadb://localhost/";
    private static final String DB="universidadULP";
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    private static Connection connection;
    
    private Conexion (){}
    
    public static Connection getConexion(){
        
        if(connection == null){
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection = DriverManager.getConnection(URL+DB,USUARIO,PASSWORD);                
            } catch (ClassNotFoundException ex){ 
                JOptionPane.showMessageDialog(null, "Error al cargar los driver."); 
            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Abrir XAMPP o algo esta mal escrito.");
            }
        }
        return connection;
    }
}

