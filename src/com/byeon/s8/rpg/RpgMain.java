

package com.byeon.s8.rpg;

public class RpgMain {

	public static void main(String[] args) {
		
		Knight k1 = new Knight();
		Magition m1 = new Magition();
		Archer a1 = new Archer();
		
		Character [] ch = new Character[3]; // 이처럼 여러개의 관계없는 애들을 관계를 만들어줘서
											// 데이터를 운반하게 해줄때 사용한다!
		ch[0] = k1;
		ch[1] = m1;
		ch[2] = a1;
		
		
		
	}

}



