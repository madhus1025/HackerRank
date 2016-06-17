package Simple;

import java.util.*;

public class UtopianTree {
	
	
	public static int processHeightByNumberOfCycles(int cycles){
		
		int height = 1;	
		int index =0;
		int flag = 0;
		
		while(index < cycles){
			
			if(flag == 0){
				height *= 2;
				flag=1;
			}
			else{
				height++;
				flag=0;
			}
			index++;
		}
		
		return height;
	}
	
	public static void main(String args[]){
		
		int numberOfCases;
		
		Scanner input = new Scanner(System.in);
		numberOfCases = input.nextInt();

		for(int index =0; index < numberOfCases; index++){
			
			int cycles = input.nextInt();
			System.out.println(processHeightByNumberOfCycles(cycles));
		}	
	}
}
