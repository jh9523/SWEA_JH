package D2;

// https://swexpertacademy.com/main/code/problem/problemDetail.do

import java.util.Scanner;

public class Simple369 {
	public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        for(int i =1; i<=T; i++){
            int count = 0;
             
            if(i<10){
                if(i%3==0){
                    System.out.print("- ");
                }
                else{
                    System.out.print(i+" ");                    
                 }
             
            }
            else{
                String a = Integer.toString(i);
                String[] num = a.split("");
                 
                for(int k =0; k<num.length; k++){
                     
                    if(num[k].contains("3") || num[k].contains("6") || num[k].contains("9")){
                        count++;
                                                 
                    }
                }
                 
                if(count==0) System.out.print(i+" ");
                 
                else{
                    for(int z= 0; z<count;z++){
                        if(count==1) System.out.print("-");
                        else System.out.print("-");
                    }
                     
                    System.out.print(" ");
                }
            }
             
         
       }
 }

}
