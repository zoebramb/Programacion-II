//Si la excepción hereda de RuntimeException, no es obligatorio capturarla
public class ProductoInvalidoException  extends RuntimeException
{
    public ProductoInvalidoException(String mensaje)
    {
        super(mensaje);
    }
}