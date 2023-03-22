import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scs = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = scs.nextInt();
        System.out.println("Ingrese otro numero:: ");
        int numero2 = scs.nextInt();
        System.out.println("El resultado de la suma es: " + (numero + numero2));
    }
}
