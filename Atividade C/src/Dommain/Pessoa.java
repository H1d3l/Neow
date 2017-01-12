package Dommain;

public class Pessoa {
	String nome;
	int idade;
	
	void fazAniversario(){
		this.idade++;
	}
	
	public String mostraIdade(){
		return ("Nome: "+this.nome+"\n"+"Idade: "+this.idade);
		
	}

}
