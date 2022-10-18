import java.util.Scanner;
public class ejer1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = sc.nextInt();

        if (num < 0)
            System.out.println("El numero es NEGATIVO ");
          if (num > 0)
                System.out.println("El número es POSITIVO ");
    }
}
