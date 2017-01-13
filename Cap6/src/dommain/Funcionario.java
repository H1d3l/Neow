package dommain;


public class Funcionario {
	private String nome;
	private String Rg;
	private String matricula;
	public String departamento;
	public Data dataAdmissao;
	private Double salario;
	public static int identificador = 0;
	
	String dadosFuncionario(){
		String dados ="\n"+"nome:"+ this.nome +"\n"+"matricula:"+ 
		this.matricula+"\n"+"departamento:"+ this.departamento;
		return dados;
		
	}
	
	public int getIdentificador(){
		return Funcionario.identificador;
	}		

	public Funcionario(){
		
	}
	public Funcionario(String nome){
		this.Rg = nome;
	}
		
	public double getSalario(){
		return this.salario;
		
	}
	public String getMatricula(){
		return this.matricula;
	}
	public void setMatricula(String matricula){
		this.matricula = matricula;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
		Funcionario.identificador++;
	}
	
	
	public void setSalario(double salario){
		this.salario = salario;
	}
	public String getRg(){
		return this.Rg;
	}
	public void setRg(String Rg){
		this.Rg = Rg;
	}
	
	public String mostra(){
		String date = "Nome: " +this.nome+"\n"+"Matricula: "+this.matricula+
				"\n"+"Departamento: "+this.departamento+"\n"+"Salario: "+this.salario+
				"\n"+"Data Admissao:"+this.dataAdmissao.dataFormatada()+"\n"+
				"Ganho Anual: "+this.calculaGanhoAnual();
				return date;
			}
	
	double recebeAumento(double aumento){
		double novoSalario = this.salario + aumento;
		this.salario = novoSalario;
		return novoSalario;
		}
	
	double calculaGanhoAnual(){
		return this.salario*12;
	}
}



