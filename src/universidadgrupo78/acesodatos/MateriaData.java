
package universidadgrupo78.acesodatos;


import java.sql.*;
import java.util.*;
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
                PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, materia.getNombre());
                ps.setInt(2, materia.getAnioMateria());
                ps.setBoolean(3, materia.isEstado());
                ps.executeUpdate();
                
                ResultSet rs = ps.getGeneratedKeys();
                
                if(rs.next()){
                    materia.setIdMateria(rs.getInt(1));
                    JOptionPane.showMessageDialog(null, "Materia Agregado");
                }      
                
                ps.close();         
                
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al obtener datos de Materia");
        }
    }
    public Materia buscarMateria(int id) {
        Materia materia=null;
        String sql="SELECT nombre,anioMateria,estado FROM materia WHERE idMateria=?";
       
        try {
            PreparedStatement ps=con.prepareStatement(sql);
           ps.setInt(1, id);
           ResultSet rs= ps.executeQuery();
           if(rs.next()){
               materia= new Materia();
               materia.setIdMateria(id);
               materia.setNombre(rs.getString("nombre"));
               materia.setAnioMateria(rs.getInt("anioMateria"));
               materia.setEstado(rs.getBoolean("estado"));
            }else{
               JOptionPane.showMessageDialog(null,"No existe la materia");
            }
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Error al acceder a la Tabla Materia");
       }
           return materia;     
    }   
    public void modificarMateria(Materia materia) {
       String sql="UPDATE materia SET anioMateria=?,estado=? WHERE nombre=?";
      
        try {
           PreparedStatement ps=con.prepareStatement(sql);
           ps.setInt(1,materia.getAnioMateria());
           ps.setBoolean(2,materia.isEstado());
           ps.setString(3,materia.getNombre());
           int exito=ps.executeUpdate();
           if (exito==1){
               JOptionPane.showMessageDialog(null, "Materia modificado con éxito");
           }else {
            JOptionPane.showMessageDialog(null, "No se pudo modificar la materia");
           }
          ps.close();
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"Error al acceder a la Tabla Materia") ;
        } 
    }  
    public void eliminarMateria(int id){
        try{
            String sql="UPDATE materia SET estado=0 WHERE idMateria=? ";
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila=ps.executeUpdate();
            if (fila==1){
               JOptionPane.showMessageDialog(null, "Se eliminó el materia");  
            }
            ps.close();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la Tabla Materia");  
        }
    }    
    public List<Materia> listarAlumnos(){
    
    String sql="SELECT idMateria,nombre,anioMateria,estado FROM materia WHERE estado=1";
        
    ArrayList<Materia> materias = new ArrayList<>();
   
     try{
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Materia materia= new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("anioMateria"));
                materia.setEstado(rs.getBoolean("estado"));
                materias.add(materia);
            }
            ps.close();
    }catch (SQLException ex) {
     JOptionPane.showMessageDialog(null,"Error al acceder a la Tabla Materia");   
    }
    return materias;
    }
}