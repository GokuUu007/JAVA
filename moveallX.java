import java.util.*;

public class moveallX {
    public static void moves(String str,String newString,int idx, int count,char input) {

        if(idx == str.length()) {
            for(int i=0; i<count; i++) {
                newString += input;
            }
            System.out.print(newString);
            return;
        }

        char currentChar = str.charAt(idx);

        if(currentChar == input) {
            count += 1;
            moves(str, newString, idx+1, count, input);
        } else {
            newString += currentChar;
            moves(str, newString, idx+1, count, input);
        }

        
    }

    public static void main(String args[]) {


        System.out.println("Enter text :");

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String newString = "";
        System.out.println("Enter character you wanna move at last :");
        char input = sc.next().charAt(0);
        int count = 0;

        moves(str, newString, 0, count, input);

        
    }
}
