
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculatingFunction {  
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        long n=Long.parseLong(bf.readLine());
        long sum=0;
        if( n%2==0)
            sum=(n/2);
        else 
            sum = -((n/2)+1);
        System.out.println(sum);
    }
}
