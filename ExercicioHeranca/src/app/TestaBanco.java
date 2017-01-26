package app;

import dommain.AtualizadorDeContas;
import dommain.Banco;
import dommain.Conta;
import dommain.ContaCorrente;
import dommain.ContaPoupanca;

public class TestaBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Banco BancoNovo = new Banco();
		
		Conta cc = new ContaCorrente();
		BancoNovo.adciona(cc);
		cc.deposita(1000);		
		
		Conta cp = new ContaPoupanca();
		BancoNovo.adciona(cp);
		cp.deposita(1000);

		AtualizadorDeContas atualizaContas = new AtualizadorDeContas(0.1);
		
		//atualizaContas.Roda(cc);
		//atualizaContas.Roda(cp);

		for (int i = 0; i < BancoNovo.pegaTotalDeContas(); i++) {
			atualizaContas.Roda(BancoNovo.pegaConta(i));
			
		}

	}

}
