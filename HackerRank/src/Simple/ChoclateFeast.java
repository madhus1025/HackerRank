package Simple;

import java.util.*;

public class ChoclateFeast {
	public static void main(String args[]){
		
		int totalTestCases;
		double totalMoney;
		double wrappers;
		double costOfOneChoclate;
		int index;
		int choclates;
		int finalChoclatesPostReturningWrappers=0;
		int returnChoclates;
		int totalChoclates;
		
		Scanner scan = new Scanner(System.in);
		totalTestCases = scan.nextInt();
		for(index=0; index<totalTestCases; index++ ){
			
			totalMoney = scan.nextDouble();
			costOfOneChoclate = scan.nextDouble();
			wrappers = scan.nextDouble();
			
			choclates = (int)Math.floor(totalMoney/costOfOneChoclate);
			
			totalChoclates = choclates;
			
			while(totalChoclates >= wrappers){
				
				
				returnChoclates = (int)((int)Math.floor(totalChoclates/wrappers));
				
				totalChoclates = (int) (returnChoclates+(totalChoclates%wrappers));
			
				choclates+=returnChoclates;

			}
			
			System.out.println(choclates);
			
		}	
		scan.close();
	}
}
