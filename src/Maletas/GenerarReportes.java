package Maletas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JComboBox;
import java.awt.Button;
import javax.swing.JButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class GenerarReportes extends JFrame implements ItemListener {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTextArea textAreaReporte;
	private JLabel lblTipoReporte;
	private JComboBox cmbTipoReporte;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GenerarReportes frame = new GenerarReportes();
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
	public GenerarReportes() {
		setTitle("Generar reportes");
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setBounds(100, 100, 592, 279);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 36, 556, 199);
			contentPane.add(scrollPane);
			{
				textAreaReporte = new JTextArea();
				textAreaReporte.setEditable(false);
				scrollPane.setViewportView(textAreaReporte);
			}
		}
		{
			lblTipoReporte = new JLabel("Tipo de reporte:");
			lblTipoReporte.setBounds(10, 11, 81, 14);
			contentPane.add(lblTipoReporte);
		}
		{
			cmbTipoReporte = new JComboBox();
			cmbTipoReporte.addItemListener(this);
			cmbTipoReporte.setBounds(101, 7, 365, 22);
			cmbTipoReporte.addItem("Escoger el tipo de Reporte");
			cmbTipoReporte.addItem("Ventas por modelo");
			cmbTipoReporte.addItem("Razon de precios en relacion al mayor");
			cmbTipoReporte.addItem("Estadistica sobre la cantidad optima");
			cmbTipoReporte.addItem("Estadistica sobre el precio");
			contentPane.add(cmbTipoReporte);
		}
		{
			btnCerrar = new JButton("Cerrar");
			btnCerrar.setBounds(477, 7, 89, 23);
			contentPane.add(btnCerrar);
		}

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == this.cmbTipoReporte)
			itemStateChangedCmbTipoReporte(e);

	}

	public void itemStateChangedCmbTipoReporte(ItemEvent e) {
		int index = this.cmbTipoReporte.getSelectedIndex();
		switch (index) {
		case 1:
			reportePorModelos();
			break;
		case 2:
			reportePorRelacionPrecio();
			break;
		case 3:
			reportePorCantidadOptima();
			break;
		case 4:
			reportePorPrecio();
			break;
		default:
			break;
		}

	}

	private void reportePorRelacionPrecio() {
		textAreaReporte.setText("RAZON DE PRECIOS EN RELACION AL PRECIO MAYOR\n");
		textAreaReporte.append("Modelo : Aviator\n");
		textAreaReporte.append("Precio : " + VentanaMaletas.cantidadVentasAviator + "\n");
		textAreaReporte.append("Razon : " + VentanaMaletas.cantidadUnidadesVendidasAviator + "\n");

		textAreaReporte.append("Modelo : Century\n");
		textAreaReporte.append("Precio : " + VentanaMaletas.cantidadVentasCentury + "\n");
		textAreaReporte.append("Razon : " + VentanaMaletas.cantidadUnidadesVendidasCentury + "\n");

		textAreaReporte.append("Modelo : Benneton\n");
		textAreaReporte.append("Precio : " + VentanaMaletas.cantidadVentasBenneton + "\n");
		textAreaReporte.append("Razon : " + VentanaMaletas.cantidadUnidadesVendidasBenneton + "\n");

		textAreaReporte.append("Modelo : Lucas\n");
		textAreaReporte.append("Precio : " + VentanaMaletas.cantidadVentasLucas + "\n");
		textAreaReporte.append("Razon : " + VentanaMaletas.cantidadUnidadesVendidasLucas + "\n");

		textAreaReporte.append("Modelo : Samsonite\n");
		textAreaReporte.append("Precio : " + VentanaMaletas.cantidadVentasSamsonite + "\n");
		textAreaReporte.append("Razon : " + VentanaMaletas.cantidadUnidadesVendidasSamsonite);

	}

	private void reportePorCantidadOptima() {
		int superaron = 0;
		int noSuperaron = 0;
		int igualaron = 0;
		// Aviator
		if (VentanaMaletas.cantidadUnidadesVendidasAviator > VentanaMaletas.cantidadOptima)
			superaron += 1;
		else if (VentanaMaletas.cantidadUnidadesVendidasAviator == VentanaMaletas.cantidadOptima)
			igualaron += 1;
		else
			noSuperaron += 1;

		// Century
		if (VentanaMaletas.cantidadUnidadesVendidasCentury > VentanaMaletas.cantidadOptima)
			superaron += 1;
		else if (VentanaMaletas.cantidadUnidadesVendidasCentury == VentanaMaletas.cantidadOptima)
			igualaron += 1;
		else
			noSuperaron += 1;

		// Benneton
		if (VentanaMaletas.cantidadUnidadesVendidasBenneton > VentanaMaletas.cantidadOptima)
			superaron += 1;
		else if (VentanaMaletas.cantidadUnidadesVendidasBenneton == VentanaMaletas.cantidadOptima)
			igualaron += 1;
		else
			noSuperaron += 1;

		// Lucas
		if (VentanaMaletas.cantidadUnidadesVendidasLucas > VentanaMaletas.cantidadOptima)
			superaron += 1;
		else if (VentanaMaletas.cantidadUnidadesVendidasLucas == VentanaMaletas.cantidadOptima)
			igualaron += 1;
		else
			noSuperaron += 1;

		// Samsonite
		if (VentanaMaletas.cantidadUnidadesVendidasSamsonite > VentanaMaletas.cantidadOptima)
			superaron += 1;
		else if (VentanaMaletas.cantidadUnidadesVendidasSamsonite == VentanaMaletas.cantidadOptima)
			igualaron += 1;
		else
			noSuperaron += 1;

		textAreaReporte.setText("ESTADISTICA SOBRE LA CANTIDA OPTIMA\n");
		textAreaReporte.append("Cantidad de modelos que superaron la cantidad optima : " + superaron + "\n");
		textAreaReporte.append("Cantidad de modelos que no superaron la cantidad optima : " + noSuperaron + "\n");
		textAreaReporte.append("Cantidad de modelos que igualaron la cantidad optima : " + igualaron);

	}

	private void reportePorPrecio() {
		// Declaracion de variables
		double promedio = 0;
		double mayor = 0;
		double menor = 0;
		// if Aviator = Mayor : else menor
		if (VentanaMaletas.cantidadUnidadesVendidasAviator > VentanaMaletas.cantidadUnidadesVendidasCentury
				&& VentanaMaletas.cantidadUnidadesVendidasAviator > VentanaMaletas.cantidadUnidadesVendidasBenneton
				&& VentanaMaletas.cantidadUnidadesVendidasAviator > VentanaMaletas.cantidadUnidadesVendidasLucas
				&& VentanaMaletas.cantidadUnidadesVendidasAviator > VentanaMaletas.cantidadUnidadesVendidasSamsonite)
			mayor = VentanaMaletas.cantidadUnidadesVendidasAviator;

		if (VentanaMaletas.cantidadUnidadesVendidasAviator < VentanaMaletas.cantidadUnidadesVendidasCentury
				&& VentanaMaletas.cantidadUnidadesVendidasAviator < VentanaMaletas.cantidadUnidadesVendidasBenneton
				&& VentanaMaletas.cantidadUnidadesVendidasAviator < VentanaMaletas.cantidadUnidadesVendidasLucas
				&& VentanaMaletas.cantidadUnidadesVendidasAviator < VentanaMaletas.cantidadUnidadesVendidasSamsonite)
			menor = VentanaMaletas.cantidadUnidadesVendidasAviator;

		// Century Mayor
		if (VentanaMaletas.cantidadUnidadesVendidasCentury > VentanaMaletas.cantidadUnidadesVendidasAviator
				&& VentanaMaletas.cantidadUnidadesVendidasCentury > VentanaMaletas.cantidadUnidadesVendidasBenneton
				&& VentanaMaletas.cantidadUnidadesVendidasCentury > VentanaMaletas.cantidadUnidadesVendidasLucas
				&& VentanaMaletas.cantidadUnidadesVendidasCentury > VentanaMaletas.cantidadUnidadesVendidasSamsonite)
			mayor = VentanaMaletas.cantidadUnidadesVendidasCentury;

		if (VentanaMaletas.cantidadUnidadesVendidasCentury > VentanaMaletas.cantidadUnidadesVendidasAviator
				&& VentanaMaletas.cantidadUnidadesVendidasCentury > VentanaMaletas.cantidadUnidadesVendidasBenneton
				&& VentanaMaletas.cantidadUnidadesVendidasCentury > VentanaMaletas.cantidadUnidadesVendidasLucas
				&& VentanaMaletas.cantidadUnidadesVendidasCentury > VentanaMaletas.cantidadUnidadesVendidasSamsonite)
			menor = VentanaMaletas.cantidadUnidadesVendidasCentury;
		// Benneton Mayor
		if (VentanaMaletas.cantidadUnidadesVendidasBenneton > VentanaMaletas.cantidadUnidadesVendidasAviator
				&& VentanaMaletas.cantidadUnidadesVendidasBenneton > VentanaMaletas.cantidadUnidadesVendidasCentury
				&& VentanaMaletas.cantidadUnidadesVendidasBenneton > VentanaMaletas.cantidadUnidadesVendidasLucas
				&& VentanaMaletas.cantidadUnidadesVendidasBenneton > VentanaMaletas.cantidadUnidadesVendidasSamsonite)
			mayor = VentanaMaletas.cantidadUnidadesVendidasBenneton;
		if (VentanaMaletas.cantidadUnidadesVendidasBenneton > VentanaMaletas.cantidadUnidadesVendidasAviator
				&& VentanaMaletas.cantidadUnidadesVendidasBenneton > VentanaMaletas.cantidadUnidadesVendidasCentury
				&& VentanaMaletas.cantidadUnidadesVendidasBenneton > VentanaMaletas.cantidadUnidadesVendidasLucas
				&& VentanaMaletas.cantidadUnidadesVendidasBenneton > VentanaMaletas.cantidadUnidadesVendidasSamsonite)
			menor = VentanaMaletas.cantidadUnidadesVendidasBenneton;
		// Lucas Mayor
		if (VentanaMaletas.cantidadUnidadesVendidasLucas > VentanaMaletas.cantidadUnidadesVendidasAviator
				&& VentanaMaletas.cantidadUnidadesVendidasLucas > VentanaMaletas.cantidadUnidadesVendidasBenneton
				&& VentanaMaletas.cantidadUnidadesVendidasLucas > VentanaMaletas.cantidadUnidadesVendidasCentury
				&& VentanaMaletas.cantidadUnidadesVendidasLucas > VentanaMaletas.cantidadUnidadesVendidasSamsonite)
			mayor = VentanaMaletas.cantidadUnidadesVendidasLucas;
		if (VentanaMaletas.cantidadUnidadesVendidasLucas < VentanaMaletas.cantidadUnidadesVendidasAviator
				&& VentanaMaletas.cantidadUnidadesVendidasLucas < VentanaMaletas.cantidadUnidadesVendidasBenneton
				&& VentanaMaletas.cantidadUnidadesVendidasLucas < VentanaMaletas.cantidadUnidadesVendidasCentury
				&& VentanaMaletas.cantidadUnidadesVendidasLucas < VentanaMaletas.cantidadUnidadesVendidasSamsonite)
			menor = VentanaMaletas.cantidadUnidadesVendidasLucas;
		// Samsonite Mayor
		if (VentanaMaletas.cantidadUnidadesVendidasSamsonite > VentanaMaletas.cantidadUnidadesVendidasAviator
				&& VentanaMaletas.cantidadUnidadesVendidasSamsonite > VentanaMaletas.cantidadUnidadesVendidasBenneton
				&& VentanaMaletas.cantidadUnidadesVendidasSamsonite > VentanaMaletas.cantidadUnidadesVendidasLucas
				&& VentanaMaletas.cantidadUnidadesVendidasSamsonite > VentanaMaletas.cantidadUnidadesVendidasCentury)
			mayor = VentanaMaletas.cantidadUnidadesVendidasSamsonite;
		if (VentanaMaletas.cantidadUnidadesVendidasSamsonite < VentanaMaletas.cantidadUnidadesVendidasAviator
				&& VentanaMaletas.cantidadUnidadesVendidasSamsonite < VentanaMaletas.cantidadUnidadesVendidasBenneton
				&& VentanaMaletas.cantidadUnidadesVendidasSamsonite < VentanaMaletas.cantidadUnidadesVendidasLucas
				&& VentanaMaletas.cantidadUnidadesVendidasSamsonite < VentanaMaletas.cantidadUnidadesVendidasCentury)
			menor = VentanaMaletas.cantidadUnidadesVendidasSamsonite;

		promedio = (VentanaMaletas.cantidadUnidadesVendidasAviator + VentanaMaletas.cantidadUnidadesVendidasCentury
				+ VentanaMaletas.cantidadUnidadesVendidasBenneton + VentanaMaletas.cantidadUnidadesVendidasLucas
				+ VentanaMaletas.cantidadUnidadesVendidasSamsonite) / 5;

		textAreaReporte.setText("ESTADISTICA SOBRE EL PRECIO\n");
		textAreaReporte.append("Precio promedio : S/." + promedio + "\n");
		textAreaReporte.append("Precio mayor : S/." + mayor + "\n");
		textAreaReporte.append("Precio menor : S/." + menor);

	}

	public void reportePorModelos() {
		textAreaReporte.setText("VENTAS POR MODELO\n");
		textAreaReporte.append("Modelo				 		  : Aviator\n");
		textAreaReporte.append("Cantidad de Ventas  	      : " + VentanaMaletas.cantidadVentasAviator + "\n");
		textAreaReporte
				.append("Cantidad de Unidades Vendidas : " + VentanaMaletas.cantidadUnidadesVendidasAviator + "\n");
		textAreaReporte.append("Import total vendido 		  : " + VentanaMaletas.impTotalAviator + "\n");

		textAreaReporte.append("Modelo				 		  : Century\n");
		textAreaReporte.append("Cantidad de Ventas  	      : " + VentanaMaletas.cantidadVentasCentury + "\n");
		textAreaReporte
				.append("Cantidad de Unidades Vendidas : " + VentanaMaletas.cantidadUnidadesVendidasCentury + "\n");
		textAreaReporte.append("Import total vendido 		  : " + VentanaMaletas.impTotalCentury + "\n");

		textAreaReporte.append("Modelo				 		  : Benneton\n");
		textAreaReporte.append("Cantidad de Ventas  	      : " + VentanaMaletas.cantidadVentasBenneton + "\n");
		textAreaReporte
				.append("Cantidad de Unidades Vendidas : " + VentanaMaletas.cantidadUnidadesVendidasBenneton + "\n");
		textAreaReporte.append("Import total vendido 		  : " + VentanaMaletas.impTotalBenneton + "\n");

		textAreaReporte.append("Modelo				 		  : Lucas\n");
		textAreaReporte.append("Cantidad de Ventas  	      : " + VentanaMaletas.cantidadVentasLucas + "\n");
		textAreaReporte
				.append("Cantidad de Unidades Vendidas : " + VentanaMaletas.cantidadUnidadesVendidasLucas + "\n");
		textAreaReporte.append("Import total vendido 		  : " + VentanaMaletas.impTotalLucas + "\n");

		textAreaReporte.append("Modelo				 		  : Samsonite\n");
		textAreaReporte.append("Cantidad de Ventas  	      : " + VentanaMaletas.cantidadVentasSamsonite + "\n");
		textAreaReporte
				.append("Cantidad de Unidades Vendidas : " + VentanaMaletas.cantidadUnidadesVendidasSamsonite + "\n");
		textAreaReporte.append("Import total vendido 		  : " + VentanaMaletas.impTotalSamsonite);

	}

}
