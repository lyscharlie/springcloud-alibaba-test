package com.lyscharlie.test2.biz.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestServiceTest {

	@Autowired
	private TestService testService;

	@Test
	public void test1() {
		Assert.assertTrue(this.testService.test1());
	}

	@Test
	public void test2() {
		this.testService.test2();
	}
}