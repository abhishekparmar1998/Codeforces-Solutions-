

import java.io.IOException;
import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) throws IOException
    {
        /*BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=br.read();
        double fraction=0;
        int temp=0;
        
        for(int i=0;i<n;i++){
            temp=br.read();
            fraction=fraction+(temp/100);
        }
        
        double ans=(fraction/n)*100;
        System.out.println(ans);
           */
        
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        double temp=0;
        double vol=0;
        for(int i=0;i<n;i++)
        {
            temp=kb.nextDouble();
            vol+=(temp/100.0);
        }
        System.out.println((vol/n)*100);
    }
}
