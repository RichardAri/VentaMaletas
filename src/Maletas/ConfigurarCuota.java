package Maletas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ConfigurarCuota extends JFrame {

	private JPanel contentPane;
	private JLabel lblTipoObsequio;
	private JTextField txtCuota;
	private JButton btnAceptar;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfigurarCuota frame = new ConfigurarCuota();
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
	public ConfigurarCuota() {
		setTitle("Configurar cuota diaria");
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setBounds(100, 100, 428, 95);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblTipoObsequio = new JLabel("Cuota diaria esperada (S/.)");
			lblTipoObsequio.setBounds(10, 11, 204, 14);
			contentPane.add(lblTipoObsequio);
		}
		{
			txtCuota = new JTextField();
			txtCuota.setBounds(163, 8, 115, 20);
			contentPane.add(txtCuota);
			txtCuota.setColumns(10);
		}
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.setBounds(312, 7, 89, 23);
			contentPane.add(btnAceptar);
		}
		{
			btnCerrar = new JButton("Cancelar");
			btnCerrar.setBounds(312, 33, 89, 23);
			contentPane.add(btnCerrar);
		}
	}

}
