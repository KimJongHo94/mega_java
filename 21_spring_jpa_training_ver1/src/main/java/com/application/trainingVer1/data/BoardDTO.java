package com.application.trainingVer1.data;

import java.util.Date;


import lombok.Data;

@Data
public class BoardDTO {
	
	// Long 클래스 타입으로 생성 시 
	// 정수 타입일 경우 기본값 0으로 들어가는게 아닌
	// null로 데이터가 생성이 된다
	// 데이터 insert 할 시 이 부분 Check
	// 일반 타입 long 으로 타입 지정
	private long boardId;
	private String passwd;
	private String writer;
	private String subject;
	private String content;
	private long readCnt;	
	private Date enrollAt;
	
}
