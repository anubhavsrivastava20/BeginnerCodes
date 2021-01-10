import java.util.*;
//Array List Question

public class Questions {
    public static void  main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //Declaring Array List under list
        ArrayList<ArrayList<Integer>> rows = new ArrayList<>();

        //Loop to get started with 1 List
        for (int i = 0; i < n; i++) {

            //2nd List Declaration
            int d = in.nextInt();
            ArrayList<Integer> row = new ArrayList<>();
            //Loop to add values
            for (int j = 0; j < d; j++) {
                row.add(in.nextInt());
            }
            //Adding 2nd list value in main list i.e row
            rows.add(row);
        }

        //Queries
        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            try {
                System.out.println(rows.get(x-1).get(y-1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
    }
}