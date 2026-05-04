public class Usuario {
    private String nombre;
    private int edad;

    public Usuario(){};

    public void registrarUsuario(String nombre, int edad)
    {
        if (edad < 0 || nombre == null || nombre =="")
        {
            throw new IllegalArgumentException("Error! Illegal argument");
        }
        else
        {
            this.nombre = nombre;
            this.edad = edad;
        }
    }

    public void registrarEspecifico(String nombre, int edad)
    {
        if(edad < 0)
        {
            throw new IllegalArgumentException("La edad no puede ser menor a 0.");
        }
        else if (nombre == null || nombre == "")
        {
            throw new IllegalArgumentException("El nombre no puede quedar vacio");
        }
        else
        {
            this.nombre = nombre;
            this.edad = edad;
        }
    }

@Override
    public String toString()
    {
        return "Nombre: " + nombre + " | Edad: " + edad ;
    }

}
