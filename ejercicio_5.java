// public class Multiply {
//     public static Double multiply(Double a, Double b) {
//         return a * b
//     }
// este codigo se puede hacer de una forma correcta y muy basica: 
import java.util.Scanner;
public class ejercicio_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a,b,suma;

        System.out.print("Ingresa un número: ");
        a = entrada.nextInt();
        System.out.print("Ingresa otro número: ");
        b = entrada.nextInt();

        suma = a * b;

        System.out.println("La multiplicación de los números es: "+suma);




    }   
}
