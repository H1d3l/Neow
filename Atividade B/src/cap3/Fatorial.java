package cap3;

public class Fatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long fatorial = 1;
		
        for (int n = 1; n <= 30; n++) {

            while (n >= 2){
                fatorial = fatorial * n;
                break;            
            }System.out.println("Fatorial de "+n+" = "+fatorial);
}
	}

}
