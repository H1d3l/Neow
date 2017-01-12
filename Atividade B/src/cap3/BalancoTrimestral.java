package cap3;

public class BalancoTrimestral {

	public static void main(String[] args) {
		// Variaveis e tipos primitivos . cap 3.3-Questao 1 e 2. 

		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		int gastosTrimestre = gastosJaneiro+gastosFevereiro+gastosMarco;
		System.out.println("Valor gasto trimestral = "+gastosTrimestre);
		int mediaMensal = gastosTrimestre / 3;
		System.out.println("Valor da media mensal = "+mediaMensal);
	}

}
