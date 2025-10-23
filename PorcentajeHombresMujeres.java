import java.util.Scanner; 
public class PorcentajeHombresMujeres{
	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.println("Calcular el promedio");
		System.out.println("Ingrese el numero de hombres que hay en su salón");
		int hombres = sc.nextInt();
		System.out.println("ingrese el numero de mujeres que hay en su salón");
		int mujeres = sc.nextInt();
			
		int Numerototal  = hombres + mujeres;

		double promedioH = (hombres * 100.0) / Numerototal;
		double promedioM = (mujeres * 100.0) / Numerototal;
		
		System.out.println("Numero total de personas en el salon: " +   Numerototal);	
		System.out.println("Cantidad de hombres: " + promedioH + "%");
		System.out.println("Cantidad de mujeres: " + promedioM + "%");
	}
}
