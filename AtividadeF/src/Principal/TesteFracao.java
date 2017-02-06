package Principal;

import javax.swing.JOptionPane;
import javax.xml.soap.SOAPMessage;

import Quests.Fracao;
import Utils.IOTools;

public class TesteFracao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String menu = "1-Somar\n2-Subtrair\n3-Multiplicar\n4-Dividir\n5-Equivalente\n6-Sair";
	
		
		while(true){
			int opcao = Integer.parseInt(JOptionPane.showInputDialog(null,menu));
			switch (opcao) {
			case 1:
					Fracao f1 = new Fracao(IOTools.getInt(),IOTools.getInt()); 
					Fracao f2 = new Fracao(IOTools.getInt(),IOTools.getInt());
					JOptionPane.showMessageDialog(null, f1.Somar(f2));					
					break;

			case 2:
				Fracao f3 = new Fracao(IOTools.getInt(),IOTools.getInt()); 
				Fracao f4 = new Fracao(IOTools.getInt(),IOTools.getInt());
				JOptionPane.showMessageDialog(null, f3.Subtrair(f4));
					break;
				
			case 3:
				Fracao f5 = new Fracao(IOTools.getInt(),IOTools.getInt()); 
				Fracao f6 = new Fracao(IOTools.getInt(),IOTools.getInt());
				JOptionPane.showMessageDialog(null, f5.Multiplicar(f6));
					break;
			
			case 4:
				Fracao f7 = new Fracao(IOTools.getInt(),IOTools.getInt()); 
				Fracao f8 = new Fracao(IOTools.getInt(),IOTools.getInt());
				JOptionPane.showMessageDialog(null, f7.Dividir(f8));
					break;
			case 5:
				Fracao f9 = new Fracao(IOTools.getInt(),IOTools.getInt()); 
				Fracao f10 = new Fracao(IOTools.getInt(),IOTools.getInt());
				JOptionPane.showMessageDialog(null, f9.Equivalente(f10));
					break;
			case 6:
				return;
			default:
				JOptionPane.showMessageDialog(null,"opcao invalida");
			
			
			}
			
			
		}

	}
			
}		
	

