
import java.util.Scanner;

public class VanyaAndFence {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int arr[]=new int[2];
        for(int i=0;i<2;i++)
            arr[i]=kb.nextInt();
        int n=arr[0];
        int h=arr[1];
        int width=0;
        for(int i=0;i<n;i++)
        {
            int k=kb.nextInt();
            if(k<=h)
                width+=1;
            else
                width+=2;
        }
        System.out.println(width);
    }
}
