package com.lyscharlie.test2.common.utils;

import java.util.Date;
import java.util.UUID;

import org.apache.commons.lang3.time.DateUtils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.lyscharlie.test2.biz.entity.UserDO;

public class JwtUtils {

	private static String secretKey = "secret123456";

	public static String getToken(UserDO user) {
		String token = JWT.create()
				.withJWTId(UUID.randomUUID().toString())
				.withSubject(user.getUserId().toString())
				.withIssuedAt(new Date())
				.withExpiresAt(DateUtils.addMinutes(new Date(), 5))
				.withClaim("userId", user.getUserId())
				.withClaim("userName", user.getUserName())
				.sign(Algorithm.HMAC256(secretKey));
		return token;
	}
}
