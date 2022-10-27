package ProvaQ06;

import java.util.ArrayList;

public class Main 
{
    public static void main(String[] args) 
    {
        ArrayList<ContaCorrente> contas = new ArrayList<>();
        contas.add(new ContaCorrente(500));
        contas.add(new ContaEspecial(500, 300));

        Cliente cliente = new Cliente("Joaquim", contas);
        ContaCorrente contaCorrente = cliente.getContas().get(0);

        if(ContaCorrente.Sacar(100)) 
        {
            System.out.println("Saquei 100 reais da conta corrente");
        }

        ContaCorrente contaEspecial = cliente.getContas().get(1);
        if(ContaEspecial.Sacar(800)) 
        {
            System.out.println("Sacando 800 reais da conta especial");
        }
        System.out.println(contaEspecial.getSaldo());
    } 
}
