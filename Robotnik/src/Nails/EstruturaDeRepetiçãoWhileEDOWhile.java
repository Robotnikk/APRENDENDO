package Nails;

public class EstruturaDeRepetiçãoWhileEDOWhile {

	public static void main(String[] args) {

		int numero = 0;

		while (numero <= 60) { /* while verifica e depois executa o codigo */
			System.out.println("Numero atual é: " + numero);
			numero++;
		}
		/* ------------------------------------------------ */

		int numero2 = 0;
		do { /* primeiro executa e depois verifica */
			System.out.println("O numero atual é: " + numero2);
				numero2++;
		} while (numero2 <= 70);
	}
}
