package pojo;

import java.io.UnsupportedEncodingException;

import sun.management.snmp.jvminstr.JvmRTInputArgsTableMetaImpl;
import util.MD5;

public class User {
	
    private Integer id;
    private String username;
    private String password;
    private String phone;
    private int level;
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
	
	//在set方法时加密 SpringMVC自动封装时用无参构造+set方法
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
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + level;
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
		User other = (User) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (level != other.level)
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
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", phone=" + phone + ", level="
				+ level + "]";
	}
	
	
	public User() {
	}
	public User(String phone, String password) {
		this.phone = phone;
		this.password = password;
	}
	public User(String username, String password, String phone) {
		this.username = username;
		this.password = password;
		this.phone = phone;
	}
	public User(Integer id, String username, String password, String phone) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.phone = phone;
	}
	public User(String username, String password, String phone, int level) {
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.level = level;
	}
	public User(Integer id, String username, String password, String phone, int level) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.level = level;
	}
	
    
    




}