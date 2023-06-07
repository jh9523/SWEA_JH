package D2;

// 2001
// https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5PzOCKAigDFAUq

import java.util.Scanner;

public class GoAwayFly {
	public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
         
        for(int i =0; i<t; i++) {
            int n = sc.nextInt();
            int a[][] = new int[n][n];
            int m = sc.nextInt();
             
            for(int j=0; j<n;j++) {
                for(int k=0; k<n; k++){
                    a[j][k] = sc.nextInt();
                }
            }
            int max=0;
             
            int b[][] = new int[n-m+1][n-m+1];
            for(int j=0; j<n-m+1;j++) {
                for(int k=0; k<n-m+1; k++) {
                    for(int e =0; e<m;e++) {
                        for(int x =0; x<m; x++) {
                            b[j][k]+= a[j+e][k+x];
                            if(max<b[j][k]) {
                                max=b[j][k];
                            }
                        }
                    }
                }
            }
             
            System.out.println("#"+(i+1)+" "+max);
             
        }
    }

}
