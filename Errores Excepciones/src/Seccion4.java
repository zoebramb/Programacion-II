import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Seccion4 {
    public static void main(String[] args) {
        
        String ruta = "personas.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(ruta)))
        {
            String linea;
            while((linea = br.readLine()) != null )
            {
                System.out.println("Persona: " + linea);
            }
        }catch(IOException e)
        {
            System.out.println("No se pudo acceder al archivo. " + e.getMessage());
        }
    }
}
