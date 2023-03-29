package org.ieslosremedios.daw1.prog.ut7.ejercicios;

import java.io.*;
public class Ejercicio3IntentosPasswdConsole {
    public static void main(String[] args) {
        /**
         * Enunciado: Escribe un programa que pida al usuario su nombre y contraseña y los compare
         * con la valor de una constante. En caso de que se introduzca mal sus credenciales, permite 3 intentos
         * */
        Console consola = System.console();
        System.out.println("\tLOGIN\t");
        if (consola == null) {
            System.out.println("Introduce algo");
        }else {

            System.out.println("Introduce tu nombre ");
            String nombre = consola.readLine();
            System.out.println("Hola "+nombre);
        }
    }
}
