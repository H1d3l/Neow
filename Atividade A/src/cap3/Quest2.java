package cap3;

import javax.swing.JOptionPane;

public class Quest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aux;
		int R1,R2,R3,R4,RE,maior,menor;
		
			aux = JOptionPane.showInputDialog("Resistencia 1: ");
			R1 = Integer.parseInt(aux);
			
			aux = JOptionPane.showInputDialog("Resistencia 2: ");
			R2 = Integer.parseInt(aux);
			
			aux = JOptionPane.showInputDialog("Resistencia 3: ");
			R3 = Integer.parseInt(aux);
			
			aux = JOptionPane.showInputDialog("Resistencia 4: ");
			R4 = Integer.parseInt(aux);
			
			RE = R1 + R2 + R3 + R4;
			
			
			if (R1 < R2 && R1 < R3 && R1 < R4){
				menor = R1;
			}else if(R2 < R3 && R2 < R4){
				menor = R2;
			}else if(R3 < R4){
				menor = R3;
			}else{
				menor = R4;
			}
			
			if (R1 > R2 && R1 > R3 && R1 > R4){
				maior = R1;
			}else if(R2 > R3 && R2 > R4){
				maior = R2;
			}else if(R3 > R4){
				maior = R3;
			}else{
				maior = R4;
			}
			
			JOptionPane.showMessageDialog(null,"Resistencias fornecidas: \n"+ R1 + ","+ R2 + "," + R3 + "," + R4+"\n Resistencia equivalente:"+ RE +"\n Maior resistencia:" + maior +"\n Menor resistencia:" +menor);

	}



	}


