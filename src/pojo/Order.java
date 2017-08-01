package pojo;

public class Order {
	private Integer id;
	private Integer user_id;
	private Integer food_id;
	private Integer number;
	private Integer store_id;
	private String orderid;
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
	public Integer getFood_id() {
		return food_id;
	}
	public void setFood_id(Integer food_id) {
		this.food_id = food_id;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public Integer getStore_id() {
		return store_id;
	}
	public void setStore_id(Integer store_id) {
		this.store_id = store_id;
	}
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((food_id == null) ? 0 : food_id.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		result = prime * result + ((orderid == null) ? 0 : orderid.hashCode());
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
		Order other = (Order) obj;
		if (food_id == null) {
			if (other.food_id != null)
				return false;
		} else if (!food_id.equals(other.food_id))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		if (orderid == null) {
			if (other.orderid != null)
				return false;
		} else if (!orderid.equals(other.orderid))
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
		return "Order [id=" + id + ", user_id=" + user_id + ", food_id=" + food_id + ", number=" + number
				+ ", store_id=" + store_id + ", orderid=" + orderid + "]";
	}
	public Order() {
	}
	public Order(Integer user_id, Integer food_id, Integer number, Integer store_id, String orderid) {
		this.user_id = user_id;
		this.food_id = food_id;
		this.number = number;
		this.store_id = store_id;
		this.orderid = orderid;
	}
	public Order(Integer id, Integer user_id, Integer food_id, Integer number, Integer store_id, String orderid) {
		this.id = id;
		this.user_id = user_id;
		this.food_id = food_id;
		this.number = number;
		this.store_id = store_id;
		this.orderid = orderid;
	}
	
	
}
