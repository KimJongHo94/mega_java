package com.application.aop.ex;

import org.springframework.stereotype.Component;

// 테스트 클래스
@Component
public class Manager {
	
	public void work() {
		System.out.println("매니저의 일을 한다.");
	}
	
	public void getWorkingTime() {
		try {
			Thread.sleep(700);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void getInfo(String title, int salary) {
		
	}
	
	
}
