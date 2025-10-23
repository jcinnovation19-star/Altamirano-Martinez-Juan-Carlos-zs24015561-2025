import java.util.Scanner; 
public class MetrosPiesPulgadas{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el numero de metros a convertir");
		double metros = sc.nextDouble();
		double pies = metros * 3.28084;
		double pulgadas = metros * 39.3701;
		System.out.println(metros + " metros es igual a " + pies + " pies");
		System.out.println(metros + " metros es igual a " + pulgadas + " pulgadas");
		


	}
}