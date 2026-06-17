package bd;

public class App {
    public static void main(String[] args) {
        //METODO PARA PROBAR TODAS LAS FUNCIONES

        OperacionesDB ops = new OperacionesDB();

        //EJECUTAR EL INSERT
        ops.insertarEmpleado("Zoe", "Diseño");

        //EJECUTAR EL UPDATE
        ops.actualizarDepartamento(1, "Analista");

        //EJECUTAR UN DELETE
        ops.borrarEmpleado(1);
    }
}
