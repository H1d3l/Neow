package app;

import dommain.ContaCorrente;
import dommain.Tributavel;

public class TestaTributavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		System.out.println(cc.calculaTributos());
		
		//Testando polimorfimo
		
		Tributavel t = cc;
		System.out.println(t.calculaTributos());
		

	}

}
