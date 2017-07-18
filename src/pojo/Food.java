package pojo;

public class Food {

	private Integer id;
    private String foodname;
    private String foodinfo;
    private Double price;
    private Integer catelog_id;
    private Integer store_id;
    private String photo;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFoodname() {
		return foodname;
	}
	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}
	public String getFoodinfo() {
		return foodinfo;
	}
	public void setFoodinfo(String foodinfo) {
		this.foodinfo = foodinfo;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getCatelog_id() {
		return catelog_id;
	}
	public void setCatelog_id(Integer catelog_id) {
		this.catelog_id = catelog_id;
	}
	public Integer getStore_id() {
		return store_id;
	}
	public void setStore_id(Integer store_id) {
		this.store_id = store_id;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((catelog_id == null) ? 0 : catelog_id.hashCode());
		result = prime * result + ((foodinfo == null) ? 0 : foodinfo.hashCode());
		result = prime * result + ((foodname == null) ? 0 : foodname.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((photo == null) ? 0 : photo.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((store_id == null) ? 0 : store_id.hashCode());
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
		Food other = (Food) obj;
		if (catelog_id == null) {
			if (other.catelog_id != null)
				return false;
		} else if (!catelog_id.equals(other.catelog_id))
			return false;
		if (foodinfo == null) {
			if (other.foodinfo != null)
				return false;
		} else if (!foodinfo.equals(other.foodinfo))
			return false;
		if (foodname == null) {
			if (other.foodname != null)
				return false;
		} else if (!foodname.equals(other.foodname))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (photo == null) {
			if (other.photo != null)
				return false;
		} else if (!photo.equals(other.photo))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (store_id == null) {
			if (other.store_id != null)
				return false;
		} else if (!store_id.equals(other.store_id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Food [id=" + id + ", foodname=" + foodname + ", foodinfo=" + foodinfo + ", price=" + price
				+ ", catelog_id=" + catelog_id + ", store_id=" + store_id + ", photo=" + photo + "]";
	}
	public Food() {
	}
	public Food(String foodname, String foodinfo, Double price) {
		this.foodname = foodname;
		this.foodinfo = foodinfo;
		this.price = price;
	}
	public Food(Integer id, String foodname, String foodinfo, Double price) {
		this.id = id;
		this.foodname = foodname;
		this.foodinfo = foodinfo;
		this.price = price;
	}
	public Food(String foodname, String foodinfo, Double price, Integer store_id) {
		this.foodname = foodname;
		this.foodinfo = foodinfo;
		this.price = price;
		this.store_id = store_id;
	}
	public Food(Integer id, String foodname, String foodinfo, Double price, Integer store_id) {
		this.id = id;
		this.foodname = foodname;
		this.foodinfo = foodinfo;
		this.price = price;
		this.store_id = store_id;
	}
	public Food(String foodname, String foodinfo, Double price, Integer catelog_id, Integer store_id) {
		this.foodname = foodname;
		this.foodinfo = foodinfo;
		this.price = price;
		this.catelog_id = catelog_id;
		this.store_id = store_id;
	}
	public Food(Integer id, String foodname, String foodinfo, Double price, Integer catelog_id, Integer store_id) {
		this.id = id;
		this.foodname = foodname;
		this.foodinfo = foodinfo;
		this.price = price;
		this.catelog_id = catelog_id;
		this.store_id = store_id;
	}
	public Food(String foodname, String foodinfo, Double price, Integer store_id, String photo) {
		this.foodname = foodname;
		this.foodinfo = foodinfo;
		this.price = price;
		this.store_id = store_id;
		this.photo = photo;
	}
	public Food(Integer id, String foodname, String foodinfo, Double price, Integer store_id, String photo) {
		this.id = id;
		this.foodname = foodname;
		this.foodinfo = foodinfo;
		this.price = price;
		this.store_id = store_id;
		this.photo = photo;
	}
	public Food(String foodname, String foodinfo, Double price, Integer catelog_id, Integer store_id, String photo) {
		this.foodname = foodname;
		this.foodinfo = foodinfo;
		this.price = price;
		this.catelog_id = catelog_id;
		this.store_id = store_id;
		this.photo = photo;
	}
	public Food(Integer id, String foodname, String foodinfo, Double price, Integer catelog_id, Integer store_id,
			String photo) {
		this.id = id;
		this.foodname = foodname;
		this.foodinfo = foodinfo;
		this.price = price;
		this.catelog_id = catelog_id;
		this.store_id = store_id;
		this.photo = photo;
	}
    
    
}
