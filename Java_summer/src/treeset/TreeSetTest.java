package treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("°¡");
		treeSet.add("ÇÏ");
		treeSet.add("´Ù");
		
		for(String str:treeSet) {
			System.out.println(str);
		}
	}

}
