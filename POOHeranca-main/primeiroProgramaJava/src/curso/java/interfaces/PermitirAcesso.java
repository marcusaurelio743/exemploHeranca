package curso.java.interfaces;

/* essa interface ser� o nosso contrato de autentica��o*/

public interface PermitirAcesso {
	
	/* apenas a declara��o do metodo*/
	
	public boolean Autenticar(String login, String senha);
	
	public boolean Autenticar();

}
