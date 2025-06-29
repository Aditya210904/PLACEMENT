import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int tree = sc.nextInt();
        if( tree <= columns){
            System.out.print("Yes");
        }
        else if((tree-1)%columns == 0){
            System.out.print("Yes");
            
        }
        else if((tree % columns) == 0){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}
