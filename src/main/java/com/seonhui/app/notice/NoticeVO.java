package com.seonhui.app.notice;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity(name = "NOTICE")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class NoticeVO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long boardNum;
	@Column
	private String boardTitle;
	@Column
	private String boardWriter;
	@Column
	private String boardContents;
	@Column
	private Date createDate;
	//@Column
	private Long boardHit;
}
