
package universidadgrupo78;

import java.sql.Connection;
import universidadgrupo78.acesodatos.Conexion;
import universidadgrupo78.vistas.PaginaInicial;



public class UniversidadGrupo78 {

   
    public static void main(String[] args) {
        Connection con = Conexion.getConexion();
        
        PaginaInicial pag=new PaginaInicial();
        //</editor-fold>
        PaginaInicial.setNimbusFeel();
       
       java.awt.EventQueue.invokeLater(new Runnable() {
          public void run() {
            new PaginaInicial().setVisible(true);
          }
       });
        
    }
    
}
