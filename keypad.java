import java.util.*;

public class keypad {
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void nokia(String str, int idx, String combination) {

        if(idx == str.length()) {
            System.out.println(combination);
            return;
        }

        char currentChar = str.charAt(idx);
        String mapping = keypad[currentChar - '0'];

        for(int i=0; i<mapping.length(); i++) {
            nokia(str, idx+1, combination+mapping.charAt(i));
        }
    }

    public static void main(String args[]) {
        System.out.println("Enter the keys you wanna press :");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String combination = "";


        System.out.println("The possible combinations are :");

        nokia(str, 0, combination);

    }
}
