package br.senai.sp.jandira.arquivo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import java.awt.Font;

public class FrameArquivo extends JFrame {

	private JPanel contentPane;

	public FrameArquivo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 250);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panelHeaer = new JPanel();
		panelHeaer.setBounds(10, 11, 394, 56);
		panel.add(panelHeaer);
		panelHeaer.setLayout(null);
		
		JLabel lblArquivo = new JLabel("Arquivo");
		lblArquivo.setFont(new Font("Arial", Font.BOLD, 14));
		lblArquivo.setHorizontalAlignment(SwingConstants.CENTER);
		lblArquivo.setBounds(138, 0, 118, 25);
		panelHeaer.add(lblArquivo);
		
		JLabel lblTexto = new JLabel("Texto");
		lblTexto.setFont(new Font("Arial", Font.BOLD, 14));
		lblTexto.setHorizontalAlignment(SwingConstants.CENTER);
		lblTexto.setBounds(138, 31, 118, 25);
		panelHeaer.add(lblTexto);
		
		JPanel panelMain = new JPanel();
		panelMain.setBounds(10, 75, 394, 118);
		panel.add(panelMain);
		panelMain.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(0, 0, 394, 118);
		textPane.setText(getName());
		panelMain.add(textPane);
		
		JPanel panelFooter = new JPanel();
		panelFooter.setBounds(10, 204, 394, 34);
		panel.add(panelFooter);
		panelFooter.setLayout(null);
		
		JButton btnGravar = new JButton("Gravar");
		btnGravar.setBounds(93, 6, 89, 23);
		panelFooter.add(btnGravar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(192, 6, 89, 23);
		panelFooter.add(btnLimpar);
		
		btnGravar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Arquivo arquivo = new Arquivo();
				
				String caminho = "C:\\Users\\21276756\\Desktop\\Teste\\aula.txt";
				String conteudo = textPane.getText();
				
				String conteudoArquivo = arquivo.ler(caminho);
				conteudoArquivo += "\n" + conteudo;
				
				arquivo.escrever(caminho, conteudoArquivo);
				
			}
		});
		
		
	}
}
