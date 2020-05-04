

import java.util.Scanner;

public class Hulk {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print("I ");
            if(i%2!=0)
                System.out.print("hate ");
            else
                System.out.print("love ");
            if(i==n)
                System.out.print("it ");
            else
                System.out.print("that ");
        }
    }
}
