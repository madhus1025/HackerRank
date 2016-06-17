package Simple;

import java.math.BigInteger;
import java.util.*;

public class ExtraLongFactorial {
	
	public static void main(String args[]){
		
		BigInteger factorial = BigInteger.valueOf(1);
		BigInteger temp =BigInteger.valueOf(1);
		
		int number;
		
		Scanner input = new Scanner(System.in);
		
		number = input.nextInt();
		factorial = BigInteger.valueOf(number);
		number--;
		
		while(number!=0){
			
			temp = BigInteger.valueOf(number);
			factorial = factorial.multiply(temp);
			number--;
		}
		System.out.println(factorial);
	}

}
