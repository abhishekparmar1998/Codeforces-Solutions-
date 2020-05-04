

import java.util.Scanner;

public class WrongSubtraction {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int arr[]=new int[2];
        for(int i=0;i<2;i++)
            arr[i]=kb.nextInt();
        
        int number=arr[0];
        int n=arr[1];
        
        for (int i=0;i<n;i++){
            if(number%10==0)
                number/=10;
            else
                number--;
        }
        
        System.out.println(number);
        
    }
}
