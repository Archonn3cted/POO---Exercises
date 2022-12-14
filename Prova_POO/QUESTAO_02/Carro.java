package ProvaQ02;

public class Carro 
{
    protected String modelo;
    protected int capacidadeMaxima;
    protected int quantidadePessoa;

    public Carro(String modelo, int capacidadeMaxima, int quantidadePessoa)
    {
        if (quantidadePessoa <= capacidadeMaxima)
        {
            this.modelo = modelo;
            this.capacidadeMaxima = capacidadeMaxima;
            this.quantidadePessoa = quantidadePessoa;
        }else{
            System.out.printf("Não é permitido mais que: %d pessoas no carro.", capacidadeMaxima);
        }
    }

    public String getModelo() 
    {
        return modelo;
    }

    public void setQuantidadePessoa(int quantidadePessoa) 
    {
        this.quantidadePessoa = quantidadePessoa;
    }

    @Override
    public String toString() 
    {
        return "Carro: " + modelo + ", capacidade maxima: " + capacidadeMaxima + ", quantidade de pessoa: ";
    }

    public int setQuantidadePessoa() 
    {
        return 0;
    }
}
