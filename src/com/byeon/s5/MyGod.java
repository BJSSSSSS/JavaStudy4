

package com.byeon.s5;

public class MyGod {
	
	private static MyGod myGod;
	
	//private MyGod() {}
	
	public static MyGod makeGod() {
		//SingleTon
		if(MyGod.myGod == null) {
			MyGod.myGod = new MyGod();
		}
		
		return MyGod.myGod;
		
	}
}


