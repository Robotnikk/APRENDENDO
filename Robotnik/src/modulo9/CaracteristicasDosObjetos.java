package modulo9;


/* Parte da aula 9.7 , 9.8 , 9.9*/

public class CaracteristicasDosObjetos {
	
	public static void main(String[] args) {
		
		/* vc pode chamar uma classe do java, não apenas variaveis*/
		
		/* VVV Objeto ainda não existe na memoria escrito dessa maneira VVV */
		PrimeiraClasseObjAluno alunoX;
		
		
		
		/* VVV agora sim existe um objeto real na memoria VVV */
		
		/* new PrimeiraClasseObjAluno() é uma instancia (criação de objeto)*/
		/* aluno1 é uma ref para o objeto PrimeiraClasseObjAluno*/
		
		PrimeiraClasseObjAluno aluno1 = new PrimeiraClasseObjAluno(); /* Futuro John */
		aluno1.nome = "John";
		aluno1.idade = 19;
		
		System.out.println("Nome do aluno é: " + aluno1.nome);
		System.out.println("Ele tem " + aluno1.idade + " anos");
		
		PrimeiraClasseObjAluno aluno2 = new PrimeiraClasseObjAluno(); /* Futura Wendy */
		
		
		PrimeiraClasseObjAluno aluno3 = new PrimeiraClasseObjAluno(); /* Futura Emily*/
	
		/* ^^^^ basicamente é "classe vinculada a variavel = nova variavel 
		  baseada nas informações da classe" (meus pensamentos) */
		
		PrimeiraClasseObjAluno aluno4 = new PrimeiraClasseObjAluno("Arthur");
		
		PrimeiraClasseObjAluno aluno5 = new PrimeiraClasseObjAluno("Mary", 17);
		
		PrimeiraClasseObjAluno aluno6 = new PrimeiraClasseObjAluno("Steve", 18, "30/10/2021");
		
		
 		
		
	}

}
