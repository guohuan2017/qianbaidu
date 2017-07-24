package dao;

import java.util.List;

import pojo.Food;

public interface FoodMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbggenerated Tue Jul 18 15:34:39 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbggenerated Tue Jul 18 15:34:39 CST 2017
     */
    int insert(Food record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbggenerated Tue Jul 18 15:34:39 CST 2017
     */
    int insertSelective(Food record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbggenerated Tue Jul 18 15:34:39 CST 2017
     */
    Food selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbggenerated Tue Jul 18 15:34:39 CST 2017
     */
    int updateByPrimaryKeySelective(Food record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbggenerated Tue Jul 18 15:34:39 CST 2017
     */
    int updateByPrimaryKey(Food record);
    
    List<Food> selectByStoreId(Integer id);
}