
package Proyecto3;


public class Principal {


    public static void main(String[] args) {
        Paquete paquete1 = new Paquete("AB001", "Pablo Rossi", 4);
        Paquete paquete2 = new Paquete("Mariano Martinez", 8);
        
        // Comprobamos el status de la mensajeria en segurida
        System.out.println("El paquete 1 fue entregado?: "+ paquete1.isEntregadoAlVecino());
        System.out.println("El paquete 2 fue entregado?: "+ paquete2.isEntregadoAlVecino());
        
        System.out.println("");
        
        System.out.println("=== Corroboramos si fue entregado ===");
        // Damos la orden de entrega
        paquete1.retirarPaquete();
        paquete2.retirarPaquete();
        
        // Comprobamos que el mismo fue entregado
        System.out.println("El paquete 1 fue entregado?: "+ paquete1.isEntregadoAlVecino());
        System.out.println("El paquete 2 fue entregado?: "+ paquete2.isEntregadoAlVecino());
        
        System.out.println("");
        
        System.out.println("=== Consultamos la cantidad recibida===");
       
        // Comprobamos la cantidad recibida
        System.out.println("La cantidad de mensajeria es: "+ Paquete.totalPaquetesRecibidos);
    }
    
}
