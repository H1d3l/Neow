package cap2;

import javax.swing.JOptionPane;

public class ImpostoITBI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float valor_transa��o,valor_venal,percentual_imposto,maior_valor,valor_imposto,desconto;
		String aux;
		
		try{
			aux = JOptionPane.showInputDialog("Digite valor transa��o: ");
			valor_transa��o = Float.parseFloat(aux);
			
			aux = JOptionPane.showInputDialog("Digite valor venal: ");
			valor_venal = Float.parseFloat(aux);
			
			aux = JOptionPane.showInputDialog("Digite percentual imposto: ");
			percentual_imposto = Float.parseFloat(aux);
					
			if (valor_transa��o>valor_venal){
				maior_valor = valor_transa��o;
			}else{
				maior_valor = valor_venal;
			}
			
			desconto = (maior_valor*percentual_imposto)/100;
			valor_imposto = maior_valor*desconto/100;
			
			JOptionPane.showMessageDialog(null,"Valor imposto: "+valor_imposto);		
		}catch(NumberFormatException erro){
			System.out.println("Digite valores numericos");
		}
		
	}

}
