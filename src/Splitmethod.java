//Split Method Function or Question
//Reference code


import java.util.Arrays;
import java.util.Scanner;

public class Splitmethod {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

    //trim function is used to remove all spaces in string.
    s= s.trim();

    /*^ Means Not equals to seperates with every start of word
    If we remove that it will only consider special characters.
    */
    String[] op = s.split("[^a-zA-Z]+");

    //Loop to count length
    if(s.length() == 0){
        System.out.println(0);
    }else{
        System.out.println(op.length);
    }

    //Loop for Sting print
        for(String string : op) {
            System.out.println(string);
        }
    }
}
