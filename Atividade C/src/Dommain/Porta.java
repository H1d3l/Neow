package Dommain;

public class Porta {
	Boolean aberta = false;
	String cor;
	int dimensaoX,dimensaoY,dimensaoZ;
	
	void abre(){
		if (this.aberta = false){
			this.aberta = true;
		}
	}
	void fecha(){
		if(this.aberta = true){
			this.aberta = false;
		}
	}
	void pinta(String s){
		this.cor = s;
	}
	Boolean estaAberta(){
		if(this.aberta == true){
			return true;
		}else{
			return false;
		}
		
	}
	public String mostra(){
		return ("Cor: "+cor+"\nTamanho//\n X = "+dimensaoX+",Y = "+dimensaoY+",Z = "+dimensaoZ);	
		}
}

