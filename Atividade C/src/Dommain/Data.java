package Dommain;

public class Data {
	public int Dia;
	public int Mes;
	public int Ano;
	
	public String dataFormatada(){
		String date = this.Dia + "/"+ this.Mes+"/"+ this.Ano;
		return date;
	}

}
