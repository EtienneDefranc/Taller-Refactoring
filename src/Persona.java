public class Persona {
    private String nombre;
    private int edad;
    private String genero;
    private String direccion;
    private String telefono;
    private String correoElectronico;

    public Persona(String nombre, int edad, String genero, String direccion, String telefono, String correoElectronico) {
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setGenero(genero);
        this.setDireccion(direccion);
        this.setTelefono(telefono);
        this.setCorreoElectronico(correoElectronico);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}
