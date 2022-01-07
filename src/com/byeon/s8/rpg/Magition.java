

package com.byeon.s8.rpg;

public class Magition extends Character implements Act{
	
	
	//마법사 is a 캐릭터
	//마법사 has a 캐릭터
	
	int mp;

	@Override
	public void attack() {
		this.spel();
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	private void spel() { // 이미 만들어진 메서드가 있었다면 인터페이스 사용시 불러내주기만 하면 된다
		System.out.println("파이어 볼");
	}
	
	
}


