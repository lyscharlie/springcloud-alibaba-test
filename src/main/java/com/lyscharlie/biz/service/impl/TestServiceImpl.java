package com.lyscharlie.biz.service.impl;

import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.lyscharlie.biz.service.TestService;
import com.lyscharlie.common.annotation.RetryMethod;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class TestServiceImpl implements TestService {

	@Value("${test.list}")
	private List<String> list;

	@RetryMethod(times = 3)
	@Override
	public boolean test1() {
		boolean value = RandomUtils.nextBoolean();
		log.info("run value is {}", value);
		return value;
	}

	@Override
	public void test2() {
		if (CollectionUtils.isNotEmpty(list)) {
			for (String s : list) {
				log.info(s);
			}
		}
	}

}
