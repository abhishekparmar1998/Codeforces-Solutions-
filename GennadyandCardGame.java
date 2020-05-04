
import java.util.Scanner;

public class GennadyandCardGame {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        String input=kb.next();
        char ch1=input.charAt(0);
        char ch2=input.charAt(1);
        String arr[]=new String[5];
        for(int i=0;i<arr.length;i++)
            arr[i]=kb.next();
        
        for(int i=0;i<arr.length;i++)
        {
            char ch3=arr[i].charAt(0);
            char ch4=arr[i].charAt(1);
            if(ch1==ch3 || ch2==ch4)
            {
                System.out.println("YES");
                System.exit(0);
            }
        }
       
        System.out.println("NO");
        
        
    }
    
}
