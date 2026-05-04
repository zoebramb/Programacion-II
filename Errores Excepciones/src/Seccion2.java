public class Seccion2 {
    public static void main(String[] args) {

    //2.1
        Usuario u1 = new Usuario();
        try
        {
            u1.registrarUsuario(null, 0);
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    //2.2
        Usuario u2 = new Usuario();
        Usuario u3 = new Usuario();

        try{
            u2.registrarEspecifico("Juan", -3);
            System.out.println(u2.toString());
        }catch(IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }

        try{
            u3.registrarEspecifico(null, 0);
            System.out.println(u3.toString());
        }catch(IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    
    }
}
