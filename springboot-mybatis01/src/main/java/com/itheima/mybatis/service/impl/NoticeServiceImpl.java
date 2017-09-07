package com.itheima.mybatis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itheima.mybatis.dao.NoticeDao;
import com.itheima.mybatis.entity.Notice;
import com.itheima.mybatis.service.NoticeService;

@Service
@Transactional
public class NoticeServiceImpl implements NoticeService {

	@Autowired
	private NoticeDao dao;
	@Override
	public List<Notice> findAll() {
		
		return dao.findAll();
	}

}
