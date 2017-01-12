package atividadeD;
import java.lang.reflect.Array;
import java.util.Arrays;

import javax.print.attribute.standard.JobKOctetsProcessed;
import javax.swing.JOptionPane;

public class AppEstacinamento {
	public static void main(String[]args){
		String[] vagas = new String[10];
		Arrays.fill(vagas,"vaga livre");
		String VAGA_LIVRE = "Vaga livre";
		String menu = "1 - Entrada \n2 - Saida \n3 - Estado \n4-Sair";
		
		while (true) {
			
			int opcao = Integer.valueOf(JOptionPane.showInputDialog(null,menu));
			switch (opcao) {
			case 1://Entrada
				int vaga = Integer.parseInt(JOptionPane.showInputDialog("vaga: "));
				String placa = JOptionPane.showInputDialog("placa");
				vagas[vaga] = placa; 
				break;

			case 2://Saida
				vaga = Integer.parseInt(JOptionPane.showInputDialog("vaga:"));
				vagas[vaga]= VAGA_LIVRE;
				JOptionPane.showMessageDialog(null,"Saida de veiculo com sucesso");
				break;
				
			case 3://Estado
				String resultado = "Estado: \n";
				for(int i = 0; i<vagas.length;i++){
					resultado+= "vaga "+ i+"--->"+vagas[i]+"\n";
					
				}
				JOptionPane.showMessageDialog(null, resultado);
				break;
			case 4://Sair
				return;
			default:
				JOptionPane.showMessageDialog(null, "opcao invalida");
			}
			
			
		}
		
	}
}
