public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldo)
    {
        this.saldo = saldo;
    }

    public void retirar (double monto) throws SaldoInsuficienteException
    {
        if(monto > saldo)
        {
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }
    }

}
