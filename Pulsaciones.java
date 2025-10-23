import java.util.Scanner; 
public class Pulsaciones{
	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.println("Ingrese su edad");
		int edad = sc.nextInt();
		int pulsaciones = (220 - edad)/10;
		System.out.println("sus pulsaciones son" + pulsaciones);
	
	}
}