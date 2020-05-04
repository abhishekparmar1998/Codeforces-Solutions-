

import java.util.Scanner;

public class BearandBigBrother {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int arr[]=new int[2];
        for(int i=0;i<2;i++)
            arr[i]=kb.nextInt();
      
        int count=0;
        while(arr[0]<=arr[1]){
            arr[0]=arr[0]*3;
            arr[1]=arr[1]*2;
            count++;
            if(arr[0]>arr[1])
                break;
        }
        System.out.println(count);
    }
}
