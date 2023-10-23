package DataCustomer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import CRUD.Dtaos;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Customer {

	private JFrame frmCustomer;
	private JTextField txtComN;
	private JTextField txtConN;
	private JTextField txtConT;
	private JTextField txtAdd;
	private JTextField txtReg;
	private JTextField txtPosC;
	private JTextField txtCou;
	private JTextField txtPho;
	private JTextField txtCit;
	private JTextField txtFox;
	private JTable tblD;
	public DefaultTableModel m = new DefaultTableModel();
	customerclass x = null;
	int fila = 0, id = 0;
	ArrayList<customerclass> lista;
	private JButton btnAgr;
	private JButton btnAct;
	private JLabel txtId;

	public static void main(String[] args) {
		Customer x = new Customer();
		x.frmCustomer.setVisible(true);

	}

	public void actualizarTabla() {
		Data da = new Data();
		while (m.getRowCount() > 0) {
			m.removeRow(0);
		}
		lista = da.selectCustomerclasses();
		for (customerclass d : lista) {
			Object o[] = new Object[11];
			o[0] = d.getCustomerid();
			o[1] = d.getCompany_name();
			o[2] = d.getContact_name();
			o[3] = d.getContact_title();
			o[4] = d.getAddress();
			o[5] = d.getCity();
			o[6] = d.getRegion();
			o[7] = d.getPostal_code();
			o[8] = d.getCountry();
			o[9] = d.getPhone();
			o[10] = d.getFax();
			m.addRow(o);
		}
		tblD.setModel(m);

	}

	public Customer() {
		initialize();
	}

	private void initialize() {
		frmCustomer = new JFrame();
		frmCustomer.setTitle("Customer");
		frmCustomer.setBounds(100, 100, 1102, 672);
		frmCustomer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCustomer.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("CustomerID");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 27, 129, 19);
		frmCustomer.getContentPane().add(lblNewLabel);

		JLabel lblCompanyName = new JLabel("COMPANY NAME");
		lblCompanyName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCompanyName.setBounds(10, 56, 140, 19);
		frmCustomer.getContentPane().add(lblCompanyName);

		txtComN = new JTextField();
		txtComN.setBounds(160, 57, 211, 20);
		frmCustomer.getContentPane().add(txtComN);
		txtComN.setColumns(10);

		JLabel lblContactName = new JLabel("CONTACT NAME");
		lblContactName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblContactName.setBounds(10, 86, 140, 19);
		frmCustomer.getContentPane().add(lblContactName);

		txtConN = new JTextField();
		txtConN.setColumns(10);
		txtConN.setBounds(160, 87, 211, 20);
		frmCustomer.getContentPane().add(txtConN);

		JLabel lblContactTittle = new JLabel("CONTACT TITTLE");
		lblContactTittle.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblContactTittle.setBounds(10, 116, 140, 19);
		frmCustomer.getContentPane().add(lblContactTittle);

		txtConT = new JTextField();
		txtConT.setColumns(10);
		txtConT.setBounds(160, 117, 211, 20);
		frmCustomer.getContentPane().add(txtConT);

		JLabel lblAddress = new JLabel("ADDRESS");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAddress.setBounds(10, 146, 140, 19);
		frmCustomer.getContentPane().add(lblAddress);

		txtAdd = new JTextField();
		txtAdd.setColumns(10);
		txtAdd.setBounds(160, 147, 211, 20);
		frmCustomer.getContentPane().add(txtAdd);

		JLabel lblRegion = new JLabel("REGION");
		lblRegion.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRegion.setBounds(381, 56, 140, 19);
		frmCustomer.getContentPane().add(lblRegion);

		txtReg = new JTextField();
		txtReg.setColumns(10);
		txtReg.setBounds(531, 57, 211, 20);
		frmCustomer.getContentPane().add(txtReg);

		JLabel lblPostalCode = new JLabel("POSTAL CODE");
		lblPostalCode.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPostalCode.setBounds(381, 84, 140, 19);
		frmCustomer.getContentPane().add(lblPostalCode);

		txtPosC = new JTextField();
		txtPosC.setColumns(10);
		txtPosC.setBounds(531, 85, 211, 20);
		frmCustomer.getContentPane().add(txtPosC);

		JLabel lblCountry = new JLabel("COUNTRY");
		lblCountry.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCountry.setBounds(381, 116, 140, 19);
		frmCustomer.getContentPane().add(lblCountry);

		txtCou = new JTextField();
		txtCou.setColumns(10);
		txtCou.setBounds(531, 117, 211, 20);
		frmCustomer.getContentPane().add(txtCou);

		JLabel lblPhone = new JLabel("PHONE");
		lblPhone.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPhone.setBounds(381, 146, 140, 19);
		frmCustomer.getContentPane().add(lblPhone);

		txtPho = new JTextField();
		txtPho.setColumns(10);
		txtPho.setBounds(531, 147, 211, 20);
		frmCustomer.getContentPane().add(txtPho);

		JLabel lblCompanyName_8 = new JLabel("CITY");
		lblCompanyName_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCompanyName_8.setBounds(10, 176, 140, 19);
		frmCustomer.getContentPane().add(lblCompanyName_8);

		txtCit = new JTextField();
		txtCit.setColumns(10);
		txtCit.setBounds(160, 177, 211, 20);
		frmCustomer.getContentPane().add(txtCit);

		JLabel lblCompanyName_8_1 = new JLabel("FAX");
		lblCompanyName_8_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCompanyName_8_1.setBounds(381, 174, 140, 19);
		frmCustomer.getContentPane().add(lblCompanyName_8_1);

		txtFox = new JTextField();
		txtFox.setColumns(10);
		txtFox.setBounds(531, 175, 211, 20);
		frmCustomer.getContentPane().add(txtFox);

		

		btnAgr = new JButton("Agregar");
		btnAgr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					customerclass x = new customerclass();
					x.setCompany_name(txtComN.getText());
					x.setContact_name(txtConN.getText());
					x.setContact_title(txtConT.getText());
					x.setAddress(txtAdd.getText());
					x.setCity(txtCit.getText());
					x.setRegion(txtReg.getText());
					x.setPostal_code(txtPosC.getText());
					x.setCountry(txtCou.getText());
					x.setPhone(txtPho.getText());
					x.setFax(txtFox.getText());
					if (x.insertar()) {
						JOptionPane.showMessageDialog(null, "correcto");
						actualizarTabla();
					} else {
						JOptionPane.showMessageDialog(null, "Error 404 xd xd");
					}
					lista.add(x);
					actualizarTabla();
				} catch (Exception e2) {
				}
			}
		});
		btnAgr.setBounds(778, 56, 89, 23);
		frmCustomer.getContentPane().add(btnAgr);
		
		btnAct = new JButton("Actualizar");
		btnAct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					x.setCompany_name(txtComN.getText());
					x.setContact_name(txtConN.getText());
					x.setContact_title(txtConT.getText());
					x.setAddress(txtAdd.getText());
					x.setCity(txtCit.getText());
					x.setRegion(txtReg.getText());
					x.setPostal_code(txtPosC.getText());
					x.setCountry(txtCou.getText());
					x.setPhone(txtPho.getText());
					x.setFax(txtFox.getText());
					if (x.actualizar()) {
						JOptionPane.showMessageDialog(null, "insertado");
						actualizarTabla();
					} else {
						JOptionPane.showMessageDialog(null, "Error 404 xd xd");
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Error 404 xd xd");

				}
				
			}
		});
		btnAct.setBounds(778, 116, 89, 23);
		frmCustomer.getContentPane().add(btnAct);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 206, 1066, 401);
		frmCustomer.getContentPane().add(scrollPane);

		tblD = new JTable();
		tblD.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				fila=tblD.getSelectedRow();
				x=lista.get(fila);
				txtId.setText(""+x.getCustomerid());
				txtComN.setText(""+x.getCompany_name());
				txtConN.setText(""+x.getContact_name());
				txtConT.setText(""+x.getContact_title());
				txtAdd.setText(""+x.getAddress());
				txtCit.setText(""+x.getCity());
				txtReg.setText(""+x.getRegion());
				txtPosC.setText(""+x.getPostal_code());
				txtCou.setText(""+x.getCountry());
				txtPho.setText(""+x.getPhone());
				txtFox.setText(""+x.getFax());
			}
		});
		m.addColumn("Costumerid");
		m.addColumn("Company name");
		m.addColumn("Contact name");
		m.addColumn("Contact titlle");
		m.addColumn("Address");
		m.addColumn("City");
		m.addColumn("Region");
		m.addColumn("Postal code");
		m.addColumn("Country");
		m.addColumn("Phone");
		m.addColumn("Fax");
		tblD.setModel(m);
		scrollPane.setViewportView(tblD);
		
		txtId = new JLabel("Id");
		txtId.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtId.setBounds(156, 27, 129, 19);
		frmCustomer.getContentPane().add(txtId);
	}
	
}
