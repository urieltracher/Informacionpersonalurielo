/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.informacionpersonaluriel;

/**
 *
 * @author rider
 */
public class InformacionPersonal {

    String nombre_alumno = "uriel",
           apellido_paterno = "gtz",
           apellido_materno = "rdz";
    int numero_cuenta = 00000;
    String semestre = "1000";
    String materias = "Prg/12:30/13:00/";
    
    
    public void Informacion(){        
        System.out.println("nombre completo del usuario: " + nombre_alumno +" "+ apellido_paterno +" "+ apellido_materno );
        System.out.println("numero de cuenta : " +numero_cuenta);
        System.out.println("semestre cursando: " + semestre);
        System.out.println("Las materias y horarios que cursa: " + materias);
    }
    
    public static void main(String[] args) {
        InformacionPersonal informacion= new InformacionPersonal();
        informacion.Informacion();
                
    }
    
}