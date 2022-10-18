import java.util.Scanner;
public class DobleYTripleSolProfe
{
  public static void main(String[] args)
  {
        short num;
        //DATOS de Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir numero");

        num= teclado.nextShort();
        System.out.println("El numero es:  " + num);
        //Proceso

        //Datos salida
        System.out.println("Doble:  "+num*2);
        System.out.println("Triple:  "+num*3);

       }
}
