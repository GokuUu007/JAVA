import java.util.*;

public class quicksort {

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i =  low-1;

        for(int j=low; j<high; j++) {
            if(arr[j] < pivot) {
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i; //pivot index
    }
    public static void sort(int arr[], int low, int high) {

        if(low < high) {
            int pidx = partition(arr, low, high);

            sort(arr, low, pidx-1);
            sort(arr, pidx+1, high);
        }
    }
    public static void main(String args[]) {
        System.out.println("Enter size of your array :");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int n = arr.length;

        System.out.println("Fill numbers in your array :");

        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        sort(arr, 0, n-1);

        System.out.println("Your array is sorted :");

        for(int i=0; i<n; i++)  {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
