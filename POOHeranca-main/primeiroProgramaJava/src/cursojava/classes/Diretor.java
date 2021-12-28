package cursojava.classes;

import curso.java.interfaces.PermitirAcesso;

/*Essa é nossa classe/ objeto que representa Diretor
 * 
 * A classe Diretor herda os atributos e metodos da classe Pessoa*/
public class Diretor extends Pessoa implements PermitirAcesso {

	private String registroEducacao;

	private int tempoDuracao;

	private String titulacao;

	private String login;

	private String senha;
	
	public Diretor(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	public Diretor() {
		
	}

	public String getRegistroEducacao() {
		return registroEducacao;
	}

	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}

	public int getTempoDuracao() {
		return tempoDuracao;
	}

	public void setTempoDuracao(int tempoDuracao) {
		this.tempoDuracao = tempoDuracao;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	@Override
	public String toString() {
		return "Diretor [registroEducacao=" + registroEducacao + ", tempoDuracao=" + tempoDuracao + ", titulacao="
				+ titulacao + ", nome=" + nome + ", idade=" + idade + ", dataNacimento=" + dataNacimento
				+ ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + "]";
	}

	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 3900.80;
	}
	
	
	@Override
	/* esse é o metodo de contrato de autenticação*/
	
	public boolean Autenticar(String login, String senha) {
		this.login = login;
		this.senha = senha;
		
		return Autenticar();
	}

	@Override
	public boolean Autenticar() {
		
		return login.equals("marcus") && senha.equals("123");
	}
	

}
