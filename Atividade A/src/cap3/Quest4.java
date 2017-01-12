package cap3;

import javax.swing.JOptionPane;

public class Quest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aux;
		int num,i,tabuada;
		
		
		aux = JOptionPane.showInputDialog("Numero: ");
		num = Integer.parseInt(aux);
		
		for (i = 1; i <= 10; i++){
			System.out.println(num*i);
			//tabuada = num*i;
			//aux = JOptionPane.showMessageDialog(null,tabuada);
		}
	}
}
		


