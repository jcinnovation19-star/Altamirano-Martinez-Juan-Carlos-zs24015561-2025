import java.util.Scanner;
public class NumeroParImpar{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Numero Par o Ipar");
        System.out.print("Ingrese cualquier numero: ");
        int num = input.nextInt();
        if(num % 2 == 0) System.out.println("El numero ingresado es " + num + " es par");
        else System.out.println("El numero ingresado es " + num + " es impar");
        
        input.close();
    
    }
}