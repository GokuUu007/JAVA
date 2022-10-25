import java.util.*;

public class printnum {

    public static void printnum(int n) {
        if(n == 0) {
            return;
        }

        System.out.println(n);
        printnum(n-1);
    }
    public static void main(String args[]) {
        int toContinue;
        do{
        System.out.println("Enter no : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printnum(n);

        System.out.println("To continue enter (1) or To stop enter (2) :");
        toContinue = sc.nextInt();
        } while(toContinue == 1);
    }
}