/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo78.entidades;

import java.time.LocalDate;

/**
 *
 * @author Joni
 */
public class Alumno {
   
    private int idAlumno;
    private int dni;
    private String apellido;
    private String nombre;
    private LocalDate fechaNac;
    private boolean estado;

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    private int dni;
    
    public Alumno() {
    }

<<<<<<< Updated upstream
    public Alumno(int idAlumno, String apellido, String nombre, LocalDate fechaNac, boolean estado, int dni) {
        this.idAlumno = idAlumno;
        this.dni = dni;
=======
    public Alumno(int idAlumno,int dni, String apellido, String nombre, LocalDate fechaNac, boolean estado) {
        this.idAlumno = idAlumno;
        this.dni=dni;
>>>>>>> Stashed changes
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.estado = estado;
        
    }

<<<<<<< Updated upstream
    public Alumno(String apellido, String nombre, LocalDate fechaNac, boolean estado, int dni) {
        this.dni = dni;
=======
    public Alumno(int dni,String apellido, String nombre, LocalDate fechaNac, boolean estado) {
        this.dni=dni;
>>>>>>> Stashed changes
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.estado = estado;
        
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }


    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "alumno{" + "idAlumno=" + idAlumno + ", apellido=" + apellido + ", nombre=" + nombre + '}';
    }
    
    
}
