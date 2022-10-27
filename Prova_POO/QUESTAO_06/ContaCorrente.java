package ProvaQ06;

class ContaCorrente 
{
    protected double Saldo;

    ContaCorrente() 
    {
        Saldo = 0;
    }

    ContaCorrente(double Saldo) 
    {
        this.Saldo = Saldo;
    }

    public double getSaldo() 
    {
        return Saldo;
    }

    void Depositar(double value) 
    {
        if (value < 0) 
        {
            System.out.println("Valor inválido");
            System.exit(1);
        }

        Saldo += value;
    }

    protected boolean withdraw(double value) 
    {
        if(Saldo - value < 0) return false;
        Saldo -= value;
        return true;
    }

    boolean transfer(ContaCorrente account) 
    {
        double transferValue = this.getSaldo();
        this.withdraw(transferValue);
        account.Depositar(transferValue);
        return true;
    }

    @Override
    public String toString() 
    {
        return String.format("%f\n", Saldo);
    }
}
