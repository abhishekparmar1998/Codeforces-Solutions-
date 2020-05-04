


import java.util.Scanner;

public class AntonandDanik {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        String str=kb.next();
        int anton=0,danik=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='A')
                anton++;
            else
                danik++;
        }
        if (anton>danik)
            System.out.println("Anton");
        else if(anton<danik)
            System.out.println("Danik");
        else
            System.out.println("Friendship");
    }
    
}
