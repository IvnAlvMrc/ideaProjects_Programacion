import javax.print.StreamPrintService;
import java.util.Scanner;
public class Fincarectangular {

    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce datos:    " );

        int metros = teclado.nextInt();
        System.out.println("El área es:  "+ (metros*metros) + " metros cuadrados  " );
        System.out.println(" Su perimetro exterior es:  " + metros*4 + " metros "  );


    }
}