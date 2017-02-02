package dommain;

public class Circulo implements AreaCalculavel{
	private double raio;
	
	public  Circulo(double raio){
		this.raio=raio;
	}
	public double calculaArea(){
		double area = Math.PI*raio*raio;
		return area;
	}
	@Override
	public double CalculaArea() {
		// TODO Auto-generated method stub
		return calculaArea();
	}
	
}
