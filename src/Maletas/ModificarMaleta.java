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
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class ModificarMaleta extends JFrame implements ActionListener,ItemListener {

	private JPanel contentPane;
	private JLabel lblModeloM;
	private JLabel lblPrecio;
	private JLabel lblAncho;
	private JLabel lblAlto;
	private JLabel lblFondo;
	private JComboBox cmbModelo;
	private JButton btnCerrar;
	private JButton btnGrabar;
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtAlto;
	private JTextField txtFondo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModificarMaleta frame = new ModificarMaleta();
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
	public ModificarMaleta() {
		setTitle("Modificar maleta");
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setBounds(100, 100, 427, 174);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblModeloM = new JLabel("Modelo:");
		lblModeloM.setBounds(10, 11, 77, 14);
		contentPane.add(lblModeloM);

		lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setBounds(10, 33, 77, 14);
		contentPane.add(lblPrecio);

		lblAncho = new JLabel("Ancho (cm)");
		lblAncho.setBounds(10, 58, 77, 14);
		contentPane.add(lblAncho);

		lblAlto = new JLabel("Alto (cm)");
		lblAlto.setBounds(10, 83, 77, 14);
		contentPane.add(lblAlto);

		lblFondo = new JLabel("Fondo (cm)");
		lblFondo.setBounds(10, 108, 77, 14);
		contentPane.add(lblFondo);

		txtFondo = new JTextField();
		txtFondo.setBounds(82, 105, 219, 17);
		contentPane.add(txtFondo);
		txtFondo.setColumns(10);

		txtAlto = new JTextField();
		txtAlto.setBounds(82, 80, 219, 17);
		contentPane.add(txtAlto);
		txtAlto.setColumns(10);

		txtAncho = new JTextField();
		txtAncho.setBounds(82, 55, 219, 17);
		contentPane.add(txtAncho);
		txtAncho.setColumns(10);

		txtPrecio = new JTextField();
		txtPrecio.setBounds(82, 30, 219, 17);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);

		cmbModelo = new JComboBox();
		cmbModelo.addItemListener(this);
		cmbModelo.setBounds(82, 7, 219, 18);
		contentPane.add(cmbModelo);
		cmbModelo.addItem("Aviator");
		cmbModelo.addItem("Century");
		cmbModelo.addItem("Benneton");
		cmbModelo.addItem("Lucas");
		cmbModelo.addItem("Samsonite");

		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(311, 7, 89, 23);
		contentPane.add(btnCerrar);

		btnGrabar = new JButton("Grabar");
		btnGrabar.addActionListener(this);
		btnGrabar.setBounds(311, 33, 89, 23);
		contentPane.add(btnGrabar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar)
			actionPerformedBtnCerrar(e);
		if( e.getSource() == this.btnGrabar)
			actionPerformedBtnGrabar(e);
			
		
	}
	
	public void actionPerformedBtnCerrar(ActionEvent e) {
		this.setVisible(false);
	}
	
	public void actionPerformedBtnGrabar(ActionEvent e) {
		if (cmbModelo.getSelectedIndex() == 0) {
			VentanaMaletas.precio0 = Double.parseDouble(txtPrecio.getText());
			VentanaMaletas.ancho0 = Double.parseDouble(txtAncho.getText());
			VentanaMaletas.alto0 = Double.parseDouble(txtAlto.getText());
			VentanaMaletas.fondo0 = Double.parseDouble(txtFondo.getText());
		}
		if (cmbModelo.getSelectedIndex() == 1) {
			VentanaMaletas.precio1 = Double.parseDouble(txtPrecio.getText());
			VentanaMaletas.ancho1 = Double.parseDouble(txtAncho.getText());
			VentanaMaletas.alto1 = Double.parseDouble(txtAlto.getText());
			VentanaMaletas.fondo1 = Double.parseDouble(txtFondo.getText());
		}
		if (cmbModelo.getSelectedIndex() == 2) {
			VentanaMaletas.precio2 = Double.parseDouble(txtPrecio.getText());
			VentanaMaletas.ancho2 = Double.parseDouble(txtAncho.getText());
			VentanaMaletas.alto2 = Double.parseDouble(txtAlto.getText());
			VentanaMaletas.fondo2 = Double.parseDouble(txtFondo.getText());
		}
		if (cmbModelo.getSelectedIndex() == 3) {
			VentanaMaletas.precio3 = Double.parseDouble(txtPrecio.getText());
			VentanaMaletas.ancho3 = Double.parseDouble(txtAncho.getText());
			VentanaMaletas.alto3 = Double.parseDouble(txtAlto.getText());
			VentanaMaletas.fondo3 = Double.parseDouble(txtFondo.getText());
		}
		if (cmbModelo.getSelectedIndex() == 4) {
			VentanaMaletas.precio4 = Double.parseDouble(txtPrecio.getText());
			VentanaMaletas.ancho4 = Double.parseDouble(txtAncho.getText());
			VentanaMaletas.alto4 = Double.parseDouble(txtAlto.getText());
			VentanaMaletas.fondo4 = Double.parseDouble(txtFondo.getText());
		}
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == this.cmbModelo)
			itemStateChangedCmbModelo(e);
		
	}
	
	public void itemStateChangedCmbModelo(ItemEvent e) {
		if (cmbModelo.getSelectedIndex() == 0) {
			txtPrecio.setText("" + VentanaMaletas.precio0);
			txtAncho.setText("" + VentanaMaletas.ancho0);
			txtAlto.setText("" + VentanaMaletas.alto0);
			txtFondo.setText("" + VentanaMaletas.fondo0);
		}
		if (cmbModelo.getSelectedIndex() == 1) {
			txtPrecio.setText("" + VentanaMaletas.precio1);
			txtAncho.setText("" + VentanaMaletas.ancho1);
			txtAlto.setText("" + VentanaMaletas.alto1);
			txtFondo.setText("" + VentanaMaletas.fondo1);
		}
		if (cmbModelo.getSelectedIndex() == 2) {
			txtPrecio.setText("" + VentanaMaletas.precio2);
			txtAncho.setText("" + VentanaMaletas.ancho2);
			txtAlto.setText("" + VentanaMaletas.alto2);
			txtFondo.setText("" + VentanaMaletas.fondo2);
		}
		if (cmbModelo.getSelectedIndex() == 3) {
			txtPrecio.setText("" + VentanaMaletas.precio3);
			txtAncho.setText("" + VentanaMaletas.ancho3);
			txtAlto.setText("" + VentanaMaletas.alto3);
			txtFondo.setText("" + VentanaMaletas.fondo3);
		}
		if (cmbModelo.getSelectedIndex() == 4) {
			txtPrecio.setText("" + VentanaMaletas.precio4);
			txtAncho.setText("" + VentanaMaletas.ancho4);
			txtAlto.setText("" + VentanaMaletas.alto4);
			txtFondo.setText("" + VentanaMaletas.fondo4);
		}
	}
	
}



