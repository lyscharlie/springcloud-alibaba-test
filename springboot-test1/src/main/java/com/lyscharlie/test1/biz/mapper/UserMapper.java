package com.lyscharlie.test1.biz.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyscharlie.test1.biz.entity.UserDO;

public interface UserMapper extends BaseMapper<UserDO> {

	public Integer selectCountByRegisterReferId(Long registerReferId);

	public UserDO selectRandomUser();

}
