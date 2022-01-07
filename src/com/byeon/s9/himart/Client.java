

package com.byeon.s9.himart;

public class Client {

	int money;
	int point;
	
	public void buy(Electronics et) {
		
		this.money = this.money - et.price;
		this.point = this.point + et.point;
		
		System.out.println("최종금액 : " + this.money);
		System.out.println("최종포인트 : " + this.point);
		
	}
	
}


