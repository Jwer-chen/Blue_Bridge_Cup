package algorithm;

import java.util.Scanner;

/**
 * 
 * T 将整数n分成k份，且每份不能为空，任意两份不能相同(不考虑顺序)。
 * 	 例如：n=7，k=3，下面三种分法被认为是相同的。
 * 	 1，1，5; 1，5，1; 5，1，1;
 * 	 问有多少种不同的分法。
 * 
 * 
 * @author tugeng
 *
 */
public class Division_Of_Numbers2 {
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, k;  
		
		n = sc.nextInt();
		
		k = sc.nextInt();
	    
		int[][] f = new int[1000][1000];  
		
        f[1][1]=1;
        
        for(int i=2;i<=n;i++){  
        	
            for(int j=1;j<=k && j<=i;j++){ 
            	
                f[i][j] = f[i-1][j-1] + f[i-j][j];  
            }
            
        }  
        
        System.out.println(f[n][k]);  

		
		
	}
	

}
