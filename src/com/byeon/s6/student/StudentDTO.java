

package com.byeon.s6.student;

public abstract class StudentDTO {

	String name;
	int num;
	int kor;
	int eng;
	int math;
	int total;
	
	public abstract int setTotal(); // 선언해줄게 니네가 가져다써, 강제성을 띄는 문법
	
}


