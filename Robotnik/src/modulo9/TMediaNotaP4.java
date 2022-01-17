package modulo9;

import javax.swing.JOptionPane;

public class TMediaNotaP4 {

	public static void main(String[] args) {

		/*EU VOLTEEEIII*/
		TDadosP3 aluno = new TDadosP3();

		aluno.setNota1(277);
		aluno.setNota2(0);
		aluno.setNota3(0);
		aluno.setNota4(0);

		JOptionPane.showMessageDialog(null, aluno.getAprovads() ? "Ta BRABO, media de : " + aluno.getMediaNota()
				: "Mииииии, media de: " + aluno.getMediaNota());

	}

}
