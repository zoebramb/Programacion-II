/* En una clase Usuario, aplica la sobrecarga de constructores: crea un constructor por defecto (sin parámetros), uno que reciba solo el nombre, y otro que reciba nombre y edad para inicializar el objeto de distintas maneras. En la misma clase, aplica la sobrecarga de métodos creando un método actualizarPerfil(String correo) y otro actualizarPerfil(String correo, int telefono).  */

public class Usuario {
    //Atributos encapsulados de la clase usuario
    private String nombre;
    private int edad;
    private String correo;
    private int telefono;

    
    //Sobrecarga de constructores con y sin parámetros
    
    public Usuario(){}

    public Usuario(String nombre){
        this.nombre = nombre;
    }

    public Usuario(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    // Sobrecarga de métodos con diferentes parámetros

    public void actualizarPerfil(String correo){
        this.correo = correo;
    }

    public void actualizarPerfil(String correo, int telefono){
        this.correo = correo;
        this.telefono = telefono;
    }

   
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCorreo() {
        return correo;
    }

    public int getTelefono() {
        return telefono;
    }

}