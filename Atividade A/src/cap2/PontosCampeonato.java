package cap2;

import java.util.Scanner;

public class PontosCampeonato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pontos_lider,pontos_lanterna,vitorias;
		Scanner aux;
		try{
			System.out.println("Pontos do lider: ");
			aux = new Scanner(System.in);
			pontos_lider = (int) aux.nextFloat();
			
			System.out.println("Pontos do lanterna: ");
			aux = new Scanner(System.in);
			pontos_lanterna = (int) aux.nextFloat();
			
			vitorias = (pontos_lider - pontos_lanterna)/3;
			System.out.println("Vitorias necessarias: "+ vitorias);
		}catch(NumberFormatException erro){
			System.out.println("Digite apenas valores numericos....");
		}
		
		

	}

}
