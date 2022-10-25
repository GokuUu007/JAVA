import java.util.Scanner;

public class sumOfnum {
    public static void printsum(int i,int n, int sum) {
        if(i == n) {
            sum +=i;
            System.out.println(sum);
            return;
        }

        sum += i;
        printsum(i+1, n, sum);
    }
    
    public static void main(String args[]) {
        int tocontinue;
        do{
        System.out.println("Enter number till where u wanna calculate sum :");
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;

        System.out.println("Sum of first " +n+ " number is :");
        printsum(i, n, 0);
        System.out.println("to continue enter (1)");
        tocontinue = sc.nextInt();
        }while (tocontinue == 1);
    }
}
