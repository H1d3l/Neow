 package Quests;

import javax.swing.JOptionPane;

public class IOTools {
	private static String nome;
	private static double valor1;
	public static int valor;
	private static String msg = "Mensagem ao usuario";
	
	public static String getString(){
		return JOptionPane.showInputDialog("Digite nome:");
	
	}
	public static int getInt(){
		try{
			return Integer.parseInt(JOptionPane.showInputDialog("Digite Valor;")) ;
			 
			
		}catch(ArithmeticException erro)
		{
			JOptionPane.showMessageDialog(null, "informe valores inteiros!"+erro.toString(),"ERRO",JOptionPane.ERROR_MESSAGE);
		}
		return valor;
	}
	
	public static Double getReal(){
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite Valor:"));
		return valor1;	
	}
	public static void showMessage(){
		JOptionPane.showMessageDialog(null, msg);
		
	}
	

}
