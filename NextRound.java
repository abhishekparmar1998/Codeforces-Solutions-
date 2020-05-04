
import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int arr[]=new int[2];
        for(int i=0;i<2;i++)
            arr[i]=kb.nextInt();
        
        int n=arr[0];
        int k=arr[1];
        
        int score[]=new int[n];
        for(int i=0;i<n;i++)
            score[i]=kb.nextInt();
        
        int kth=score[k-1];
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(score[i]>=kth && score[i]>0)
                count++;
        }
        System.out.println(count);
    }
    
}
