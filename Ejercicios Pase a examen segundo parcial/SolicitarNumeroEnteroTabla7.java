import java.util.Scanner;

public class SolicitarNumeroEnteroTabla7 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("\tTabla de multiplicar");
        System.out.print("Ingrese el numero para ver su tabla multiplicar: ");
        int num = input.nextInt();
        
        for(int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        
    }
}