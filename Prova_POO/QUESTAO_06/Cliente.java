package POO.Prova_POO.QUESTAO_06;

import java.util.ArrayList;

class Cliente {
    private String nome;
    private ArrayList<Conta_corrente> contas;

    public Cliente() {
        this.nome = "";
        this.contas = new ArrayList<>();
    }

    public Cliente(String nome, ArrayList<Conta_corrente> contas) {
        this.nome = nome;
        this.contas = contas;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Conta_corrente> getContas() {
        return contas;
    }

    @Override
    public String toString() {
        return String.format("Nome do cliente: %s\n", nome);
    }
}
