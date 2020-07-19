package set;

public class MemberHashSetTest {

	public static void main(String[] args) {
		
		MemberHashSet manager = new MemberHashSet();
		
		Member memberLee = new Member(100,"Lee");
		Member memberKim = new Member(200,"Kim");
		Member memberPark = new Member(300,"Park");
		Member memberCho = new Member(300,"Cho");
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		manager.addMember(memberCho);
		
		manager.showAllMember();

	}

}
