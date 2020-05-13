

import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        String pair[]=new String[n];
        for(int i=0;i<n;i++)
            pair[i]=kb.next();
       
        String first=pair[0];
        int count=0;
        for(int i=1;i<n;i++){
            String second=pair[i];
            if(!(first.equals(second)))
                count++;
            first=pair[i];
        }
        
        System.out.println(count+1);
    }
}
