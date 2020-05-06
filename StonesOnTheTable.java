

import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        kb.nextLine();
        String input=kb.next();
        char ch1=input.charAt(0);
        int count=0;
        for(int i=1;i<n;i++)
        {
            char ch2=input.charAt(i);
            if(ch1==ch2)
                count++;
            ch1=ch2;
        }
        System.out.println(count);
    }
}
