package Simple;

import java.util.Scanner;

public class AngryProfessor {

	
	
	public static void isClassCancelled(int students[], int n, int k){
		
		int index;
		int count = 0;
		
		for(index = 0; index < n; index++){
			if(students[index] <=0 )
				count++;
			if(count>k){
				System.out.println("NO");
				return;
			}
		}
		if(count == k)
			System.out.println("NO");
		else
			System.out.println("YES");
		return;
	}
	
	public static void main(String args[]){
		
		int noOfCases;
		int n;
		int k;
		
		Scanner input = new Scanner(System.in);
		
		noOfCases = input.nextInt();
		
		for(int index=0; index<noOfCases; index++){
		
			n = input.nextInt();
			k = input.nextInt();
			
			int arr[] = new int[n];
			
			for(int index1=0; index1 < n; index1++){
				
				arr[index1] = input.nextInt();
			}
			
			isClassCancelled(arr,n,k);
			
		}
	}
	
}
