package hashmap;

import hashmap.Member;
import hashmap.MemberHashMap;

public class MemberHashMapTest {

	public static void main(String[] args) {
		
		MemberHashMap manager = new MemberHashMap();
		
		Member memberLee = new Member(200,"Lee");
		Member memberKim = new Member(100,"Kim");
		Member memberPark = new Member(300,"Park");
		Member memberPark2 = new Member(300,"Park2");
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		
		manager.showAllMember();
		
		manager.removeMember(200);
		manager.showAllMember();
	}

}
