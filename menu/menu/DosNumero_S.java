package menu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.CompoundBorder;
import java.awt.Window.Type;

public class DosNumero_S {

	JFrame frame;
	private JTextField resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DosNumero_S window = new DosNumero_S();
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
	public DosNumero_S() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setType(Type.POPUP);
		frame.setBounds(100, 100, 468, 334);
		frame.getContentPane().setLayout(null);
		
		JLabel texto = new JLabel("Suma:Dos numeros");
		texto.setFont(new Font("Tahoma", Font.PLAIN, 20));
		texto.setBounds(135, 11, 181, 49);
		frame.getContentPane().add(texto);
		
		JSpinner num1 = new JSpinner();
		num1.setModel(new SpinnerNumberModel(Integer.valueOf(0), null, null, Integer.valueOf(1)));
		num1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		num1.setBounds(91, 71, 272, 29);
		frame.getContentPane().add(num1);
		
		JSpinner num2 = new JSpinner();
		num2.setBounds(91, 135, 272, 29);
		frame.getContentPane().add(num2);
		
		
		
		JButton btn = new JButton("Resultado");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1 = (int) num1.getValue();
				int n2 = (int) num2.getValue();
				int res = n1 + n2;
				resultado.setText(Integer.toString(res));
				
				
				Menu window = new Menu();
				String[] aa = {"aa", "aa"};
				//window.table.getColumn(aa);
				
				
				
			}
		});
		btn.setBorder(new EmptyBorder(0, 0, 0, 0));
		btn.setAlignmentX(Component.CENTER_ALIGNMENT);
		btn.setBounds(160, 235, 102, 29);
		frame.getContentPane().add(btn);
		
		resultado = new JTextField();
		resultado.setFont(new Font("Tahoma", Font.PLAIN, 16));
		resultado.setBorder(new CompoundBorder(new CompoundBorder(), null));
		resultado.setHorizontalAlignment(SwingConstants.CENTER);
		resultado.setEditable(false);
		resultado.setBounds(130, 192, 172, 29);
		frame.getContentPane().add(resultado);
		resultado.setColumns(10);
		

	}
}
