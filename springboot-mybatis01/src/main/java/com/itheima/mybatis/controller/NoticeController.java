package com.itheima.mybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itheima.mybatis.entity.Notice;
import com.itheima.mybatis.service.NoticeService;

@RestController
public class NoticeController {

	@Autowired
	private NoticeService service;
	@GetMapping("/findAll")
	public List<Notice> findAll(){
		try {
			return service.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
