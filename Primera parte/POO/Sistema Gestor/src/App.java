public class App {
    public static void main(String[] args) throws Exception {

        Reporte reporte = new Reporte();
        reporte.generarSecciones("Sección 1", "Sección 2", "Sección 3");
        reporte.generarSecciones(); // Llamada sin argumentos para comprobar flexibilidad

        // llamo al método para que muestre las máximas conexiones
        SistemaGestor.mostrarMax_Conexiones();
    }
}
