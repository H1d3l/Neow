package app;

import dommain.AtualizadorDeContas;
import dommain.Conta;
import dommain.ContaCorrente;
import dommain.ContaPoupanca;

public class TestaAtualizadorDeContas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta c = new Conta();
		Conta cc = new ContaCorrente();
		Conta cp =  new ContaPoupanca();
		
		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);
		
		
		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
		
		adc.Roda(c);
		adc.Roda(cc);
		adc.Roda(cp);
		
		System.out.println("Saldo Total: "+adc.getSaldoTotal());

	}

}
