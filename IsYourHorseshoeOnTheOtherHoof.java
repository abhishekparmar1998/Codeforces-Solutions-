


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IsYourHorseshoeOnTheOtherHoof {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        Set<Integer> hs = new HashSet<>(); 
        for(int i=0;i<4;i++)
        hs.add(kb.nextInt());
        
        System.out.println(4-hs.size());
    }
}
