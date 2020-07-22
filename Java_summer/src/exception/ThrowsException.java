package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	
	public Class loadClass (String fileName, String className) throws ClassNotFoundException, FileNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}

	public static void main(String[] args) {
		
		ThrowsException test = new ThrowsException();
		try {
			test.loadClass("b.txt","java.lang.string");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
			//디폴트 예외 - 최상위 예외: 사용시 가장 마지막에 위치해야함
		}
	}

}
