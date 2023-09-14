
package universidadgrupo78;

import universidadgrupo78.acesodatos.MateriaData;
import universidadgrupo78.entidades.Materia;
import universidadgrupo78.vistas.PaginaInicial;
import java.sql.*;
import java.util.*;



public class UniversidadGrupo78 {

   
    public static void main(String[] args) {
         
        
        PaginaInicial.NimbusLookAndFeel();
        Materia Ciencia = new Materia("Ciencia5",4,true);
        System.out.println(Ciencia);
        MateriaData ci = new MateriaData();
        System.out.println(ci);
        ci.guardarMateria(Ciencia);
    }
    
}
