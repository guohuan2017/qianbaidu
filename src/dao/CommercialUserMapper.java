package dao;

import pojo.CommercialUser;

public interface CommercialUserMapper {
	 /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commercial_user
     *
     * @mbggenerated Mon Jul 31 10:44:36 CST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commercial_user
     *
     * @mbggenerated Mon Jul 31 10:44:36 CST 2017
     */
    int insert(CommercialUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commercial_user
     *
     * @mbggenerated Mon Jul 31 10:44:36 CST 2017
     */
    int insertSelective(CommercialUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commercial_user
     *
     * @mbggenerated Mon Jul 31 10:44:36 CST 2017
     */
    CommercialUser selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commercial_user
     *
     * @mbggenerated Mon Jul 31 10:44:36 CST 2017
     */
    int updateByPrimaryKeySelective(CommercialUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commercial_user
     *
     * @mbggenerated Mon Jul 31 10:44:36 CST 2017
     */
    int updateByPrimaryKey(CommercialUser record);

	CommercialUser selectBytelPassword(CommercialUser commercialUser);

	int updateStoreId(CommercialUser commercialUser);

}
