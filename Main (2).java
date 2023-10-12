import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numero, fibonacci1, fibonacci2;
        do{

            System.out.println("Introduce la cantidad");
            int numero = scanner.nextInt();
            } while(numero<=1);
            System.out.println("Los" + numero + " primeros numeros de la serie son: ");

            fibonacci1 = 1;
            fibonacci2 = 1;

            System.out.println(fibonacci1 + "");
            for (i=2;i<=numero;i++) {
                System.out.println(fibonacci2 + "");
                fibonacci2 = fibonacci1 + fibonacci2;
                fibonacci1 = fibonacci2 - fibonacci1;
            }
            System.out.println();
    }
}