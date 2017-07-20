package pojo;

import java.io.UnsupportedEncodingException;

import util.MD5;

public class Deliver {

	private Integer id;
    private String username;
    private String password;
    private String phone;
    private String info;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		try {
			this.password = new MD5().jiami(password);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((info == null) ? 0 : info.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deliver other = (Deliver) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (info == null) {
			if (other.info != null)
				return false;
		} else if (!info.equals(other.info))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Deliver [id=" + id + ", username=" + username + ", password=" + password + ", phone=" + phone
				+ ", info=" + info + "]";
	}
	public Deliver() {
	}
	public Deliver(String phone, String password) {
		this.phone = phone;
		this.password = password;
	}
	public Deliver(String username, String password, String phone) {
		this.username = username;
		this.password = password;
		this.phone = phone;
	}
	public Deliver(String username, String password, String phone, String info) {
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.info = info;
	}
	public Deliver(Integer id, String password, String phone) {
		this.id = id;
		this.password = password;
		this.phone = phone;
	}
	public Deliver(Integer id, String username, String password, String phone) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.phone = phone;
	}
	public Deliver(Integer id, String username, String password, String phone, String info) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.info = info;
	}
    
    
}
