package atividadeD;

import java.util.Random;

import javax.swing.JOptionPane;

public class Quest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] meses ={"janeiro","fevereiro","março","abril","maio","junho","julho","agosto","setembro","outubro","novembro","dezembro"};
		JOptionPane.showMessageDialog(null,meses[(int)(Math.random()*11)]);
	}
}
