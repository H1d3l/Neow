package Principal;
import java.util.Random;

import javax.swing.JOptionPane;

import Utils.IOTools;

public class TestadorPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = IOTools.getInt();
		//int num = Integer.parseInt(JOptionPane.showInputDialog("Digite numero: "));
		int[] V = new int [num];
		int cont = 0;
		String numeros = " ";
		Random sorteio = new Random();
		
		for (int i = 0; i < V.length; i++) {
			int prox = 0;
			
			int valor = sorteio.nextInt(60)+1;
				V[i]+=valor;
				valor = prox;
				if (prox!=V[i]){
					numeros+=V[i]+",";
					if(V[i]%6 == 0){
						cont++;
					}
				}
				
					
			}System.out.println(cont);
		System.out.println(numeros);
			
	}

}
