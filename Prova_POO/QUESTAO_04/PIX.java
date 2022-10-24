package POO.Prova_POO.QUESTAO_04;

public class PIX implements Metodo_de_pagamento{

    @Override
    public String processar() {
        return "Pagamento realizado pelo Pix";
    }
}