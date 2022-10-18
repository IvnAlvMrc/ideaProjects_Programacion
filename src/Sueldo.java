import java.util.Scanner;
public class Sueldo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce tu sueldo:   ");

        int sueldo = teclado.nextInt();

        int resultado = 20 % sueldo;

        System.out.println("Tu sueldo se queda en:  " + resultado + "  aplicando la retención del 20%");
    // z=x;
    // x=y;
    // y=z;
    }
}