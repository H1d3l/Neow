package dommain;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca>{
	
	public void atualiza(double taxa){
		super.atualiza(taxa*3);
		//this.saldo+=this.saldo*taxa*3;
	}
	
	public int compareTo(ContaPoupanca o){
		if(this.getNumero()<o.getNumero()){
			return -1;
		}if(this.getNumero()>o.getNumero()){
			return 1;
		}return 0;
	}

}
