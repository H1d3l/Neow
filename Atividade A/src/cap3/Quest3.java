import javax.swing.JOptionPane;

public class Quest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String senha_origin = "java8";
		String login_origin = "java8";
		String login_usr,senha_usr;
		int tentativas =3;
		
		login_usr = JOptionPane.showInputDialog("Digite usuario: ");
		senha_usr = JOptionPane.showInputDialog("Digite senha: ");
		
		while (tentativas>0){
			if (login_origin.equals(login_usr) && senha_origin.equals(senha_usr)){
				JOptionPane.showMessageDialog(null, "Login e Usuario aceitos\nBem vindo!!");
				break;
				}else{
					
					JOptionPane.showMessageDialog(null,"Login ou senha incorretos..\nVoce tem mais "+(tentativas-=1)+" chance(s)...");
					login_usr = JOptionPane.showInputDialog("Digite usuario: ");
					senha_usr = JOptionPane.showInputDialog("Digite senha: ");
				}
		}JOptionPane.showMessageDialog(null, "Usuario invalido");
	}
}
		
	