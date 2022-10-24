package POO.Prova_POO.QUESTAO_06;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Conta_corrente> contas = new ArrayList<>();
        contas.add(new Conta_corrente(500));
        contas.add(new Conta_especial(500, 300));

        Cliente cliente = new Cliente("Joaquim", contas);
        Conta_corrente conta_corrente = cliente.getContas().get(0);

        if(conta_corrente.sacar(100)) {
            System.out.println("Saquei 100 reais da conta corrente");
        }

        Conta_corrente conta_especial = cliente.getContas().get(1);
        if(conta_especial.sacar(800)) {
            System.out.println("Sacando 800 reais da conta especial");
        }
        System.out.println(conta_especial.getSaldo());
    } 
}