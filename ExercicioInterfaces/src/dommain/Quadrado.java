package dommain;

public class Quadrado implements AreaCalculavel {
	private int lado;
	
	public Quadrado(int lado){
		this.lado = lado;
	}
	public double calculaArea(){
		return this.lado*this.lado;
	}
	@Override
	public double CalculaArea() {
		// TODO Auto-generated method stub
		return calculaArea();
	}

}
