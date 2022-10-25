import java.util.*;

public class Strictlyincreasing {

    public static boolean checkIncrease(int array[],int idx) {


        if(idx == array.length-1) {
            return true;
        }


        if(array[idx] < array[idx+1] ) {
            return checkIncrease(array, idx+1);
        } else {
            return false;
        }

    }

    public static void main(String args[]) {
        System.out.println("Enter size of your array :");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];
        
        System.out.println("Enter numbers of your list : ");

        for(int i=0; i<size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println(checkIncrease(array, 0));
    }
}
