
package Proyecto3;

// Creamos los atributos de instancia
public class Paquete {
    private String codigoSeguimiento;
    private String destinatario;
    private int departamento;
    private boolean entregadoAlVecino;
    public static int totalPaquetesRecibidos = 0;


// Constructor1 para las compras online.
public Paquete(String codigoSeguimiento, String destinatario, int departamento){
    this.codigoSeguimiento = codigoSeguimiento;
    this.destinatario = destinatario;
    this.departamento = departamento;
    this.entregadoAlVecino = false;  // la mensajeria queda en seguridad,aun no fue entregado a su dueño.
    totalPaquetesRecibidos++;
    
}

// Constructor2 para la correspondencia comun.
public Paquete(String destinatario, int departamento){
    this.destinatario = destinatario;
    this.departamento = departamento;
    this.entregadoAlVecino = false;  // la mensajeria queda en seguridad,aun no fue entregado a su dueño.
    totalPaquetesRecibidos++;
}

// Creamos los metodos getter/setter para el encapsulamiento.
    public String getCodigoSeguimiento(){
        return codigoSeguimiento;
    }
    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public int getDepartamento() {
        return departamento;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    public boolean isEntregadoAlVecino() {
        return entregadoAlVecino;
    }

    public void setEntregadoAlVecino(boolean entregadoAlVecino) {
        this.entregadoAlVecino = entregadoAlVecino;
    }

    public static int getTotalPaquetesRecibidos() {
        return totalPaquetesRecibidos;
    }

    public static void setTotalPaquetesRecibidos(int totalPaquetesRecibidos) {
        Paquete.totalPaquetesRecibidos = totalPaquetesRecibidos;
    }
    
    // Metodos de accion 
    public static int mostrarCantidadPaquetesRecibidos(){
        return totalPaquetesRecibidos;
    }
    
    public void retirarPaquete(){
        this.entregadoAlVecino = true;
    }






























}