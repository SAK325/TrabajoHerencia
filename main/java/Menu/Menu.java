/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

import Modelo.Estudiante;
import Modelo.Profesor;
import java.util.Scanner;

/**
 *
 * @author qfsak
 */
public class Menu {
    
    private boolean bandera = true;
    Scanner leer = new Scanner(System.in);
    Estudiante e = null;
    Profesor p = null;
    
    public void menu(){
    
        System.out.println("Elija la opción del menú que desea realizar"
                + "Ingrese 1 para registrar un estudiante"
                + "Ingrese 2 para consultar un estudiante"
                + "Ingrese 3 para registrar un profesor"
                + "Ingrese 4 para consultar un profesor"
                + "Ingrese 0 para terminar el programa");
        
        
    }
    
}
