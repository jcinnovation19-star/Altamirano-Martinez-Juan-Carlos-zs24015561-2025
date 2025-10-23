import java.util.Scanner; 
public class CalcularGrados{
	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.println("ingrese los grados a convertir");
		double grados = sc.nextDouble();
		double gradosF = (1.8 * grados)+32;
		double gradosk = grados + 273.15;
		System.out.println(grados + "grados cel son" + gradosF + " grados Fahrenheit");
		System.out.println(grados + "grados cel son" + gradosk + " grados kelvin");
	}
}