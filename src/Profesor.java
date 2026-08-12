/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class Profesor {

    // Atributos
    private String idProfesor;
    private String nombre;
    private String especialidad;

    // Constructor vacío
    public Profesor() {
    }

    // Constructor con parámetros
    public Profesor(String idProfesor, String nombre, String especialidad) {
        this.idProfesor = idProfesor;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    // Métodos Getters y Setters
    public String getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(String idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // Método para mostrar datos
    public void mostrarProfesor() {
        System.out.println("--- Datos del Profesor ---");
        System.out.println("ID: " + idProfesor);
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
    }
}
