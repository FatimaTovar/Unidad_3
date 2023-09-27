import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        //Identificar si un numero es par o impar
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int num= leer.nextInt();
        if (num%2==0){
            System.out.println("Es un numero par");
    }else{
            System.out.println("Es un numero impar");
}
        }
}