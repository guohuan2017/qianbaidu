package pojo;

import java.util.Date;

public class OrderList {

	private Integer id;
	private Integer user_id;
	private Integer address_id;
	private Integer store_id;
	private Integer deliver_id;
	private Integer order_id;
	private Double total_price;
	private Integer status;
	
	//使用注解转换格式的话 xml中可以不注册
  	//@DateTimeFormat(pattern = "yyyy-MM-dd")
  	private Date time;

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

	public Integer getAddress_id() {
		return address_id;
	}

	public void setAddress_id(Integer address_id) {
		this.address_id = address_id;
	}

	public Integer getStore_id() {
		return store_id;
	}

	public void setStore_id(Integer store_id) {
		this.store_id = store_id;
	}

	public Integer getDeliver_id() {
		return deliver_id;
	}

	public void setDeliver_id(Integer deliver_id) {
		this.deliver_id = deliver_id;
	}

	public Integer getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}

	public Double getTotal_price() {
		return total_price;
	}

	public void setTotal_price(Double total_price) {
		this.total_price = total_price;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address_id == null) ? 0 : address_id.hashCode());
		result = prime * result + ((deliver_id == null) ? 0 : deliver_id.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((order_id == null) ? 0 : order_id.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((store_id == null) ? 0 : store_id.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
		result = prime * result + ((total_price == null) ? 0 : total_price.hashCode());
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
		OrderList other = (OrderList) obj;
		if (address_id == null) {
			if (other.address_id != null)
				return false;
		} else if (!address_id.equals(other.address_id))
			return false;
		if (deliver_id == null) {
			if (other.deliver_id != null)
				return false;
		} else if (!deliver_id.equals(other.deliver_id))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (order_id == null) {
			if (other.order_id != null)
				return false;
		} else if (!order_id.equals(other.order_id))
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
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		if (total_price == null) {
			if (other.total_price != null)
				return false;
		} else if (!total_price.equals(other.total_price))
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
		return "OrderList [id=" + id + ", user_id=" + user_id + ", address_id=" + address_id + ", store_id=" + store_id
				+ ", deliver_id=" + deliver_id + ", order_id=" + order_id + ", total_price=" + total_price + ", status="
				+ status + ", time=" + time + "]";
	}

	
	public OrderList() {
	}
	public OrderList(Integer user_id, Integer address_id, Integer store_id, Integer deliver_id, Integer order_id,
			Double total_price, Integer status) {
		this.user_id = user_id;
		this.address_id = address_id;
		this.store_id = store_id;
		this.deliver_id = deliver_id;
		this.order_id = order_id;
		this.total_price = total_price;
		this.status = status;
	}
	public OrderList(Integer id, Integer user_id, Integer address_id, Integer store_id, Integer deliver_id,
			Integer order_id, Double total_price, Integer status) {
		this.id = id;
		this.user_id = user_id;
		this.address_id = address_id;
		this.store_id = store_id;
		this.deliver_id = deliver_id;
		this.order_id = order_id;
		this.total_price = total_price;
		this.status = status;
	}
	public OrderList(Integer user_id, Integer address_id, Integer store_id, Integer deliver_id, Integer order_id,
			Double total_price, Integer status, Date time) {
		this.user_id = user_id;
		this.address_id = address_id;
		this.store_id = store_id;
		this.deliver_id = deliver_id;
		this.order_id = order_id;
		this.total_price = total_price;
		this.status = status;
		this.time = time;
	}
	public OrderList(Integer id, Integer user_id, Integer address_id, Integer store_id, Integer deliver_id,
			Integer order_id, Double total_price, Integer status, Date time) {
		this.id = id;
		this.user_id = user_id;
		this.address_id = address_id;
		this.store_id = store_id;
		this.deliver_id = deliver_id;
		this.order_id = order_id;
		this.total_price = total_price;
		this.status = status;
		this.time = time;
	}
  	
  	
}
