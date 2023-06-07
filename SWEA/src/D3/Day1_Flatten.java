package D3;

// 1208
//https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV139KOaABgCFAYh

import java.util.Scanner;

public class Day1_Flatten {
	public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = 10;
        for(int i =0; i<10;i++) {
            int max=-1;
            int min=101;
            int sum=0;
             
            int dum = sc.nextInt();
            int[] a = new int[100];
            for(int j =0; j<100;j++) {
                a[j]=sc.nextInt();          
                sum+=a[j];
            }
            sum=sum%2;
             
            if(sum==1) {
                for(int k=0; k<dum;k++) {
                    if(a[max(a)]-a[min(a)]==1) {
                        System.out.println("#"+(i+1)+" "+1);
                        break;
                    }
                    else {
                        a[max(a)]=a[max(a)]-1;
                        a[min(a)]=a[min(a)]+1;
                    }  
                }
                System.out.println("#"+(i+1)+" "+(a[max(a)]-a[min(a)]));
            }
            else if(sum==0) {
                for(int k=0; k<dum;k++) {
                    if(a[max(a)]-a[min(a)]==0) {
                        System.out.println("#"+(i+1)+" "+0);
                        break;
                    }
                    else {
                        a[max(a)]=a[max(a)]-1;
                        a[min(a)]=a[min(a)]+1;
                    }               
                }
                System.out.println("#"+(i+1)+" "+(a[max(a)]-a[min(a)]));
            }
        }
    }
     
    public static int max(int[] a) {
        int m=-1;
        int mdx=-1;
        for(int i=0; i<a.length;i++) {
            if(m<a[i]) {
                m=a[i];
                mdx=i;
            }
        }
        return(mdx);
    }
     
    public static int min(int[] a) {
        int m=101;
        int mdx=-1;
        for(int i=0; i<a.length;i++) {
            if(m>a[i]) {
                m=a[i];
                mdx=i;
            }
        }
         
        return(mdx);
         
    }

}
