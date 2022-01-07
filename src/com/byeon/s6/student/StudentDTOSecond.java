

package com.byeon.s6.student;

public class StudentDTOSecond extends StudentDTO{

//	String name;
//	int num;
//	int kor;
//	int eng;
//	int math;
	
//	public StudentDTOSecond() {
//		//super("iu");// 이게 생략되어 있는거임 부모의 생성자를 호출하는것! 여기서는 StudentDTO
//	}
	
	int history;
	
	public int setTotal() {
		//overriding
		this.total = this.kor + this.eng + this.math + this.history;
		System.out.println(this.total);
		
		return this.total;
	}
	
}


