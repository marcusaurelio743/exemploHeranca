package curso.java.marcus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import curso.java.classesauxiliares.FuncaoAutenticacao;
import curso.java.interfaces.PermitirAcesso;
import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classes.Secretario;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {

	/* main é o metodo auto executavel java */
	public static void main(String[] args) {
		
		String login = JOptionPane.showInputDialog("Informe o Login");
		String senha = JOptionPane.showInputDialog("Informe a senha");
		
		
		if(new FuncaoAutenticacao(new Diretor(login,senha)).autenticar()) {
		/* vou travar o contrato para autorizar somente quem
		 *  realmente tem o contrato 100% legitimo*/
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		/*é uma lista que dentro dela temos uma chave que identifica uma sequência de valores também*/
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

		

		for (int qtd = 1; qtd <= 5; qtd++) {

			/* new aluno é uma instância (cria um objeto) */
			/* o aluno1 é uma referencia para objeto aluno */

			String nome = JOptionPane.showInputDialog("Qual é o nome do aluno " + qtd + " ?");
			/*
			 * String idade = JOptionPane.showInputDialog("Qual a sua idade?"); String
			 * dataNacimento = JOptionPane.showInputDialog("Qual a data de nacimento?");
			 * String rg = JOptionPane.showInputDialog("Qual é o RG"); String cpf =
			 * JOptionPane.showInputDialog("Qual é o CPF"); String nomeMae =
			 * JOptionPane.showInputDialog("Qual é o nome da mãe?"); String nomePai =
			 * JOptionPane.showInputDialog("Qual é o nome do Pai?"); String dataMatricula =
			 * JOptionPane.showInputDialog("Qual é a data da matricula?"); String nomeEscola
			 * = JOptionPane.showInputDialog("Qual é o nome da Escola?"); String serie =
			 * JOptionPane.showInputDialog("Qual Serie matriculado?");
			 */

			/* ======================================================================= */
			Aluno aluno1 = new Aluno();
			aluno1.setNome(nome);
			/*
			 * aluno1.setIdade(Integer.valueOf(idade));
			 * aluno1.setDataNacimento(dataNacimento); aluno1.setRegistroGeral(rg);
			 * aluno1.setNumeroCpf(cpf); aluno1.setNomeMae(nomeMae);
			 * aluno1.setNomePai(nomePai); aluno1.setDataMatricula(dataMatricula);
			 * aluno1.setNomeEscola(nomeEscola); aluno1.setSerieMatriculado(serie);
			 */

			for (int pos = 1; pos <= 1; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina " + pos + " ?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina " + pos + " ?");

				/* instanciando a disciplina e atibuino valores */

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno1.getDisciplinas().add(disciplina);

			}
			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");

			if (escolha == 0) {// opção sim é zero

				int continuaRemover = 0;
				int posicao = 1;

				while (continuaRemover == 0) {

					String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou 4 ?");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					continuaRemover = JOptionPane.showConfirmDialog(null, "Contiuar a remover?");

				}
			}

			alunos.add(aluno1);
		}
		// o maps tem que inicializar as listas antes
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());

		for (Aluno aluno : alunos) {/*Separei em listas de aprovados em recuperação ou reprovado*/
			if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);

			} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				maps.get(StatusAluno.RECUPERACAO).add(aluno);

			} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)) {
				maps.get(StatusAluno.REPROVADO).add(aluno);
				

			}		

		}
		
		System.out.println("--------------------Lista dos Alunos Aprovados-------------------------------");
		for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
			System.out.println("Nome: "+aluno.getNome()+" Resultado: "+aluno.getAlunoAprovado2()+" Media "+
		aluno.getMediaNota()+" Disciplina: "+aluno.getDisciplinas());
			
		}
		System.out.println(" ");
		
		System.out.println("--------------------Lista dos Alunos Reprovados-------------------------------");
		for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
			System.out.println("Nome: "+aluno.getNome()+" Resultado: "+aluno.getAlunoAprovado2()+" Media "+
		aluno.getMediaNota()+" Disciplina: "+aluno.getDisciplinas());
			
		}
		
		System.out.println(" ");
		
		System.out.println("--------------------Lista dos Alunos Em Recuperação-------------------------");
		for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println("Nome: "+aluno.getNome()+" Resultado: "+aluno.getAlunoAprovado2()+" Media "+
		aluno.getMediaNota()+" Disciplina: "+aluno.getDisciplinas());
			
		}
		}else {
			JOptionPane.showMessageDialog(null, "autenticação não realizada!!!! ");
		}

	}

}
