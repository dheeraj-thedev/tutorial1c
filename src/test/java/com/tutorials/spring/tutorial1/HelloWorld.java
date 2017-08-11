package com.tutorials.spring.tutorial1;

import com.tutorials.spring.tutorial1.services.DummyService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloWorld {

	@Autowired
	private DummyService dummyService;

	@Test
	public void test(){
		Assert.assertEquals(dummyService.test(), "OK");
	}
}
