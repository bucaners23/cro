package DataCustomer;

public class customerclass {
	int customerid;
	String company_name;
	String contact_name;
	String contact_title;
	String address;
	String city;
	String region;
	String postal_code;
	String country;
	String phone;
	String fax;
	Data da=new Data();
	public customerclass() {
		
	}
public boolean insertar() {
		if(da.insertar(this)) {
			return true;
		}else {
		return false;
	}
}
public boolean actualizar() {
	if(da.actualizar(this)) {
		return true;
	}else {
	return false;
}
}
	public customerclass(int customerid, String company_name, String contact_name, String contact_title, String address,
			String city, String region, String postal_code, String country, String phone, String fax) {
		super();
		this.customerid = customerid;
		this.company_name = company_name;
		this.contact_name = contact_name;
		this.contact_title = contact_title;
		this.address = address;
		this.city = city;
		this.region = region;
		this.postal_code = postal_code;
		this.country = country;
		this.phone = phone;
		this.fax = fax;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getContact_name() {
		return contact_name;
	}
	public void setContact_name(String contact_name) {
		this.contact_name = contact_name;
	}
	public String getContact_title() {
		return contact_title;
	}
	public void setContact_title(String contact_title) {
		this.contact_title = contact_title;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getPostal_code() {
		return postal_code;
	}
	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	
	
	
	


}
