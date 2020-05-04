

import java.util.Scanner;

public class WayToLongWords {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        kb.nextLine();
        String arr[]=new String[n];
        for(int i=0;i<n;i++)
            arr[i]=kb.nextLine();
        
        for(String s:arr)
        {
            if(s.length()>10){          
            char first=s.charAt(0);
            char last=s.charAt(s.length()-1);
            int mid=s.length()-2;
            String output=String.valueOf(first)+String.valueOf(mid)+String.valueOf(last);
            System.out.println(output);
            }
            else
                System.out.println(s);
        }
       
    }
    
}
