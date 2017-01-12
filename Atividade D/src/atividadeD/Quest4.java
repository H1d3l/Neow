package atividadeD;

import java.util.Random;

import javax.swing.JOptionPane;

public class Quest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] par = new int [10];
		int [] impar = new int [10];
		
		String pares = " ",impares = " ";
		
		Random sorteio = new Random();
		
		for (int i = 0; i < 10; i++) {
			int valor = sorteio.nextInt(10)+1;
			if (valor%2 == 0){
				par[i]+=valor;
				pares+=par[i]+ ",";
				
			}else{
				impar[i]+=valor;
				impares+=impar[i]+",";
			}
		}
		JOptionPane.showMessageDialog(null, " impares: \n" + impares+" \npares:\n "+ pares);
		System.out.println("impares: \n" + impares );
		System.out.println( "pares:\n "+ pares);
		
	}

}

/*Faça uma classe contendo dois arrays do tipo inteiro, um chamado par e outro chamado ímpar.
Cada array deve conter 10 elementos. A seguir, faça um laço de repetição com 10 iterações e que
contenha internamente a geração randômica de números entre 1 e 20. Se o valor gerado for par,
armazene no array chamado par, caso contrário, no array chamado impar. Ao final, apresente o
conteúdo de cada um dos arrays.*/