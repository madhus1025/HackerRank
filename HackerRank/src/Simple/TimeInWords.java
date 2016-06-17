package Simple;

import java.util.*;

public class TimeInWords {
	
	
	public static void initializeMinutesHashMap(Map<Integer, String> hoursInWords){
		
		hoursInWords.put(2, "twenty");
		hoursInWords.put(3, "thirty");
		hoursInWords.put(4, "fourty");
		hoursInWords.put(5, "fifty");
		hoursInWords.put(6, "sixty");
		hoursInWords.put(10, "ten");
		hoursInWords.put(11, "eleven");
		hoursInWords.put(12, "twelve");
		hoursInWords.put(13, "thirteen");
		hoursInWords.put(14, "fourteen");
		hoursInWords.put(15, "fifteen");
		hoursInWords.put(16, "sixteen");
		hoursInWords.put(17, "seventeen");
		hoursInWords.put(18, "eighteen");
		hoursInWords.put(19, "nineteen");

		
	}

	public static void initializeHoursHashMap(Map<Integer, String> hoursInWords){
		
		hoursInWords.put(1, "one");
		hoursInWords.put(2, "two");
		hoursInWords.put(3, "three");
		hoursInWords.put(4, "four");
		hoursInWords.put(5, "five");
		hoursInWords.put(6, "six");
		hoursInWords.put(7, "seven");
		hoursInWords.put(8, "eight");
		hoursInWords.put(9, "nine");
		hoursInWords.put(10, "ten");
		hoursInWords.put(11, "eleven");
		hoursInWords.put(12, "twelve");
		hoursInWords.put(13, "one");
	}
	
	
	public static void timeInWords(int hours, int minutes){
	
		Map<Integer, String> unitsPlace = new HashMap<>();
		Map<Integer, String> tensPlace = new HashMap<>();
		
		String trailing = " o' clock";

		
		initializeHoursHashMap(unitsPlace);
		initializeMinutesHashMap(tensPlace);
		
		if(minutes == 0){
			System.out.println(unitsPlace.get(hours)+trailing);
			return;
		}
		if(minutes < 20){
			
			if(minutes == 15)
				System.out.println("quarter past "+unitsPlace.get(hours));	
			else if(minutes!=1)
				System.out.println(tensPlace.get(minutes)+" minutes past "+unitsPlace.get(hours));
			else
				System.out.println(tensPlace.get(minutes)+" minute past "+unitsPlace.get(hours));

			return;
		}
		if(minutes > 20 && minutes < 30){
			int temp = minutes /10;
			int temp1 = minutes%10;
			String minutesWord = tensPlace.get(temp);
			if(temp1!=0){
				minutesWord = minutesWord.concat(" "+unitsPlace.get(temp1)+"");
			}
			System.out.println(minutesWord+" minutes past "+unitsPlace.get(hours));

			return;
		}
		if(minutes == 30){
			System.out.println("half past "+unitsPlace.get(hours));
			return;
		}
		if(minutes > 30 && minutes <= 59 && minutes!=45){
			minutes = 60 -minutes;
			int temp = minutes /10;
			int temp1 = minutes%10;
			if(minutes < 20 && temp!=0){
				if(minutes!=1)
					System.out.println(tensPlace.get(minutes)+" minutes to "+unitsPlace.get(hours+1));
				else
					System.out.println(tensPlace.get(minutes)+" minute to "+unitsPlace.get(hours+1));

				return;
			}
			
			String minutesWord="";
			if(temp!=0)
				 minutesWord = tensPlace.get(temp)+" ";
			if(temp1!=0){
				minutesWord = minutesWord.concat(""+unitsPlace.get(temp1)+"");
			}
			if(temp ==0 && temp1 == 1)
				System.out.println(minutesWord+" minute to "+unitsPlace.get(hours+1));
			else
				System.out.println(minutesWord+" minutes to "+unitsPlace.get(hours+1));

			return;
		}	
		if(minutes ==45){
			System.out.println("quarter to "+unitsPlace.get(hours+1));

		}
	}
	
	
	public static void main(String args[]){
		
		
		int h;
		int m;

		Scanner input = new Scanner(System.in);
		h = input.nextInt();
		m = input.nextInt();
		
		timeInWords(h,m);
	}
	
	
}

