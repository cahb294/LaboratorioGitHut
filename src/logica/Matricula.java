/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author cahb294
 * clase de gestion de matricula de estudiante.
 */
public class Matricula {
    
 // Atributos privados
    private Estudiante estudiante;
    private Profesor profesor;
    private String asignatura;
    private Date fechaMatricula;
    private String codigoMatricula;

    
    public Matricula(Estudiante estudiante, Profesor profesor, String asignatura, Date fechaMatricula, String codigoMatricula) {
        this.estudiante = estudiante;
        this.profesor = profesor;
        this.asignatura = asignatura;
        this.fechaMatricula = fechaMatricula;
        this.codigoMatricula = codigoMatricula;
    }
    
    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public Date getFechaMatricula() {
        return fechaMatricula;
    }

    public void setFechaMatricula(Date fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }

    public String getCodigoMatricula() {
        return codigoMatricula;
    }

    public void setCodigoMatricula(String codigoMatricula) {
        this.codigoMatricula = codigoMatricula;
    }

    // Método para mostrar los datos de la matrícula
    public void mostrarInformacionMatricula() {
        System.out.println("=== DATOS DE MATRÍCULA ===");
        System.out.println("Código: " + codigoMatricula);
        System.out.println("Fecha: " + fechaMatricula);
        System.out.println("Asignatura: " + asignatura);
        System.out.println("Estudiante: " + estudiante.getNombre() + " - Carné: " + estudiante.getCarnet());
        System.out.println("Profesor: " + profesor.getNombre() + " - Cédula: " + profesor.getCedula());
        System.out.println("----------------------------------------");
    }

}
