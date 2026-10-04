
package Proyecto1;


public class Principal {


    public static void main(String[] args) {
        // Se presentan en la Seguridad del edificio.
        Visitante familiar = new Visitante("Juan Kast","1234567", 4, "B" );
        Visitante plomero = new Visitante("Luis Sala", "4532165", 10, "Ä");
        
        // La seguridad consulta los ingresos en el sistema.
        System.out.println("Juan Kast ingreso? " + familiar.isEstaEnEdificio());
        System.out.println("El plomero ingreso? " + plomero.isEstaEnEdificio());
        
        System.out.println("");
        
        // Comprobamos si el familiar y plomero se retiraron
        familiar.registrarSalida();
        plomero.registrarSalida();
        
        //La seguridad hace un control de los accesos
        System.out.println("Juan Kast aun esta en el edificio? "+ familiar.isEstaEnEdificio());
        System.out.println("El plomero aun esta en el edificio? "+ plomero.isEstaEnEdificio());
        
        System.out.println("La cantidad de ingresos es: " + Visitante.getContadorIngresos());

    }
    
}
