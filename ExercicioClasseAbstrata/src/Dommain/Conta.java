package Dommain;

public abstract class Conta {
	protected double saldo;
	
	
	public double getSaldo(){
		return this.saldo;
	}
	public void deposita(double valor){
		this.saldo+=valor;
	
	}
	public void saca(double valor){
		this.saldo-=valor;
	}
	//abstract void atualiza(double taxa);
	
	

}
