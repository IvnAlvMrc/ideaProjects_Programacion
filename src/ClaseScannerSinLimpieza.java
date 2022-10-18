import java.util.*;
public class ClaseScannerSinLimpieza {
    public static void main(String[] args) {

        // Declaramos el objeto scanner
        Scanner lectura=new Scanner(System.in);

        // Variable para almacenar el nombre
        String miNombre="";

        // Variable para Almacenar la edad
        int edad=0;
        // Ahora pedimos su edad y la guardamos en edad
        System.out.println("Escribe tu edad:");


        edad=lectura.nextInt();
        System.out.println("Escribe tu nombre:");

        System.out.println("Tu nombre es " + miNombre
                + " y tu edad es " + edad + " años.");
        // Mostramos que finalizó el programa
        System.out.println("Programa finalizado con éxito.");
    }
}

