

package com.byeon.s6.student;

public class StudentMain {

	public static void main(String[] args) {
		
		StudentDTOSecond ss = new StudentDTOSecond();
		StudentDTOThird st = new StudentDTOThird();
		
		
		ss.kor = 10;
		ss.eng = 20;
		ss.math = 30;
		ss.history = 30;
		
		st.kor = 20;
		st.eng = 50;
		st.math = 40;
		st.physics = 70;
		
		
		ss.setTotal();
		st.setTotal();
		
	}

}


