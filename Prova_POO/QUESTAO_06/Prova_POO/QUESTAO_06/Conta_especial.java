package POO.Prova_POO.QUESTAO_06;

class Conta_especial extends Conta_corrente {
    private float limit;

    public Conta_especial(float limit) {
        this.balance = 0;
        this.limit = limit;
    }

    public Conta_especial(double balance, float limit) {
        super(balance);
        this.limit = limit;
    }

    @Override
    protected boolean withdraw(double value) {
        if (balance + limit - value < 0) return false;
        balance -= value;
        return true;
    }
}