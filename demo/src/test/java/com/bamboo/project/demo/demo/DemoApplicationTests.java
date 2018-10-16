package com.bamboo.project.demo.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
// import org.springframework.cloud.task.*;
// import org.springframework.cloud.task.configuration.*;

@RunWith(SpringRunner.class)
@SpringBootTest
//@TestPropertySource(properties = {"spring.cloud.task.closecontext_enabled=false"})
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println("hello");
	}

}
