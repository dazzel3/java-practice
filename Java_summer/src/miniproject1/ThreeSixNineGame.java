package miniproject1;

public class ThreeSixNineGame {

	public static void main(String[] args) {
		
		// TODO i가 1부터 100까지 반복되어야 합니다. // 숫자를 1 증가시킴
    	for (int i=1;i<=100;i++){ 
            int secondNumber = 0; // TODO 1의 자리 숫자를 나타냅니다.
            secondNumber = i % 10;
            
            int firstNumber = 0;  // TODO 10의 자리 숫자를 나타냅니다.
            firstNumber = i / 10;
            
            boolean is306090 = true; // TODO 숫자의 10의 자리수가 3,6,9에 해당 되는지를 확인해주세요
            boolean is369 = true;  
            
            
            
            if ((firstNumber % 3) == 0 && (firstNumber != 0)) {
            	is306090 = true;
            	
            	
            }
            else {
            	is306090 = false;
            }
            
            // TODO 숫자의 1의 자리수가 3,6,9에 해당 되는지를 확인해주세요
            
            if ((secondNumber % 3) == 0 && (secondNumber != 0) ) {
            	is369 = true;
            	
            }
            else {
            	is369 = false;
            }

            
            // TODO 숫자가 33, 36, 39, 63, 66, 69, 93, 96, 99에 해당되는 경우 '**'이 출력됩니다. System.out.println("**")
            // TODO 숫자에 3, 6, 9가 한번 포함되는 경우 '*'이 출력됩니다. System.out.println("*")
            // 숫자에 3, 6, 9가 들어가지 않을 경우 숫자가 출력됩니다.
            
            if (is369 && is306090) {
            	System.out.println("**");
            }
            else if (is369 || is306090) {
            	System.out.println("*");
            }
            else {
            	System.out.println(i);
            }
            
            
            
    	}
	}

}
