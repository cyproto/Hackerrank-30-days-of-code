import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.ArrayList;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String reg = ".+@gmail\\.com$";
        Pattern pat = Pattern.compile(reg);

        ArrayList<String> list = new ArrayList<>();
        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];

            Matcher match = pat.matcher(emailID);

            if(match.find())
                list.add(firstName);
        }
        Collections.sort(list);
        for(String name:list) {
            System.out.println(name);
        }
        scanner.close();
    }
}
