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
		textAreaReporte.append("Modelo				 		  : Aviator\n");
		textAreaReporte.append("Cantidad de Ventas  	      : "+VentanaMaletas.cantidadVentasAviator+"\n");
		textAreaReporte.append("Cantidad de Unidades Vendidas : "+VentanaMaletas.cantidadUnidadesVendidasAviator+"\n");
		textAreaReporte.append("Import total vendido 		  : "+VentanaMaletas.impTotalAviator+"\n");
		
		textAreaReporte.append("Modelo				 		  : Century\n");
		textAreaReporte.append("Cantidad de Ventas  	      : " + VentanaMaletas.cantidadVentasCentury + "\n");
		textAreaReporte.append("Cantidad de Unidades Vendidas : " + VentanaMaletas.cantidadUnidadesVendidasCentury + "\n");
		textAreaReporte.append("Import total vendido 		  : " + VentanaMaletas.impTotalCentury + "\n");
		
		textAreaReporte.append("Modelo				 		  : Benneton\n");
		textAreaReporte.append("Cantidad de Ventas  	      : " + VentanaMaletas.cantidadVentasBenneton + "\n");
		textAreaReporte.append("Cantidad de Unidades Vendidas : " + VentanaMaletas.cantidadUnidadesVendidasBenneton + "\n");
		textAreaReporte.append("Import total vendido 		  : " + VentanaMaletas.impTotalBenneton + "\n");
		
		textAreaReporte.append("Modelo				 		  : Lucas\n");
		textAreaReporte.append("Cantidad de Ventas  	      : " + VentanaMaletas.cantidadVentasLucas + "\n");
		textAreaReporte.append("Cantidad de Unidades Vendidas : " + VentanaMaletas.cantidadUnidadesVendidasLucas + "\n");
		textAreaReporte.append("Import total vendido 		  : " + VentanaMaletas.impTotalLucas + "\n");
		
		textAreaReporte.append("Modelo				 		  : Samsonite\n");
		textAreaReporte.append("Cantidad de Ventas  	      : " + VentanaMaletas.cantidadVentasSamsonite + "\n");
		textAreaReporte.append("Cantidad de Unidades Vendidas : " + VentanaMaletas.cantidadUnidadesVendidasSamsonite + "\n");
		textAreaReporte.append("Import total vendido 		  : " + VentanaMaletas.impTotalSamsonite);
		
	}

	private void reportePorPrecio() {
		
		
	}

	private void reportePorCantidadOptima() {
		
		
	}

	public void reportePorModelos() {
		textAreaReporte.setText("VENTAS POR MODELO\n");
		textAreaReporte.append("Modelo				 		  : Aviator\n");
		textAreaReporte.append("Cantidad de Ventas  	      : "+VentanaMaletas.cantidadVentasAviator+"\n");
		textAreaReporte.append("Cantidad de Unidades Vendidas : "+VentanaMaletas.cantidadUnidadesVendidasAviator+"\n");
		textAreaReporte.append("Import total vendido 		  : "+VentanaMaletas.impTotalAviator+"\n");
		
		textAreaReporte.append("Modelo				 		  : Century\n");
		textAreaReporte.append("Cantidad de Ventas  	      : " + VentanaMaletas.cantidadVentasCentury + "\n");
		textAreaReporte.append("Cantidad de Unidades Vendidas : " + VentanaMaletas.cantidadUnidadesVendidasCentury + "\n");
		textAreaReporte.append("Import total vendido 		  : " + VentanaMaletas.impTotalCentury + "\n");
		
		textAreaReporte.append("Modelo				 		  : Benneton\n");
		textAreaReporte.append("Cantidad de Ventas  	      : " + VentanaMaletas.cantidadVentasBenneton + "\n");
		textAreaReporte.append("Cantidad de Unidades Vendidas : " + VentanaMaletas.cantidadUnidadesVendidasBenneton + "\n");
		textAreaReporte.append("Import total vendido 		  : " + VentanaMaletas.impTotalBenneton + "\n");
		
		textAreaReporte.append("Modelo				 		  : Lucas\n");
		textAreaReporte.append("Cantidad de Ventas  	      : " + VentanaMaletas.cantidadVentasLucas + "\n");
		textAreaReporte.append("Cantidad de Unidades Vendidas : " + VentanaMaletas.cantidadUnidadesVendidasLucas + "\n");
		textAreaReporte.append("Import total vendido 		  : " + VentanaMaletas.impTotalLucas + "\n");
		
		textAreaReporte.append("Modelo				 		  : Samsonite\n");
		textAreaReporte.append("Cantidad de Ventas  	      : " + VentanaMaletas.cantidadVentasSamsonite + "\n");
		textAreaReporte.append("Cantidad de Unidades Vendidas : " + VentanaMaletas.cantidadUnidadesVendidasSamsonite + "\n");
		textAreaReporte.append("Import total vendido 		  : " + VentanaMaletas.impTotalSamsonite);
		
	}


}
