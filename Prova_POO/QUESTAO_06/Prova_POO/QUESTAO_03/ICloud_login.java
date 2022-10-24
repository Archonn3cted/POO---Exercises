package POO.Prova_POO.QUESTAO_03;

public class ICloud_login implements Login{
    
    public ICloud_login(APP celular){}
    @Override
    public void logar() {
        System.out.println("Logando com o ICloud");
    }
}