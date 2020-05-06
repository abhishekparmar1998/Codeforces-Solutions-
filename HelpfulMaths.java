
import java.util.Arrays;
import java.util.Scanner;
public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        String exp=kb.next();
        if(exp.length()==1)
            System.out.println(exp);
        else{
        int len=exp.length()-(exp.length()/2);
        int arr[]=new int[len];
        int j=0;
        for(int i=0;i<exp.length();i++)
        {
        char ch = exp.charAt(i);
        if(ch=='3' || ch=='1' || ch=='2'){
         arr[j]=Integer.parseInt(String.valueOf(ch));
        j++;
        }
    }
        
        Arrays.sort(arr);
        String output="";
         
           for(int i=0;i<arr.length;i++)
        {
                output+=String.valueOf(arr[i]);
                if(i!=arr.length-1)
                    output+="+";
        }
        System.out.println(output);

}
}
}
