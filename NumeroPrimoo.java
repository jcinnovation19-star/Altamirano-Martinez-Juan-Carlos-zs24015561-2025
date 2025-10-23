import java.util.Scanner;
public class NumeroPrimoo{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Numero primo");
        System.out.println("Ingrese cualquier numero: ");
        int num = input.nextInt();
        if(num > 1) {
            int i = 2;
            boolean primo = true;
            while( i < num) {
                if(num % i == 0) {
                    primo = false;
                    i++;
                    break;
                }  
                i++;
            }
            
            if(primo) System.out.println("El numero ingresado es " + num + " si es primo");
            else System.out.println("El numero ingresado es " + num + " no es primo");
        } else {
            System.out.println("El numero tiene que ser mayor a 1");
        }
        
        input.close();
    
    }
}