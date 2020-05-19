
import java.util.Scanner;

public class Games {
     public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int arr[]=new int[n];
        int brr[]=new int[n];
       // int count[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=kb.nextInt();
            brr[i]=kb.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<n;j++){
                if(arr[i]==brr[j])
                    c++;
            }
          sum=sum+c;
        }
         System.out.println(sum);
    }
}
