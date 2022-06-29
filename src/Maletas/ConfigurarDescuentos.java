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

public class ConfigurarDescuentos extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblTipoObsequio;
	private JLabel lblUnoACinco;
	private JLabel lblSeisADiez;
	private JLabel lblOnceAMas;
	private JTextField txtUnoCinco;
	private JTextField txtSeisDiez;
	private JTextField txtOnceQuince;
	private JTextField txtMasQuince;
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
			txtUnoCinco = new JTextField();
			txtUnoCinco.setBounds(135, 8, 86, 20);
			contentPane.add(txtUnoCinco);
			txtUnoCinco.setColumns(10);
		}
		{
			txtSeisDiez = new JTextField();
			txtSeisDiez.setColumns(10);
			txtSeisDiez.setBounds(135, 33, 86, 20);
			contentPane.add(txtSeisDiez);
		}
		{
			txtOnceQuince = new JTextField();
			txtOnceQuince.setColumns(10);
			txtOnceQuince.setBounds(135, 58, 86, 20);
			contentPane.add(txtOnceQuince);
		}
		{
			txtMasQuince = new JTextField();
			txtMasQuince.setColumns(10);
			txtMasQuince.setBounds(135, 83, 86, 20);
			contentPane.add(txtMasQuince);
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
		rellenarDescuentos();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar)
			actionPerformedBtnCerrar(e);
		if (e.getSource() == btnAceptar)
			actionPerformedBtnAceptar(e);
	}

	public void actionPerformedBtnCerrar(ActionEvent e) {
		this.setVisible(false);
	}

	public void rellenarDescuentos() {
		txtUnoCinco.setText(VentanaMaletas.porcentaje1 + "");
		txtSeisDiez.setText(VentanaMaletas.porcentaje2 + "");
		txtOnceQuince.setText(VentanaMaletas.porcentaje3 + "");
		txtMasQuince.setText(VentanaMaletas.porcentaje4 + "");
	}

	public void actionPerformedBtnAceptar(ActionEvent e) {
		VentanaMaletas.porcentaje1 = Double.parseDouble(txtUnoCinco.getText().toString());
		VentanaMaletas.porcentaje2 = Double.parseDouble(txtSeisDiez.getText().toString());
		VentanaMaletas.porcentaje3 = Double.parseDouble(txtOnceQuince.getText().toString());
		VentanaMaletas.porcentaje4 = Double.parseDouble(txtMasQuince.getText().toString());
		JOptionPane.showMessageDialog(null,"Porcentaje(s) actualizados exitosamente", "Actualizacion de Porcentajes", JOptionPane.INFORMATION_MESSAGE);
		txtUnoCinco.requestFocus();
	}

}
