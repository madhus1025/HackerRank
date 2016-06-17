package Simple;
import java.util.*;


public class DiagonalSum {

	static int diffBetweenDiagonalSums(int arr[][], int n){
		
		int row;
		int column;
		int primaryDiagonalSum = 0;
		int secondaryDiagonalSum = 0;
		
		
		
		for(row = 0; row < n; row++){
			
			primaryDiagonalSum += arr[row][row];
			secondaryDiagonalSum += arr[row][n-row-1];
		
		}
		
		return Math.abs(primaryDiagonalSum - secondaryDiagonalSum);
	}
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        System.out.println(diffBetweenDiagonalSums(a,n));
    in.close();
    }
}
