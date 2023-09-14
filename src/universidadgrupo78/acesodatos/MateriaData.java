/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo78.acesodatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import universidadgrupo78.entidades.Materia;
/**
 *
 * @author Joni
 */
public class MateriaData {
     private Connection con=null;
    
    public void MateriaData(){
        con = Conexion.getConexion();
    }
    
    public void guardarMateria(Materia materia){
        String sql ="INSERT INTO materia(nombre, anioMateria, estado) VALUES (?, ?, ?)";
        System.out.println(sql);
        try {
                PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, materia.getNombre());
                ps.setInt(2, materia.getAnioMateria());
                ps.setBoolean(3, materia.isEstado());
                ps.executeUpdate();
                
                ResultSet rs = ps.getGeneratedKeys();
                
                if(rs.next()){
                    materia.setIdMateria(rs.getInt(1));
                    JOptionPane.showMessageDialog(null, "Alumno Agregado");
                }      
                
                ps.close();         
                
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al obtener datos de Materia"+ex.getMessage());
        }
    }
    
}
