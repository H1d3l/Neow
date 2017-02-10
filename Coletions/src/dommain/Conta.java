package dommain;

public class Conta {
	protected double saldo;
	protected int numero;
	
	public int getNumero() {
		return this.numero;
	}
	public int setNumero(int valor){
		valor = this.numero;
		return this.numero;
		
	}
	
	
	public double getSaldo(){
		return this.saldo;
	}
	public void deposita(double valor){
		this.saldo+=valor;
	
	}
	public void saca(double valor){
		this.saldo-=valor;
	}
	public void atualiza(double taxa){
		this.saldo+=this.saldo*taxa;
	}
	
	

}


















