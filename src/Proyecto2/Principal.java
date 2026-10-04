
package Proyecto2;


public class Principal {


    public static void main(String[] args) {
        // Momento en que se presentan en la seguridad.
        Proveedores proveedor1 = new Proveedores("Lavaya", "Pablo", "Marmol", "12987654", "Lavadero", "Laundry");
        Proveedores proveedor2 = new Proveedores("N&Otros", "Jose", "Nuñez", "34213567", "Plomero", "Pileta" );
        Proveedores proveedor3 = new Proveedores("Correo Argentino", 10, "H");
        Proveedores proveedor4 = new Proveedores("Iplan", "Marcelo", "Gallardo", "890001700", "Internet", "Unidad", 3, "B");
        
        // Hacemos las comprobaciones si hubo ingresos
        System.out.println("La empresa Lavaya ingreso? "+ proveedor1.isEstaEnEdificio());
        System.out.println("La empresa N&Otros ingreso? "+ proveedor2.isEstaEnEdificio());
        System.out.println("La empresa Correo Argentino ingreso? "+ proveedor3.isEstaEnEdificio());
        System.out.println("La empresa Iplan ingreso? "+ proveedor4.isEstaEnEdificio());
        
        System.out.println("");
        
        // Le damos la salida a los proveedores
        proveedor1.registrarSalida();
        proveedor2.registrarSalida();
        proveedor3.registrarSalida();
        proveedor4.registrarSalida();
        
        
        // Hacemos un control de cantidad de accesos al edificio\
        System.out.println("La cantidad de accesos del dia de hoy es: "+ Proveedores.getContadorIngreso());
        
    }
    
}
