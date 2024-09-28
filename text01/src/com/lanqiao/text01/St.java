package com.lanqiao.text01;
import java.util.Scanner;

public class St {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a=new int[20];
        int[][] dp=new int[50000][20];
        int n,m,z;
        z=scanner.nextInt();
        n=scanner.nextInt();
        m=scanner.nextInt();
        for (int i = 1; i <=z ; i++) {
           a[i]=scanner.nextInt();
        }
       int p=(int)(Math.log(z)/Math.log(2));
        for (int j = 1; j <=z ; j++) {
            dp[j][0]=a[j];

        }
        for (int k = 1; k <= p; k++) {
            for (int s = 1; s+(1<<k)-1 <=z ; s++) {
                dp[s][k]=Math.max(dp[s][k-1],dp[s+(1<<k-1)][k-1]);
            }
        }
        Js js = new Js();
        js.Info_(n,m,dp);

    }
}
class Js{
    public void Info_(int n,int m,int[][] dp){
        int k=(int)(Math.log(m-n+1)/Math.log(2));
        int max=Math.max(dp[n][k],dp[m-(1<<k)+1][k]);
        System.out.println(max);
    }

}
