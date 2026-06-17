public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) throws ProductoInvalidoException
    {
        if(precio < 0 ) 
        {
            throw new ProductoInvalidoException("El precio no puede ser menor a 0");
        }
        else{
            this.precio = precio;
        }
        this.nombre = nombre;
    }
}
