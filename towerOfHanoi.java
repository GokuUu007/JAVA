import java.util.*;

public class towerOfHanoi {
    public static void moveDisks(int n,String src, String helper, String dest) {

        //BASE CASE
        if(n == 1) {
            System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
            return;
        }

        moveDisks(n-1, src, dest, helper);
        System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
        moveDisks(n-1, helper, src, dest);

    }

    public static void main(String args[]) {
        int tocontinue;
        do{
        System.out.println("Enter number of disks : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        moveDisks(n, "S", "H", "D");
        System.out.println("TO CONTINUE ENTER (1) OR TO STOP (0) :");
        tocontinue = sc.nextInt();
        } while(tocontinue == 1);
    }
}