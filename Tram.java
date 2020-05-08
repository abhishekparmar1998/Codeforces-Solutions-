

import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int arr[][]=new int[n][2];
        int sum=0,max=0;
        for(int i=0;i<n;i++){
        int exit=kb.nextInt();
        sum=sum-exit;
        int enter=kb.nextInt();
        sum=sum+enter;
        if(sum>max)
            max=sum;
        }
        
        System.out.println(max);
      
    }
}
