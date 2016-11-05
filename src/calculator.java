import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class calculator extends JFrame {

	private JPanel contentPane;
	private JTextField v1_valor;
	private JTextField v2_valor;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JLabel lblResultados;
	private JTextField resultado_suma;
	private JTextField resultado_resta;
	private JTextField resultado_multiplicar;
	private JTextField resultado_dividir;
	private JLabel lblSoyLaBestia;
	private JButton btnClear;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator frame = new calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		v1_valor = new JTextField();
		v1_valor.setBounds(149, 40, 86, 20);
		contentPane.add(v1_valor);
		v1_valor.setColumns(10);
		
		v2_valor = new JTextField();
		v2_valor.setBounds(149, 71, 86, 20);
		contentPane.add(v2_valor);
		v2_valor.setColumns(10);
		
		JLabel v1 = new JLabel("Primer Valor");
		
		v1.setBounds(20, 43, 108, 14);
		
		contentPane.add(v1);
		
		JLabel v2 = new JLabel("Segundo Valor");
		v2.setBounds(20, 74, 108, 14);
		contentPane.add(v2);
		
		
		btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String valor1 = v1_valor.getText();
				int Valor1= Integer.valueOf(valor1);
				String valor2 = v2_valor.getText();
				int Valor2= Integer.valueOf(valor2);
				int suma= Valor1+Valor2;
				String valoruno = String.valueOf(suma);
				resultado_suma.setText(valoruno);
				
			}
		});
		btnNewButton.setBounds(10, 135, 89, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("-");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String valor1 = v1_valor.getText();
				int Valor1= Integer.valueOf(valor1);
				String valor2 = v2_valor.getText();
				int Valor2= Integer.valueOf(valor2);
				int suma= Valor1-Valor2;
				String valoruno = String.valueOf(suma);
				resultado_resta.setText(valoruno);
			}
		});
		btnNewButton_1.setBounds(109, 135, 89, 23);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("x");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String valor1 = v1_valor.getText();
				int Valor1= Integer.valueOf(valor1);
				String valor2 = v2_valor.getText();
				int Valor2= Integer.valueOf(valor2);
				int suma= Valor1*Valor2;
				String valoruno = String.valueOf(suma);
				resultado_multiplicar.setText(valoruno);
			}
		});
		btnNewButton_2.setBounds(236, 135, 89, 23);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("/");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String valor1 = v1_valor.getText();
				int Valor1= Integer.valueOf(valor1);
				String valor2 = v2_valor.getText();
				int Valor2= Integer.valueOf(valor2);
				if (Valor2==0){
				resultado_dividir.setText("No se puede dividir por 0");
				}
				else{
				int suma= Valor1/Valor2;
				String valoruno = String.valueOf(suma);
				resultado_dividir.setText(valoruno);
				}
			}
		});
		btnNewButton_3.setBounds(335, 135, 89, 23);
		contentPane.add(btnNewButton_3);
		
		lblResultados = new JLabel("Resultados");
		lblResultados.setBounds(20, 182, 93, 23);
		contentPane.add(lblResultados);
		
		resultado_suma = new JTextField();
		resultado_suma.setBounds(20, 216, 63, 20);
		
		contentPane.add(resultado_suma);
		resultado_suma.setColumns(10);
		
		resultado_resta = new JTextField();
		resultado_resta.setBounds(115, 216, 86, 20);
		contentPane.add(resultado_resta);
		resultado_resta.setColumns(10);
		
		resultado_multiplicar = new JTextField();
		resultado_multiplicar.setBounds(221, 216, 86, 20);
		contentPane.add(resultado_multiplicar);
		resultado_multiplicar.setColumns(10);
		
		resultado_dividir = new JTextField();
		resultado_dividir.setBounds(322, 216, 86, 20);
		contentPane.add(resultado_dividir);
		resultado_dividir.setColumns(10);
		
		lblSoyLaBestia = new JLabel("SOY LA BESTIA, PD: VIDAL");
		lblSoyLaBestia.setBounds(131, 15, 223, 14);
		contentPane.add(lblSoyLaBestia);
		
		btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				resultado_suma.setText("");
				resultado_resta.setText("");
				resultado_dividir.setText("");
				resultado_multiplicar.setText("");
				v1_valor.setText("");
				v2_valor.setText("");
				
				 
			}
		});
		btnClear.setBounds(335, 53, 89, 23);
		contentPane.add(btnClear);
	}
}
