package Taller;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
         Scanner lectura = new Scanner(System.in);
        
        System.out.println("Cual es su nombre? ");
        String nombre = lectura.nextLine();
        
        System.out.println("\ncual es su sexo? ");
        String sexo = lectura.nextLine();
       
        
        System.out.println("\ncual es su edad? ");
        int edad = lectura.nextInt();
        lectura.nextLine(); 
        
        System.out.println("\nDigite su estatura(cm)");
        int estatura = lectura.nextInt();
        lectura.nextLine(); 
        
        System.out.println("\nEstado civil? ");
        String estadoCivil = lectura.nextLine();

        

        Persona per1 = new Persona(nombre, edad, sexo, estadoCivil, estatura);

       System.out.println("Hola " + per1.getNombre() + " , tu edad es de " + per1.getEdad() + "\n" +
               " tu sexo es: " + per1.getSexo() + "\n" + " tu estatura es de: " + per1.getEstatura() + " cm\n" +
                      " tu estado civil es: " + per1.getEstado_civil() + "\n");
       
                  
        System.out.println("en que lugar dormiras?");
        String lugar= lectura.nextLine();
         System.out.println("cuantas horas?");
        int horas= lectura.nextInt();
        lectura.nextLine();
        System.out.println("de dia o noche?");
        String dia= lectura.nextLine();
        
        per1.dormir(lugar, horas, dia);
        System.out.println("-------------------");
        
        System.out.println("En donde haras ejercicio?");
        String ejercicio= lectura.nextLine();
        per1.hacerEjercicio(ejercicio);
        System.out.println("-------------------------------------------");
         
        System.out.println("que comeras?");
        String comida= lectura.nextLine();
        Persona.comer(comida);
        
    }
   
    
    
    
}

