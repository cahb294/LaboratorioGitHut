/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author maria
 */
public class Estudiante {

    //Atributos 
    private String cedula;
    private String nombre;
    private String correoEstudiante;
    private String carrera;

    //constructor vacío
    public Estudiante() {
    }

    //Constructor con parámetros
    public Estudiante(String cedula, String nombre, String correoEstudiante, String carrera) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.correoEstudiante = correoEstudiante;
        this.carrera = carrera;
    }
    
    
    // Getters y Setters

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoEstudiante() {
        return correoEstudiante;
    }

    public void setCorreoEstudiante(String correoEstudiante) {
        this.correoEstudiante = correoEstudiante;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    
    // Método para mostrar los datos del estudiante
    
    
    public void mostrarEstudiante (){
        
        System.out.println("---Datos del Estudiante---");
        System.out.println("Cédula: " + cedula);
        System.out.println("Nombre: " + nombre);
        System.out.println("Correo Estudiantil: " + correoEstudiante);
        System.out.println("Carrera: " + carrera);
}
    
    
    
    
}
