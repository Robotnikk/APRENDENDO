package Nails;

public class repeticaoEContinue {

	public static void main(String[] args) {

		for (int numero = 0; numero <= 60; numero++) {

			System.out.println("é: " + numero);

			if (numero == 5 || numero == 7) {
				System.out.println("te achei " + numero);
				continue; /*Ignora os comandos abaixo e repete*/
			}
			
			System.out.println("vc nãao");
			
		}

	}
}
