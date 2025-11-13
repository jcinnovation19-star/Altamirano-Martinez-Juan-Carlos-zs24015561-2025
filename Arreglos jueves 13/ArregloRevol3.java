import java.util.Scanner;
public class ArregloRevol3{
	public static void main(String args[]){
		int arre[] = new int[11];
		Scanner sc = new Scanner(System.in);
		for(int x = 0; x < 7;x++){
			System.out.println("introduce un numero entero");
			arre[x] = sc.nextInt();
		}
		for(int x = 0; x < 7;x++){
		System.out.println(arre[x] + " ");
		}
		sc.close();
	}
}