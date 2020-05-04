

import java.util.Scanner;

public class MishkaandGame {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int arr[][]=new int[n][2];
        int misk=0,chris=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<2;j++){
                arr[i][j]=kb.nextInt();
            }
        }
        
        for(int i=0;i<n;i++)
        {
            if(arr[i][0]>arr[i][1])
                misk++;
            else if(arr[i][0]<arr[i][1])
                chris++;
        }
        
        if(misk>chris)
            System.out.println("Mishka");
        else if(misk<chris)
            System.out.println("Chris");
        else
            System.out.println("Friendship is magic!^^");
        
        
    }
}
