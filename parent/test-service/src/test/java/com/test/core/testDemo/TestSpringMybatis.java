package com.test.core.testDemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.dubbo.container.Main;
import com.test.core.bean.TestBook;
import com.test.core.dao.TestBookDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-context.xml"})
public class TestSpringMybatis {
	
	@Autowired
	TestBookDao testBookDao;
	@Test
	public void testFind(){
		TestBook findById = testBookDao.findById("1000");
		TestSpringMybatis.main(new String []{"222","333"});
		System.out.println(findById.toString());
	}
	
	public static void main(String[] args) {
		int i = 0;
		System.out.println(11);
	}
}
