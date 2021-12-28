package curso.java.marcus;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {
	public static void main(String[] args) {
		
		/*iniciando disciplinas para adicionar ao aluno*/
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Java");
		disciplina.setNota(90);
		
		Aluno aluno = new Aluno();
		
		aluno.setNome("Marcus Aurelio Melo de Oliveira Santos");
		aluno.setIdade(22);
		aluno.setDataNacimento("13-04-1995");
		aluno.setRegistroGeral("384747474747");
		aluno.setNumeroCpf("095747-949494-33");
		aluno.setNomeMae("maria");
		aluno.setNomePai("Jose");
		aluno.setDataMatricula("20-04-2021");
		aluno.setNomeEscola("Escola de treinamento web");
		aluno.setSerieMatriculado("1 ano");

		/*
		 * Agora o aluno vai adicionar a disciplina que foi instânciada*/
		aluno.getDisciplinas().add(disciplina);
		
		/*---------------Instânciando classe Diretor-------------------------------*/
		Diretor diretor = new Diretor();
		diretor.setNome("José Ferreira Gomes");
		diretor.setIdade(50);
		diretor.setDataNacimento("13-04-1878");
		diretor.setRegistroGeral("384747474747");
		diretor.setNumeroCpf("075747-949494-33");
		diretor.setTitulacao("Diretor Vigente");
		diretor.setTempoDuracao(100);
		diretor.setRegistroEducacao("00003456");
		
		/*------------------Instânciar Classe Secretario----------------------------*/
		
		Secretario secretario = new Secretario();
		secretario.setNome("Amanda Gomes Faria");
		secretario.setIdade(18);
		secretario.setDataNacimento("13-04-1990");
		secretario.setRegistroGeral("384747474747");
		secretario.setNumeroCpf("055747-949494-33");
		secretario.setNivelCargo("Secretario (a)");
		secretario.setExperiencia("5 Anos de experiência");
		secretario.setRegistro("00567");
		
		/* mostrar na tela os objetos: Secretario Diretor e Aluno*/
		
		System.out.println(aluno);
		System.out.println();
		System.out.println(diretor);
		System.out.println();
		System.out.println(secretario);
		
		System.out.println(aluno.pessoaMaiorIdade() + " -"+aluno.msgMaiorIdade() ); 
		System.out.println(diretor.pessoaMaiorIdade()); 
		System.out.println(secretario.pessoaMaiorIdade()); 
		
		System.out.println("Sálario Aluno é = " + aluno.salario());
		System.out.println("Sálario Diretor é = " + diretor.salario());
		System.out.println("Sálario Secretario é = " + secretario.salario());
		
		teste(aluno);
		teste(secretario);
		teste(diretor);
		
		
		
		
		
	}
	
	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa é demias: " 
	+ pessoa.getNome() + " e o sálario é de: " + pessoa.salario());
		
	}

}
