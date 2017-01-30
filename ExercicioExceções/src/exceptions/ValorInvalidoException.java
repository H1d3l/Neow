package exceptions;

public class ValorInvalidoException extends RuntimeException{
	
	public ValorInvalidoException(double valor){
		super("valor invalido:"+valor);
	}

}
