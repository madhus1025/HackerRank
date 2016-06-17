package Medium;

import java.util.*;

public class GridSearch {

	static int lastColumn=-1;
	
	public static int searchPattern(String arr[], int length,String pattern, int searchIndex){
		
		for(int index=searchIndex; index<=length; index++){

			if(arr[index].contains(pattern)){
				if(lastColumn!=-1){
					if(lastColumn != arr[index].lastIndexOf(pattern))
						return 0;
				}
				return index;
			}
		}
		return 0;	
	}
	
	
	
    public static void main(String[] args) {
    	
    	int flag=1;
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
        	flag=1;
        	lastColumn =-1;
            int R = in.nextInt();
            int C = in.nextInt();
            String G[] = new String[R];
            for(int G_i=0; G_i < R; G_i++){
                G[G_i] = in.next();
            }
            int r = in.nextInt();
            int c = in.nextInt();
            String P[] = new String[r];
            for(int P_i=0; P_i < r; P_i++){
                P[P_i] = in.next();
            }
            int search=0;
            R--;
            for(int searchIndex=0; searchIndex < r; searchIndex++){
            	search = searchPattern(G,R,P[searchIndex],search);
            	if(search==0){
            		 flag=0;
            		 break;
            	}
            	R=search+1;
            	search=R;
            }
            if(flag==0)
            	System.out.println("NO");
            else
            	System.out.println("YES");   
        }
    }
	
	
}
