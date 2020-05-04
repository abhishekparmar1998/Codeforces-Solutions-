
import java.util.Scanner;

public class InSearchofanEasyProblem {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        String output="Easy";
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=kb.nextInt();
        
        for(int i=0;i<n;i++){
            if(arr[i]==1)
            {
                output="Hard";
                break;
            }
        }
        System.out.println(output);
    }
    
}
