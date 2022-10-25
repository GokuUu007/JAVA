import java.util.*;

public class findOccurance {

    public static int first = -1;
    public static int last = -1;

    public static void occurance(String str,int idx, char element) {

        if(idx == str.length()) {
            System.out.println("First occurance of "+element+" is at index = "+first);
            System.out.println("Last occurance of "+element+" is at index = "+last);
            return;
        }

        char currentchar = str.charAt(idx);
        if(currentchar == element) {
            if(first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }

        occurance(str, idx+1, element);

        
    }

    public static void main(String args[]) {
        System.out.println("Enter text : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Enter character :");
        char element = sc.next().charAt(0);

        occurance(str, 0, element);
        
        
    }
}
