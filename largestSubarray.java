import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int max=0,sum =0;
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                sum = sum+a[j];
                if(max<sum){
                    max = sum;
                }
            }
            sum =0;
            
        }
        System.out.print(max);
    }
    
    
    
}