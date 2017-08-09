package com.test.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.core.bean.TestBook;
import com.test.core.dao.TestBookDao;

@Service("testBookService")
public class TestBookServiceImpl implements TestBookService{

	@Autowired
	TestBookDao testBookDao;
	
	public TestBook findById(String id) {
		return testBookDao.findById(id);
	}

}
