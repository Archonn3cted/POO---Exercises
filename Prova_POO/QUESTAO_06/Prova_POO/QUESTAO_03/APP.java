package POO.Prova_POO.QUESTAO_03;

public class APP{
    private String usuario;
    private String senha;

    public APP(String usuario, String senha){
        this.usuario = usuario;
        this.senha = senha;

    }
    public String getLogin() {
        return senha;
    }

    public void setLogin(String senha) {
        this.senha = senha;
    }
    public String getUsuario() {
        return usuario;
    }
}