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

public class ConfigurarDescuentos extends JFrame {

	private JPanel contentPane;
	private JLabel lblTipoObsequio;
	private JLabel lblUnoACinco;
	private JLabel lblSeisADiez;
	private JLabel lblOnceAMas;
	private JTextField txtTipoObsequio;
	private JTextField txtUnoACinco;
	private JTextField txtSeisADiez;
	private JTextField txtOnceAMas;
	private JButton btnAceptar;
	private JButton btnCerrar;
	private JLabel lblPorcentaje;
	private JLabel lblPorcentaje_1;
	private JLabel lblPorcentaje_2;
	private JLabel lblPorcentaje_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfigurarDescuentos frame = new ConfigurarDescuentos();
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
	public ConfigurarDescuentos() {
		setTitle("Configurar porcentajes de descuento");
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setBounds(100, 100, 376, 151);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblTipoObsequio = new JLabel("1 a 5 unidades");
			lblTipoObsequio.setBounds(10, 11, 96, 14);
			contentPane.add(lblTipoObsequio);
		}
		{
			lblUnoACinco = new JLabel("6 a 10 unidades");
			lblUnoACinco.setBounds(10, 36, 96, 14);
			contentPane.add(lblUnoACinco);
		}
		{
			lblSeisADiez = new JLabel("11 a 15 unidades");
			lblSeisADiez.setBounds(10, 61, 96, 14);
			contentPane.add(lblSeisADiez);
		}
		{
			lblOnceAMas = new JLabel("M\u00E1s de 15 unidades");
			lblOnceAMas.setBounds(10, 86, 131, 14);
			contentPane.add(lblOnceAMas);
		}
		{
			txtTipoObsequio = new JTextField();
			txtTipoObsequio.setBounds(135, 8, 86, 20);
			contentPane.add(txtTipoObsequio);
			txtTipoObsequio.setColumns(10);
		}
		{
			txtUnoACinco = new JTextField();
			txtUnoACinco.setColumns(10);
			txtUnoACinco.setBounds(135, 33, 86, 20);
			contentPane.add(txtUnoACinco);
		}
		{
			txtSeisADiez = new JTextField();
			txtSeisADiez.setColumns(10);
			txtSeisADiez.setBounds(135, 58, 86, 20);
			contentPane.add(txtSeisADiez);
		}
		{
			txtOnceAMas = new JTextField();
			txtOnceAMas.setColumns(10);
			txtOnceAMas.setBounds(135, 83, 86, 20);
			contentPane.add(txtOnceAMas);
		}
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.setBounds(267, 7, 89, 23);
			contentPane.add(btnAceptar);
		}
		{
			btnCerrar = new JButton("Cancelar");
			btnCerrar.setBounds(267, 32, 89, 23);
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
		{
			lblPorcentaje = new JLabel("%");
			lblPorcentaje.setBounds(231, 11, 46, 14);
			contentPane.add(lblPorcentaje);
		}
		{
			lblPorcentaje_1 = new JLabel("%");
			lblPorcentaje_1.setBounds(231, 36, 46, 14);
			contentPane.add(lblPorcentaje_1);
		}
		{
			lblPorcentaje_2 = new JLabel("%");
			lblPorcentaje_2.setBounds(231, 61, 46, 14);
			contentPane.add(lblPorcentaje_2);
		}
		{
			lblPorcentaje_3 = new JLabel("%");
			lblPorcentaje_3.setBounds(231, 86, 46, 14);
			contentPane.add(lblPorcentaje_3);
		}
	}

}
