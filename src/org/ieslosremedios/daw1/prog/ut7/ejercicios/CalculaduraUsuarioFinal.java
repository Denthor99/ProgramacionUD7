package org.ieslosremedios.daw1.prog.ut7.ejercicios;
import java.sql.SQLOutput;
import java.util.*;
public class CalculaduraUsuarioFinal {
    public static void main(String[] args) {
        //declaramos las variable necesarias pora el ejercicio
        Integer a,b,resultado;
        char tipoOperacion;
        Scanner calculo=new Scanner(System.in);
        System.out.println("CALCULADORA BASICA VERSION 2K23");
        System.out.println("     Inserte un numero:");
        a=calculo.nextInt();
        System.out.println("     Inserte otro numero:");
        b=calculo.nextInt();
        System.out.println("¿Qué operación va a realizar?");
        System.out.println("a. Suma");
        System.out.println("b. Resta");
        System.out.println("c. División");
        System.out.println("d. Multiplicación");
        System.out.println("e. Potencia");
        System.out.println("f. Modulo");
        tipoOperacion=calculo.next().charAt(0);

        switch (tipoOperacion){
            case 'a':
                resultado=a+b;
                System.out.println("El resultado de esta operación es "+resultado);
                break;
            case 'b':
                resultado=a-b;
                System.out.println("El resultado de esta operación es "+resultado);
                break;
            case 'c':
                resultado=a/b;
                System.out.println("El resultado de esta operación es "+resultado);
                break;
            case 'd':
                resultado=a*b;
                System.out.println("El resultado de esta operación es "+resultado);
                break;
            case 'e':
                resultado=(int)Math.pow(a,b);
                System.out.println("El resultado de esta operación es "+resultado);
                break;
            case 'f':
                resultado=a%b;
                System.out.println("El resultado de esta operación es "+resultado);
                break;
            default:
                System.out.println("Introduce una operación que sea permitida");
                break;
        }
    }
}
