
import java.util.Arrays;
import java.util.Scanner;

public class QueueAtTheSchool {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int arr[]=new int[2];
        for(int i=0;i<arr.length;i++)
            arr[i]=kb.nextInt();
        kb.nextLine();
        String queue=kb.next();
        char output[]=queue.toCharArray();
        
        for(int i=1;i<=arr[1];i++){
            for(int j=0;j<arr[0]-1;j++)
            {
                if(output[j]=='B' && output[j+1]=='G')
                {
                    output[j]='G';
                    output[j+1]='B';
                    j++;
                }
            }
        }
        String o=String.valueOf(output);
        System.out.println(o);
        
    }
    
}
