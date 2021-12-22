package modulo9;

/* classe / objeto que representa o aluno*/

/*Aulas: 9.5 , 9.6 , 9.7 , 9.8 , 9.9, 9.10 */
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

	/*===================================================================================*/
	
	
	public PrimeiraClasseObjAluno() { /* cria dados na memoria - padrão java
	
	
	Para a criação vc começa digitando o nome da classe e usa o auto completar que estiver escrito
	construtor  */
		
		
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
	
	/*Metodos setters(adicionar dados atrib) e getters(obter valores do atrib)*/
	
	
	/*Recebe dados*/
	public void setNome(String nome) {
		this.nome = nome;
		
	}
	
	public String getNome() {
		return this.nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
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

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	public boolean isTemCachorro() {
		return temCachorro;
	}

	public void setTemCachorro(boolean temCachorro) {
		this.temCachorro = temCachorro;
	}
	
	
	
	
	
	
}
