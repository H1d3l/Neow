package dommain;

public class Banco {
	Conta[] novaconta = new Conta[10];
	public int index = 0;
	
	public void adciona(Conta c){
		this.novaconta[index]=c;
		index++;
		
	}
	public Conta pegaConta(int x){
		return novaconta[x];
		
	}
	public int pegaTotalDeContas(){
		return index;
		
		
		/*int cont = 0;
		for (int i = 0; i < novaconta.length; i++) {
			if (novaconta[i]!=null){
				cont++;
			}
			
		}return cont;
		*/
	}
}
