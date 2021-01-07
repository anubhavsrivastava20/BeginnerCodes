//Anagram Problem

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void  main(String[] args) {
        //Take String user Input
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        //Case Insensitivity
        String x = a.toLowerCase();
        String y = b.toLowerCase();

        //Convert String to Array to Sort
        char[] a1 = x.toCharArray();
        char [] a2 = y.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        //Check Result
        boolean result = Arrays.equals(a1,a2);
        if(result == true){
            System.out.println("Anagrams");
        }else{
            System.out.println("Not Anagrams");
        }
    }
}
