import java.util.Scanner; 
public class AreaCirculo{
	public static void main (String args[]){
		Scanner input =  new Scanner (System.in);
	System.out.println("ingrese la medida del radio");
	double radio = input.nextDouble();
	double area = 3.1416 * (radio * radio);
	System.out.println("El area del circulo es " + area);

	}
}