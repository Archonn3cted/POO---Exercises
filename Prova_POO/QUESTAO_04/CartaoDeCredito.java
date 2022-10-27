package ProvaQ04;

public class CartaoDeCredito implements MetodoDePagamento
{
    @Override
    public String Pagamento() 
    {
        return "Pagamento realizado pelo Cartão de Credito";
    }
}
