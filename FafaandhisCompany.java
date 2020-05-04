
import java.util.Scanner;

public class FafaandhisCompany {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int count=0;
        for(int i=1;i<n;i++){
            int temp=n-i;
            if(temp%i==0)
                count++;
        }
        System.out.println(count);
    }
}
