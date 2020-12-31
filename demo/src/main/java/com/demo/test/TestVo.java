package com.demo.test;

import org.springframework.data.redis.core.RedisHash;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TestVo {
	private String id;
	private String token;
	private String loginDate;

}
