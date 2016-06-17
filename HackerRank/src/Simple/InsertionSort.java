package Simple;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class InsertionSort {
    
    

    public static void insertIntoSorted(int[] ar,int s) {

    	int index=0;
    	int temp;
    	int element = ar[s-1];
    	
    	for(index=s-2; index>=0; index--){
    		
    		if(element < ar[index])
    			ar[index+1] = ar[index];
    		else{
    			ar[index+1] = element;
    			break;
    		}
    		printArray(ar);
    	}	
    	if(index == -1)
    		ar[0] = element;
		printArray(ar);

    	
    }
    
   
    
    
/* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
        }
        insertIntoSorted(ar,s);
    }
    
    
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
 
