package com.duming;

import com.duming.service.UserInfoService;
import com.duming.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConsumerServerApplicationTests {
	@Autowired
	UserInfoService userInfoService;
	
	@Test
	void contextLoads() {
		userInfoService.getUser();
	}

}
