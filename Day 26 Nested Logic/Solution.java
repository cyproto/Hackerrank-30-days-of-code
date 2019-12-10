import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s =  new Scanner(System.in);
        int d1 = s.nextInt();
        int m1 = s.nextInt();
        int y1 = s.nextInt();
        int d2 = s.nextInt();
        int m2 = s.nextInt();
        int y2 = s.nextInt();
        
        if(y1>y2){
            System.out.println(10000);
        }
        else if(m1>m2 && (y1>=y2)){
            System.out.println((m1-m2)*500);
        }
        else if(d1>d2&&m1>=m2&&y1>=y2){
            System.out.println((d1-d2)*15);
        }
        else{
            System.out.println(0);
        }
}
}

