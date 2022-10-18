import com.sun.source.tree.WhileLoopTree;

/**
 * Este programa escribe o texto "Ola Curso!!" na consola usando o método System.out.println()
 */
public class OlaCurso {
    public static void main(String[] args) {
        System.out.println("Ola curso");
        int a,b;
        a=40;
        b=400;

               System.out.println(" El valor de a :  " +a);
        System.out.println(" El valor de b :  " + b);

        String cadena;                           // Variable cadea de tipo String
        cadena = "isto é unha cadea";            // Inicializamos a cadea
        String subcadea = cadena.substring(0,4); // A variable subcadea terá o valor "Isto";
        System.out.println(" cadena:  " + cadena + " subscadena  " + subcadea);
    }
}
