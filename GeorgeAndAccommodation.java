

import java.util.Scanner;

public class GeorgeAndAccommodation {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int arr[]=new int[2];
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                arr[j]=kb.nextInt();
            }
            if(arr[0]+2<=arr[1])
                count++;
        }
        System.out.println(count);
    }
}
