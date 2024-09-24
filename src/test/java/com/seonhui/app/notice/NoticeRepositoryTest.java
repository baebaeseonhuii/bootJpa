package com.seonhui.app.notice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class NoticeRepositoryTest {
	
	@Autowired
	private NoticeRepository noticeRepository;

	@Test
	void test() {
		List<NoticeVO> ar = noticeRepository.findAll();
		log.info("List: {}", ar);
		assertNotEquals(0, ar.size());
	}

}
