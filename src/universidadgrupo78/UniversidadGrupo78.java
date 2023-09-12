
package universidadgrupo78;

import com.sun.prism.impl.PrismSettings;
import java.sql.Connection;
import universidadgrupo78.acesodatos.Conexion;
import universidadgrupo78.vistas.PaginaInicial;



public class UniversidadGrupo78 {

   
    public static void main(String[] args) {
        Connection con = Conexion.getConexion();
        
       PaginaInicial.NimbusLookAndFeel();
       
    }
    
}
