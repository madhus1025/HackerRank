package Simple;

import java.util.*;




public class MaxSubArray {

	static int maxContinue=0;
	static int maxDiscrete=0;
	
	public static int processInput(int arr[],int start,int end){
		
		int maxSet1;
		int maxSet2;
		
		
			
		
		
		return 0;
	}
	
	public static void displayResult(int maxContinue, int maxDiscrete){
		System.out.println(maxContinue+" "+maxDiscrete);
	}
	
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		int index=0;
		int noOfCases = input.nextInt();
		int arr[] = new int[100000];
		int arrSize;
		
		for(index=0;index < noOfCases; index++){
			
			arrSize = input.nextInt();
			
			for(int index1=0; index1 < arrSize; index1++)
				arr[index1] = input.nextInt();
			
			//processInput(arr,arrSize);
		}
		input.close();
	}
	
}
