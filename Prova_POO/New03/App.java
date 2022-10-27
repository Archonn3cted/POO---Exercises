package POO.Prova_POO.New03;

public class App extends Login {
	private boolean Logged = false;

	@Override
	protected void TipoLogin(Tipos type) {
		if(Logged == false){
			
		if(type.equals(Tipos.Google)) {
			Logged = true;
			Google();

		} else if (type.equals(Tipos.Facebook)) {
			Logged = true;
			Facebook();

		} else if (type.equals(Tipos.ICloud)) {
			Logged = true;
			ICloud();}

		} else {
			System.out.println("Você já está conectado!");
		}
		
	}
	private void ICloud() {
		System.out.println("Você conectou com sua conta ICloud!");
	}
	private void Facebook() {
		System.out.println("Você conectou com sua conta Facebook!");
	}
	private void Google() {
		System.out.println("Você conectou com sua conta Google!");
		
	}
	@Override
	protected void Logando(String user, String password) {
	}
}