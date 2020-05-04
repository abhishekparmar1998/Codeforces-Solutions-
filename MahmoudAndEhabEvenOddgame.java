
import java.util.Scanner;

public class MahmoudAndEhabEvenOddgame {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        char turn='M';
        int n=kb.nextInt();
        while(n!=0){
            if(turn=='M')
            {
                if(n%2==0)
                {
                    n=0;
                    turn='E';
                    //System.out.println("Mahmoud");
                    //System.exit(0);
                }
                else if(n-2>=0)
                {
                    n=n-2;
                    turn='E';
                }
                else
                    break;
            }
            else{
                if(n%2!=0)
                {
                    n=0;
                    turn='M';
                    //System.out.println("Ehab");
                    //System.exit(0);
                }
                else if(n-1>=0)
                {
                    n=n-1;
                    turn='M';
                }
                else
                    break;
            }
        }
        if(turn=='E')
            System.out.println("Mahmoud");
        else
            System.out.println("Ehab");
    }
    
}
