
package universidadgrupo78;

import universidadgrupo78.acesodatos.MateriaData;
import universidadgrupo78.entidades.Materia;
import universidadgrupo78.vistas.PaginaInicial;
import java.sql.*;
import java.time.LocalDate;
import java.util.*;
import universidadgrupo78.acesodatos.AlumnoData;
import universidadgrupo78.entidades.Alumno;



public class UniversidadGrupo78 {

   
    public static void main(String[] args) {
         
        
        PaginaInicial.NimbusLookAndFeel();
        Alumno juan = new Alumno(1237823,"Dominguez","Juan",LocalDate.of(1994,12,03),true);
        AlumnoData al = new AlumnoData();
        al.guardarAlumno(juan);
        Materia Ciencia = new Materia("Ciencia5",3,true);
        MateriaData ci= new MateriaData();
        ci.guardarMateria(Ciencia);
    }
    
}
