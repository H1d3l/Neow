package app;

import dommain.Conta;
import dommain.ContaPoupanca;
import exceptions.ValorInvalidoException;

public class TestaDeposita {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta cp = new ContaPoupanca();
		try{
			cp.deposita(-100);
		}catch (ValorInvalidoException e) {
			// TODO: handle exception
			System.out.println("Voce tentou depositar um valor invalido");
		}
		

	}

}
