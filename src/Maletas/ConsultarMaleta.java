package Maletas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;

public class ConsultarMaleta extends JFrame implements ActionListener, ItemListener {

	private JPanel contentPane;
	private JLabel lblModeloM;
	private JLabel lblPrecio;
	private JLabel lblAncho;
	private JLabel lblAlto;
	private JLabel lblFondo;
	private JTextField txtFondo;
	private JTextField txtAlto;
	private JTextField txtAncho;
	private JTextField txtPrecio;
	private JComboBox cmbModelo;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultarMaleta frame = new ConsultarMaleta();
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
	public ConsultarMaleta() {
		
		setTitle("Consultar Maleta");
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setBounds(100, 100, 427, 174);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblModeloM = new JLabel("Modelo:");
			lblModeloM.setBounds(10, 11, 77, 14);
			contentPane.add(lblModeloM);
		}
		{
			lblPrecio = new JLabel("Precio (S/)");
			lblPrecio.setBounds(10, 33, 77, 14);
			contentPane.add(lblPrecio);
		}
		{
			lblAncho = new JLabel("Ancho (cm)");
			lblAncho.setBounds(10, 58, 77, 14);
			contentPane.add(lblAncho);
		}
		{
			lblAlto = new JLabel("Alto (cm)");
			lblAlto.setBounds(10, 83, 77, 14);
			contentPane.add(lblAlto);
		}
		{
			lblFondo = new JLabel("Fondo (cm)");
			lblFondo.setBounds(10, 108, 77, 14);
			contentPane.add(lblFondo);
		}
		{
			txtFondo = new JTextField();
			txtFondo.setEditable(false);
			txtFondo.setBounds(82, 105, 219, 17);
			contentPane.add(txtFondo);
			txtFondo.setColumns(10);
		}
		{
			txtAlto = new JTextField();
			txtAlto.setEditable(false);
			txtAlto.setBounds(82, 80, 219, 17);
			contentPane.add(txtAlto);
			txtAlto.setColumns(10);
		}
		{
			txtAncho = new JTextField();
			txtAncho.setEditable(false);
			txtAncho.setBounds(82, 55, 219, 17);
			contentPane.add(txtAncho);
			txtAncho.setColumns(10);
		}
		{
			txtPrecio = new JTextField();
			txtPrecio.setEditable(false);
			txtPrecio.setBounds(82, 30, 219, 17);
			contentPane.add(txtPrecio);
			txtPrecio.setColumns(10);
		}
		{
			cmbModelo = new JComboBox();
			cmbModelo.setBounds(82, 7, 219, 18);
			contentPane.add(cmbModelo);
			cmbModelo.addItem("Aviator");
			cmbModelo.addItem("Century");
			cmbModelo.addItem("Benneton");
			cmbModelo.addItem("Lucas");
			cmbModelo.addItem("Samsonite");
			cmbModelo.addItemListener(this);
		}
		{
			btnCerrar = new JButton("Cerrar");
			btnCerrar.addActionListener(this);
			btnCerrar.setBounds(311, 7, 89, 23);
			contentPane.add(btnCerrar);
		}
		//Valores por default
		this.txtPrecio.setText(""+VentanaMaletas.precio0);
		this.txtAncho.setText(""+VentanaMaletas.ancho0);
		this.txtAlto.setText(""+VentanaMaletas.alto0);
		this.txtFondo.setText(""+VentanaMaletas.fondo0);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar)
			actionPerformedBtnCerrar(e);
	}

	public void actionPerformedBtnCerrar(ActionEvent e) {
		this.setVisible(false);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == this.cmbModelo)
			itemStateChangedCmbModelo(e);

	}

	public void itemStateChangedCmbModelo(ItemEvent e) {
		// Declaracion de variables
		int modeloseleccionado = cmbModelo.getSelectedIndex();
		switch (modeloseleccionado) {
		case 0:
			this.txtPrecio.setText(""+VentanaMaletas.precio0);
			this.txtAncho.setText(""+VentanaMaletas.ancho0);
			this.txtAlto.setText(""+VentanaMaletas.alto0);
			this.txtFondo.setText(""+VentanaMaletas.fondo0);
			break;
		case 1:
			this.txtPrecio.setText(""+VentanaMaletas.precio1);
			this.txtAncho.setText(""+VentanaMaletas.ancho1);
			this.txtAlto.setText(""+VentanaMaletas.alto1);
			this.txtFondo.setText(""+VentanaMaletas.fondo1);
			break;
		case 2:
			this.txtPrecio.setText(""+VentanaMaletas.precio2);
			this.txtAncho.setText(""+VentanaMaletas.ancho2);
			this.txtAlto.setText(""+VentanaMaletas.alto2);
			this.txtFondo.setText(""+VentanaMaletas.fondo2);
			break;
		case 3:
			this.txtPrecio.setText(""+VentanaMaletas.precio3);
			this.txtAncho.setText(""+VentanaMaletas.ancho3);
			this.txtAlto.setText(""+VentanaMaletas.alto3);
			this.txtFondo.setText(""+VentanaMaletas.fondo3);
			break;
		case 4:
			this.txtPrecio.setText(""+VentanaMaletas.precio4);
			this.txtAncho.setText(""+VentanaMaletas.ancho4);
			this.txtAlto.setText(""+VentanaMaletas.alto4);
			this.txtFondo.setText(""+VentanaMaletas.fondo4);
			break;
		default:
			break;
		}
	}

}
