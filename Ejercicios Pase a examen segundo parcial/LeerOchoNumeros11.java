import java.util.Scanner;
public class LeerOchoNumeros11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeros[] = new int[8];
        boolean existe = false;
        for(int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa cualquier numero: ");
            numeros[i] = input.nextInt();
        }
        System.out.print("Ingresa el numero que deseas buscar dentro del arreglo: ");
        int buscar = input.nextInt();
        
        for(int i = 0; i < numeros.length; i++) {
            if(buscar == numeros[i]) existe = true;  // CORREGIDO
        }
        
        if(existe) 
            System.out.println("El numero si existe en el arreglo");
        else 
            System.out.println("El numero no existe en el arreglo");  // CORREGIDO

        input.close();
    }
}