package Maletas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.ScrollPane;
import javax.swing.JScrollPane;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ListadoMaletas extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JScrollPane scrollPane_1;
	private TextArea txtAreaListado;
	private JButton btnCerrar;
	private JButton btnListar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListadoMaletas frame = new ListadoMaletas();
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
	public ListadoMaletas() {
		setTitle("Listado de maletas");
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setBounds(100, 100, 510, 419);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(10, 10, 474, 324);
			contentPane.add(scrollPane_1);
			{
				txtAreaListado = new TextArea();
				txtAreaListado.setEditable(false);
				scrollPane_1.setViewportView(txtAreaListado);
			}
		}
		{
			btnCerrar = new JButton("Cerrar");
			btnCerrar.setBounds(151, 345, 89, 23);
			contentPane.add(btnCerrar);
			btnCerrar.addActionListener(this);
		}
		{
			btnListar = new JButton("Listar");
			btnListar.addActionListener(this);
			btnListar.setBounds(250, 345, 89, 23);
			contentPane.add(btnListar);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.btnCerrar)
			actionPerformedBtnCerrar(e);
		if(e.getSource() == this.btnListar)
			actionPerformedBtnListar(e);
	}
	
	public void actionPerformedBtnCerrar(ActionEvent e) {
		this.setVisible(false);
	}
	
	public void actionPerformedBtnListar(ActionEvent e) {
		txtAreaListado.setText("LISTADO DE MALETAS\n\n");
		txtAreaListado.append("Modelo : "+VentanaMaletas.modelo0+"\n");
		txtAreaListado.append("Precio : "+VentanaMaletas.precio0+"\n");
		txtAreaListado.append("Profundidad : "+VentanaMaletas.fondo0+"\n");
		txtAreaListado.append("Ancho : "+VentanaMaletas.ancho0+"\n");
		txtAreaListado.append("Alto : "+VentanaMaletas.alto0+"\n\n");
		
		txtAreaListado.append("Modelo : "+VentanaMaletas.modelo1+"\n");
		txtAreaListado.append("Precio : "+VentanaMaletas.precio1+"\n");
		txtAreaListado.append("Profundidad : "+VentanaMaletas.fondo1+"\n");
		txtAreaListado.append("Ancho : "+VentanaMaletas.ancho1+"\n");
		txtAreaListado.append("Alto : "+VentanaMaletas.alto1+"\n\n");
		
		txtAreaListado.append("Modelo : "+VentanaMaletas.modelo2+"\n");
		txtAreaListado.append("Precio : "+VentanaMaletas.precio2+"\n");
		txtAreaListado.append("Profundidad : "+VentanaMaletas.fondo2+"\n");
		txtAreaListado.append("Ancho : "+VentanaMaletas.ancho2+"\n");
		txtAreaListado.append("Alto : "+VentanaMaletas.alto2+"\n\n");
		
		txtAreaListado.append("Modelo : "+VentanaMaletas.modelo3+"\n");
		txtAreaListado.append("Precio : "+VentanaMaletas.precio3+"\n");
		txtAreaListado.append("Profundidad : "+VentanaMaletas.fondo3+"\n");
		txtAreaListado.append("Ancho : "+VentanaMaletas.ancho3+"\n");
		txtAreaListado.append("Alto : "+VentanaMaletas.alto3+"\n\n");

		txtAreaListado.append("Modelo : "+VentanaMaletas.modelo4+"\n");
		txtAreaListado.append("Precio : "+VentanaMaletas.precio4+"\n");
		txtAreaListado.append("Profundidad : "+VentanaMaletas.fondo4+"\n");
		txtAreaListado.append("Ancho : "+VentanaMaletas.ancho4+"\n");
		txtAreaListado.append("Alto : "+VentanaMaletas.alto4);
	}
	
}
