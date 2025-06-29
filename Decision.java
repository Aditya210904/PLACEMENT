import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int cost = sc.nextInt();
        int days = sc.nextInt();
        int pay = 0;
        if (month == 4 ||month == 5 ||month == 6 || month == 11 || month == 12){
            pay+= pay+((cost*days*120)/100);
            
        }
        else if (month> 12){
            System.out.print("Invalid Input");
            return;
        }
        else{
            pay+= cost*days;
             }
                
        System.out.print(pay);
        
}
}
