package miniproject3;

import miniproject3.Member;

public class Member implements Comparable<Member> {
	
	
	//Todo 일반 회원 클래스의 속성은 아이디, 이름, 등급(FAMILY) 세가지 입니다.
	protected int memberId;
	protected String memberName;
	protected String grade;
	
	public Member() {
		
	}
		
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
		
		//To-do 일반 멤버의 기본 등급을 FAMILY로 만들어 줍니다.
		grade="FAMILY";
	}
		
		
	// To-do 일반 회원 클래스의 각 속성에 getter/setter를 제공합니다.
	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
		
	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String showMemberInfo() {
		// To-do 회원 정보를 보여주는 showMemberInfo 메서드를 구현합니다.
		return getMemberName()+"회원 님의 회원 아이디는 "+getMemberId()+"이며, 등급은 "+getGrade()+"입니다.";
	}

	//To-do 회원을 이름 순으로 정렬하기 위해 Comparable 메서드를 구현합니다.
	@Override
	public int compareTo(Member member) {
		return this.getMemberName().compareTo(member.getMemberName());
	}

	
}
