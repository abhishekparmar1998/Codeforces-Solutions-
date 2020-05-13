
import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=kb.nextInt();
        
        int brr[]=new int[n];
        for(int i=0;i<n;i++){
            brr[arr[i]-1]=i;
        }
       
        for(int i=0;i<n;i++)
            System.out.println(brr[i]+1);
}
}