package pojo;

import java.util.List;
import java.io.UnsupportedEncodingException;

import util.MD5;

public class Store {
	
	private Integer id;
    private String storename;
    private String tel;
    private String password;
    private String address;
    private String info;
    private String type;
    private String subtype;
    private String photo;
    private String photoout;
    private String photoin;
    
    private List<CommericalUser> commericalUsers;
    
    
	
	public List<CommericalUser> getCommericalUsers() {
		return commericalUsers;
	}
	public void setCommericalUsers(List<CommericalUser> commericalUsers) {
		this.commericalUsers = commericalUsers;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStorename() {
		return storename;
	}
	public void setStorename(String storename) {
		this.storename = storename;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSubtype() {
		return subtype;
	}
	public void setSubtype(String subtype) {
		this.subtype = subtype;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getPhotoout() {
		return photoout;
	}
	public void setPhotoout(String photoout) {
		this.photoout = photoout;
	}
	public String getPhotoin() {
		return photoin;
	}
	public void setPhotoin(String photoin) {
		this.photoin = photoin;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((info == null) ? 0 : info.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((photo == null) ? 0 : photo.hashCode());
		result = prime * result + ((photoin == null) ? 0 : photoin.hashCode());
		result = prime * result + ((photoout == null) ? 0 : photoout.hashCode());
		result = prime * result + ((storename == null) ? 0 : storename.hashCode());
		result = prime * result + ((subtype == null) ? 0 : subtype.hashCode());
		result = prime * result + ((tel == null) ? 0 : tel.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Store other = (Store) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
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
		if (photo == null) {
			if (other.photo != null)
				return false;
		} else if (!photo.equals(other.photo))
			return false;
		if (photoin == null) {
			if (other.photoin != null)
				return false;
		} else if (!photoin.equals(other.photoin))
			return false;
		if (photoout == null) {
			if (other.photoout != null)
				return false;
		} else if (!photoout.equals(other.photoout))
			return false;
		if (storename == null) {
			if (other.storename != null)
				return false;
		} else if (!storename.equals(other.storename))
			return false;
		if (subtype == null) {
			if (other.subtype != null)
				return false;
		} else if (!subtype.equals(other.subtype))
			return false;
		if (tel == null) {
			if (other.tel != null)
				return false;
		} else if (!tel.equals(other.tel))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Store [id=" + id + ", storename=" + storename + ", tel=" + tel + ", password=" + password + ", address="
				+ address + ", info=" + info + ", type=" + type + ", subtype=" + subtype + ", photo=" + photo
				+ ", photoout=" + photoout + ", photoin=" + photoin + "]";
	}
	//构造方法
	public Store() {
	}
	public Store(String tel, String password) {
		this.tel = tel;
		this.password = password;
	}
	public Store(String storename, String tel, String password) {
		this.storename = storename;
		this.tel = tel;
		this.password = password;
	}
	public Store(String storename, String tel, String password, String address) {
		this.storename = storename;
		this.tel = tel;
		this.password = password;
		this.address = address;
	}
	public Store(String storename, String tel, String password, String address, String info) {
		this.storename = storename;
		this.tel = tel;
		this.password = password;
		this.address = address;
		this.info = info;
	}
	public Store(String storename, String tel, String password, String address, String info, String type) {
		this.storename = storename;
		this.tel = tel;
		this.password = password;
		this.address = address;
		this.info = info;
		this.type = type;
	}
	public Store(String storename, String tel, String password, String address, String info, String type,
			String photo) {
		this.storename = storename;
		this.tel = tel;
		this.password = password;
		this.address = address;
		this.info = info;
		this.type = type;
		this.photo = photo;
	}
	public Store(String storename, String tel, String password, String address, String info, String type,
			String subtype, String photo) {
		this.storename = storename;
		this.tel = tel;
		this.password = password;
		this.address = address;
		this.info = info;
		this.type = type;
		this.subtype = subtype;
		this.photo = photo;
	}
	public Store(Integer id, String tel, String password) {
		this.id = id;
		this.tel = tel;
		this.password = password;
	}
	public Store(Integer id, String storename, String tel, String password) {
		this.id = id;
		this.storename = storename;
		this.tel = tel;
		this.password = password;
	}
	public Store(Integer id, String storename, String tel, String password, String address) {
		this.id = id;
		this.storename = storename;
		this.tel = tel;
		this.password = password;
		this.address = address;
	}
	public Store(Integer id, String storename, String tel, String password, String address, String info) {
		this.id = id;
		this.storename = storename;
		this.tel = tel;
		this.password = password;
		this.address = address;
		this.info = info;
	}
	public Store(Integer id, String storename, String tel, String password, String address, String info, String type) {
		this.id = id;
		this.storename = storename;
		this.tel = tel;
		this.password = password;
		this.address = address;
		this.info = info;
		this.type = type;
	}
	public Store(Integer id, String storename, String tel, String password, String address, String info, String type,
			String photo) {
		this.id = id;
		this.storename = storename;
		this.tel = tel;
		this.password = password;
		this.address = address;
		this.info = info;
		this.type = type;
		this.photo = photo;
	}
	public Store(Integer id, String storename, String tel, String password, String address, String info, String type,
			String subtype, String photo) {
		this.id = id;
		this.storename = storename;
		this.tel = tel;
		this.password = password;
		this.address = address;
		this.info = info;
		this.type = type;
		this.subtype = subtype;
		this.photo = photo;
	}
	
	
	public Store(Integer id, String storename, String tel, String password, String address, String info, String type,
			String subtype, String photo, String photoout, String photoin) {
		this.id = id;
		this.storename = storename;
		this.tel = tel;
		this.password = password;
		this.address = address;
		this.info = info;
		this.type = type;
		this.subtype = subtype;
		this.photo = photo;
		this.photoout = photoout;
		this.photoin = photoin;
	}
    
    
}
