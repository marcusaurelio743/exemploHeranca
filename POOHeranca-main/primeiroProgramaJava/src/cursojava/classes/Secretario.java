package cursojava.classes;

import curso.java.interfaces.PermitirAcesso;

/*Essa é nossa classe/ objeto que representa Secretaio
 * 
 * A classe Secretaio herda os atributos e metodos da classe Pessoa*/
public class Secretario extends Pessoa implements PermitirAcesso {
	
	private String registro;
	
	private String nivelCargo;
	
	private String experiencia;
	
	private String login;
	
	private String senha;
	
	
	
	public Secretario() {
		
	}
	
	public Secretario(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public String getNivelCargo() {
		return nivelCargo;
	}

	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia
				+ ", nome=" + nome + ", idade=" + idade + ", dataNacimento=" + dataNacimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + "]";
	}

	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 1800.80 * 0.9;
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
		
		return login.equals("admin") && senha.equals("admin");
	}
	

	
	
	
	
	

}
