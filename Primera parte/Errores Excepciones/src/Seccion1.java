public class Seccion1 {
    public static void main(String[] args) {
    
    //1.1
        String cadena = "abc";

        try
        {
            Integer.parseInt(cadena);
        } catch(NumberFormatException e)
        {
            System.out.println(e.getMessage() +" "+ e.getClass().getName());
        }

    //1.2

        try
        {
            Integer resultado = 10 / 0;
            System.out.println(resultado);
        } catch(ArithmeticException e)
        {
            System.out.println("\nError " + e.getMessage());
        }
        finally
        {
            System.out.println("Limpieza final");
        }

    //1.3
        try
        {
            int cadenaInt = Integer.parseInt(cadena);
            int division = 100/cadenaInt;  
            System.out.println(division);          
        }catch(NumberFormatException | ArithmeticException e)
        {
            System.out.println("\nError de cálculo o conversión");
        }
    }
}