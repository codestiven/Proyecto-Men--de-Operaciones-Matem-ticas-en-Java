package menu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSpinner;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.Window.Type;
import java.awt.BorderLayout;

import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

import java.awt.ComponentOrientation;
import java.awt.Cursor;
import javax.swing.DropMode;
import javax.swing.JButton;

import java.awt.Dimension;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JInternalFrame;

public class Menu {

	private JFrame frame;
	public JFrame frame2,frame3 ,frame4,frame5,frame_6,frame7;
	private JLabel Texto_7;

	private JTextField resultado,resultado2,resultado_3,resultado3,resultado_6,resultado7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Menu() {
		DosNumero_S();
		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("deprecation")
	private void initialize() {
		DosNumero_S();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 577, 354);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu Calcular = new JMenu("Calcular");
		menuBar.add(Calcular);
		
		JMenu SUMAR = new JMenu("SUMAR");
		Calcular.add(SUMAR);
		
		JMenuItem DosNumero_S = new JMenuItem("Dos numeros");
//		DosNumero_S.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			//	DosNumero_S window = new DosNumero_S();
//			//	window.frame.setVisible(true);
//				
//				DosNumero_S.setVisible(true);
//				frame2.setVisible(false);
//				
//				
//				
//
//				
//			}
//		});
		SUMAR.add(DosNumero_S);
		
		JMenuItem TresNumeros_S = new JMenuItem("Tres numeros");
		SUMAR.add(TresNumeros_S);
		
		JMenu MULTIPLICAR = new JMenu("MULTIPLICAR");
		Calcular.add(MULTIPLICAR);
		
		JMenuItem DosNumero_M = new JMenuItem("Dos numeros");
		MULTIPLICAR.add(DosNumero_M);
		
		JMenuItem TresNumeros_M = new JMenuItem("Tres numeros");
		MULTIPLICAR.add(TresNumeros_M);
		
		JMenu RESTAR = new JMenu("RESTAR");
		Calcular.add(RESTAR);
		
		JMenuItem DosNumero_R = new JMenuItem("Dos numeros");
		RESTAR.add(DosNumero_R);
		
		JMenuItem TresNumeros_R = new JMenuItem("Tres numeros");
		RESTAR.add(TresNumeros_R);
		frame.getContentPane().setLayout(null);
		
		JTable table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Referencia", "Resultado"}
			},
			new String[] {
				"Referencia", "Resultado"
			}
		));
		table.setBounds(10, 11, 541, 271);

		frame.getContentPane().add(table);
	
//DosNumero frame---------------------------------------------------------------------------------------------------------
		
		JFrame frame2 = new JFrame();
		frame2.setType(Type.POPUP);
		frame2.setBounds(100, 100, 468, 334);
		frame2.getContentPane().setLayout(null);
		
		JLabel texto = new JLabel("Suma:Dos numeros");
		texto.setFont(new Font("Tahoma", Font.PLAIN, 20));
		texto.setBounds(135, 11, 181, 49);
		frame2.getContentPane().add(texto);
		
		JSpinner num1 = new JSpinner();
		num1.setModel(new SpinnerNumberModel(Integer.valueOf(0), null, null, Integer.valueOf(1)));
		num1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		num1.setBounds(91, 71, 272, 29);
		frame2.getContentPane().add(num1);
		
		JSpinner num2 = new JSpinner();
		num2.setBounds(91, 135, 272, 29);
		frame2.getContentPane().add(num2);
		
		
		
		JButton btn = new JButton("Resultado");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1 = (int) num1.getValue();
				int n2 = (int) num2.getValue();
				int res = n1 + n2;
				resultado.setText(Integer.toString(res));
				
				
				
				DefaultTableModel modelo=(DefaultTableModel) table.getModel(); 
				Object [] fila=new Object[2]; 

				    fila[0]= "suma de dos numero"; 
			        fila[1]= Integer.toString(res);
			        modelo.addRow(fila); 
			        
			        
			       table.setModel(modelo); 
				
				
				
			}
		});
		btn.setBorder(new EmptyBorder(0, 0, 0, 0));
		btn.setAlignmentX(Component.CENTER_ALIGNMENT);
		btn.setBounds(160, 235, 102, 29);
		frame2.getContentPane().add(btn);
		
		resultado = new JTextField();
		resultado.setFont(new Font("Tahoma", Font.PLAIN, 16));
		resultado.setBorder(new CompoundBorder(new CompoundBorder(), null));
		resultado.setHorizontalAlignment(SwingConstants.CENTER);
		resultado.setEditable(false);
		resultado.setBounds(130, 192, 172, 29);
		frame2.getContentPane().add(resultado);
		resultado.setColumns(10);
		frame2.setVisible(false);
		
		
		//TresNumero frame---------------------------------------------------------------------------------------------------------		
		
		

			frame3 = new JFrame();
			frame3.setBounds(100, 100, 450, 300);
			frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame3.getContentPane().setLayout(null);
			
			JLabel lblSumatresNumeros = new JLabel("Suma:Tres numeros");
			lblSumatresNumeros.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblSumatresNumeros.setBounds(113, 11, 181, 49);
			frame3.getContentPane().add(lblSumatresNumeros);
			
			JSpinner num1_2 = new JSpinner();
			num1_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			num1_2.setBounds(67, 93, 272, 29);
			frame3.getContentPane().add(num1_2);
			
			JSpinner num2_2 = new JSpinner();
			num2_2.setBounds(67, 53, 272, 29);
			frame3.getContentPane().add(num2_2);
			
			JButton btn_2 = new JButton("Resultado");

			
			resultado2 = new JTextField();
			resultado2.setText("00");
			resultado2.setHorizontalAlignment(SwingConstants.CENTER);
			resultado2.setFont(new Font("Tahoma", Font.PLAIN, 16));
			resultado2.setEditable(false);
			resultado2.setColumns(10);
			resultado2.setBorder(new CompoundBorder(new CompoundBorder(), null));
			resultado2.setBounds(114, 177, 172, 29);
			frame3.getContentPane().add(resultado2);
			
			JSpinner num3_2 = new JSpinner();
			num3_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			num3_2.setBounds(67, 137, 272, 29);
			frame3.getContentPane().add(num3_2);
			
			
			
			
		
			btn_2.setBorder(new EmptyBorder(0, 0, 0, 0));
			btn_2.setAlignmentX(0.5f);
			btn_2.setBounds(148, 221, 102, 29);
			frame3.getContentPane().add(btn_2);
			frame3.setVisible(false);


			
			btn_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int n1,n2,n3,res;
					n1 = (int) num1_2.getValue();
					n2 = (int) num2_2.getValue();
					n3 = (int) num3_2.getValue();
					
					res = n1+n2+n3;
					
					resultado2.setText(Integer.toString(res));
					
					DefaultTableModel modelo=(DefaultTableModel) table.getModel(); 
					Object [] fila=new Object[2]; 

					    fila[0]= "suma de tres numero"; 
				        fila[1]= Integer.toString(res);
				        modelo.addRow(fila); 
				        
				        
				       table.setModel(modelo); 
					
					
					
					
				}
			});
		
		//DosNumero M frame---------------------------------------------------------------------------------------------------------		
		
			frame4 = new JFrame();
			frame4.setType(Type.POPUP);
			frame4.setBounds(100, 100, 468, 334);
			frame4.getContentPane().setLayout(null);
			
			JLabel texto3 = new JLabel("Multiplicacion:Dos numeros");
			texto3.setFont(new Font("Tahoma", Font.PLAIN, 20));
			texto3.setBounds(106, 11, 272, 49);
			frame4.getContentPane().add(texto3);
			
			JSpinner num1_3 = new JSpinner();
			num1_3.setModel(new SpinnerNumberModel(Integer.valueOf(0), null, null, Integer.valueOf(1)));
			num1_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			num1_3.setBounds(91, 71, 272, 29);
			frame4.getContentPane().add(num1_3);
			
			JSpinner num2_3 = new JSpinner();
			num2_3.setBounds(91, 135, 272, 29);
			frame4.getContentPane().add(num2_3);
			
			
			
			JButton btn_3 = new JButton("Resultado");
			btn_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int n1 = (int) num1_3.getValue();
					int n2 = (int) num2_3.getValue();
					int res = n1 * n2;
					resultado_3.setText(Integer.toString(res));
					
					
					DefaultTableModel modelo=(DefaultTableModel) table.getModel(); 
					Object [] fila=new Object[2]; 

					    fila[0]= "Multiplicacion de dos numero"; 
				        fila[1]= Integer.toString(res);
				        modelo.addRow(fila); 
				        
				        
				       table.setModel(modelo); 
					
					
					
				}
			});
			btn_3.setBorder(new EmptyBorder(0, 0, 0, 0));
			btn_3.setAlignmentX(Component.CENTER_ALIGNMENT);
			btn_3.setBounds(160, 235, 102, 29);
			frame4.getContentPane().add(btn_3);
			
			resultado_3 = new JTextField();
			resultado_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
			resultado_3.setBorder(new CompoundBorder(new CompoundBorder(), null));
			resultado_3.setHorizontalAlignment(SwingConstants.CENTER);
			resultado_3.setEditable(false);
			resultado_3.setBounds(130, 192, 172, 29);
			frame4.getContentPane().add(resultado_3);
			resultado_3.setColumns(10);
			frame4.setVisible(false);
		
		//TresNumero M frame-----------------------------------------------------------------------------------------------------
			
			
			frame5 = new JFrame();
			frame5.setBounds(100, 100, 450, 300);
			frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame5.getContentPane().setLayout(null);
			
			JLabel lblSumatresNumeros_5 = new JLabel("Multiplicacion:Tres numeros");
			lblSumatresNumeros_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblSumatresNumeros_5.setBounds(77, 11, 249, 49);
			frame5.getContentPane().add(lblSumatresNumeros_5);
			
			JSpinner num1_31 = new JSpinner();
			num1_31.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			num1_31.setBounds(67, 93, 272, 29);
			frame5.getContentPane().add(num1_31);
			
			JSpinner num2_31 = new JSpinner();
			num2_31.setBounds(67, 53, 272, 29);
			frame5.getContentPane().add(num2_31);
			
			JButton btn_31 = new JButton("Resultado");

			
			resultado3 = new JTextField();
			resultado3.setText("00");
			resultado3.setHorizontalAlignment(SwingConstants.CENTER);
			resultado3.setFont(new Font("Tahoma", Font.PLAIN, 16));
			resultado3.setEditable(false);
			resultado3.setColumns(10);
			resultado3.setBorder(new CompoundBorder(new CompoundBorder(), null));
			resultado3.setBounds(114, 177, 172, 29);
			frame5.getContentPane().add(resultado3);
			
			JSpinner num3_3 = new JSpinner();
			num3_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			num3_3.setBounds(67, 137, 272, 29);
			frame5.getContentPane().add(num3_3);
			
			
			
			
			btn_31.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int n1,n2,n3,res;
					n1 = (int) num1_31.getValue();
					n2 = (int) num2_31.getValue();
					n3 = (int) num3_3.getValue();
					
					res = n1*n2*n3;
					
					resultado3.setText(Integer.toString(res));
					
					DefaultTableModel modelo=(DefaultTableModel) table.getModel(); 
					Object [] fila=new Object[2]; 

					    fila[0]= "Multiplicacion de Tres numero"; 
				        fila[1]= Integer.toString(res);
				        modelo.addRow(fila); 
				        
				        
				       table.setModel(modelo); 
					
					
					
					
				}
			});
			btn_31.setBorder(new EmptyBorder(0, 0, 0, 0));
			btn_31.setAlignmentX(0.5f);
			btn_31.setBounds(148, 221, 102, 29);
			frame5.getContentPane().add(btn_31);	
			
			
			
		//DosNumero R frame-------------------------------------------------------
			
			frame_6 = new JFrame();
			frame_6.setType(Type.POPUP);
			frame_6.setBounds(100, 100, 468, 334);
			frame_6.getContentPane().setLayout(null);
			
			JLabel texto_R = new JLabel("Resta:Dos numeros");
			texto_R.setFont(new Font("Tahoma", Font.PLAIN, 20));
			texto_R.setBounds(135, 11, 181, 49);
			frame_6.getContentPane().add(texto_R);
			
			JSpinner num1_6 = new JSpinner();
			num1_6.setModel(new SpinnerNumberModel(Integer.valueOf(0), null, null, Integer.valueOf(1)));
			num1_6.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			num1_6.setBounds(91, 71, 272, 29);
			frame_6.getContentPane().add(num1_6);
			
			JSpinner num2_6 = new JSpinner();
			num2_6.setBounds(91, 135, 272, 29);
			frame_6.getContentPane().add(num2_6);
			
			
			
			JButton btn_6 = new JButton("Resultado");
			btn_6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int n1 = (int) num1_6.getValue();
					int n2 = (int) num2_6.getValue();
					int res = n1 - n2;
					resultado_6.setText(Integer.toString(res));
					
					

					DefaultTableModel modelo=(DefaultTableModel) table.getModel(); 
					Object [] fila=new Object[2]; 

					    fila[0]= "Resta de dos numero"; 
				        fila[1]= Integer.toString(res);
				        modelo.addRow(fila); 
				        
				        
				       table.setModel(modelo); 
					
					
				}
			});
			btn_6.setBorder(new EmptyBorder(0, 0, 0, 0));
			btn_6.setAlignmentX(Component.CENTER_ALIGNMENT);
			btn_6.setBounds(160, 235, 102, 29);
			frame_6.getContentPane().add(btn_6);
			
			resultado_6 = new JTextField();
			resultado_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
			resultado_6.setBorder(new CompoundBorder(new CompoundBorder(), null));
			resultado_6.setHorizontalAlignment(SwingConstants.CENTER);
			resultado_6.setEditable(false);
			resultado_6.setBounds(130, 192, 172, 29);
			frame_6.getContentPane().add(resultado_6);
			resultado_6.setColumns(10);
		    frame_6.setVisible(false);
		    
		    
		 //TresNumero R frame-------------------------------------------------------------------------
		    
		    frame7 = new JFrame();
			frame7.setBounds(100, 100, 450, 300);
			frame7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame7.getContentPane().setLayout(null);
			
			Texto_7 = new JLabel("Resta:Tres numeros");
			Texto_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
			Texto_7.setBounds(111, 11, 249, 49);
			frame7.getContentPane().add(Texto_7);
			
			JSpinner num1_7 = new JSpinner();
			num1_7.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			num1_7.setBounds(67, 51, 272, 29);
			frame7.getContentPane().add(num1_7);
			
			JSpinner num2_7 = new JSpinner();
			num2_7.setBounds(67, 91, 272, 29);
			frame7.getContentPane().add(num2_7);
			
			JButton btn_7 = new JButton("Resultado");

			
			resultado7 = new JTextField();
			resultado7.setText("00");
			resultado7.setHorizontalAlignment(SwingConstants.CENTER);
			resultado7.setFont(new Font("Tahoma", Font.PLAIN, 16));
			resultado7.setEditable(false);
			resultado7.setColumns(10);
			resultado7.setBorder(new CompoundBorder(new CompoundBorder(), null));
			resultado7.setBounds(114, 177, 172, 29);
			frame7.getContentPane().add(resultado7);
			
			JSpinner num3_7 = new JSpinner();
			num3_7.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			num3_7.setBounds(67, 137, 272, 29);
			frame7.getContentPane().add(num3_7);
			
			
			
			
			btn_7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int n1,n2,n3,res;
					n1 = (int) num1_7.getValue();
					n2 = (int) num2_7.getValue();
					n3 = (int) num3_7.getValue();
					
					res = n1-n2-n3;
					
					resultado7.setText(Integer.toString(res));
					
					
					

					DefaultTableModel modelo=(DefaultTableModel) table.getModel(); 
					Object [] fila=new Object[2]; 

					    fila[0]= "Resta de Tres numero"; 
				        fila[1]= Integer.toString(res);
				        modelo.addRow(fila); 
				        
				        
				       table.setModel(modelo); 
					
					
					
				}
			});
			btn_7.setBorder(new EmptyBorder(0, 0, 0, 0));
			btn_7.setAlignmentX(0.5f);
			btn_7.setBounds(148, 221, 102, 29);
			frame7.getContentPane().add(btn_7);
			
			frame7.setVisible(false);
		    
		//eventos --------------------------------------------------------------------------------------------

		

		DosNumero_S.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame2.setVisible(true);				
			}
		});
		TresNumeros_S.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame3.setVisible(true);
			}
		});
		
		DosNumero_M.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame4.setVisible(true);
			}
		});
		
		TresNumeros_M.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame5.setVisible(true);
			}
		});

		DosNumero_R.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame_6.setVisible(true);
			}
		});
		
		TresNumeros_R.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame7.setVisible(true);
			}
		});

	
	}
	
	
	public void DosNumero_S() {
		
	}
}
