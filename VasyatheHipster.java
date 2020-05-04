
import java.util.Scanner;

public class VasyatheHipster {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int arr[]=new int[2];
        for(int i=0;i<2;i++){
            arr[i]=kb.nextInt();
        }
        int a=arr[0];
        int b=arr[1];
        int pair=0,same=0;
        while(true){
            if(a!=0 && b!=0)
            {
                a--;
                b--;
                pair++;
            }
            else if(a==0 && b!=0)
            {
                if(b==1)
                    break;
                else
                {
                    b=b-2;
                    same++;
                }
            }
            else if(a!=0 && b==0)
            {
                if(a==1)
                    break;
                 else
                {
                    a=a-2;
                    same++;
                }
            }
            else
                break;
            
        }
        System.out.print(pair+" "+same);
    }
}
