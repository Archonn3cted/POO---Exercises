package POO.Prova_POO.QUESTAO_04;

public class Cartao_de_credito implements Metodo_de_pagamento{

    @Override
    public String processar() {
        return "Pagamento realizado pelo Cartão de Credito";
    }

}