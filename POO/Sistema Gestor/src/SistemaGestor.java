public class SistemaGestor 
{
    /* final sirve para decir que esta variable no va a cambiar en ningun momento, no puede ser redefinidia ni sobreescrita 
    static se usa para que sea una variable de clase (ocupa un solo lugar de memoria), si no fuese static, el sistema va a crear lugares nuevos de memoria para guardarla con cada instancia de la clase */

    public static final int MAX_CONEXIONES = 10;

    //no puedo hacer un método no estatico con variables estáticas
    public static void mostrarMax_Conexiones()
    {
        System.out.println("Máximas Conexiones: " + MAX_CONEXIONES);
    }
}