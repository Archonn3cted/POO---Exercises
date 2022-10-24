package POO.Prova_POO.QUESTAO_03;
public class Main {
    public static void main(String[] args) {
        APP celular = new APP("Luana", "Gato");
        APP celular2 = new APP("Luckas", "Lorem");
        Google_login login1 = new Google_login(celular);
        Facebook_login login2 = new Facebook_login(celular2);

        System.out.println(celular.getUsuario());
        login1.logar();

        System.out.println(celular2.getUsuario());
        login2.logar();
    }
}