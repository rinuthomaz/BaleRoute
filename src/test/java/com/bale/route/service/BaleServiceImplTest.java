package com.bale.route.service;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bale.route.Application;


/**
 * @fileName CheckInServiceImplTest.java
 * @author kmahagao
 * @Project dei
 * @Date Sep 27, 2016
 * @Sprint 6
 * @UserStory #1404:Operator submits singed inspection
 * @Theme CheckInServiceImplTest
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { Application.class })
@TestPropertySource(locations = "classpath:application-test.properties")
public class BaleServiceImplTest {

	

	@Test
	public void test() {
		String test = "test";
		Assert.assertEquals(test, "test");
	}

}
