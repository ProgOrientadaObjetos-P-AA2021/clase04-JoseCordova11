/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import java.util.Scanner;
/**
 *
 * @author Jose Cordova
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        /*Crear un objeto y presentar los datos
        Ingresar la información por teclado.
        */
        Scanner leer = new Scanner(System.in);
        
	System.out.println("Ingrese nombre del Hospital: ");
	String nombre = leer.next();
	
	System.out.println("Ingrese nombre de la ciudad: ");
	String ciudad = leer.next();
	
	System.out.println("Ingrese número doctores: ");
	int numDoctores = leer.nextInt();

	System.out.println("Ingrese número enfermeros");
	int numEnfermeros = leer.nextInt();
	
	Hospital h1 = new Hospital(nombre, ciudad, numDoctores, numEnfermeros);
        
        System.out.printf("%s\n" , h1);
	  
        
        
    }
}
