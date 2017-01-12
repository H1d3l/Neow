package Dommain;


public class Empresa {
	String nomeEmpresa,CNPJ;
	int i = 0;
	public Funcionario[] empregados;
	
	public void adciona(Funcionario f){
		for (int i = 0; i < empregados.length; i++) {
			if(empregados[i]==null){
				empregados[i] = f;
				break;
			
			}
		}
	}

	public boolean contem(Funcionario f){
		boolean valor = false;
		for (int i = 0; i < empregados.length; i++) {
			if(f.nome == empregados[i].nome){
				valor = true;
				break;
			}
			
		}
		return false;
		
	}
	
		public void mostraEmpregados(){
			for (int i = 0; i < this.empregados.length; i++) {
				System.out.println("empregados na posicao:"+i+"\n"+"salario:"+empregados[i].salario);
				}	
				
			}
		public void realocar(){
			Funcionario[] empregadosNovos = new Funcionario [this.empregados.length+10];
			for (int i = 0; i < empregadosNovos.length; i++) {
				empregadosNovos[i]=empregados[i];
				
			}empregados = empregadosNovos;
		
		}
		


}



