package dao;

import pojo.Catelog;

public interface CatelogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table catelog
     *
     * @mbggenerated Tue Jul 18 15:34:39 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table catelog
     *
     * @mbggenerated Tue Jul 18 15:34:39 CST 2017
     */
    int insert(Catelog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table catelog
     *
     * @mbggenerated Tue Jul 18 15:34:39 CST 2017
     */
    int insertSelective(Catelog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table catelog
     *
     * @mbggenerated Tue Jul 18 15:34:39 CST 2017
     */
    Catelog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table catelog
     *
     * @mbggenerated Tue Jul 18 15:34:39 CST 2017
     */
    int updateByPrimaryKeySelective(Catelog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table catelog
     *
     * @mbggenerated Tue Jul 18 15:34:39 CST 2017
     */
    int updateByPrimaryKey(Catelog record);
}