

package com.byeon.s3.member;

public class MemberMain {

	public static void main(String[] args) {
		Member member = new Member();
		
		member.setAge(40000);
		
		System.out.println(member.getAge());
	
		member.setHeight(181.1);
		
		System.out.println(member.getHeight());

		member.setEmail("test@gmail.com");
		
		String email = member.getEmail();
		
		System.out.println(email);
	}

}


