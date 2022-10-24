package POO.Prova_POO.QUESTAO_02;

import java.util.ArrayList;

public class Estacionamento {

    ArrayList<Carro> carros = new ArrayList<>();

    public void estacionar_Carro(Carro carro){
        carros.add(carro);
    }

    public int verQuantidade_Pessoas_Estacionamento(){
        int total_Pessoas = 0;
        for (Carro carro : carros){
            total_Pessoas += carro.setQuantidadePessoa();
        }
        System.out.printf("Tem %d pessoas no estacionamento \n", total_Pessoas);
        return total_Pessoas;
    }

    public void listar_Carros(){
        for (Carro carro : carros){
            System.out.println(carro);
        }
    }   
}