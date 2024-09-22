package menu;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

public class TresNumeros_M {

	private JFrame frame5;
	private JTextField resultado3;
	private JLabel lblSumatresNumeros_5;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TresNumeros_M window = new TresNumeros_M();
					window.frame5.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TresNumeros_M() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame5 = new JFrame();
		frame5.setBounds(100, 100, 450, 300);
		frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame5.getContentPane().setLayout(null);
		
		lblSumatresNumeros_5 = new JLabel("Multiplicacion:Tres numeros");
		lblSumatresNumeros_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSumatresNumeros_5.setBounds(77, 11, 249, 49);
		frame5.getContentPane().add(lblSumatresNumeros_5);
		
		JSpinner num1_3 = new JSpinner();
		num1_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		num1_3.setBounds(67, 93, 272, 29);
		frame5.getContentPane().add(num1_3);
		
		JSpinner num2_3 = new JSpinner();
		num2_3.setBounds(67, 53, 272, 29);
		frame5.getContentPane().add(num2_3);
		
		JButton btn_3 = new JButton("Resultado");

		
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
		
		
		
		
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1,n2,n3,res;
				n1 = (int) num1_3.getValue();
				n2 = (int) num2_3.getValue();
				n3 = (int) num3_3.getValue();
				
				res = n1*n2*n3;
				
				resultado3.setText(Integer.toString(res));
				
				
				
				
				
				
			}
		});
		btn_3.setBorder(new EmptyBorder(0, 0, 0, 0));
		btn_3.setAlignmentX(0.5f);
		btn_3.setBounds(148, 221, 102, 29);
		frame5.getContentPane().add(btn_3);
	}

	}


