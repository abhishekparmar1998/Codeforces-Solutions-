
import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int arr[][]=new int[n][3];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<3;j++)
            {
                arr[i][j]=kb.nextInt();
            }
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            int ones=0;
            for(int j=0;j<3;j++)
            {
               if(arr[i][j]==1)
                   ones++;
            }
            if(ones>=2)
                count++;
        }
        
        System.out.println(count);
        
        
    }
    
}
