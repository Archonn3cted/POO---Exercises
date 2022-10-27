package ProvaQ06;

import java.util.ArrayList;

class Cliente 
{
    private String nome;
    private ArrayList<ContaCorrente> contas;

    public Cliente() 
    {
        this.nome = "";
        this.contas = new ArrayList<>();
    }

    public Cliente(String nome, ArrayList<ContaCorrente> contas) 
    {
        this.nome = nome;
        this.contas = contas;
    }

    public String getNome() 
    {
        return nome;
    }

    public ArrayList<ContaCorrente> getContas() 
    {
        return contas;
    }

    @Override
    public String toString() {
        return String.format("Nome do cliente: %s\n", nome);
    }
}
