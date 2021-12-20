package One.Amy;

public class Tails {

	public static void main(String[] args) {

		int nota1 = 2;
		int nota2 = 50;
		int nota3 = 95;
		int nota4 = 50;

		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 70) {
			System.out.println("Eai Eisten, tranquilo?: " + media);
		} else

		if (media >= 50) {
			System.out.println("Vc esta por um fio mocinho: " + media);
		} else if (media < 50) {
			System.out.println("SAI DA MINHA FRENTE INULTIL: " + media);
		}

	}
}
