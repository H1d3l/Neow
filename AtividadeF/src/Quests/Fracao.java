package Quests;

import java.awt.font.NumericShaper;

public class Fracao {
	public  int denominador;
	public  int numerador;
	public int num;

	
	public int setDenominador(int denominador){
		if(denominador<0){
			denominador = 1;
		}return denominador;
	}
	public Fracao(int numerador,int denominador){
		this.denominador = denominador;
		this.numerador = numerador;

	}
	public Fracao(){
		this.numerador = 0;
		this.denominador = 1;
		
	}
	public Fracao(int num){
		this.num = numerador;
		this.denominador = 1;
	}
	
	
	public  String toString(){
		return this.numerador+"/"+this.denominador;
		
	}
	
	public static  int mdc(int numerador, int denominador){
		int r = denominador%numerador;
		while(r!=0){
			denominador=numerador;
			numerador = r;
			r = denominador%numerador;
			
		}return numerador;
		
	}
	public static int mmc(int num1, int num2) {

	    int mmc = 0, aux, i;

	    for (i = 2; i <= num2; i++) {
	        aux = num1 * i;
	        if ((aux % num2) == 0) {
	            mmc = aux;
	            i = num2 + 1;
	        }
	    }
	    return mmc/2;
	}
		
		
		
	public  Fracao Simplificar(){
	
		return new Fracao(this.numerador/mdc(this.numerador,this.denominador), this.denominador/mdc(this.numerador,this.denominador));
		}
		
	public  Fracao Somar(Fracao nova){
		int f1 = ((mmc(this.denominador,nova.denominador)/this.denominador)*this.numerador);
		int f2 = ((mmc(this.denominador,nova.denominador)/nova.denominador)*nova.numerador);
		return new Fracao(f1+f2,mmc(this.denominador,nova.denominador));
	}
	public Fracao Subtrair(Fracao nova){
		return new Fracao((this.numerador*nova.denominador)-(nova.numerador*this.denominador) ,mmc(this.denominador,nova.denominador));
	
	}
	public Fracao Multiplicar(Fracao nova){
			
		return new Fracao((this.numerador*nova.numerador),this.denominador*nova.denominador);
	}
	
	public Fracao Dividir(Fracao nova){
		return new Fracao((this.numerador*nova.denominador),(this.denominador*nova.numerador));
	}
	
	public double Decimal(){
		return  Double.valueOf(this.numerador)/Double.valueOf(this.denominador);
		
	}
	
	public String minimo(Fracao nova){
		if(Decimal()>nova.Decimal()){
			return toString();
		}else{
			return nova.toString();
		}
	}
	public boolean Equivalente(Fracao nova){
		if(Decimal()==nova.Decimal()){
			return true;
		}else{
			return false;
		}
	}
	
	
}
