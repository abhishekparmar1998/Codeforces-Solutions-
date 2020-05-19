

import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        kb.nextLine();
        String input=kb.next();
        input=input.toUpperCase();
        if(n<26)
            System.out.println("NO");
        else{
            for(int i=65;i<=90;i++)
            {
                char ch=(char)i;
                if(!(input.contains(String.valueOf(ch)))){
                    System.out.println("NO");
                    System.exit(0);
                }    
            }
            System.out.println("YES");
        }
    }
}
