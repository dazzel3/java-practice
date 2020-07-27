package miniproject3;

import miniproject3.Member;
import java.util.Iterator;
import java.util.TreeSet;



public class SortedManager {
	
	//To-do 회원을 정렬하여 관리하기 위해 TreeSet을 활용합니다.
	private TreeSet<Member> treeSet;
	
	public SortedManager() {
		treeSet = new TreeSet<Member>();
	}
	
	//To-do 회원을 추가하는 메서드를 만듭니다.
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	//To-do 회원을 삭제하는 메서드를 만듭니다.
	public boolean removeMember(int memberId) {
		
		Iterator<Member> ir = treeSet.iterator();
		while (ir.hasNext()) {
			Member member = ir.next();
			if (member.getMemberId() == memberId) {
				treeSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId+"번호가 존재하지 않습니다.");
		return false;
	}
	
	//To-do 모든 회원을 보여주는 메서드를 구현 합니다.
	public void showAllMember() {
		for (Member member: treeSet) {
			System.out.println(member.getMemberName());
		}
		System.out.println();
	}
		
	//To-do 회원정보를 가져오는 getter를 제공합니다.
	public TreeSet<Member> getMemberList() {
		return treeSet;
	}
}
