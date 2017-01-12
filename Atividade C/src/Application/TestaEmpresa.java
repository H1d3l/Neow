package Application;

import javax.swing.JOptionPane;

import Dommain.Empresa;
import Dommain.Funcionario;

public class TestaEmpresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empresa empresa1 = new Empresa();
		empresa1.empregados = new Funcionario[10];
		
		Funcionario f1 = new Funcionario();
		f1.salario = 1000.0;
		empresa1.adciona(f1);
		//empresa1.mostraEmpregados();
		
		Funcionario f2 = new Funcionario();
		f2.salario = 1700.0;
		empresa1.adciona(f2);
		
		empresa1.mostraEmpregados();
	}

}
