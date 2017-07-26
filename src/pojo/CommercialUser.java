package pojo;

import java.util.List;
import org.hibernate.validator.constraints.NotEmpty;

public class CommercialUser {

	private String id;
	@NotEmpty
	private String name;
	@NotEmpty
	private String password;
	private int storeid;
	private String power;
	@NotEmpty
	private String tel;

	private Store store;

	private List<Address> addresses;

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	/*在set方法时加密 SpringMVC自动封装时用无参构造+set方法*/
	public void setPassword(String password) {
		this.password = password;
	}

	public int getStoreid() {
		return storeid;
	}

	public void setStoreid(int storeid) {
		this.storeid = storeid;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}
	
	

}
