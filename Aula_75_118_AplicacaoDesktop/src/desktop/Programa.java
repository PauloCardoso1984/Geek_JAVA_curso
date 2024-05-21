package desktop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/* APLICAÇÃO DESKTOP */
public class Programa {
	public static void main(String[] args) {
		
		// LOGIN E SENHA
		final String USER = "Paulo";
		final String PASS = "1984Reginaldo";
		
		// TITULO DA TELA
		JFrame frame = new JFrame ("Paulo Cardoso :: Acesso ao Sistema");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //SISTEMA QUE IRÁ PARAR A APLICAÇÃO
		
		// PAINEL / JANELA
		JPanel panel = new JPanel();
		// Fazendo agrupamento dos elementos na tela
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		
		// FAZENDO A TELA DE USUÁRIO
		JLabel lblUsuario = new JLabel ("Usuário: ");
		JTextField txtUsuario = new JTextField(15);
		txtUsuario.setToolTipText("Informe seu usuário de acesso... ");
		
		// FAZENDO A TELA DE SENHA
		JLabel lblSenha = new JLabel("Senha: ");
		JPasswordField txtSenha = new JPasswordField(15);
		txtSenha.setToolTipText("Informe sua senha de acesso: ");
		
		// CRIANDO UM BOTÃO
		JButton btnLoggin = new JButton("Login");
		
		// CONFIGURANDO O BOTÃO PARA A SENHA CRIADA
		btnLoggin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(txtUsuario.getText().equals(USER) && new String (txtSenha.getPassword()).equals(PASS)) {
					JOptionPane.showMessageDialog(frame,  "Acesso autorizado...");
				} else {
					JOptionPane.showMessageDialog(frame,  "Acesso negado...");
				}
			}			
		});
		
		// ADICIONANDO DENTRO DE PAINEL
		panel.add(lblUsuario);
		panel.add(txtUsuario);
		
		panel.add(lblSenha);
		panel.add(txtSenha);
		
		panel.add(btnLoggin);
		
		// ALOCAR OS RECURSOS
		frame.setContentPane(panel);
		frame.pack();
		frame.setVisible(true);
	}
}