
package universidadgrupo78.acesodatos;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import universidadgrupo78.entidades.Materia;



public class MateriaData {
     private Connection con=null;
    
    public MateriaData(){
        con = Conexion.getConexion();
    }
    
    public void guardarMateria(Materia materia){
        String sql ="INSERT INTO materia(nombre,anioMateria,estado) VALUES (?,?,?)";
        
        try {
                PreparedStatement fs = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
                fs.setString(1, materia.getNombre());
                fs.setInt(2, materia.getAnioMateria());
                fs.setBoolean(3, materia.isEstado());
                fs.executeUpdate();
                
                ResultSet rs = fs.getGeneratedKeys();
                
                if(rs.next()){
                    materia.setIdMateria(rs.getInt(1));
                    JOptionPane.showMessageDialog(null, "Materia Agregado");
                }      
                
                fs.close();         
                
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al obtener datos de Materia");
        }
    }
    public void modificarAlumno(Materia materia) {
      String sql="UPDATE materia SET nombre=?,anioMateria=?,estado=?+ WHERE idMateria=?";
      PreparedStatement ps =null;
       try {
           ps=con.prepareStatement(sql);
           ps.setString(1, materia.getNombre());
           ps.setInt(2,materia.getAnioMateria());
           ps.setBoolean(3,materia.isEstado());
           ps.setInt(4,materia.getIdMateria());
           int exito=ps.executeUpdate();
           if (exito==1){
               JOptionPane.showMessageDialog(null, "Alumno modificado con éxito");
           }
           
       } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"Error al acceder a la Tabla Alumno") ;
       }   
  }
    
}