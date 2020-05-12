

import java.util.Scanner;

public class BeautifulYear {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int y=kb.nextInt(); // input year
        //for(int i=y+1;i<=9000;i++)
        int i=y+1;
        while(true)
        {
         String year=String.valueOf(i);
         String distinct="";
         for(int j=0;j<year.length();j++){
             char ch=year.charAt(j);
             if(!(distinct.contains(String.valueOf(ch))))
                 distinct+=String.valueOf(ch);
         }
         if( distinct.length()==year.length())
         {
             System.out.println(i);
             break;
         }
         i++;
        }
        
    }
    
}
