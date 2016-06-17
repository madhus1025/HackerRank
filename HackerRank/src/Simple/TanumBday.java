package Simple;

import java.util.Scanner;

public class TanumBday {
	
	public static void main(String args[]){
		
		long index = 0;
		long noOfCases;
		
		long blackGifts;
		long whiteGifts;
		
		long blackCost;
		long whiteCost;
		long exchangeCost;
		
		long totalCost;
		long costWithExchangeBlack;
		long costWithExchangeWhite;
		
		Scanner input = new Scanner(System.in);		
		noOfCases = input.nextLong();
		
		for(index = 0; index < noOfCases; index++){
			
			blackGifts = input.nextLong();
			whiteGifts = input.nextLong();
			
			blackCost = input.nextLong();
			whiteCost = input.nextLong();
			exchangeCost  = input.nextLong();
			
			totalCost = whiteCost*whiteGifts + blackCost*blackGifts;
		
			costWithExchangeBlack = whiteCost*(whiteGifts+blackGifts) + blackGifts * exchangeCost;
			costWithExchangeWhite = blackCost*(whiteGifts+blackGifts) + whiteGifts * exchangeCost;
			
			if(totalCost > costWithExchangeBlack){
				if(costWithExchangeBlack > costWithExchangeWhite)
					System.out.println(costWithExchangeWhite);
				else
					System.out.println(costWithExchangeBlack);
			}
			else{
				if(totalCost > costWithExchangeWhite )
					System.out.println(costWithExchangeWhite);
				else
					System.out.println(totalCost);
			}
				
		
		}	
	}

}
