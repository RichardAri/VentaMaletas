package Maletas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;

public class VentanaMaletas extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	// Datos minimos de la primera maleta
	public static String modelo0 = "Aviator";
	public static double precio0 = 124.9;
	public static double ancho0 = 63.5;
	public static double alto0 = 30.9;
	public static double fondo0 = 29.2;

	// Datos minimos del segundo maleta
	public static String modelo1 = "Century";
	public static double precio1 = 174.9;
	public static double ancho1 = 75.0;
	public static double alto1 = 28.5;
	public static double fondo1 = 30.0;

	// Datos minimos del tercer maleta
	public static String modelo2 = "Benneton";
	public static double precio2 = 159.9;
	public static double ancho2 = 65.2;
	public static double alto2 = 31.2;
	public static double fondo2 = 29.4;

	// Datos minimos del cuarto maleta
	public static String modelo3 = "Lucas";
	public static double precio3 = 99.9;
	public static double ancho3 = 45.0;
	public static double alto3 = 70.0;
	public static double fondo3 = 25.0;

	// Datos minimos del quinto maleta
	public static String modelo4 = "Samsonite";
	public static double precio4 = 84.9;
	public static double ancho4 = 50.2;
	public static double alto4 = 60.4;
	public static double fondo4 = 25.0;
	// Obsequios
	public static String tipoObsequio = "Lapicero";
	public static String obsequio1 = "USB";
	public static String obsequio2 = "Cuaderno";
	public static String obsequio3 = "Lapicero";
	public static int obsequioCantidad1 = 2;
	public static int obsequioCantidad2 = 3;
	public static int obsequioCantidad3 = 4;

	// Porcentajes de descuento
	public static double porcentaje1 = 7.5;
	public static double porcentaje2 = 10.0;
	public static double porcentaje3 = 12.5;
	public static double porcentaje4 = 15.0;
	
	
	
	//Cantidad Optima
	public static double cuotaDiaria = 30000; 
	public static int cantidadOptima = 10;
	
	//Variables de Reportes
	//Aviator
	public static int cantidadVentasAviator = 0;
	public static int cantidadUnidadesVendidasAviator = 0;
	public static double impTotalAviator = 0;
	
	//Century
	public static int cantidadVentasCentury = 0;
	public static int cantidadUnidadesVendidasCentury= 0;
	public static double impTotalCentury = 0;
	
	//Benneton
	public static int cantidadVentasBenneton= 0;
	public static int cantidadUnidadesVendidasBenneton= 0;
	public static double impTotalBenneton = 0;
	
	//Lucas
	public static int cantidadVentasLucas= 0;
	public static int cantidadUnidadesVendidasLucas= 0;
	public static double impTotalLucas = 0;
	
	//Samsonite
	public static int cantidadVentasSamsonite= 0;
	public static int cantidadUnidadesVendidasSamsonite= 0;
	public static double impTotalSamsonite = 0;
	

	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenu mnNewMenu_1;
	private JMenu mnNewMenu_2;
	private JMenu mnNewMenu_3;
	private JMenu mnNewMenu_4;
	private JMenuItem mntmSalir;
	private JMenuItem mntmConsultarMaleta;
	private JMenuItem mntmModificarMaleta;
	private JMenuItem mntmListarMaletas;
	private JMenuItem mntmGenerarReportes;
	private JMenuItem mntmConfigurarDescuentos;
	private JMenuItem mntmConfigurarCantidad;
	private JMenuItem mntmAcercaTienda;
	private JMenuItem mntmConfigurarObsequios;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaMaletas frame = new VentanaMaletas();
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
	public VentanaMaletas() {
		setTitle("Tienda 1.0");
		this.setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 796, 499);
		{
			menuBar = new JMenuBar();
			setJMenuBar(menuBar);
			{
				mnNewMenu = new JMenu("Archivo");
				menuBar.add(mnNewMenu);
				{
					mntmSalir = new JMenuItem("Salir");
					mnNewMenu.add(mntmSalir);
					mntmSalir.addActionListener(this);
				}
			}
			{
				mnNewMenu_1 = new JMenu("Mantenimiento");
				menuBar.add(mnNewMenu_1);
				{
					mntmConsultarMaleta = new JMenuItem("Consultar Maleta");
					mnNewMenu_1.add(mntmConsultarMaleta);
					mntmConsultarMaleta.addActionListener(this);
				}
				{
					mntmModificarMaleta = new JMenuItem("Modificar Maleta");
					mnNewMenu_1.add(mntmModificarMaleta);
					mntmModificarMaleta.addActionListener(this);
				}
				{
					mntmListarMaletas = new JMenuItem("Listar Maletas");
					mnNewMenu_1.add(mntmListarMaletas);
					mntmListarMaletas.addActionListener(this);
				}
			}
			{
				mnNewMenu_2 = new JMenu("Ventas");
				menuBar.add(mnNewMenu_2);
				{
					mntmGenerarReportes = new JMenuItem("Generar Reportes");
					mnNewMenu_2.add(mntmGenerarReportes);
					mntmGenerarReportes.addActionListener(this);
				}
			}
			{
				mnNewMenu_3 = new JMenu("Configuracion");
				menuBar.add(mnNewMenu_3);
				{
					mntmConfigurarObsequios = new JMenuItem("Configurar obsequio");
					mnNewMenu_3.add(mntmConfigurarObsequios);
					mntmConfigurarObsequios.addActionListener(this);
				}
				{
					mntmConfigurarDescuentos = new JMenuItem("Configurar descuentos");
					mnNewMenu_3.add(mntmConfigurarDescuentos);
					mntmConfigurarDescuentos.addActionListener(this);
				}
				{
					mntmConfigurarCantidad = new JMenuItem("Configurar cantidad optima");
					mnNewMenu_3.add(mntmConfigurarCantidad);
					mntmConfigurarCantidad.addActionListener(this);
				}
			}
			{
				mnNewMenu_4 = new JMenu("Ayuda");
				menuBar.add(mnNewMenu_4);
				{
					mntmAcercaTienda = new JMenuItem("Acerca de Tienda");
					mnNewMenu_4.add(mntmAcercaTienda);
					mntmAcercaTienda.addActionListener(this);
				}
			}
		}
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

	public void actionPerformed(ActionEvent e) {
		// Menu Archivo - Salir
		if (e.getSource() == mntmSalir) {
			System.exit(0);
		}

		// Menu Mantenimiento - Consultar Maleta
		if (e.getSource() == mntmConsultarMaleta) {
			ConsultarMaleta abrir = new ConsultarMaleta();
			abrir.setVisible(true);
		}

		// Menu Mantenimiento - Modificar Maleta
		if (e.getSource() == mntmModificarMaleta) {
			ModificarMaleta abrir = new ModificarMaleta();
			abrir.setVisible(true);
		}

		// Menu Mantenimiento - Listar Maletas
		if (e.getSource() == mntmListarMaletas) {
			ListadoMaletas abrir = new ListadoMaletas();
			abrir.setVisible(true);
		}

		// Menu Ventas - Generar Reportes
		if (e.getSource() == mntmGenerarReportes) {
			GenerarReportes abrir = new GenerarReportes();
			abrir.setVisible(true);
		}

		// Menu Configuracion - Configurar Descuentos
		if (e.getSource() == mntmConfigurarDescuentos) {
			ConfigurarDescuentos abrir = new ConfigurarDescuentos();
			abrir.setVisible(true);
		}

		// Menu Configuracion - Configurar Cantidad optima
		if (e.getSource() == mntmConfigurarCantidad) {
			ConfigurarCantidad abrir = new ConfigurarCantidad();
			abrir.setVisible(true);
		}

		// Menu Configuracion - Configurar Obsequio
		if (e.getSource() == mntmConfigurarObsequios) {
			ConfigurarObsequios abrir = new ConfigurarObsequios();
			abrir.setVisible(true);
		}

		// Menu Ayuda - Acerca Tienda
		if (e.getSource() == mntmAcercaTienda) {
			AcercaTienda abrir = new AcercaTienda();
			abrir.setVisible(true);
		}
		
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
