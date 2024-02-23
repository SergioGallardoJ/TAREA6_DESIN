import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JRadioButton;

public class Interfaz {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz window = new Interfaz();
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
	public Interfaz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		
		JLabel lblDesinTarea = new JLabel("DESIN TAREA 6");
		lblDesinTarea.setVerticalAlignment(SwingConstants.BOTTOM);
		lblDesinTarea.setHorizontalAlignment(SwingConstants.CENTER);
		lblDesinTarea.setFont(new Font("Stencil", Font.PLAIN, 17));
		frame.getContentPane().add(lblDesinTarea, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("SERGIO GALLARDO JIMENEZ");
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 17));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel, BorderLayout.CENTER);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("pulse Aqui");
		frame.getContentPane().add(rdbtnNewRadioButton, BorderLayout.WEST);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Pulse aqui");
		frame.getContentPane().add(rdbtnNewRadioButton_1, BorderLayout.EAST);
	}

}
