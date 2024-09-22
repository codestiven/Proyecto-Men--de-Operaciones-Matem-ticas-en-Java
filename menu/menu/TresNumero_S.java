package menu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TresNumero_S {

	private JFrame frame;
	private JTextField resultado2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TresNumero_S window = new TresNumero_S();
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
	public TresNumero_S() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSumatresNumeros = new JLabel("Suma:Tres numeros");
		lblSumatresNumeros.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSumatresNumeros.setBounds(113, 11, 181, 49);
		frame.getContentPane().add(lblSumatresNumeros);
		
		JSpinner num1_2 = new JSpinner();
		num1_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		num1_2.setBounds(67, 93, 272, 29);
		frame.getContentPane().add(num1_2);
		
		JSpinner num2_2 = new JSpinner();
		num2_2.setBounds(67, 53, 272, 29);
		frame.getContentPane().add(num2_2);
		
		JButton btn_2 = new JButton("Resultado");

		
		resultado2 = new JTextField();
		resultado2.setText("00");
		resultado2.setHorizontalAlignment(SwingConstants.CENTER);
		resultado2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		resultado2.setEditable(false);
		resultado2.setColumns(10);
		resultado2.setBorder(new CompoundBorder(new CompoundBorder(), null));
		resultado2.setBounds(114, 177, 172, 29);
		frame.getContentPane().add(resultado2);
		
		JSpinner num3_2 = new JSpinner();
		num3_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		num3_2.setBounds(67, 137, 272, 29);
		frame.getContentPane().add(num3_2);
		
		
		
		
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1,n2,n3,res;
				n1 = (int) num1_2.getValue();
				n2 = (int) num2_2.getValue();
				n3 = (int) num3_2.getValue();
				
				res = n1+n2+n3;
				
				resultado2.setText(Integer.toString(res));
				
				
				
				
				
				
			}
		});
		btn_2.setBorder(new EmptyBorder(0, 0, 0, 0));
		btn_2.setAlignmentX(0.5f);
		btn_2.setBounds(148, 221, 102, 29);
		frame.getContentPane().add(btn_2);
	}

}
