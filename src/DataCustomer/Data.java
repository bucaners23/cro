package DataCustomer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.cj.xdevapi.PreparableStatement;

public class Data {

	Connection cx;

	public Data() {
	}

	public Connection conectar() {
		try {
			cx = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "");
			System.out.println("CONEXION EXITOSA");
		} catch (SQLException e) {
			System.out.println("FALLO DE CONEXION");
			e.printStackTrace();
		}
		return cx;
	}

	public boolean insertar(customerclass a) {
		PreparedStatement ps;
		try {
			ps = conectar().prepareStatement("INSERT INTO datos values(null,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, a.getCompany_name());
			ps.setString(2, a.getContact_name());
			ps.setString(3, a.getContact_title());
			ps.setString(4, a.getAddress());
			ps.setString(5, a.getCity());
			ps.setString(6, a.getRegion());
			ps.setString(7, a.getPostal_code());
			ps.setString(8, a.getCountry());
			ps.setString(9, a.getPhone());
			ps.setString(10, a.getFax());
			ps.execute();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public ArrayList<customerclass> selectCustomerclasses() {
		ArrayList<customerclass> listaCustomer = null;
		try {
			listaCustomer = new ArrayList<customerclass>();
			PreparedStatement ps = conectar().prepareStatement("SELECT * FROM datos");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				customerclass x = new customerclass();
				x.setCustomerid(rs.getInt(1));
				x.setCompany_name(rs.getString(2));
				x.setContact_name(rs.getString(3));
				x.setContact_title(rs.getString(4));
				x.setAddress(rs.getString(5));
				x.setCity(rs.getString(6));
				x.setRegion(rs.getString(7));
				x.setPostal_code(rs.getString(8));
				x.setCountry(rs.getString(9));
				x.setPhone(rs.getString(10));
				x.setFax(rs.getString(11));
				listaCustomer.add(x);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaCustomer;

	}

	public boolean eliminar(int customerid) {
		PreparedStatement ps;
		try {
			ps = conectar().prepareStatement("DELETE FROM datos WHERE customerID");
			ps.setInt(1, customerid);
			ps.execute();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

	}

	public boolean actualizar(customerclass a) {
		PreparedStatement ps;
		try {
			ps = conectar().prepareStatement("UPDATE datos SET customerID=?,company_name=?,contact_name=?,contact_title=?,address=?,city=?,region=?,postal_code=?,country=?,phone=?,fax=? WHERE customerID=?");
			ps.setString(1, a.getCompany_name());
			ps.setString(2, a.getContact_name());
			ps.setString(3, a.getContact_title());
			ps.setString(4, a.getAddress());
			ps.setString(5, a.getCity());
			ps.setString(6, a.getRegion());
			ps.setString(7, a.getPostal_code());
			ps.setString(8, a.getCountry());
			ps.setString(9, a.getPhone());
			ps.setString(10, a.getFax());
			ps.setInt(11,a.getCustomerid());
			ps.execute();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
}
