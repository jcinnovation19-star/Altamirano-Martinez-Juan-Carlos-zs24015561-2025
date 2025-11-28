import java.util.Scanner;
public class CajeroAutomatico3 {
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);
        char continuar;
        double adeudo = 1000;
        double deudaDelMes = 200;      
        do{
            System.out.println("Cajero automatico");
            System.out.println("1.- Consulta");
            System.out.println("2.- Pago del mes");
            System.out.println("3.- Pago de adeudo");
            System.out.println("4.- Salir");
            System.out.print("Elija la opción de movimiento a realizar: ");
            int opcion = input.nextInt();         
            if(opcion == 1) {
                if(adeudo > 0) System.out.println("atención, usted tiene un adeudo de " + adeudo + " MXN!!!!");
                System.out.println("La deuda del mes actual es de " + deudaDelMes + " MXN");                           
            } else if(opcion == 2) {
                if(deudaDelMes <= 0) {
                    System.out.println("El pago del mes es 0 por ende no se necesita realziar el pago, buen dia");
                } else {
                    System.out.println("El pago del mes actual es de " + deudaDelMes + " MXN");
                    System.out.print("Ingrese el monto que desea pagar o abonar: ");
                    double monto = input.nextDouble();                    
                    if(deudaDelMes >= monto) {
                        deudaDelMes -= monto;
                        System.out.println("Pago fue realizado con exito");
                    } else {
                        System.out.println("ocurrió un error, el monto de pago no puede ser mayor que la deuda del mes");
                    }
                }               
            } else if(opcion == 3) {
                if(adeudo <= 0) {
                    System.out.println("Su adeudo actual es 0 Por ende no se requiere pago, buen dia");
                } else {
                    System.out.println("Su adeudo a pagar es de" + adeudo + " MXN");
                    System.out.print("Ingrese el monto que desea pagar: ");
                    double monto = input.nextDouble();                   
                    if(adeudo >= monto) {
                        adeudo -= monto;
                        System.out.println("el pago fue realizado correctamente"); 
                    } else {
                        System.out.println("Error. El monto de pago no puede ser mayor que el adeudo que usted tiene");
                    }                    
                }                
            } else if(opcion == 4) {
                break;
            }           
            input.nextLine();
            System.out.println("¡Deseas realizar otra operacion? s/n");
            continuar = input.nextLine().charAt(0);            
        } while(continuar == 's' || continuar == 'S');        
        System.out.println("la transacción fue finalizada con exito, tenga un buen dia");        
        input.close();
    
    }
}