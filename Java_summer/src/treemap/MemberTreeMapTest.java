package treemap;

import treemap.Member;
import treemap.MemberTreeMap;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		
		MemberTreeMap manager = new MemberTreeMap();
		
		Member memberLee = new Member(200,"Lee");
		Member memberKim = new Member(100,"Kim");
		Member memberPark = new Member(300,"Park");
		Member memberPark2 = new Member(400,"Park2");
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		manager.addMember(memberPark2);
		
		manager.showAllMember();
		
		manager.removeMember(200);
		manager.showAllMember();
	}

}
