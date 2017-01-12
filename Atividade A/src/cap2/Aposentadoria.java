package cap2;

import javax.swing.JOptionPane;

public class Aposentadoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object [] op = {"m","f"};
		int idade,tempo_contribuição;
		String aux;
		
		String sexo = (String) JOptionPane.showInputDialog(null,"Insira sexo: m / f","pesquisa",JOptionPane.PLAIN_MESSAGE,null,op,"m");
		
		aux = JOptionPane.showInputDialog("Insira idade: ");
		idade = Integer.parseInt(aux);
		
		aux = JOptionPane.showInputDialog("Anos de contribuição: ");
		tempo_contribuição = Integer.parseInt(aux);
				
		if (sexo == "m" && idade>=65 && tempo_contribuição>=35){
			JOptionPane.showMessageDialog(null, "Você ja tem direito a aposentadoria!");
		}if (sexo == "f" && idade>=60 && tempo_contribuição>=30) {
			JOptionPane.showMessageDialog(null, "Você ja tem direito a aposentadoria!");
		}else{
			JOptionPane.showMessageDialog(null, "Você não tem direito a aposentadoria!");
		}

	}

}
