

package com.byeon.s8.rpg;

public class Knight extends Character implements Act{ //implement라 오버라이딩 필요
											//오버라이딩 시 source에서 바로 확인 및 진행 가능!

	@Override
	public void attack() {
		System.out.println("칼 휘두르기");
	}

	@Override
	public void move() {
		System.out.println("걸어다니기");
	}

	

	
}


