import java.util.*;

public class permutation {
    public static void printperm(String str,String Permutation) {

        if(str.length() == 0) {
            System.out.println(Permutation);
            return;
        }

        for(int i=0; i<str.length(); i++) {

            char currChar = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i+1);
            printperm(newstr, Permutation+currChar);
        }

    }

    public static void main(String args[]) {
        System.out.println("Enter text :");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String Permutation = "";



        System.out.println("The total permutation are given below :");
        printperm(str, Permutation);
    }


}