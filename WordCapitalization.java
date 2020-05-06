
import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        String input=kb.next();
        String output="";
        String first=String.valueOf(input.charAt(0));
        first=first.toUpperCase();
        output=first+input.substring(1,input.length());
        System.out.println(output);
    }
    
}
