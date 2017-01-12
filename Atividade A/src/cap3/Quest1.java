package cap3;

import javax.swing.JOptionPane;

public class Quest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aux,NomeProduto;
		float valorProduto,desconto,valorComDesconto;
		
			aux = JOptionPane.showInputDialog("Nome do produto: ");
			NomeProduto = String.valueOf(aux);
			
			aux = JOptionPane.showInputDialog("Valor do produto: ");
			valorProduto = Float.parseFloat(aux);
			
			if (valorProduto < 0){
				JOptionPane.showMessageDialog(null, "O valor eh menor que zero");
			}else{
				if (valorProduto >= 50 && valorProduto < 200){
					desconto = valorProduto * 5 / 100;
					valorComDesconto = valorProduto - desconto;
					JOptionPane.showMessageDialog(null, "Nome do produto :"+ NomeProduto +"\n Valor original do produto : "+ valorProduto +"\n Valor do produto com desconto : "+ valorComDesconto);
				}else if(valorProduto >= 200 && valorProduto < 500){
					desconto = valorProduto * 6 / 100;
					valorComDesconto = valorProduto - desconto;
					JOptionPane.showMessageDialog(null, "Nome do produto : "+ NomeProduto +"\n Valor original do produto : "+ valorProduto +"\n Valor do produto com desconto : "+ valorComDesconto);
				}else if (valorProduto >= 500 && valorProduto < 1000){
					desconto = valorProduto * 7 / 100;
					valorComDesconto = valorProduto - desconto;
					JOptionPane.showMessageDialog(null, "Nome do produto : "+ NomeProduto +"\n Valor original do produto : "+ valorProduto +"\n Valor do produto com desconto : "+ valorComDesconto);
				}else if (valorProduto >= 100){
					desconto = valorProduto * 8 / 100;
					valorComDesconto = valorProduto - desconto;
					JOptionPane.showMessageDialog(null, "Nome do produto : "+ NomeProduto +"\n Valor original do produto : "+ valorProduto +"\n Valor do produto com desconto : "+ valorComDesconto);
				}
			}
		}


	}


