

import java.util.Scanner;

public class ArrivalOfTheGeneral {
    public static void main(String[] args) {
         Scanner kb=new Scanner(System.in);
    int n=kb.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
        arr[i]=kb.nextInt();
    int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    int minI=0,maxI=0;
    for(int i=0;i<n;i++)
    {
        if(arr[i]<=min){
             min=arr[i];
             minI=i;
        }
        if(arr[i]>max){
            max=arr[i];
            maxI=i;
        }
    }
    int steps=0;
    if(minI<maxI)
          steps=(n-1-minI)+(maxI)-1;
    else
        steps=(n-1-minI)+(maxI);
        //System.out.println("MinI: "+minI+" MaxI: "+maxI);
        System.out.println(steps);
    }
   
    
}
