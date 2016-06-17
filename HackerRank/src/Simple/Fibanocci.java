package Simple;

import java.math.BigInteger;
import java.util.*;

public class Fibanocci {

	
	public static void getNthNumber(long first, long second, int n){
		
		BigInteger nValue;
		BigInteger temp = null;
		BigInteger firstValue = BigInteger.valueOf(first);
		BigInteger secondValue = BigInteger.valueOf(second);
		int index;
		
		for(index =2; index < n; index++){
			
			temp = (secondValue.pow(2)).add(firstValue);
			firstValue = secondValue;
			secondValue = temp;
		}
		System.out.println(temp);	
	}
	
	
	public static BigInteger recursiveWay(BigInteger first, BigInteger second, int n){
		
		if(n==1)
			return first;
		if(n==2)
			return second;
		if(n==3)
			return (second.pow(2)).add(first);
		
		return (recursiveWay(first,second,n-1).pow(2)).add(recursiveWay(first,second,n-2));
	}
	
	public static void main(String args[]){
		
		long first;
		long second;
		
		BigInteger firstValue;
		BigInteger secondValue;
		
		int n;
		
		Scanner input = new Scanner(System.in);
		
		first = input.nextLong();
		second = input.nextLong();
		
		firstValue = BigInteger.valueOf(first);
		secondValue = BigInteger.valueOf(second);
		
		n = input.nextInt();
		
		
		System.out.println(recursiveWay(firstValue,secondValue,n));
		
	}
	
}
