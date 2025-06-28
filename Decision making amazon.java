import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f1,f2,f3,s1,s2,s3,a1,a2,a3;
        f1 = sc.nextInt();
        f2 = sc.nextInt();
        f3 = sc.nextInt();
        s1 = sc.nextInt();
        s2 = sc.nextInt();
        s3 = sc.nextInt();
        a1 = sc.nextInt();
        a2 = sc.nextInt();
        a3 = sc.nextInt();
        long f = f1-Math.round(f1*f2/100.0)+f3;
        long s = s1-Math.round(s1*s2/100.0)+s3;
        long a = a1-Math.round(a1*a2/100.0)+a3;
        System.out.println("In Flipkart: Rs."+f);
        System.out.println("In Snapdeal: Rs."+s);
        System.out.println("In Amazon: Rs."+a);
        
        if((f<=s) && (f<=a)){
            System.out.print("Choose Flipkart");
        }
        else if((s<=f) && (s<=a)){
            System.out.println("Choose Snapdeal");
            
        }
        else if((a<=f) &&(a<=s)){
            System.out.println("Choose Amazon");
        }
        else{
            System.out.println("Choose Flipkart");
        }
        
        
    }
}