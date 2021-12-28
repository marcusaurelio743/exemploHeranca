package cursojava.classes;

import java.util.Objects;

/*
 * Herança
 * Pessoa é a Classe pai ou super classe 
 * */
public abstract class Pessoa {
	protected String nome;
	protected int idade;
	protected String dataNacimento;
	protected String registroGeral;
	protected String numeroCpf;
	
	/*metodo da classe pai é obrigatoria para as classes filhas*/
	public abstract double salario();
	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getDataNacimento() {
		return dataNacimento;
	}
	public void setDataNacimento(String dataNacimento) {
		this.dataNacimento = dataNacimento;
	}
	public String getRegistroGeral() {
		return registroGeral;
	}
	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}
	public String getNumeroCpf() {
		return numeroCpf;
	}
	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(dataNacimento, idade, nome, numeroCpf, registroGeral);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(dataNacimento, other.dataNacimento) && idade == other.idade
				&& Objects.equals(nome, other.nome) && Objects.equals(numeroCpf, other.numeroCpf)
				&& Objects.equals(registroGeral, other.registroGeral);
	}
	
	/*retorna true se for 18 pra cima senão retorna false*/
	
	public boolean pessoaMaiorIdade() {
		return idade >= 18;
	}
	
	
	
	

}
