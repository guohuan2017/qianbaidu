package dao;

import pojo.Deliver;

public interface DeliverMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliver
     *
     * @mbggenerated Tue Jul 18 15:34:39 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliver
     *
     * @mbggenerated Tue Jul 18 15:34:39 CST 2017
     */
    int insert(Deliver record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliver
     *
     * @mbggenerated Tue Jul 18 15:34:39 CST 2017
     */
    int insertSelective(Deliver record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliver
     *
     * @mbggenerated Tue Jul 18 15:34:39 CST 2017
     */
    Deliver selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliver
     *
     * @mbggenerated Tue Jul 18 15:34:39 CST 2017
     */
    int updateByPrimaryKeySelective(Deliver record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliver
     *
     * @mbggenerated Tue Jul 18 15:34:39 CST 2017
     */
    int updateByPrimaryKey(Deliver record);
}