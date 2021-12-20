package One.Amy;

public class Knucles {

	public static void main(String[] args) {

		int nota1 = 20000;
		int nota2 = 50;
		int nota3 = 95;
		int nota4 = 50;

		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		/*if (media >= 70) {
			System.out.println("Eai Eisten, tranquilo?: " + media);
		} else

		if (media >= 50) {
			System.out.println("Vc esta por um fio mocinho: " + media);
		} else if (media < 50) {
			System.out.println("SAI DA MINHA FRENTE INULTIL: " + media);
		}*/
		
		/*Operadores Ternarios são apra micro validações*/
		
		/*String saidaResultado;
		
		saidaResultado = media >= 70 ? "Aprovs filhao: " + media : media >= 50 && media <= 69 ? 
				
				"Opaa escorregou: " + media : 
					
					"BAAAAAAKA: " + media; */
		
		
			
			/*System.out.println(saidaResultado);*/
			
			String haloInfinite;
			
haloInfinite = media >= 20000 ? "miseravel maldito! " + media : media <= 19999 && media >= 8000 ? 
		"Slk chama o Goku ae" : "Ha, eu ja esperava por essa decepção";
			
			System.out.println(haloInfinite);

	}
}
