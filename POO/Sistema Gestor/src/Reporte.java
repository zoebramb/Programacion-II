/*Ejercicio 2.3 (Creación de métodos de argumento variables): Añade a la clase Reporte un método que acepte argumentos variables (var-args) usando la sintaxis de puntos suspensivos (String... secciones). Llama a este método pasándole tres cadenas distintas, y luego llámalo sin pasarle ningún argumento para comprobar su flexibilidad. Recorre las secciones internamente usando un bucle for-each. */

public class Reporte 
{
    public void GenerarEncabezado()
    {
        System.out.println("--- REPORTE ---");
    }    
 
    public String generarCuerpo()
    {
        return "CUERPO";
    }

    public void generarSecciones(String ...secciones)
    {
        if (secciones.length == 0) {
            System.out.println("No se han proporcionado secciones.");
        } else {
            System.out.println("SECCIONES:");
            for (String seccion : secciones) {
                System.out.println("- " + seccion);
            }
        }
    }
}
