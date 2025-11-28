import java.util.Scanner;
public class CajeroRetiros4 {
    public static void main(String[] args) {   
        Scanner input = new Scanner(System.in);
        double saldo = 5000;
        char continuar;        
        do {
            System.out.println("Cajero automatico");
            System.out.println("Su saldo actual es de " + saldo + " MXN");
            System.out.print("Ingrese la cantidad a retirar: ");
            double cantidad = input.nextDouble();           
            if(saldo >= cantidad) {
                saldo -= cantidad;
                System.out.println("El retiro  fue realizado con exito");
                System.out.println("El Saldo actual es: " + saldo + " MXN");               
            } else {
                System.out.println("error, el saldo es insuficiente");
            }           
            input.nextLine();
            System.out.println("¿Deseas continuar? s/n");
            continuar = input.nextLine().charAt(0);                       
        } while(continuar == 's' || continuar == 'S');
        
    
    }
}