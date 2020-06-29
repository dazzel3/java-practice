package array;

public class CharArrayTest {

	public static void main(String[] args) {
		
		/* char[] cArr = new char[26];
		
		for (int i=0, alphabet = 'A'; i<cArr.length; i++,alphabet++) {
			cArr[i] = (char)alphabet;
			
			System.out.println(cArr[i]);
			
		}*/
		
		char[] cArr = new char[26];
		
		char alphabet = 'A';
		
		for (int i=0; i <cArr.length; i++) {
			cArr[i] = alphabet++;
			
			System.out.println(cArr[i]+","+(int)cArr[i]);
		}
		
		
	}

}
