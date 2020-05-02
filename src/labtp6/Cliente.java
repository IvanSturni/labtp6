package labtp6;

public class Cliente {
    private String nombre;
    private String apellido;
    private String ciudad;
    private String direccion;
    private String dni;

    public Cliente(String nombre, String apellido, String dni, String ciudad, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return this.nombre + " " + this.apellido + " " 
             + this.ciudad + " " + this.direccion;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
