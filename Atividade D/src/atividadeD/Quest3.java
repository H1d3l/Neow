package atividadeD;

import javax.swing.JOptionPane;

public class Quest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matriz = new int [4][4];
		for  (int linha = 0; linha < matriz.length; linha ++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
					matriz[linha][coluna] = (int)(Math.random()*255);
				
			}
			
		}
		for  (int h = 0; h < matriz.length; h ++) {
			for (int l = 0;  l< matriz.length; l++){
				System.out.println(("["+(h+1)+"]["+(l+1)+"]: "+ matriz[h][l]));
				//JOptionPane.showMessageDialog(null, (("["+(h+1)+"]["+(l+1)+"]: "+ matriz[h][l])));
			}

		}
	}
	
}
		