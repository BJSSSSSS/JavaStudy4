

package com.byeon.s5;

public class MyGodMain {

	public static void main(String[] args) {
		
		//SingleTon - 전체 프로그램에서 이 클래스의 객체는 딱 1개!
		
		MyGod myGod = MyGod.makeGod();
		System.out.println(myGod);
		
		MyGod myGod2 = MyGod.makeGod();
		System.out.println(myGod2);
		
		MyGod myGod3 = MyGod.makeGod();
		System.out.println(myGod3);
		System.out.println(MyGod.makeGod());
		
	}

}


