package Dommain;

public class fibonacciTernario {
	int n;
	
	public int calculaFibonacci(int n){
		return (n<2 ?  n :  calculaFibonacci(n-1)+calculaFibonacci(n-2) );
		
		}

	
}

