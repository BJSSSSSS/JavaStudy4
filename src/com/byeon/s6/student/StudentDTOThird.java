

package com.byeon.s6.student;

public class StudentDTOThird extends StudentDTO{
	
//	String name;
//	int num;
//	int kor;
//	int eng;
//	int math;
	
	int physics;

	@Override
	public int setTotal() {
		this.total = this.kor + this.eng + this.math + this.physics;
		System.out.println(this.total);
		return this.total;
	}
	
	
//	@Override //annotation(설명 + 행동)
//		public void setTotal() {
//			this.total = this.kor + this.eng + this.math + this.physics;
//			System.out.println(this.total);
//			
//		}
	
	
	
	
	
	
	
	
}


