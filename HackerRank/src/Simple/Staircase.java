package Simple;

import java.util.Scanner;

public class Staircase {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int index=0; index < n; index++){
			for(int spaces=0; spaces < n-index; spaces++)
				System.out.print("");
			for(int num=0; num <= index; num++)
				System.out.print("#");
			System.out.println();
		}
	}

}
