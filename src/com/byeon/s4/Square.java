

package com.byeon.s4;

public class Square {

	public static final int SERO = 1;
	final int GARO_SIZE; // final을 붙이면 변수가 상수로 바뀐다!(초기화를 하면 값을 한번만 넣을 수 있다!)
	
	
	public Square() {
		this.GARO_SIZE = 5; // final의 변수는 다 대문자인데 이때 스네이크 표기법으로 단어를 나눈다
	}
	
	
//	static {
//		Square.SERO = 3;
//	}
	
	
	public static void info() {
		
		System.out.println("Class Method");
//		System.out.println(this.garo);
		System.out.println(Square.SERO);
//		this.info2();

	}
	
	public void info2() {
		//this.garo = 6; //final이 붙으면 값 변경이 안됨
		final int NUM = 1;
//		NUM = 3; //에러 발생!
		System.out.println("Instance Method");
		System.out.println(this.GARO_SIZE);
		System.out.println(Square.SERO);
		Square.info();
	}
	
	
	
	
	
}


