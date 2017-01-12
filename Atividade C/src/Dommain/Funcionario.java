package Dommain;

import javax.swing.JOptionPane;

public class Funcionario {
	public String nome;
	public String Rg;
	public String matricula;
	public String departamento;
	public Data dataAdmissao;
	public Double salario;
	
	String dadosFuncionario(){
		String dados ="\n"+"nome:"+ this.nome +"\n"+"matricula:"+ 
		this.matricula+"\n"+"departamento:"+ this.departamento;
		return dados;
		
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



