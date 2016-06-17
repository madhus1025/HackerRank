package Simple;

import java.util.Scanner;

public class SherlockHolmes {

	public static int getFives(int number){
		
		int index = number/3;
		int index1=0;
		int count = number/3;
		
		while(index >= 1){
		
			if((number-(index*3))%5 == 0)
				return count;
			else{
				index-=1;
				count--;
			}
		}
		
		return -1;
	}
	
	public static void main(String args[]){
		
		int n;
	
		Scanner input = new Scanner(System.in);		
		n = input.nextInt();
		
		for(int index=0; index< n; index++){
			
			int number = input.nextInt();
			
			if(number%3 == 0){
				for(int index1 =0; index1 < number; index1++)
					System.out.print("5");
				System.out.println("");
				continue;
			}
			
			int fives = getFives(number);
			
			if(fives !=-1){
				
				for(int index1 =0; index1 < number; index1++){
					if(index1 < (fives*3))
						System.out.print("5");
					else
						System.out.print("3");
				}
				System.out.println("");
				continue;

			}
			
			if(number%5 == 0){
				for(int index1 =0; index1 < number; index1++)
					System.out.print("3");
				System.out.println("");
				continue;
			}
			
			System.out.print("-1");
			System.out.println("");
		}
	}
	
}
