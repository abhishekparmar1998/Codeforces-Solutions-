
import java.util.Arrays;
import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        String input=kb.next();
        String output="";    
        for(int i=0;i<input.length();i++)
        {
            char ch=input.charAt(i);
           if(!(output.contains(String.valueOf(ch))))
               output+=String.valueOf(ch);
        }
        //System.out.println(output);
        if(output.length()%2==0)
            System.out.println("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");
      }
}
