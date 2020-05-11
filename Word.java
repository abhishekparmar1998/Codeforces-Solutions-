
import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        String word=kb.next();
        int upper=0,lower=0;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(Character.isUpperCase(ch))
                upper++;
            else
                lower++;
        }
        if(upper>lower)
            System.out.println(word.toUpperCase());
        else
            System.out.println(word.toLowerCase());
        
    }
    
}
