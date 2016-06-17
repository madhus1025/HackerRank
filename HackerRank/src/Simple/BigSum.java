package Simple;

import java.util.*;

public class BigSum {


	static long sum(long arr[], int n){
		
		long sum=0;
		for(int index=0; index<n; index++){
			sum+=arr[index];
		}
		return sum;
	}
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long arr[] = new long[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextLong();
        }
        System.out.println(sum(arr,n));
    }
}
