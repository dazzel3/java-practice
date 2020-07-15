package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
					IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
		//매개변수 생성자 - 객체가 있는 경우 
		Person person = new Person("James");
		System.out.println(person);
		
		
		//디폴트 생성자 - 객체가 없는 경우
		Class c1 = Class.forName("classex.Person");
		Person person1 = (Person)c1.newInstance();
		System.out.println(person1);
		
		//매개변수 생성자 - 객체가 없는 경우
		Class[] parameterTypes = {String.class};
		Constructor cons = c1.getConstructor(parameterTypes);
		
		Object[] initargs = {"김유신"};
		Person personLee = (Person)cons.newInstance(initargs);
		System.out.println(personLee);
	}

}
