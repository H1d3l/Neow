import javax.swing.JOptionPane;

public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont,num,num2;
		String text= "";
		num = Integer.parseInt(JOptionPane.showInputDialog("Insira numero: "));
		for(cont = 0;cont<=10;cont++){
			num2 = num*cont;
			text+=num+"x"+cont+"="+num2+"\n";
			JOptionPane.showMessageDialog(null,text );
			
		}

	}

}
