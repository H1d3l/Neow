package Application;

import javax.swing.JOptionPane;

import Dommain.Data;
import Dommain.Funcionario;

public class TesteFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario f1;
		f1 = new Funcionario();
		Data data = new Data();
		//data.inserirData();
		f1.dataAdmissao = data;
		f1.nome = JOptionPane.showInputDialog("Nome Funcionario: ");
		f1.Rg = JOptionPane.showInputDialog("Rg: ");
		f1.matricula = JOptionPane.showInputDialog("Matricula:");
		f1.salario = Double.parseDouble(JOptionPane.showInputDialog("Salario: "));
		f1.departamento = JOptionPane.showInputDialog("Departamento: ");
		f1.dataAdmissao.Dia = Integer.parseInt(JOptionPane.showInputDialog("Dia adimiss�o: "));
		f1.dataAdmissao.Mes = Integer.parseInt(JOptionPane.showInputDialog("Mes adimiss�o: "));
		f1.dataAdmissao.Ano = Integer.parseInt(JOptionPane.showInputDialog("Ano adimiss�o: "));
		System.out.println(f1.mostra());
		/*
		Funcionario f1 = new Funcionario();
		f1.nome = "Jarvs";
		f1.salario = 3000.00;
		
		Funcionario f2 = new Funcionario();
		f2.nome = "Jarvs";
		f2.salario = 3000.00;
		Funcionario f2 = f1;
		if (f1==f2){
			System.out.println("iguais");
		}else{
			System.out.println("diferentes");
		}
		
		System.out.println(f1.recebeAumento(50));
		System.out.println("Dados do funcionario  "+ f1.dadosFuncionario());
		System.out.println("Ganho anual: "+ f1.calculaGanhoAnual());
		*/
		
	
	
	}
	
	

}
