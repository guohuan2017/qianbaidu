package dao;

import pojo.CommercialUser;

public interface CommercialUserMapper {

	int insertSelective(CommercialUser commercialUser);

	CommercialUser selectBytelPassword(CommercialUser commercialUser);

}
