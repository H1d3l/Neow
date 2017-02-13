package app;

import java.awt.JobAttributes;

import javax.swing.JOptionPane;

import modelo.Estacionamento;
import modelo.Veiculo;

public class TestaEstacionamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estacionamento estacionamento = new Estacionamento();
		String menu = "1-entrada\n2-saida\n3-listar situacao\n4-sair";
		
		while(true){
			int op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
			case 1:
				Veiculo n1 = new Veiculo();
				n1.setPlaca(JOptionPane.showInputDialog("Digite placa: "));
				n1.setModelo(JOptionPane.showInputDialog("Digite modelo: "));
				estacionamento.Entrada(n1);
				
				break;
			case 2:
				String placa =	JOptionPane.showInputDialog("placa:");
				
				if(estacionamento.saida(placa)){
					JOptionPane.showInternalMessageDialog(null, "ok");
				}else{
					JOptionPane.showInternalMessageDialog(null, "veiculo nao estacionado");
				}
				break;
			
			
			case 3:
				
				JOptionPane.showMessageDialog(null, estacionamento.vagas());
				
				break;
			case 4:
				return;
			default:
				break;
			}
		}
			
		     

	
	}
	

}
