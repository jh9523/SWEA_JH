package D3;

// https://swexpertacademy.com/main/code/problem/problemDetail.do

import java.util.Scanner;

public class Day1_View {
	public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int t= 10;
        int n = 0;
        for(int i =0; i<t; i++) {
            int cnt=0;
            n=sc.nextInt();
            int[] a = new int[n];
            for(int j = 0; j<n;j++) {
                a[j]=sc.nextInt();      
            }
            for(int k =2; k<n-2;k++) {
                if(a[k]>max(a[k-2],a[k-1],a[k+1],a[k+2]) ) {
                    cnt+=a[k]-max(a[k-2],a[k-1],a[k+1],a[k+2]);
                }
            }
            System.out.println("#"+(i+1)+" "+cnt);
        }
    }
     
    public static int max(int a, int b, int c, int d) {
        if(a>=b && a>=c && a>=d) {
            return a;
        }
        if(b>a && b>=c && b>=d) {
            return b;
        }
        if(c>a && c>b && c>=d) {
            return c;
        }
        if(d>a && d>b && d>c) {
            return d;
        }
         
        return d;
    }

}
