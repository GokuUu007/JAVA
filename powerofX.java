import java.util.*;

public class powerofX {
    public static int calcPower(int x,int n) {

        if(n == 0 ) {
            return 1;
        }
        if(x == 0) {
            return 0;
        }
        
        int xPownm_1 = calcPower(x, n-1);
        int xPown = x*xPownm_1;
        return xPown;

    }    

    public static void main(String args[]) {
        int toContinue;
        do{
        System.out.println("Enter base no :");
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       System.out.println("Enter power :");
       int n = sc.nextInt();

       int ans = calcPower(x, n);
       System.out.println(x+" raised to the power "+n+" is "+ans);
       
       System.out.println("To continue enter (1) or To stop enter (2) :");
       toContinue = sc.nextInt();
        } while(toContinue == 1);
       
    }
}
