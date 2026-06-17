public class Seccion3 {
        public static void main(String[] args) {
    //3.1        
        CuentaBancaria c1 = new CuentaBancaria(1200);
        
        try{
            c1.retirar(1300);
        }catch(SaldoInsuficienteException e)
        {
            System.out.println(e.getMessage());
        }

    //3.2
    Producto p1 = new Producto("Computadora", -5);
    }
}
