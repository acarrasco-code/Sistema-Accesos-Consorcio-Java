
package Proyecto1;


public class Visitante {
    private String nombre;
    private String dni;
    private int piso;
    private String departamento;
    private boolean estaEnEdificio;
    private String rubro;
    private String sector;
    public static int contadorIngresos = 0;
   
    
    // Constructor 1 para las visitas
    public Visitante(String nombre, String dni, int piso, String departamento){
        this.nombre = nombre;
        this.dni = dni;
        this.piso = piso;
        this.departamento = departamento;
        this.estaEnEdificio = true;
        contadorIngresos++;
    }
    
    // Constructor 2 para los proveedores
    public Visitante(String nombre, String dni, String rubro, String sector) {
    this.nombre = nombre;
    this.dni = dni;
    this.rubro = rubro;
    this.sector = sector;
    this.estaEnEdificio = true;
    contadorIngresos++;
    }
    
    // Metodos de Encapsulamiento
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }
    
    public int getPiso() {
        return piso;
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

    public boolean isEstaEnEdificio() {
        return estaEnEdificio;
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

    public static int getContadorIngresos() {
        return contadorIngresos;
    }

    public static void setContadorIngresos(int contadorIngresos) {
        Visitante.contadorIngresos = contadorIngresos;
    }
    
    
    // Metodos de Comportamiento/accion
    public void registrarSalida(){
        this.estaEnEdificio = false;
        
    }
    
    public static int  mostrarTotalIngresos(){
        return contadorIngresos;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
