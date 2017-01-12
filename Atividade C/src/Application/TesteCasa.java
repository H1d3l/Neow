package Application;

import javax.swing.JOptionPane;

import Dommain.Casa;

public class TesteCasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Casa casa = new Casa();
		casa.pinta(JOptionPane.showInputDialog("Cor: "));
		System.out.println("portas abertas :"+ casa.quantasPortasEstaoAbertas());
		System.out.println(casa.mostra());
	
	}

}
