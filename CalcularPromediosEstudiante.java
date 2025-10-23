import java.util.Scanner;

public class CalcularPromediosEstudiante{
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
	System.out.println("Calcular promedio de estudiantes");
	System.out.println("Ingrese la primera calificación del estudiante: ");
	double calf1 = input.nextDouble();
	System.out.println("Ingrese la segunda calificación del estudiante: ");
	double calf2 = input.nextDouble();
	System.out.println("Ingrese la tercera calificación del estudiante: ");
	double calf3 = input.nextDouble();
	
	double promedio = (calf1 + calf2 + calf3) / 3;
	
	System.out.println("el promedio del estudiante es de: " + String.format("%.2f", promedio));
	
	input.close();
	
    
    }
}