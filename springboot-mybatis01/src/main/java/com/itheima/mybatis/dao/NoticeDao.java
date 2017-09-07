package com.itheima.mybatis.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itheima.mybatis.entity.Notice;

@Repository
public interface NoticeDao extends JpaRepository<Notice, Long>{
	
	
}
