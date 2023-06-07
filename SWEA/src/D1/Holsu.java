package D1;

//https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5QSEhaA5sDFAUq

import java.util.Scanner;

class Holsu{
    public static void main(String args[]) throws Exception {
       
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
         
 
        for(int test_case = 0; test_case < T; test_case++)
        {
            int sum = 0;
            for(int j = 0; j<10; j++){
                int k = sc.nextInt();
                if(k%2==1){
                    sum += k;
                }
            }
            System.out.println("#"+(test_case+1)+" "+sum);
        }
    }
}