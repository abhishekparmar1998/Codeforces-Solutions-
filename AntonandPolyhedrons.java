


import java.util.Scanner;

public class AntonandPolyhedrons {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        kb.nextLine();
        int faces=0;
        String arr[]=new String[n];
        for (int i=0;i<n;i++){
            arr[i]=kb.nextLine();
            if(arr[i].equals("Tetrahedron"))
                faces=faces+4;
            else if(arr[i].equals("Cube"))
                faces=faces+6;
            else if(arr[i].equals("Octahedron"))
                faces=faces+8;
            else if(arr[i].equals("Dodecahedron"))
                faces=faces+12;
            else
                faces=faces+20;
        }
        System.out.println(faces);
        
      
        
    }
}
