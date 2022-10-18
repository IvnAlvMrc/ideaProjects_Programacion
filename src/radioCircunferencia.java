import java.util.Scanner;
public class radioCircunferencia
{

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el radio de la circunferencia");
        int radio = teclado.nextInt();
        System.out.println("area:  "+ radio*radio*3.1416);
        System.out.println("lo otro :  "+ radio*3.1416*2);

    }
}