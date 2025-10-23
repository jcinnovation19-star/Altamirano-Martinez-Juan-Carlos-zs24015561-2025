import java.util.Scanner;
public class CalificacionesUniver{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sistema de calificaciones");
        System.out.print("Ingrese la calificación del estudiante: ");
        double calificacion = input.nextDouble();
        char calificacionLetra = 'x';
        if(calificacion <= 1.0) calificacionLetra = 'P';
        else if(calificacion <= 2.0) calificacionLetra = 'M';
        else if(calificacion <= 2.9) calificacionLetra = 'R';
        else if(calificacion <= 4.0) calificacionLetra = 'B';
        else if(calificacion <= 5.0) calificacionLetra = 'E';
        System.out.println("La calificación del estudiante es: " + calificacion + " que corresponde a: " + calificacionLetra);
        
        input.close();
        
    }
}