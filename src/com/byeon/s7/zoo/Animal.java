

package com.byeon.s7.zoo;

public abstract class Animal {

	String name;
	int age;
	
	
	public void eat() {
		System.out.println("찹찹찹");
	}
	
	public abstract void sleep() ; // 클래스안에 추상메서드가 있으면 클래스는 무조건 abstract!
								   // 동물들 각각 자는 행동이 달라서 추상메서드로 선언함!
	
}


