
import java.util.Scanner;

public class NearlyLuckyNumber {    
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        long n=kb.nextLong();
        int count=0;
        while(n!=0){
            long rem=n%10;
            if(rem==7 || rem==4)
                count++;
            n=n/10;
        }
        if(count==7 || count==4)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    
}
