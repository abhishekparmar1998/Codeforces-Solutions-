

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class IWannaBetheGuy {
    public static void main(String[] args) throws IOException {
        //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Scanner kb=new Scanner(System.in);
        HashSet <Integer>hs=new HashSet<>();
        int n=kb.nextInt();
        int p=kb.nextInt();
        for(int i=0;i<p;i++)
        hs.add(kb.nextInt());
        
        int q=kb.nextInt();
        for(int i=0;i<q;i++)
        hs.add(kb.nextInt());
        
        ArrayList <Integer> list=new ArrayList<>(hs);
        Collections.sort(list);
        if(list.size()==n)
            System.out.println("I become the guy.");
        else
            System.out.println("Oh, my keyboard!");
        
    }
}
