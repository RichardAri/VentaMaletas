package Maletas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JToolBar;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JButton;

public class AcercaTienda extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblTienda;
	private JLabel lblAutores;
	private JLabel lblSebastian;
	private JLabel lblJose;
	private JLabel lblCristian;
	private JLabel lblAlfred;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AcercaTienda frame = new AcercaTienda();
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
	public AcercaTienda() {
		setTitle("Acerca de Tienda");
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setBounds(100, 100, 462, 359);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblTienda = new JLabel("Tienda 1.0");
			lblTienda.setFont(new Font("Dialog", Font.BOLD, 24));
			lblTienda.setBounds(144, 11, 118, 71);
			contentPane.add(lblTienda);
		}
		{
			lblAutores = new JLabel("Autores");
			lblAutores.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblAutores.setBounds(176, 110, 71, 14);
			contentPane.add(lblAutores);
		}
		{
			lblSebastian = new JLabel("SEBASTIAN");
			lblSebastian.setFont(new Font("Gadugi", Font.PLAIN, 14));
			lblSebastian.setBounds(176, 150, 125, 14);
			contentPane.add(lblSebastian);
		}
		{
			lblJose = new JLabel("JOSE ELIAS LAGOS SILVA");
			lblJose.setFont(new Font("Gadugi", Font.PLAIN, 14));
			lblJose.setBounds(144, 175, 169, 14);
			contentPane.add(lblJose);
		}
		{
			lblCristian = new JLabel("RICHARD CRISTIAN ARI PARI");
			lblCristian.setFont(new Font("Gadugi", Font.PLAIN, 14));
			lblCristian.setBounds(134, 200, 196, 14);
			contentPane.add(lblCristian);
		}
		{
			lblAlfred = new JLabel("JOSE ALFREDO ESPINAL");
			lblAlfred.setFont(new Font("Gadugi", Font.PLAIN, 14));
			lblAlfred.setBounds(144, 225, 169, 14);
			contentPane.add(lblAlfred);
		}
		{
			btnCerrar = new JButton("Cerrar");
			btnCerrar.setBounds(166, 287, 89, 23);
			contentPane.add(btnCerrar);
			btnCerrar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (e.getSource() == btnCerrar) {
						setVisible(false);
					}
				}
			});
			
			
			
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(this.btnCerrar.equals(e.getSource()))
			actionPerformedBtnCerrar(e);
		
	}
	public void actionPerformedBtnCerrar(ActionEvent e) {
		this.setVisible(false);
	}
}