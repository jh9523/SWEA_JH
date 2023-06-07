package D3;

// https://swexpertacademy.com/main/code/problem/problemDetail.do

import java.util.Scanner;

public class HealthCare {
	 public static void main(String args[]) throws Exception
	    {
	        Scanner sc = new Scanner(System.in);
	        int t;
	        t=sc.nextInt();
	        int l=0;
	        int u=0;
	        int x=0;
	         
	         
	        for(int i = 0; i<t; i++) {
	            l=sc.nextInt();         
	            u=sc.nextInt();         
	            x=sc.nextInt();
	             
	            if(u<x) {
	                System.out.println("#"+(i+1)+" "+-1);
	            }
	             
	            else if(x>=l && x<=u) {
	                System.out.println("#"+(i+1)+" "+0);
	            }
	             
	            else if(x<l) {
	                System.out.println("#"+(i+1)+" "+(l-x));
	            }
	             
	        }
	    }

}
