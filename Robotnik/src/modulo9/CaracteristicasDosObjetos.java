package modulo9;


/* Parte da aula 9.7 , 9.8 , 9.9, 9.10*/

public class CaracteristicasDosObjetos {
	
	public static void main(String[] args) {
		
		/* vc pode chamar uma classe do java, não apenas variaveis*/
		
		/* VVV Objeto ainda não existe na memoria escrito dessa maneira VVV */
		PrimeiraClasseObjAluno alunoX;
		
		
		
		/* VVV agora sim existe um objeto real na memoria VVV */
		
		/* new PrimeiraClasseObjAluno() é uma instancia (criação de objeto)*/
		/* aluno1 é uma ref para o objeto PrimeiraClasseObjAluno*/
		
		PrimeiraClasseObjAluno aluno1 = new PrimeiraClasseObjAluno(); /* Futuro John */
		aluno1.setNome("John do Future");
		aluno1.setIdade(22);
		aluno1.setDataMatricula("30/10/1993");
		aluno1.setDataNascimento("30/10/1993");
		aluno1.setNomeEscola("Sesi");
		aluno1.setNomeMae("Tifa");
		aluno1.setNomePai("Cloud");
		aluno1.setTemCachorro(true);
		aluno1.setRegistroGeral("20838364");
		
		
		
		System.out.println("Nome do aluno é: " + aluno1.getNome());
		System.out.println("Ele tem " + aluno1.getIdade() + " anos");
		System.out.println("Matriculado em " + aluno1.getDataMatricula());
		System.out.println("Nasceu em " + aluno1.getDataNascimento());
		System.out.println("Estudou na escola " + aluno1.getNomeEscola() );
		System.out.println("Nome Mãe é " + aluno1.getNomeMae());
		System.out.println("Nome Pai é " + aluno1.getNomePai());
		System.out.println("RG dele é " + aluno1.getRegistroGeral());
		
		System.out.println("----------------------------------------------------------");
		/*==================================================================================*/
		
		PrimeiraClasseObjAluno aluno2 = new PrimeiraClasseObjAluno(); /* Futura Wendy */
		aluno2.setNome("Wendy a Garçonete");
		aluno2.setIdade(24);
		aluno2.setSerieMatriculado("3º ano");
		aluno2.setNumeroCpf("00011155511");
		
		System.out.println(aluno2.getNome());
		System.out.println(aluno2.getIdade());
		System.out.println(aluno2.getSerieMatriculado());
		System.out.println(aluno2.getNumeroCpf());
		
		
		/*====================================================================================*/
		
		
		PrimeiraClasseObjAluno aluno3 = new PrimeiraClasseObjAluno(); /* Futura Emily*/
	
		/* ^^^^ basicamente é "classe vinculada a variavel = nova variavel 
		  baseada nas informações da classe" (meus pensamentos) */
		
		PrimeiraClasseObjAluno aluno4 = new PrimeiraClasseObjAluno("Arthur");
		
		PrimeiraClasseObjAluno aluno5 = new PrimeiraClasseObjAluno("Mary", 17);
		
		PrimeiraClasseObjAluno aluno6 = new PrimeiraClasseObjAluno("Steve", 18, "30/10/2021");
		
		
 		
		
	}
	
	
	
	
	
	
	
	
	
	

}
