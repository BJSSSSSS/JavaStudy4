

package com.byeon.s9.himart;

import com.byeon.s8.rpg.Character;

public class HimartMain {

	public static void main(String[] args) {
		
		//Tv, Computer, Phone 정보입력
		
		Computer computer = new Computer();
		Phone phone = new Phone();
		Tv tv = new Tv();
		
		// 이건 필요가 없나?
//		Electronics [] et = new Electronics[3];
//		et[0] = computer;
//		et[1] = phone;
//		et[2] = tv;
		
		computer.company = "LG";
		computer.brand = "Gram";
		computer.price = 150;
		computer.point = 3;
		computer.cpu = "i7-10700";
		
		phone.company = "Apple";
		phone.brand = "iphone 13 pro";
		phone.price = 200;
		phone.point = 6;
		phone.pixel = 480;
		
		tv.company = "samsung";
		tv.brand = "oled";
		tv.price = 300;
		tv.point = 10;
		tv.size = 55;
		
		Client iu = new Client();
		iu.money = 1000;
		iu.point = 0;
		
		iu.buy(tv);
		
	}

}





