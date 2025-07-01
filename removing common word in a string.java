import java.util.*;
public class Main{
    public static void main(String[] args){
        ArrayList<String> m = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char  b = sc.next().charAt(0);
        String c ="";
        for(int i = 0;i<a.length();i++){
            if(a.charAt(i)!=b){
                c+=a.charAt(i);
                
            }
        }
        System.out.print(c);
        
    }
}
