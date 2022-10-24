package POO.Prova_POO.QUESTAO_04;

public class Main {

    public static void main(String[] args) {
        Boleto b = new Boleto();

        Teste pagamento = new Teste();
        pagamento.pagar(b);

        PIX p = new PIX();
        pagamento.pagar(p);
    }

}