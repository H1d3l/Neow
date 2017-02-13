package modelo;

import javax.swing.JOptionPane;
import javax.swing.Spring;

public class Estacionamento {
	Veiculo[] estacionamento = new Veiculo[10];
	
	public void Entrada(Veiculo carro){
		for (int i = 0; i < estacionamento.length; i++) {
			if(estacionamento[i] == null){
				estacionamento[i]=carro;
				break;
				
			}
		}
		
}
	
	
	public boolean saida(String placa){
		for (int j = 0; j < estacionamento.length; j++) {
			String aux = estacionamento[j].getPlaca();

			if(placa.equals(aux)){
				aux = null;	
				return true;
			}
		}
		return false;
		
	}
	
	
	
	public  String vagas() {
		String aux = "";
		for (int i = 0; i < estacionamento.length; i++) {
			if (estacionamento[i]==null){
				aux +="vaga -"+i+":livre.\n";
			}else{
				aux+="vaga -"+i+":"+"modelo: "+ estacionamento[i].getModelo() + " " + "placa: "+estacionamento[i].getPlaca()+"\n";
			}
			
			
		}
		return aux;
	}
	
}