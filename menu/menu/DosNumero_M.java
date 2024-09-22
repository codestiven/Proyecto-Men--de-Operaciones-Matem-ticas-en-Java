package menu;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

public class DosNumero_M {
	private JTextField resultado_3;
	private JFrame frame3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DosNumero_M window = new DosNumero_M();
					window.frame3.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DosNumero_M() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame3 = new JFrame();
		frame3.setType(Type.POPUP);
		frame3.setBounds(100, 100, 468, 334);
		frame3.getContentPane().setLayout(null);
		
		JLabel texto3 = new JLabel("Multiplicacion:Dos numeros");
		texto3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		texto3.setBounds(106, 11, 272, 49);
		frame3.getContentPane().add(texto3);
		
		JSpinner num1_3 = new JSpinner();
		num1_3.setModel(new SpinnerNumberModel(Integer.valueOf(0), null, null, Integer.valueOf(1)));
		num1_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		num1_3.setBounds(91, 71, 272, 29);
		frame3.getContentPane().add(num1_3);
		
		JSpinner num2_3 = new JSpinner();
		num2_3.setBounds(91, 135, 272, 29);
		frame3.getContentPane().add(num2_3);
		
		
		
		JButton btn_3 = new JButton("Resultado");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1 = (int) num1_3.getValue();
				int n2 = (int) num2_3.getValue();
				int res = n1 * n2;
				resultado_3.setText(Integer.toString(res));
				
				
				
				
				
				
			}
		});
		btn_3.setBorder(new EmptyBorder(0, 0, 0, 0));
		btn_3.setAlignmentX(Component.CENTER_ALIGNMENT);
		btn_3.setBounds(160, 235, 102, 29);
		frame3.getContentPane().add(btn_3);
		
		resultado_3 = new JTextField();
		resultado_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		resultado_3.setBorder(new CompoundBorder(new CompoundBorder(), null));
		resultado_3.setHorizontalAlignment(SwingConstants.CENTER);
		resultado_3.setEditable(false);
		resultado_3.setBounds(130, 192, 172, 29);
		frame3.getContentPane().add(resultado_3);
		resultado_3.setColumns(10);
	}

}
