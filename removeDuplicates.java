import java.util.*;

public class removeDuplicates {
    public static boolean map[] = new boolean[26]; 
    public static void printOrgs(String str,String newString,int idx) {


        if(idx == str.length()) {
            System.out.println(newString);
            return;
        }

        char currentChar = str.charAt(idx);
        if(map[currentChar - 'a']) {
            printOrgs(str, newString, idx+1);
        } else {
            newString += currentChar;
            map[currentChar-'a'] = true;
            printOrgs(str, newString, idx+1);
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        printOrgs(str, "", 0);

    }
}
