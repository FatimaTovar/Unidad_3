import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
public class Cajero Automatico {
    
// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {     
        //Definir el saldo del usuario
        double saldo=500;

        Scanner scanner=new Scanner(System.in);
        //Mostrar opciones al usuario

        System.out.println("Bienvenido al Cajero Automatico");
        System.out.println("Seleccione una opcion");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Depositar dinero");
        System.out.println("3. Retirar dinero");
        
        //Leer la opcion seleccionada
        int opcion=scanner.nextIntnt();
        switch (opcion) {
            case 1:
                //Consultar el saldo
                System.out.println("Su saldo es: " + saldo);
                break;
            case 2:
                //Depositar dinero
                System.out.println("¿Cuanto dinero desea depositar?");
                double deposito= scanner.nextDouble();
                saldo +=deposito;
                System.out.println("Su saldo es de: "+ saldo);
                break;
            case 3:
                //Retirar dinero
                System.out.println("¿Cuanto dinero desea retirar");
                double retiro=scanner.nextDouble();
                if (retiro <=saldo){
                    saldo-=retiro;
                    System.out.println("Retiro exitoso. Su nuevo saldo es de: " + saldo);
        }else {
                    System.out.println("Fondos insuficientes");
                }
                break;
            default: 
                //Opcion no valida
                System.out.println("Opcion no valida. Por favor seleccione otra opcion");
                break;
        }
        //Cerrar el objeto scanner
        scanner.close();
    }
}