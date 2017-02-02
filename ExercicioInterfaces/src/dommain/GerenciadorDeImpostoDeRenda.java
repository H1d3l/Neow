package dommain;

public class GerenciadorDeImpostoDeRenda {
	private double total;
	
	public void adciona(Tributavel t){
		System.out.println("Adcionando tributavel: "+t);
		this.total+=t.calculaTributos();
	}
	public double getTotal(){
		return this.total;
	}
}
