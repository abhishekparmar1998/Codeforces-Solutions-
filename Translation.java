

import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        String one=kb.next();
        String two=kb.next();
        StringBuilder sb=new StringBuilder(two);
        sb.reverse();
        two=sb.toString();
        if(one.equals(two))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
