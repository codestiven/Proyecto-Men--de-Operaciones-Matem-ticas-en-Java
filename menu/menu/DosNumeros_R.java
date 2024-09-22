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

public class DosNumeros_R {

	private JFrame frame_6;
	private JTextField resultado_6;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DosNumeros_R window = new DosNumeros_R();
					window.frame_6.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DosNumeros_R() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
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
	}

}
