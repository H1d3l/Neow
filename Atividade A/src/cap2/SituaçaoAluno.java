package cap2;

import javax.swing.JOptionPane;

public class SituaçaoAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aux;
		Float nota1,nota2,nota_trabalho,media;
		
		aux = JOptionPane.showInputDialog("Digite nota1: ");
		nota1 = Float.parseFloat(aux);
		
		aux = JOptionPane.showInputDialog("Digite nota2: ");
		nota2 = Float.parseFloat(aux);
		
		aux = JOptionPane.showInputDialog("Digite nota do trabalho: ");
		nota_trabalho = Float.parseFloat(aux);
		
		media = (nota1+nota2+nota_trabalho)/3;
		
		if (media<6){
			JOptionPane.showMessageDialog(null,"Aluno Reprovado!");
		}else{
			JOptionPane.showMessageDialog(null,"Aluno Aprovado!");
		}

	}

}
