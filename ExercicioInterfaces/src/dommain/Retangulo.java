package dommain;

public class Retangulo implements AreaCalculavel {
	private int largura;
	private int altura;
	
	public Retangulo(int largura,int altura){
		this.altura=altura;
		this.largura=largura;
	}
	public double calculaArea(){
		return this.largura*this.altura;
		
	}
	@Override
	public double CalculaArea() {
		// TODO Auto-generated method stub
		return calculaArea();
	}

}
