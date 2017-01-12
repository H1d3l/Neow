package cap2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Desconto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float valor_produto,porcentagem_desconto,valor_desconto,valor_produto_descontado;
		String aux;
		BufferedReader entrada;
		try{
			System.out.println("Valor do produto: ");
			entrada = new BufferedReader(new InputStreamReader(System.in));
			aux = entrada.readLine();
			valor_produto = Float.parseFloat(aux);
			
			System.out.println("Porcentagem do desconto: ");
			entrada = new BufferedReader(new InputStreamReader(System.in));
			aux =  entrada.readLine();
			porcentagem_desconto = Float.parseFloat(aux);
			
			valor_desconto = (porcentagem_desconto*valor_produto)/100;
			valor_produto_descontado = valor_produto-valor_desconto;
			System.out.println("Valor do desconto: "+ valor_desconto);
			System.out.println("Valor do produto com desconto: "+valor_produto_descontado);
			
			
		}catch(IOException erro){
			System.out.println("Houve um erro na entrada de dados"+ erro.toString());
			
		}catch(NumberFormatException erro){
			System.out.println("Digite apenas caracteres numericos..."+erro.toString());
		}
		
	}

}



