
import java.util.Scanner;

public class Dominopiling {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int arr[]=new int[2];
        for(int i=0;i<2;i++)
            arr[i]=kb.nextInt();
        int area=arr[0]*arr[1];
        int no=area/2;
        System.out.println(no);
    }
}
