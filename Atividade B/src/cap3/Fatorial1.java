package cap3;

public class Fatorial1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fatorial = 1;
		
        for (int n = 1; n <= 10; n++) {

            while (n >= 2){
                fatorial = fatorial * n;
                break;            
            }System.out.println("Fatorial de "+n+" = "+fatorial);
        }
	}
}


