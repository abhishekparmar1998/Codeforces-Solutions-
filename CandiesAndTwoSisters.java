
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CandiesAndTwoSisters {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        Scanner kb=new Scanner(System.in);
        int n=Integer.parseInt(bf.readLine());
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(bf.readLine());
        }
        
        for(int i=0;i<n;i++){
            double x=(arr[i]/2.0)-1;
            int no=(int)Math.ceil(x);
                  
            System.out.println(no);
        }
       
    }
}
