package Maletas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.TextArea;
import java.awt.event.ItemListener;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.awt.event.ItemEvent;

public class VenderMaletas extends JFrame implements ActionListener, ItemListener {
	
	//Declaracion de variables
	private static int cont=0;
	private static double importGeneralAcumulado=0;
	private JPanel contentPane;
	private JLabel lblModelo;
	private JLabel lblPrecio;
	private JLabel lblCantidad;
	private JTextField txtCantidad;
	private JTextField txtPrecio;
	private JComboBox cmbModelo;
	private JButton btnVender;
	private JButton btnCerrar;
	private JScrollPane scrollPane;
	private TextArea textAreaVenta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VenderMaletas frame = new VenderMaletas();
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
	public VenderMaletas() {
		setTitle("Vender");
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setBounds(100, 100, 427, 295);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblModelo = new JLabel("Modelo:");
			lblModelo.setBounds(10, 11, 77, 14);
			contentPane.add(lblModelo);
		}
		{
			lblPrecio = new JLabel("Precio (S/)");
			lblPrecio.setBounds(10, 33, 77, 14);
			contentPane.add(lblPrecio);
		}
		{
			lblCantidad = new JLabel("Cantidad");
			lblCantidad.setBounds(10, 58, 77, 14);
			contentPane.add(lblCantidad);
		}
		{
			txtCantidad = new JTextField();
			txtCantidad.setBounds(82, 55, 219, 17);
			contentPane.add(txtCantidad);
			txtCantidad.setColumns(10);
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
			cmbModelo.addItemListener(this);
			cmbModelo.setBounds(82, 7, 219, 18);
			contentPane.add(cmbModelo);
			cmbModelo.addItem("Aviator");
			cmbModelo.addItem("Century");
			cmbModelo.addItem("Benneton");
			cmbModelo.addItem("Lucas");
			cmbModelo.addItem("Samsonite");
		}
		{
			btnVender = new JButton("Vender");
			btnVender.addActionListener(this);
			btnVender.setBounds(311, 7, 89, 23);
			contentPane.add(btnVender);
		}
		{
			btnCerrar = new JButton("Cerrar");
			btnCerrar.setBounds(311, 33, 89, 23);
			contentPane.add(btnCerrar);
			btnCerrar.addActionListener(this);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 83, 391, 162);
			contentPane.add(scrollPane);
			{
				textAreaVenta = new TextArea();
				textAreaVenta.setEditable(false);
				scrollPane.setViewportView(textAreaVenta);
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar)
			actionPerformedBtnCerrar(e);
		if (e.getSource() == this.btnVender)
			actionPerformedBtnVender(e);

	}

	public void actionPerformedBtnCerrar(ActionEvent e) {
		this.setVisible(false);
	}

	public void actionPerformedBtnVender(ActionEvent e) {
		double impCompra = 0, impDescuento = 0, impTotal = 0;
		int cantidad = Integer.parseInt(txtCantidad.getText());
		textAreaVenta.setText("BOLETA DE VENTA\n\n");
		if (cmbModelo.getSelectedIndex() == 0) {
			impCompra = cantidad * VentanaMaletas.precio0;
			impTotal += impCompra;
			importGeneralAcumulado+=impTotal;
			textAreaVenta.append("Modelo : " + VentanaMaletas.modelo0 + "\n");
			textAreaVenta.append("Precio : " + VentanaMaletas.precio0 + "\n");
			textAreaVenta.append("Cantidad adquirida : " + cantidad + "\n");
			textAreaVenta.append("importe compra : " + impCompra + "\n");
			VentanaMaletas.cantidadUnidadesVendidasAviator +=1;
			VentanaMaletas.impTotalAviator += impTotal;
			VentanaMaletas.cantidadVentasAviator += cantidad;
		}
		if (cmbModelo.getSelectedIndex() == 1) {
			impCompra = cantidad * VentanaMaletas.precio1;
			impTotal += impCompra;
			importGeneralAcumulado+=impTotal;
			textAreaVenta.append("Modelo : " + VentanaMaletas.modelo1 + "\n");
			textAreaVenta.append("Precio : " + VentanaMaletas.precio1 + "\n");
			textAreaVenta.append("Cantidad adquirida : " + cantidad + "\n");
			textAreaVenta.append("importe compra : " + impCompra + "\n");
			VentanaMaletas.cantidadUnidadesVendidasCentury+=1;
			VentanaMaletas.impTotalCentury += impTotal;
			VentanaMaletas.cantidadVentasCentury += cantidad;

		}
		if (cmbModelo.getSelectedIndex() == 2) {
			impCompra = cantidad * VentanaMaletas.precio2;
			impTotal += impCompra;
			importGeneralAcumulado+=impTotal;
			textAreaVenta.append("Modelo : " + VentanaMaletas.modelo2 + "\n");
			textAreaVenta.append("Precio : " + VentanaMaletas.precio2 + "\n");
			textAreaVenta.append("Cantidad adquirida : " + cantidad + "\n");
			textAreaVenta.append("importe compra : " + impCompra + "\n");
			VentanaMaletas.cantidadUnidadesVendidasBenneton+=1;
			VentanaMaletas.impTotalBenneton += impTotal;
			VentanaMaletas.cantidadVentasBenneton += cantidad;

		}
		if (cmbModelo.getSelectedIndex() == 3) {
			impCompra = cantidad * VentanaMaletas.precio3;
			impTotal += impCompra;
			importGeneralAcumulado+=impTotal;
			textAreaVenta.append("Modelo : " + VentanaMaletas.modelo3 + "\n");
			textAreaVenta.append("Precio : " + VentanaMaletas.precio3 + "\n");
			textAreaVenta.append("Cantidad adquirida : " + cantidad + "\n");
			textAreaVenta.append("importe compra : " + impCompra + "\n");
			VentanaMaletas.cantidadUnidadesVendidasLucas+=1;
			VentanaMaletas.impTotalLucas += impTotal;
			VentanaMaletas.cantidadVentasLucas += cantidad;

		}
		if (cmbModelo.getSelectedIndex() == 4) {
			impCompra = cantidad * VentanaMaletas.precio4;
			impTotal += impCompra;
			importGeneralAcumulado+=impTotal;
			textAreaVenta.append("Modelo : " + VentanaMaletas.modelo4 + "\n");
			textAreaVenta.append("Precio : " + VentanaMaletas.precio4 + "\n");
			textAreaVenta.append("Cantidad adquirida : " + cantidad + "\n");
			textAreaVenta.append("importe compra : " + impCompra + "\n");
			VentanaMaletas.cantidadUnidadesVendidasSamsonite+=1;
			VentanaMaletas.impTotalSamsonite += impTotal;
			VentanaMaletas.cantidadVentasSamsonite+= cantidad;
		}

		// Descuento
		if (cantidad > 0 && cantidad < 6) {
			impDescuento = impCompra * (VentanaMaletas.porcentaje1 / 100);
			textAreaVenta.append("Importe descuento " + impDescuento + "\n");
		}
		if (cantidad > 5 && cantidad < 11) {
			impDescuento = impCompra * (VentanaMaletas.porcentaje2 / 100);
			textAreaVenta.append("Importe descuento " + impDescuento + "\n");
		}
		if (cantidad > 10 && cantidad < 16) {
			impDescuento = impCompra * (VentanaMaletas.porcentaje3 / 100);
			textAreaVenta.append("Importe descuento " + impDescuento + "\n");
		}
		if (cantidad > 15) {
			impDescuento = impCompra * (VentanaMaletas.porcentaje4 / 100);
			textAreaVenta.append("Importe descuento " + impDescuento + "\n");
		}
		textAreaVenta.append("Importe pagar : " + (impCompra - impDescuento) + "\n");
		
		// Cantidad Regalo
		if (cantidad > 0 && cantidad < 6)
			textAreaVenta.append("Unidades obsequiadas : " + cantidad * VentanaMaletas.obsequioCantidad1);
		if (cantidad > 5 && cantidad < 11)
			textAreaVenta.append("Unidades obsequiadas : " + cantidad * VentanaMaletas.obsequioCantidad1);
		if (cantidad > 10)
			textAreaVenta.append("Unidades obsequiadas : " + cantidad * VentanaMaletas.obsequioCantidad1);
		
		cont+=1;
		//mensaje 
		if (cont == 5) {
			BigDecimal impAcumulado = new BigDecimal(importGeneralAcumulado).setScale(2, RoundingMode.HALF_UP); 
			String str = "Venta Nro.5\nImporte total general acumulado : S/."+impAcumulado+"\nPorcentaje de la cuota diaria : "+((importGeneralAcumulado/5)/5)+"%";
			JOptionPane.showMessageDialog(null,str, "Avance de ventas", JOptionPane.INFORMATION_MESSAGE);
			cont = 0;
		}

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == this.cmbModelo)
			itemStateChangedCmbModelo(e);
	}

	public void itemStateChangedCmbModelo(ItemEvent e) {
		if (cmbModelo.getSelectedIndex() == 0)
			txtPrecio.setText("" + VentanaMaletas.precio0);
		if (cmbModelo.getSelectedIndex() == 1)
			txtPrecio.setText("" + VentanaMaletas.precio1);
		if (cmbModelo.getSelectedIndex() == 2)
			txtPrecio.setText("" + VentanaMaletas.precio2);
		if (cmbModelo.getSelectedIndex() == 3)
			txtPrecio.setText("" + VentanaMaletas.precio3);
		if (cmbModelo.getSelectedIndex() == 4)
			txtPrecio.setText("" + VentanaMaletas.precio4);
	}

}
