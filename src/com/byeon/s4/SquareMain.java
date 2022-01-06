

package com.byeon.s4;

public class SquareMain {

	public static void main(String[] args) {// static은 다른 클래스에서 공통적으로 사용이 가능함(객체 생성을 안해도)

		int num = 10;
		
		//Square.SERO = 10; // static은 클래스명으로 접근한다 - stack, heap 영역보다 먼저 생성되기 때문
						  
		Square.info();
		
		Square sqaure = new Square();
		Square.info();
		
	}

}

