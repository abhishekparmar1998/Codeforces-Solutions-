

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UltraFastMathematician  {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String one=br.readLine();
        String two=br.readLine();
        int arr[]=new int[one.length()];
        int brr[]=new int[two.length()];
        for(int i=0;i<one.length();i++)
            arr[i]=Integer.parseInt(String.valueOf(one.charAt(i)));
        
        for(int i=0;i<one.length();i++)
            brr[i]=Integer.parseInt(String.valueOf(two.charAt(i)));
        
        String output="";
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=brr[i])
                output+="1";
            else
                output+="0";
        }
        System.out.println(output);
    }
    
}
