package dommain;

public class AtualizadorDeContas {
	private double saldoTotal = 0;
	private double selic;
	
	public double getSelic(){
		return selic;
	}
	
	public AtualizadorDeContas(double selic){
		this.selic=selic;
	}

	public void Roda(Conta c){
		System.out.println("Saldo anterior: "+ c.saldo);
		c.atualiza(selic);
		System.out.println("Saldo atualizado : "+c.saldo);
		saldoTotal+=c.saldo;
		
	}
	public double getSaldoTotal(){
		return saldoTotal;
	}
}
