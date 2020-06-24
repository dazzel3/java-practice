package base;

import base.Person;

public class PersonTest {

	public static void main(String[] args) {
		
		Person person = new Person();
		person.age = 40;
		person.name = "James";
		person.isMarried = true;
		person.numberOfChild = 3;
		
		person.showInfo();
		
	}

}
