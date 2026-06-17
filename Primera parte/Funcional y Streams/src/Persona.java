public class Persona
{
    private Integer dni;
    private String nombre;

    public Persona(Integer dni, String nombre)
    {
        this.dni = dni;
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }    
}