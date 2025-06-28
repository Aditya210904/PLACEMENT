import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int []b = new int[a];
        int []c = new int[a];
        for(int i = 0;i<a;i++){
            b[i] = sc.nextInt();
            
        }
        int maxFromRight = b[a-1];
        System.out.print(b[a-1]+ " ");
        for(int i=a-2;i>=0;i--){
            if (b[i]> maxFromRight){
                maxFromRight = b[i];
                System.out.print(maxFromRight+ " ");
            }
            
        }
        
    }
}