package com.seonhui.app.notice;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoticeRepository extends JpaRepository<NoticeVO, Long>{
	//SELECT * FROM NOTICE
	
	public List<NoticeVO> findAll();
	
	
	
}
