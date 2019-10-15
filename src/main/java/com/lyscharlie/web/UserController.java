package com.lyscharlie.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.lyscharlie.biz.entity.User;
import com.lyscharlie.biz.service.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("user")
@Slf4j
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("userList.php")
	public List<User> userList() {
		List<User> list = this.userService.list(Wrappers.<User>lambdaQuery().eq(User::getIsDelete, 0));
		return list;
	}

}
