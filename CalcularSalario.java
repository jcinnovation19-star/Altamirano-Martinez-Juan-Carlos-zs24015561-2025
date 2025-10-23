import java.util.Scanner;

public class CalcularSalario{
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        System.out.println("Calcular nuevo salario");
        System.out.print("Ingrese su salario mensual actual: ");
        double salario = input.nextDouble();
        
        double salarioNuevo = salario + (salario * 0.25);
        
        System.out.println("Su nuevo salario es: " + salarioNuevo + "$");
        
        input.close();
    
    }
}