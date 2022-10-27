package ProvaQ06;

class ContaEspecial extends ContaCorrente 
{
    private float Limite;

    public ContaEspecial(float Limite) 
    
    {
        this.Saldo = 0;
        this.Limite = Limite;
    }
    
    public ContaEspecial(double Saldo, float Limite) 
    
    {
        super(Saldo);
        this.Limite = Limite;
    }

    @Override
    protected boolean withdraw(double value) 
    {
        if (Saldo + Limite - value < 0) return false;
        Saldo -= value;
        return true;
    }
}
