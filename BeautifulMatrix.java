

import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int arr[][]=new int[5][5];
        int x=0,y=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                arr[i][j]=kb.nextInt();
                if(arr[i][j]==1)
                {
                    x=i+1;
                    y=j+1;
                } 
            }
        }
        int steps=Math.abs(x-3)+Math.abs(y-3);
        System.out.println(steps);
    }
}
