package cap2;

import javax.swing.JOptionPane;

public class Aposentadoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object [] op = {"m","f"};
		int idade,tempo_contribui��o;
		String aux;
		
		String sexo = (String) JOptionPane.showInputDialog(null,"Insira sexo: m / f","pesquisa",JOptionPane.PLAIN_MESSAGE,null,op,"m");
		
		aux = JOptionPane.showInputDialog("Insira idade: ");
		idade = Integer.parseInt(aux);
		
		aux = JOptionPane.showInputDialog("Anos de contribui��o: ");
		tempo_contribui��o = Integer.parseInt(aux);
				
		if (sexo == "m" && idade>=65 && tempo_contribui��o>=35){
			JOptionPane.showMessageDialog(null, "Voc� ja tem direito a aposentadoria!");
		}if (sexo == "f" && idade>=60 && tempo_contribui��o>=30) {
			JOptionPane.showMessageDialog(null, "Voc� ja tem direito a aposentadoria!");
		}else{
			JOptionPane.showMessageDialog(null, "Voc� n�o tem direito a aposentadoria!");
		}

	}

}
