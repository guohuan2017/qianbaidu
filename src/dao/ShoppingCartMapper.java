package dao;

import pojo.ShoppingCart;

public interface ShoppingCartMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbggenerated Tue Jul 18 15:34:39 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbggenerated Tue Jul 18 15:34:39 CST 2017
     */
    int insert(ShoppingCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbggenerated Tue Jul 18 15:34:39 CST 2017
     */
    int insertSelective(ShoppingCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbggenerated Tue Jul 18 15:34:39 CST 2017
     */
    ShoppingCart selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbggenerated Tue Jul 18 15:34:39 CST 2017
     */
    int updateByPrimaryKeySelective(ShoppingCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbggenerated Tue Jul 18 15:34:39 CST 2017
     */
    int updateByPrimaryKey(ShoppingCart record);
}