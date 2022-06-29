package Maletas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ConfigurarObsequios extends JFrame implements ActionListener {

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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfigurarObsequios frame = new ConfigurarObsequios();
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
	public ConfigurarObsequios() {
		setTitle("Configurar obsequios");
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setBounds(100, 100, 376, 151);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblTipoObsequio = new JLabel("Tipo de obsequio");
			lblTipoObsequio.setBounds(10, 11, 99, 14);
			contentPane.add(lblTipoObsequio);
		}
		{
			lblUnoACinco = new JLabel("1 a 5 unidades");
			lblUnoACinco.setBounds(10, 36, 99, 14);
			contentPane.add(lblUnoACinco);
		}
		{
			lblSeisADiez = new JLabel("6 a 10 unidades");
			lblSeisADiez.setBounds(10, 61, 99, 14);
			contentPane.add(lblSeisADiez);
		}
		{
			lblOnceAMas = new JLabel("11 a m\u00E1s unidades");
			lblOnceAMas.setBounds(10, 86, 110, 14);
			contentPane.add(lblOnceAMas);
		}
		{
			txtTipoObsequio = new JTextField();
			txtTipoObsequio.setBounds(129, 8, 86, 20);
			contentPane.add(txtTipoObsequio);
			txtTipoObsequio.setColumns(10);
		}
		{
			txtUnoACinco = new JTextField();
			txtUnoACinco.setColumns(10);
			txtUnoACinco.setBounds(129, 33, 86, 20);
			contentPane.add(txtUnoACinco);
		}
		{
			txtSeisADiez = new JTextField();
			txtSeisADiez.setColumns(10);
			txtSeisADiez.setBounds(129, 58, 86, 20);
			contentPane.add(txtSeisADiez);
		}
		{
			txtOnceAMas = new JTextField();
			txtOnceAMas.setColumns(10);
			txtOnceAMas.setBounds(129, 83, 86, 20);
			contentPane.add(txtOnceAMas);
		}
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.addActionListener(this);
			btnAceptar.setBounds(267, 7, 89, 23);
			contentPane.add(btnAceptar);
		}
		{
			btnCerrar = new JButton("Cancelar");
			btnCerrar.setBounds(267, 32, 89, 23);
			contentPane.add(btnCerrar);
			btnCerrar.addActionListener(this);
		}
		rellenarObsequios();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar)
			actionPerformedBtnCerrar(e);
		if (e.getSource() == btnAceptar)
			actionPerformedBtnAceptar(e);

	}

	public void rellenarObsequios() {
		txtTipoObsequio.setText("" + VentanaMaletas.tipoObsequio);
		txtUnoACinco.setText(VentanaMaletas.obsequio1);
		txtSeisADiez.setText(VentanaMaletas.obsequio2);
		txtOnceAMas.setText(VentanaMaletas.obsequio3);
	}

	public void actionPerformedBtnCerrar(ActionEvent e) {
		this.setVisible(false);
	}

	public void actionPerformedBtnAceptar(ActionEvent e) {
		VentanaMaletas.tipoObsequio = txtTipoObsequio.getText();
		VentanaMaletas.obsequioCantidad1 = Integer.parseInt(txtUnoACinco.getText());
		VentanaMaletas.obsequioCantidad2 = Integer.parseInt(txtSeisADiez.getText());
		VentanaMaletas.obsequioCantidad3 = Integer.parseInt(txtOnceAMas.getText());
		JOptionPane.showMessageDialog(null,"Obsequio actualizado Exitosamente", "Configuracion de Obsequio", JOptionPane.INFORMATION_MESSAGE);
		txtTipoObsequio.requestFocus();
	}

}
