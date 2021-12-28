package curso.java.interfaces;

/* essa interface será o nosso contrato de autenticação*/

public interface PermitirAcesso {
	
	/* apenas a declaração do metodo*/
	
	public boolean Autenticar(String login, String senha);
	
	public boolean Autenticar();

}
