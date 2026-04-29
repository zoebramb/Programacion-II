public class CuentaBancaria {
    private double saldo;
    private int numeroCuenta;

    private CuentaBancaria(double saldo, int numeroCuenta)
    {
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
    }
    //métodos public

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void depositar(double monto)
    {
        if( monto < 0)
        {
            System.out.println("Monto inválido");
        }
        else
        {
            saldo += monto;
            System.out.println("Monto agregado con éxito");
        }
    }


}
