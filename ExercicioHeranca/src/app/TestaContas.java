package app;

import dommain.Conta;
import dommain.ContaCorrente;
import dommain.ContaPoupanca;

public class TestaContas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta c = new Conta();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		//ContaCorrente cc = new ContaCorrente();
		//ContaPoupanca cp = new ContaPoupanca();
		
		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);
		
		c.atualiza(0.01);
		cc.atualiza(0.01);
		cp.atualiza(0.01);
		
		System.out.println(c.getSaldo());
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());

	}

}
