
import java.util.Scanner;

public class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int arr[]=new int[3];
        for(int i=0;i<3;i++)
            arr[i]=kb.nextInt();
        
        int k=arr[0];
        int n=arr[1];
        int w=arr[2];
        
        int sum=0;
        for(int i=1;i<=w;i++)
        sum+=(i*k);
        if(sum<n)
            System.out.println("0");
        else
            System.out.println(sum-n);
    }
}
