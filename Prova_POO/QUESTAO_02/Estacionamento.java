package ProvaQ02;

import java.util.ArrayList;

public class Estacionamento 
{

    ArrayList<Carro> carros = new ArrayList<>();

    public void estacionarCarro(Carro carro)
    {
        carros.add(carro);
    }

    public int verQuantidadePessoasEstacionamento()
    {
        int TotalPessoas = 0;
        for (Carro carro : carros)
        {
            TotalPessoas += carro.setQuantidadePessoa();
        }
        System.out.printf("Tem %d pessoas no estacionamento \n", TotalPessoas);
        return TotalPessoas;
    }

    public void ListarCarros()
    {
        for (Carro carro : carros)
        {
            System.out.println(carro);
        }
    }   
}
