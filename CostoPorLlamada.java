import java.util.Scanner;
public class CostoPorLlamada{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Costos por llamada");
        System.out.print("Ingrese la duracion que tuvo la llamada: ");
        int minutos = input.nextInt();
        double costo;
        if(minutos <= 3) costo = 10;
        else costo = 10 + (minutos - 3);
        System.out.println("costo por duracion de la llamada es de: $" + costo);
        
        input.close();
            
        
    
    }
}