package modulo9;

import javax.swing.JOptionPane;

public class MediaNota {

	/* =========== aula 9.11 , 9.12 */

	/*
	 * =============================================================================
	 * ==
	 */

	public static void main(String[] args) {

		Dados aluno1 = new Dados();

		aluno1.setNota1(90);
		aluno1.setNota2(70);
		aluno1.setNota3(50.1);
		aluno1.setNota4(99.5);

		System.out.println("Media é: " + aluno1.getMediaNota());

		JOptionPane.showMessageDialog(null, aluno1.getAprovado() ? "Aprovado" : "BAAAKA");

	}
}
