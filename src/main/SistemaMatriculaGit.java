/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Date;
import logica.Matricula;

/**
 *
 * @author cahb2
 */
public class SistemaMatriculaGit {
     public static void main(String[] args) {
        // TODO code application logic here
        
        //bjeto Estudiante
        Estudiante estudiante1 = new Estudiante(
            "Carlos Pérez",
            "123456789",
            "E-001",
            "Ingeniería de Software"
        );

        // objeto Profesor
        Profesor profesor1 = new Profesor(
            "María González",
            "987654321",
            "Licenciatura en Informática",
            "TI-002"
        );

        //Prueba de matrícula 
        Matricula matricula1 = new Matricula(
            estudiante1,
            profesor1,
            "Programación II",
            new Date(),
            "MAT-2026-001"
        );

        //  Mostrar toda la información
        System.out.println("===== SISTEMA DE MATRÍCULA =====");
        estudiante1.mostrarDatosEstudiante();
        profesor1.mostrarDatosProfesor();
        matricula1.mostrarInformacionMatricula();

        System.out.println(" Matrícula registrada exitosamente.");
    }
     
}
