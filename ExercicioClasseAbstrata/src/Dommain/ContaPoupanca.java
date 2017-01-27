package Dommain;

public class ContaPoupanca extends Conta {
	public void atualiza(double taxa){
		//super.atualiza(taxa*3); Não pode usar super vindo metodos de uma classe abstrata?
		this.saldo+=this.saldo*taxa*3;
	}

}
