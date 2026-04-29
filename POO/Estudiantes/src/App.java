public class App {
    public static void main(String[] args) throws Exception 
    {
        
        Estudiante e1 = new Estudiante("nahir","isray","carrera",24,3.5);
        Estudiante e2 = new Estudiante("Zoe","Brambilla", "Programador Universitario", 23, 7);
        Estudiante e3 = new Estudiante();
        
        e3.setNombre("Camila");
        e3.setApellido("Ferreira");
        e3.setEdad(20);
        e3.setCarrera("Abogacia");
        e3.setPromedio(7.4);
        
        Estudiante[] Estudiantes = {e1, e2, e3};

        for(int i=0; i < Estudiantes.length; i++)            
        {
            System.out.println("Nombre: " + Estudiantes[i].getNombre() + " " + Estudiantes[i].getApellido() + " | Promedio: " + Estudiantes[i].getPromedio() );
        }
        

    }
}
