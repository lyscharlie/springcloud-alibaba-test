package com.lyscharlie.test2.biz.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyscharlie.test2.biz.entity.UserDO;

public interface UserMapper extends BaseMapper<UserDO> {

	public Integer selectCountByRegisterReferId(Long registerReferId);

	public UserDO selectRandomUser();

}
