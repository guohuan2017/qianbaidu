package pojo;

import java.util.Date;

public class Comment {
	private Integer id;
    private String content;
    private Integer food_id;
    private Integer user_id;
    private Integer order_id;
    private Integer stars;
    
    //使用注解转换格式的话 xml中可以不注册
  	//@DateTimeFormat(pattern = "yyyy-MM-dd")
  	private Date time;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getFood_id() {
		return food_id;
	}

	public void setFood_id(Integer food_id) {
		this.food_id = food_id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public Integer getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}

	public Integer getStars() {
		return stars;
	}

	public void setStars(Integer stars) {
		this.stars = stars;
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
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + ((food_id == null) ? 0 : food_id.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((order_id == null) ? 0 : order_id.hashCode());
		result = prime * result + ((stars == null) ? 0 : stars.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
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
		Comment other = (Comment) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
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
		if (order_id == null) {
			if (other.order_id != null)
				return false;
		} else if (!order_id.equals(other.order_id))
			return false;
		if (stars == null) {
			if (other.stars != null)
				return false;
		} else if (!stars.equals(other.stars))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
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
		return "Comment [id=" + id + ", content=" + content + ", food_id=" + food_id + ", user_id=" + user_id
				+ ", order_id=" + order_id + ", stars=" + stars + ", time=" + time + "]";
	}

	public Comment() {
	}

	public Comment(String content, Integer food_id, Integer user_id, Integer order_id) {
		this.content = content;
		this.food_id = food_id;
		this.user_id = user_id;
		this.order_id = order_id;
	}

	public Comment(String content, Integer food_id, Integer user_id, Integer order_id, Integer stars) {
		this.content = content;
		this.food_id = food_id;
		this.user_id = user_id;
		this.order_id = order_id;
		this.stars = stars;
	}

	public Comment(String content, Integer food_id, Integer user_id, Integer order_id, Date time) {
		this.content = content;
		this.food_id = food_id;
		this.user_id = user_id;
		this.order_id = order_id;
		this.time = time;
	}

	public Comment(String content, Integer food_id, Integer user_id, Integer order_id, Integer stars, Date time) {
		this.content = content;
		this.food_id = food_id;
		this.user_id = user_id;
		this.order_id = order_id;
		this.stars = stars;
		this.time = time;
	}

	public Comment(Integer id, String content, Integer food_id, Integer user_id, Integer order_id) {
		this.id = id;
		this.content = content;
		this.food_id = food_id;
		this.user_id = user_id;
		this.order_id = order_id;
	}

	public Comment(Integer id, String content, Integer food_id, Integer user_id, Integer order_id, Integer stars) {
		this.id = id;
		this.content = content;
		this.food_id = food_id;
		this.user_id = user_id;
		this.order_id = order_id;
		this.stars = stars;
	}

	public Comment(Integer id, String content, Integer food_id, Integer user_id, Integer order_id, Date time) {
		this.id = id;
		this.content = content;
		this.food_id = food_id;
		this.user_id = user_id;
		this.order_id = order_id;
		this.time = time;
	}

	public Comment(Integer id, String content, Integer food_id, Integer user_id, Integer order_id, Integer stars,
			Date time) {
		this.id = id;
		this.content = content;
		this.food_id = food_id;
		this.user_id = user_id;
		this.order_id = order_id;
		this.stars = stars;
		this.time = time;
	}
  	
  	
}
