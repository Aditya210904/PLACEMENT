import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%4 == 0 && n%100 !=0){
            System.out.print(n+" is a leap year");
        }
        else if(n%100 == 0 && n%400 == 0){
            System.out.print(n+" is a leap year");
            
        }
        else{
            System.out.print(n+" is not a leap year");
        }
        
        
    }
}
