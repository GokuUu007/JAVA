import java.util.HashSet;
import java.util.*;

public class Subsequences {
    public static void printSubsequence(String str,int idx,String newString,HashSet<String> set) {

        if(idx == str.length()) {
            if(set.contains(newString)) {
                return;
            } else {
            System.out.println(newString);
            set.add(newString);
            return;
            }
        }
        
        
        char currentChar = str.charAt(idx);

        printSubsequence(str, idx+1, newString+currentChar, set);

        printSubsequence(str, idx+1, newString, set);
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String str = sc.nextLine();
        HashSet<String> set = new HashSet<>();

        printSubsequence(str, 0, "", set);
    }
}
