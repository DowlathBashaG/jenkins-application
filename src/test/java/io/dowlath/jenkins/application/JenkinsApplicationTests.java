package io.dowlath.jenkins.application;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JenkinsApplicationTests {
	public static Logger logger = LoggerFactory.getLogger(JenkinsApplicationTests.class);
	@Test
	public contextLoads() {
		logger.info("Test case executing...");
		logger.info("Test case executing second log statement...");
		assertEquals(true,true);
	}

}
