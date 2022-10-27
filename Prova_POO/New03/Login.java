package POO.Prova_POO.New03;

abstract class Login {

    public void logar() {
        TipoLogin(null);
        Logando(null, null);
    }

    abstract void TipoLogin(Tipos type);

    abstract void Logando(String user, String password);

}