import java.util.Scanner;

public class Constructor {
    public static void main(String []args){
        children sc = new children("Anubhav" , 'M', 2);
        sc.bio();
        System.out.println(children.count);

    }
}

// 5 children
class children {
    // Properties/attributes
    String name;
    char gender;
    int rollNo;
    static int count;

    // Constructor
    public children(String name, char gender, int rollNo) {
        System.out.println("New children object created");
        this.name = name;
        this.gender = gender;
        this.rollNo = rollNo;
        count++;
    }

    void bio() {
        System.out.println(" The name of children is  " + this.name + " with roll no " + this.rollNo + " he is "+ this.gender + " and the " + count + " member of class");
    }

    static void getCount(){
        System.out.println("No of children " + count);
    }
}