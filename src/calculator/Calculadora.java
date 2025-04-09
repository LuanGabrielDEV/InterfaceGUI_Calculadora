package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.CardLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class Calculadora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;
	private JTextField textField_2;
	
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JButton btnNewButton_0;
	private boolean preenchendoPrimeiroValor = true;

	
	private JButton btnNewButton_soma;
	private JButton btnNewButton_subt;
	private JButton btnNewButton_divi;
	private JButton btnNewButton_mult;
	private JButton btnNewButton_resul;
	private JButton btnNewButton_clean;
	private JButton btnNewButton_soma_1;
	
	private double valor1 = 0;
	private double valor2 = 0;
	private String operador = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 367, 361);
		contentPane = new JPanel();
		contentPane.setForeground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CALCULADORA");
		lblNewLabel.setForeground(SystemColor.activeCaption);
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 20));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(82, 11, 186, 26);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(126, 60, 98, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("VALOR 1:");
		lblNewLabel_1.setForeground(SystemColor.activeCaption);
		lblNewLabel_1.setFont(new Font("Verdana", Font.ITALIC, 15));
		lblNewLabel_1.setBounds(38, 64, 80, 14);
		textField.setToolTipText("Presione um número"); 
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(126, 97, 98, 26);
		contentPane.add(textField_1);
		
		lblNewLabel_2 = new JLabel("VALOR 2:");
		lblNewLabel_2.setForeground(SystemColor.activeCaption);
		lblNewLabel_2.setFont(new Font("Verdana", Font.ITALIC, 15));
		lblNewLabel_2.setBounds(38, 101, 80, 14);
		textField.setToolTipText("Presione um número"); 
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Resultado:");
		lblNewLabel_2_1.setForeground(SystemColor.activeCaption);
		lblNewLabel_2_1.setFont(new Font("Verdana", Font.ITALIC, 15));
		lblNewLabel_2_1.setBounds(38, 140, 80, 14);
		contentPane.add(lblNewLabel_2_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(126, 136, 98, 26);
		contentPane.add(textField_2);
		
		/*
		 * NÚMEROS
		 */
		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionarNumero("1");
			}
		});
		
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBackground(SystemColor.textHighlight);
		btnNewButton_1.setBounds(38, 186, 50, 26);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("2");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionarNumero("2");
			}
		});
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setBackground(SystemColor.textHighlight);
		btnNewButton_2.setBounds(98, 186, 50, 26);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("3");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionarNumero("3");
			}
		});
		btnNewButton_3.setForeground(Color.BLACK);
		btnNewButton_3.setBackground(SystemColor.textHighlight);
		btnNewButton_3.setBounds(158, 186, 50, 26);
		contentPane.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("4");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionarNumero("4");
			}
		});
		btnNewButton_4.setForeground(Color.BLACK);
		btnNewButton_4.setBackground(SystemColor.textHighlight);
		btnNewButton_4.setBounds(38, 223, 50, 26);
		contentPane.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("5");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionarNumero("5");
			}
		});
		btnNewButton_5.setForeground(Color.BLACK);
		btnNewButton_5.setBackground(SystemColor.textHighlight);
		btnNewButton_5.setBounds(98, 223, 50, 26);
		contentPane.add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("6");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionarNumero("6");
			}
		});
		btnNewButton_6.setForeground(Color.BLACK);
		btnNewButton_6.setBackground(SystemColor.textHighlight);
		btnNewButton_6.setBounds(158, 223, 50, 26);
		contentPane.add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("7");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionarNumero("7");
			}
		});
		btnNewButton_7.setForeground(Color.BLACK);
		btnNewButton_7.setBackground(SystemColor.textHighlight);
		btnNewButton_7.setBounds(38, 260, 50, 26);
		contentPane.add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("8");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionarNumero("8");
			}
		});
		btnNewButton_8.setForeground(Color.BLACK);
		btnNewButton_8.setBackground(SystemColor.textHighlight);
		btnNewButton_8.setBounds(98, 260, 50, 26);
		contentPane.add(btnNewButton_8);
		
		btnNewButton_9 = new JButton("9");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionarNumero("9");
			}
		});
		btnNewButton_9.setForeground(Color.BLACK);
		btnNewButton_9.setBackground(SystemColor.textHighlight);
		btnNewButton_9.setBounds(158, 260, 50, 26);
		contentPane.add(btnNewButton_9);
		
		btnNewButton_0 = new JButton("0");
		btnNewButton_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionarNumero("0");
			}
		});
		btnNewButton_0.setForeground(Color.BLACK);
		btnNewButton_0.setBackground(SystemColor.textHighlight);
		btnNewButton_0.setBounds(98, 292, 50, 26);
		contentPane.add(btnNewButton_0);
		
		/*
		 * OPERADORES
		 */
		btnNewButton_soma = new JButton("+");
		btnNewButton_soma.setFont(new Font("Verdana", Font.PLAIN, 20));
		btnNewButton_soma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					valor1 = Double.parseDouble(textField.getText());
					operador = "+";
					preenchendoPrimeiroValor = false;
				} catch (NumberFormatException ex) {
		            textField_2.setText("Erro");
				}
			}
		});
			
		btnNewButton_soma.setBounds(218, 184, 89, 23);
		contentPane.add(btnNewButton_soma);
		
		btnNewButton_subt = new JButton("-");
		btnNewButton_subt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					valor1 = Double.parseDouble(textField.getText());		
					operador = "-";
					preenchendoPrimeiroValor = false;
				} catch (NumberFormatException ex) {
		            textField_2.setText("Erro");
				}
			}
		});
		
		btnNewButton_subt.setFont(new Font("Verdana", Font.PLAIN, 20));
		btnNewButton_subt.setBounds(218, 209, 89, 23);
		contentPane.add(btnNewButton_subt);
		
		btnNewButton_mult = new JButton("X");
		btnNewButton_mult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					valor1 = Double.parseDouble(textField.getText());					
					operador = "X";
					preenchendoPrimeiroValor = false;
				} catch (NumberFormatException ex) {
		            textField_2.setText("Erro");
				}
			}
		});

		btnNewButton_mult.setFont(new Font("Verdana", Font.PLAIN, 20));
		btnNewButton_mult.setBounds(218, 233, 89, 23);
		contentPane.add(btnNewButton_mult);
		
		btnNewButton_divi = new JButton("/");
		btnNewButton_divi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					valor1 = Double.parseDouble(textField.getText());
					operador = "/";
					preenchendoPrimeiroValor = false;
				} catch (NumberFormatException ex) {
		            textField_2.setText("Erro");
				}
			}
		});
		
		btnNewButton_divi.setFont(new Font("Verdana", Font.PLAIN, 20));
		btnNewButton_divi.setBounds(218, 258, 89, 23);
		contentPane.add(btnNewButton_divi);
		
		btnNewButton_resul = new JButton("=");
		btnNewButton_resul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
		            valor2 = Double.parseDouble(textField_1.getText());
		            double resultado = 0;
				
		            switch (operador) {
		            	case "+":
		            		resultado = valor1 + valor2;
		                break;
		            	case "-":
		            		resultado = valor1 - valor2;
		                	break;
		            		case "X":
		            		resultado = valor1 * valor2;
		                	break;
		            	case "/":
		                if (valor2 != 0) {
		                    resultado = valor1 / valor2;
		                } else {
		                    textField_2.setText("Erro!");
		                    return;
		                }
		                break;
		            default:
		                textField_2.setText("Erro");
		                return;
		        }
		        textField_2.setText(String.valueOf(resultado));
		        preenchendoPrimeiroValor = true;
			} catch (NumberFormatException ex) {
	            textField_2.setText("Erro");
	        	}
			}
		});
		
		btnNewButton_resul.setFont(new Font("Verdana", Font.PLAIN, 20));
		btnNewButton_resul.setBounds(218, 292, 89, 23);
		contentPane.add(btnNewButton_resul);
		
		btnNewButton_clean = new JButton("C");
		btnNewButton_clean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  textField.setText("");
			      textField_1.setText("");
			      textField_2.setText("");
			      operador = "";
			}
		});
		btnNewButton_clean.setBounds(158, 294, 50, 23);
		contentPane.add(btnNewButton_clean);
		
		
	}
	private void adicionarNumero(String numero) {
	    if (preenchendoPrimeiroValor) {
	        textField.setText(textField.getText() + numero);
	    } else {
	        textField_1.setText(textField_1.getText() + numero);
	    }
	}
}
