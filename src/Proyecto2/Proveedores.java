
package Proyecto2;

public class Proveedores {
    // Creamos los atributos 
    private String empresa;
    private String nombre;
    private String apellido;
    private String DNI;
    private String rubro;
    private String sector;
    private boolean estaEnEdificio;
    public static int contadorIngreso = 0;
    private int piso;
    private String departamento;
    
    // Constructor 1
    public Proveedores(String empresa,String nombre, String apellido, String DNI, String rubro, String sector, int piso, String departamento){
        this.empresa = empresa;
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.rubro = rubro;
        this.sector = sector;
        this.estaEnEdificio = true;
        contadorIngreso++;
        this.piso = piso;
        this.departamento = departamento;
    }
    // Constructor 2 recepcion de mensajeria
    public Proveedores(String empresa, int piso, String departamento){
        this.empresa = empresa;
        this.piso = piso;
        this.departamento = departamento;
        this.estaEnEdificio = false;
        contadorIngreso++;
    }
    
    // Constructor 3 para proveedores que no ingresen a unidades.
    public Proveedores(String empresa,String nombre, String apellido, String DNI, String rubro, String sector){
        this.empresa = empresa;
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.rubro = rubro;
        this.sector = sector;
        this.estaEnEdificio = true;
        contadorIngreso++;
        
    }
    
    // Creamos los metodos del Encapsulamiento, no usamos setters para estaEnEdificio 

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public static int getContadorIngreso() {
        return contadorIngreso;
    }

    public static void setContadorIngreso(int contadorIngreso) {
        Proveedores.contadorIngreso = contadorIngreso;
    }

    public int getPiso() {
        return piso;
    }

    public boolean isEstaEnEdificio() {
        return estaEnEdificio;
    }

    public void setEstaEnEdificio(boolean estaEnEdificio) {
        this.estaEnEdificio = estaEnEdificio;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    // Metodo de comportamiento o accion
    public void registrarSalida(){
        this.estaEnEdificio = false;
    }
    
    // Metodo estatico al ser global se ira modificando de manera que vayan ingresando proveedores.
    public static int mostrarCantidadIngresos(){ // Por que no lleva parametros??
        return contadorIngreso;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
