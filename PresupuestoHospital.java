import java.util.Scanner;
public class PresupuestoHospital{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Presupuestos de areas");
        System.out.print("Ingrese el presupuesto anual destinado a el hospital: ");
        double presupuesto= input.nextDouble();
        
        double ginecologia = presupuesto * 0.40;
        double traumatologia = presupuesto * 0.30;
        double pediatria = presupuesto * 0.30;
        
        System.out.println("El presupuesto anual destinado al hospital es: $" + presupuesto);
        System.out.println(" ginecologia recibirá un presupuesto de: $" + ginecologia);
        System.out.println(" traumatologia recibirá un presupuesto de: $" + traumatologia);
        System.out.println(" pediatria recibirá un presupuesto de: $" + pediatria);
        
        input.close();
    
    }
}