package treeset;

import treeset.Member;
import treeset.MemberTreeSet;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		
		MemberTreeSet manager = new MemberTreeSet();
		
		Member memberLee = new Member(200,"Lee");
		Member memberKim = new Member(100,"Kim");
		Member memberPark = new Member(300,"Park");
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		
		manager.showAllMember();

	}

}
