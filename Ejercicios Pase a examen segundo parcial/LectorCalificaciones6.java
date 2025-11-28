import java.util.Scanner;

public class LectorCalificaciones6{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String alumnos[] = new String[5];
        double calificaciones[] = new double[5];
        int aprobados = 0;
        int reprobados = 0;
        double promedio = 0;
        for(int i = 0; i < alumnos.length; i++) {
            System.out.print("Ingrese el nombre del esdudiante " + (i + 1) + ": ");
            alumnos[i] = input.nextLine();
            do{
                System.out.print("Ingrese la calificacion de " + alumnos[i] + ": ");
                calificaciones[i] = Double.parseDouble(input.nextLine());
                
                if(calificaciones[i] < 1 || calificaciones[i] > 10) {
                    System.out.println("Error, la calificacion solo es entre 1 y 10, el numero ingresado no es valido");
                    System.out.println("Intente la operación de nuevo");
                }
            } while(calificaciones[i] < 1 || calificaciones[i] > 10);
            if(calificaciones[i] >= 6) aprobados++;
            else reprobados++;
            promedio += calificaciones[i];
        }
        promedio /= calificaciones.length;
        System.out.println("\tCalificaciones de los alumnos");
        
        for(int i = 0; i < alumnos.length; i++) {
            System.out.println(alumnos[i] + ": " + calificaciones[i]);
        }
        
        System.out.println("El promedio es: " + promedio);
        System.out.println("Cantidad de Alumnos reprobados: " + reprobados);
        System.out.println("Cantidad de Alumnos aprobados: " + aprobados);
        
        input.close();
        
    }
}