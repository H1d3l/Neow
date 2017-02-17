package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;



public class TestaForca {
	 static ArrayList Bd_palavras = new ArrayList();
	 static ArrayList Bd_dicas = new ArrayList();
	 static ArrayList Bd_palavrasErradas = new ArrayList();
	 static String tema_sort = "";
	 static String palavra_sort = "";
	
	
	public static String tema_sorteado(){
		Random sorteio_tema = new Random();
		int index_sorteado = sorteio_tema.nextInt(Bd_dicas.size());
		for (int i = 0; i < Bd_dicas.size(); i++) {
			if (index_sorteado==i) {
				tema_sort = (String) Bd_dicas.get(i);
				palavra_sort = (String)Bd_palavras.get(i);
			}
			
		}
	return tema_sort;
	}
	
	public static String palavra_sorteada(){
		return palavra_sort;
	}
	
	public static void adicionarNoBD(){
		String tema = JOptionPane.showInputDialog("Digite tema:");
		Bd_dicas.add(tema);
		
		String palavra = JOptionPane.showInputDialog("Digite palavra relacionada ao tema: ");
		Bd_palavras.add(palavra);
	}
	
	public static void jogar(){
		String temaAtual = tema_sorteado();
		String palavraAtual = palavra_sorteada();
		String letrasErradas = "";
		String linha = "";
		int numeroAcertos = 0;
		int numeroErros = 0;
		
		for (int i = 0; i <palavraAtual.length(); i++) {
		
			linha+="_";
			
		}
		
		
		
		
	
	
	
	
	
	}
	
	
	
	
	
		
		
		
		
	}
	
		
	
		
		
		
			
			
					
		
		
	
		
		



