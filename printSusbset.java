import java.util.*;
import java.util.ArrayList;

public class printSusbset {
    public static void printsubset(ArrayList<Integer> subset) {
        for(int i=0; i<subset.size(); i++) {
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    
    public static void findsubset(int n,ArrayList<Integer> subset) {

        if(n==0) {
            printsubset(subset);
            return;
        }

        //if added
        subset.add(n);
        findsubset(n-1, subset);

        //if not added
        subset.remove(subset.size()-1);
        findsubset(n-1, subset);
    }

    public static void main(String args[]) {
        int input;
        do {
        System.out.println("Enter n :");
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        ArrayList<Integer> subset = new ArrayList<>();

        System.out.println("All possible subsets are :");
        findsubset(n, subset);
        System.out.println("Enter (1) to continue");
        input = sc.nextInt();
        } while(input == 1);
    }
}