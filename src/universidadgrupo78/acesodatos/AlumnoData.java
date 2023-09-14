/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo78.acesodatos;

import java.util.List;
import java.sql.*;
import java.sql.Date;
import javax.swing.JOptionPane;
import universidadgrupo78.entidades.Alumno;
import java.sql.ResultSet;
import java.util.ArrayList;
/* 

<< GUARDAR 
<< MODIFICAR 
<< BUSCAR POR ID  
<< BUSCAR POR DNI 
<< LISTAR 
<< ELIMINAR 

*/

public class AlumnoData {
 
   private Connection con=null;
 
   public AlumnoData() {
        con = Conexion.getConexion();
   }
    
    
    public void guardarAlumno(Alumno alumno){ 
       
    String sql= "INSERT INTO alumno(dni,apellido,nombre,fechaNac,estado) VALUES (?,?,?,?,?)";
    try{          
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,alumno.getDni());
            ps.setString(2,alumno.getApellido());
            ps.setString(3,alumno.getNombre());
            ps.setDate(4,Date.valueOf(alumno.getFechaNac()));
            ps.setBoolean(5,alumno.isEstado());
            ps.executeUpdate();
            ResultSet rs= ps.getGeneratedKeys();
            
            if(rs.next()){
                alumno.setIdAlumno(rs.getInt(1));// o iD_alumno
                JOptionPane.showMessageDialog(null,"Alumno ingresado correctamente");
            }   
    
    }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"El alumno no se guardó");
    }       
}
    public void modificarAlumno(Alumno alumno) {
      String sql="UPDATE alumno SET apellido=?,nombre=?,fechaNac=? WHERE dni=?";
      PreparedStatement ps =null;
       try {
           ps=con.prepareStatement(sql);
           ps.setString(1,alumno.getApellido());
           ps.setString(2,alumno.getNombre());
           ps.setDate(3,Date.valueOf(alumno.getFechaNac()));
           ps.setInt(4, alumno.getDni());
           int exito=ps.executeUpdate();
           if (exito==1){
               JOptionPane.showMessageDialog(null, "Alumno modificado con éxito");
           }else{
               JOptionPane.showMessageDialog(null, "El Alumno no pudo ser modificado");
           }
           ps.close();
       } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"Error al acceder a la Tabla Alumno") ;
       }   
  }
    public Alumno buscarAlumno(int id) {
        Alumno alumno=null;
        String sql="SELECT dni,apellido,nombre,fechaNac FROM alumno WHERE idAlumno=?AND estado=1";
        PreparedStatement ps =null;
        try {
           ps=con.prepareStatement(sql);
           ps.setInt(1, id);
           ResultSet rs= ps.executeQuery();
           if(rs.next()){
               alumno= new Alumno();
               alumno.setIdAlumno(id);
               alumno.setDni(rs.getInt("dni"));
               alumno.setApellido(rs.getString("apellido"));
               alumno.setNombre(rs.getString("nombre"));
               alumno.setFechaNac(rs.getDate("fechaNac").toLocalDate());
               alumno.setEstado(rs.getBoolean("estado"));
            }else{
               JOptionPane.showMessageDialog(null,"No existe el alumno");
            }
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Error al acceder a la Tabla Alumno");
       }
           return alumno;     
    }
    public Alumno buscarAlumnoPorDni(int dni) {
        Alumno alumno =null;
        String sql="SELECT * FROM alumno WHERE dni=? AND estado=1";
        try {
           PreparedStatement ps=con.prepareStatement(sql);
           ps.setInt(1, dni);
           ResultSet rs= ps.executeQuery();
           if(rs.next()){
               alumno= new Alumno();
               alumno.setIdAlumno(rs.getInt("idAlumno"));
               alumno.setDni(rs.getInt("dni"));
               alumno.setApellido(rs.getString("apellido"));
               alumno.setNombre(rs.getString("nombre"));
               alumno.setEstado(rs.getBoolean("estado"));
               alumno.setFechaNac(rs.getDate("fechaNac").toLocalDate());
           }else{
               JOptionPane.showMessageDialog(null,"No existe el alumno");
           }
            ps.close();
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Error al acceder a la Tabla Alumno");
       }
        System.out.println(alumno.toString());
        return alumno;
    }
    public  List<Alumno> listarAlumnos(){
    
    String sql="SELECT idAlumno,dni,apellido,nombre,fechaNac FROM alumno WHERE estado=1";
        
    ArrayList<Alumno> alumnos = new ArrayList<>();
   
     try{
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Alumno alumno= new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));
                alumnos.add(alumno);
            }
            ps.close();
    }catch (SQLException ex) {
     JOptionPane.showMessageDialog(null,"Error al acceder a la Tabla Alumno");   
    }
    return alumnos;
    }
 public void eliminarAlumno (int id){
        try{
            String sql="UPDATE alumno SET estado=0 WHERE dni=? ";
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila=ps.executeUpdate();
            if (fila==1){
               JOptionPane.showMessageDialog(null, "Se eliminó el alumno");  
            }
            ps.close();
        }catch (SQLException ex) {
     JOptionPane.showMessageDialog(null,"Error al acceder a la Tabla Alumno");  
    }
}
}