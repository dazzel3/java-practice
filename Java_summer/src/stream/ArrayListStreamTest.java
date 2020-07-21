package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Tomas");
		list.add("Edward");
		list.add("Jack");
		
		Stream<String> stream = list.stream();
		stream.forEach(s -> System.out.print(s+ " "));
		System.out.println();
		
		list.stream().sorted().forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		list.stream().map(s -> s.length()).forEach(n -> System.out.print(n + " "));
	
		
	}

}
