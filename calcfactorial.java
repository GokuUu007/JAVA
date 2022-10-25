import java.util.*;

public class calcfactorial {
    public static int printFactorial(int  i,int n) {
        
        if(n == 0 ) {
            return 1;
        }

    int nm_1 = printFactorial(i++, n-i);
    int nfac = n*nm_1;
    return nfac;

  }

  public static void main(String args[]) {
    int toContinue;
    do{
    System.out.println("Enter number to calculate factorial : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int factorial = printFactorial(0, n);
    System.out.println(n+" factorial = "+factorial);

    System.out.println("To continue enter (1) or To stop enter (2) :");
    toContinue = sc.nextInt();
    
    } while(toContinue == 1);
  }
    
}
