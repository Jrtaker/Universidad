
package universidadgrupo78;

import java.sql.Connection;
import universidadgrupo78.acesodatos.Conexion;
import universidadgrupo78.acesodatos.MateriaData;
import universidadgrupo78.entidades.Materia;
import universidadgrupo78.vistas.PaginaInicial;



public class UniversidadGrupo78 {

   
    public static void main(String[] args) {
        Connection con = Conexion.getConexion();
        
        PaginaInicial.NimbusLookAndFeel();
       
        Materia ciencia = new Materia("Ciencia", 3, true);
        MateriaData ci=new MateriaData();
        ci.guardarMateria(ciencia);
    }
    
}
