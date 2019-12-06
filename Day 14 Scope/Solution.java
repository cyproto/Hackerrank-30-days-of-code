import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

	// Add your code here
    Difference(int[] b){
        this.elements = b;
        maximumDifference = 0;
    }
    int temp;
    
    public int computeDifference(){
        for(int i = 0;i<elements.length;i++){
            for(int j = 0;j<elements.length;j++){
                if(i!=j){
                    temp = Math.abs(elements[i]-elements[j]);
                    if(temp>maximumDifference){
                        maximumDifference = temp;
                    }
                }
            }
        }
    return maximumDifference;
    }

} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}