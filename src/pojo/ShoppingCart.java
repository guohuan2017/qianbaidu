package pojo;

public class ShoppingCart {

	private Integer id;
	private Integer user_id;
	private Integer store_id;
	private Integer food_id;
	private Integer food_number;
	private Integer status;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public Integer getStore_id() {
		return store_id;
	}
	public void setStore_id(Integer store_id) {
		this.store_id = store_id;
	}
	public Integer getFood_id() {
		return food_id;
	}
	public void setFood_id(Integer food_id) {
		this.food_id = food_id;
	}
	public Integer getFood_number() {
		return food_number;
	}
	public void setFood_number(Integer food_number) {
		this.food_number = food_number;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((food_id == null) ? 0 : food_id.hashCode());
		result = prime * result + ((food_number == null) ? 0 : food_number.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((store_id == null) ? 0 : store_id.hashCode());
		result = prime * result + ((user_id == null) ? 0 : user_id.hashCode());
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
		ShoppingCart other = (ShoppingCart) obj;
		if (food_id == null) {
			if (other.food_id != null)
				return false;
		} else if (!food_id.equals(other.food_id))
			return false;
		if (food_number == null) {
			if (other.food_number != null)
				return false;
		} else if (!food_number.equals(other.food_number))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (store_id == null) {
			if (other.store_id != null)
				return false;
		} else if (!store_id.equals(other.store_id))
			return false;
		if (user_id == null) {
			if (other.user_id != null)
				return false;
		} else if (!user_id.equals(other.user_id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ShoppingCart [id=" + id + ", user_id=" + user_id + ", store_id=" + store_id + ", food_id=" + food_id
				+ ", food_number=" + food_number + ", status=" + status + "]";
	}
	public ShoppingCart() {
	}
	public ShoppingCart(Integer user_id, Integer store_id, Integer food_id, Integer food_number, Integer status) {
		this.user_id = user_id;
		this.store_id = store_id;
		this.food_id = food_id;
		this.food_number = food_number;
		this.status = status;
	}
	public ShoppingCart(Integer id, Integer user_id, Integer store_id, Integer food_id, Integer food_number,
			Integer status) {
		this.id = id;
		this.user_id = user_id;
		this.store_id = store_id;
		this.food_id = food_id;
		this.food_number = food_number;
		this.status = status;
	}
    
	
}
