package set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		set.add("이지은");
		set.add("김사랑");
		set.add("김사랑");
		set.add("최윤아");
		
		System.out.println(set); //순서대로 출력되지 않음, 중복 허용하지 않음
		
		Iterator<String> ir = set.iterator();
		
		while (ir.hasNext()) {
			String str = ir.next();
			System.out.println(str); //순서대로 출력되나 중복을 허용하지는 않음
		}
	}

}
