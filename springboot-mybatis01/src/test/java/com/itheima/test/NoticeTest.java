package com.itheima.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itheima.mybatis.Application;
import com.itheima.mybatis.service.NoticeService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=Application.class)
public class NoticeTest {
	
	@Autowired
	private NoticeService service;
	
	@Test
	public void test(){
		System.out.println(service.findAll());
	}
}
