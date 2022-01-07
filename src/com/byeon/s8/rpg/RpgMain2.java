

package com.byeon.s8.rpg;

public class RpgMain2 {

	public static void main(String[] args) {
		Knight k1 = new Knight();
		Magition m1 = new Magition();
		int num = 10;
		
		//m1 = (Magition)c1; //원래 Character은 부모라 형변환이 안되는데
						   //매지션타입으로 강제 형변환 하면 사용 가능하다
		
		
		
		m1.name = "간달프";
		m1.hp = 100;
		m1.mp = 50;
		
		//Magition type 은 Character type이다.
		Character c1 = m1;

		
		System.out.println(c1.name); //100.character.name
		System.out.println(c1.hp);
		//System.out.println(c1.mp);
		
		
		m1 = (Magition)c1;
		System.out.println(m1.name); //100.magition.name
		
	}

}



