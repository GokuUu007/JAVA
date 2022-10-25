import java.util.*;

public class fibbonaci2 {
    public static void printseries(int a, int b,int n) {
        if(n == 0) {
            return;
        }
        int c = a+b;
        System.out.print(c+" " );
        printseries(b, c, n-1);
        
    }


    public static void main(String args[]) {
        int toContinue;
        do{
        System.out.println("Enter number :");
        Scanner sc= new Scanner(System.in);
        int a = 0;
        int b = 1;
        int n = sc.nextInt();


        System.out.println("Series :");
        System.out.print(a+" "+b+" ");
        printseries(a, b, n-2);
        System.out.println();
        System.out.println("To continue enter (1) or To stop enter (2) :");
        toContinue = sc.nextInt();
        } while(toContinue == 1);
    }
}
