import java.util.Scanner; 
public class CalcularEdad{
	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.println("ingrese el su año de nacimiento");
		int añoN = sc.nextInt();
		System.out.println("ingrese el año actual");
		int añoA = sc.nextInt();
		int edad = añoA - añoN;
		System.out.println("tu edad es " + edad);
	}
}