import java.util.Scanner;

public class InvertirCapital{
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        System.out.println("Calcular Beneficio");
        System.out.print("Ingresa el capital que deseas invertir: ");
        double capital = input.nextDouble();
        
        double capitalFinal = capital + (capital * 0.02);
        
        System.out.println("Su ganancia estimada sera de. " + (capital * 0.02));
        System.out.println("Cuenta con un capital final de: " + capitalFinal);
        
        input.close();
    
    }
}