

import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int count=0;
        while(n!=0)
        {
            if(n>=5)
                n=n-5;
            else if (n>=4)
                n=n-4;
            else if(n>=3)
                n=n-3;
            else if(n>=2)
                n=n-2;
            else
                n=n-1;
            count++;
        }
        System.out.println(count);
    }
    
}
