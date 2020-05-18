
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class AntonAndLetters {

    @Override
    public String toString() {
        return "AntonAndLetters{" + '}';
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String input=bf.readLine();
        StringBuilder sb=new StringBuilder(input);
        sb=sb.deleteCharAt(input.length()-1);
        sb=sb.deleteCharAt(0);
        input=sb.toString();
        
        String duplicate[]=input.split(",");
        for(int i=0;i<duplicate.length;i++)
        {
            duplicate[i]=duplicate[i].trim();
            //System.out.println(duplicate[i]);
        }   
        String unique="";
        
        for(int i=0;i<duplicate.length;i++)
        {
            if(!(unique.contains(duplicate[i])))
                unique+=duplicate[i];
        }
        
      
        System.out.println(unique.length());
        
        
    }

}
