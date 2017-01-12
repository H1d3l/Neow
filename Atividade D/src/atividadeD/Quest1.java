package atividadeD;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Quest1 {

	public static void main(String[] args) {
		double media = 0;
		int[] notas = new int[5];
		for (int i = 0; i < notas.length; i++) {
			int valor = Integer.parseInt(JOptionPane.showInputDialog("digite valores:"));
			notas[i] = valor;
			media += valor;
		}
		Arrays.sort(notas);
		for (int i = 4; i >= 0; i--) {
			System.out.println(notas[i]);
			}
		System.out.println("media: "+ (media/5));
		}
		
		
}
