package thisex;

public class PersonTest {

	public static void main(String[] args) {

		Person personNoName = new Person();
		personNoName.showInfo();
		
		
		Person personLee = new Person("이민호",20);
		personLee.showInfo();
		System.out.println(personLee);
		
		//this와 참조변수가 가리키는 곳은 같음
		Person p = personLee.getSelf();
		System.out.println(p);
		
	}

}
