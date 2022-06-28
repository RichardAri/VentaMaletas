package Maletas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ConfigurarCantidad extends JFrame {

	private JPanel contentPane;
	private JLabel lblTipoObsequio;
	private JTextField txtCantidad;
	private JButton btnAceptar;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) { 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfigurarCantidad frame = new ConfigurarCantidad();
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
	public ConfigurarCantidad() {
		setTitle("Configurar cantidad \u00F3ptima");
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setBounds(100, 100, 438, 95);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblTipoObsequio = new JLabel("Cantidad \u00F3ptima de unidades vendidas");
			lblTipoObsequio.setBounds(10, 11, 204, 14);
			contentPane.add(lblTipoObsequio);
		}
		{
			txtCantidad = new JTextField();
			txtCantidad.setBounds(224, 8, 60, 20);
			contentPane.add(txtCantidad);
			txtCantidad.setColumns(10);
		}
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.setBounds(323, 7, 89, 23);
			contentPane.add(btnAceptar);
		}
		{
			btnCerrar = new JButton("Cancelar");
			btnCerrar.setBounds(323, 32, 89, 23);
			contentPane.add(btnCerrar);
			btnCerrar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(e.getSource() == btnCerrar)
					{
						setVisible(false);
					}
				}
			});
		}
	}

}
