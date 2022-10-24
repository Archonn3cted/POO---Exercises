package POO.Prova_POO.QUESTAO_05;

public abstract class Ufal_bluetooth{

    public Ufal_bluetooth(){
        abrirConexão();
        processarDados();
        fecharConexão();
    }

    public void abrirConexão() {
        System.out.println("Conetando -> Ufal_bluetooth");
    }

    public abstract void processarDados();

    public void fecharConexão() {
        System.out.println("Ufal_bluetooth encerrada!");
    }

}