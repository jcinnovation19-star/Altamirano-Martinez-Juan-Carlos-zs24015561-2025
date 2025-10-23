import java.util.Scanner;
public class PromocionSuMercado{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sistema de descuentos SuMercado");
        System.out.println("Ingrese el monto de la compra realizada: ");
        double monto = input.nextDouble();
        System.out.println("Ingrese una cantidad: ");
        int num = input.nextInt();
        double descuento;
        if(num < 74) {
            System.out.println("En hora buena, usted tuvo un descuento del 15%!!!");
            descuento = monto * 0.15;
        } else {
           System.out.println("Asombroso, usted tuvo un descuento del 20%!!!");
           descuento = monto * 0.20;
        }
        
        monto -= descuento;
        
        System.out.println("Su descuento es de: $" + descuento);
        System.out.println("El monto con el descuento aplicado es de: $" + monto);
        
        input.close();
        
    }
}