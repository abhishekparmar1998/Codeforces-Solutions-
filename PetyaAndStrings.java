
import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        String first=kb.next();
        kb.nextLine();
        String second=kb.next();
        if(first.equalsIgnoreCase(second))
        {
            System.out.println("0");
        }
        else{
            first=first.toLowerCase();
            second=second.toLowerCase();
           
            for(int i=0;i<first.length();i++)
                {
                if(first.charAt(i)>second.charAt(i))
                {
                    System.out.println("1");
                    break;
                }
                else if(first.charAt(i)<second.charAt(i)){
                    System.out.println("-1");
                    break;
                }
               
            }
        }
    }
    
}
