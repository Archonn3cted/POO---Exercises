package ProvaQ04;

public class Main 
{
    public static void main(String[] args) 
    {
        Boleto b = new Boleto();

        Teste Pagamento = new Teste();
        Pagamento.Pagar(b);

        PIX p = new PIX();
        Pagamento.Pagar(p);
    }
}
