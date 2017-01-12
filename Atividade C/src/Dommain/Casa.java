package Dommain;

public class Casa {
	public String cor;
	public Porta porta1 = new Porta();
	public Porta porta2 = new Porta();
	public Porta porta3 = new Porta();
	
	public String pinta(String s){
		cor = s;
		return cor;
	}
	public int quantasPortasEstaoAbertas(){
		int cont = 0;
		if(porta1.estaAberta()==true){
			cont++;
		}else if(porta2.estaAberta()==true){
			cont++;
			
		}else if(porta3.estaAberta()==true){
			cont++;
		}
	return cont;
		
	}
	public String mostra(){
		return "cor:"+ cor;
	}


}
