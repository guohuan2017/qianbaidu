package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.CommercialUserMapper;
import pojo.CommercialUser;

@Service
public class CommercialUserService {

	@Autowired
	private CommercialUserMapper dao;
	public CommercialUserMapper getDao() {
		return dao;
	}
	public void setDao(CommercialUserMapper dao) {
		this.dao = dao;
	}

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commercial_user.id
     *
     * @mbggenerated Mon Jul 31 10:44:36 CST 2017
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commercial_user.username
     *
     * @mbggenerated Mon Jul 31 10:44:36 CST 2017
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commercial_user.password
     *
     * @mbggenerated Mon Jul 31 10:44:36 CST 2017
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commercial_user.stroreid
     *
     * @mbggenerated Mon Jul 31 10:44:36 CST 2017
     */
    private Integer stroreid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commercial_user.power
     *
     * @mbggenerated Mon Jul 31 10:44:36 CST 2017
     */
    private String power;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commercial_user.phone
     *
     * @mbggenerated Mon Jul 31 10:44:36 CST 2017
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commercial_user.addressid
     *
     * @mbggenerated Mon Jul 31 10:44:36 CST 2017
     */
    private Integer addressid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commercial_user.id
     *
     * @return the value of commercial_user.id
     *
     * @mbggenerated Mon Jul 31 10:44:36 CST 2017
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commercial_user.id
     *
     * @param id the value for commercial_user.id
     *
     * @mbggenerated Mon Jul 31 10:44:36 CST 2017
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commercial_user.username
     *
     * @return the value of commercial_user.username
     *
     * @mbggenerated Mon Jul 31 10:44:36 CST 2017
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commercial_user.username
     *
     * @param username the value for commercial_user.username
     *
     * @mbggenerated Mon Jul 31 10:44:36 CST 2017
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commercial_user.password
     *
     * @return the value of commercial_user.password
     *
     * @mbggenerated Mon Jul 31 10:44:36 CST 2017
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commercial_user.password
     *
     * @param password the value for commercial_user.password
     *
     * @mbggenerated Mon Jul 31 10:44:36 CST 2017
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commercial_user.stroreid
     *
     * @return the value of commercial_user.stroreid
     *
     * @mbggenerated Mon Jul 31 10:44:36 CST 2017
     */
    public Integer getStroreid() {
        return stroreid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commercial_user.stroreid
     *
     * @param stroreid the value for commercial_user.stroreid
     *
     * @mbggenerated Mon Jul 31 10:44:36 CST 2017
     */
    public void setStroreid(Integer stroreid) {
        this.stroreid = stroreid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commercial_user.power
     *
     * @return the value of commercial_user.power
     *
     * @mbggenerated Mon Jul 31 10:44:36 CST 2017
     */
    public String getPower() {
        return power;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commercial_user.power
     *
     * @param power the value for commercial_user.power
     *
     * @mbggenerated Mon Jul 31 10:44:36 CST 2017
     */
    public void setPower(String power) {
        this.power = power == null ? null : power.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commercial_user.phone
     *
     * @return the value of commercial_user.phone
     *
     * @mbggenerated Mon Jul 31 10:44:36 CST 2017
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commercial_user.phone
     *
     * @param phone the value for commercial_user.phone
     *
     * @mbggenerated Mon Jul 31 10:44:36 CST 2017
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commercial_user.addressid
     *
     * @return the value of commercial_user.addressid
     *
     * @mbggenerated Mon Jul 31 10:44:36 CST 2017
     */
    public Integer getAddressid() {
        return addressid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commercial_user.addressid
     *
     * @param addressid the value for commercial_user.addressid
     *
     * @mbggenerated Mon Jul 31 10:44:36 CST 2017
     */
    public void setAddressid(Integer addressid) {
        this.addressid = addressid;
    }
	
	public int register(CommercialUser commercialUser) {
		return dao.insertSelective(commercialUser);
	}

	public CommercialUser login(CommercialUser commercialUser) {
		return dao.selectBytelPassword(commercialUser);
	}

	public int updateStoreId(CommercialUser commercialUser) {
		return dao.updateStoreId(commercialUser);
		
	}
	
}
