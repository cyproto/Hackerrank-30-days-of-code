import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s =  new Scanner(System.in);
        int n = s.nextInt();
        while(n>0){
            int a = s.nextInt();
            int flag = 0;
            for(int i = 2;i<=Math.sqrt(a);i++){
                if(a%i==0){
                    flag = 1;
                }
            }
            if(flag == 1||a==1){
                System.out.println("Not prime");
            }
            else {
                System.out.println("Prime");
            }
            flag = 0;
            n--;
        }
    }
}

