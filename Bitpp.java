
import java.util.Scanner;

public class Bitpp {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        kb.nextLine();
        int x=0;
        String arr[]=new String[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=kb.nextLine();
            if(arr[i].equalsIgnoreCase("X++")  || arr[i].equalsIgnoreCase("++X"))
                x=x+1;
            else
                x=x-1;
            
        }
        System.out.println(x);
    }
}
