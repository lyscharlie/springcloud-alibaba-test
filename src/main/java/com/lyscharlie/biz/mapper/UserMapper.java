package com.lyscharlie.biz.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyscharlie.biz.entity.User;

public interface UserMapper extends BaseMapper<User> {

	public Integer selectCountByRegisterReferId(Long registerReferId);

}
