package Application;


import Dommain.fibonacciTernario;

public class TesteFibonacciTernario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibonacciTernario fibonacci = new fibonacciTernario();
		for (int i = 1; i <= 6; i++) {
			int resultado = fibonacci.calculaFibonacci(i);
			System.out.println(resultado);

	}

}
}
