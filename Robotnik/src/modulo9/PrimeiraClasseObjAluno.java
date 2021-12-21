package modulo9;

/* classe / objeto que representa o aluno*/

/*Aulas: 9.5 , 9.6 , 9.7 , 9.8*/
public class PrimeiraClasseObjAluno {

	
	/* atributos do aluno são esses*/
	String nome;
	int idade;
	String dataNascimento;
	String registroGeral;
	String numeroCpf;
	String nomeMae;
	String nomePai;
	String dataMatricula;
	String nomeEscola;
	String serieMatriculado;
	boolean temCachorro;

	public PrimeiraClasseObjAluno() { /* cria dados na memoria - padrão java */
		// TODO Auto-generated constructor stub

	}

	public PrimeiraClasseObjAluno(String nomePadrao) {
		nome = nomePadrao;

	}

	public PrimeiraClasseObjAluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}

	public PrimeiraClasseObjAluno(String nomePadrao, int idadePadrao, String dataNascimentoPadrao) {
		
		nome = nomePadrao;
		idade = idadePadrao;
		dataNascimento = dataNascimentoPadrao;
	}
	
	
	
}
