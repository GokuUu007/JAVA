import java.util.*;

public class reverseString {

    public static void printString(String str, int idx) {
        if(idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }

        System.out.print(str.charAt(idx));
        printString(str, idx-1);
    }
    public static void main(String args[]) {
        int input;
        do{
        System.out.println("Enter text you want to reverse :");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println("Your reversed text :");
        printString(str, str.length()-1);
        System.out.println("To continue enter (1)");
        input = sc.nextInt();
        }while (input == 1);
    }
}
