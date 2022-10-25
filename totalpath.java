import java.util.*;

public class totalpath {
    

    public static int countpath(int i,int j,int n, int m) {

        if(i == n || j == m) {
            return 0;
        }
        if(i == n-1 && j==m-1) {
            return 1;
        }




        //move downwards
        int downwards = countpath(i+1, j, n, m);

        //move rightwards
        int rightwards = countpath(i, j+1, n, m);

        return downwards + rightwards;
    }

    public static void main(String args[]) {

        System.out.println("Enter matrix size :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Enter indice :");
        int i = sc.nextInt();
        int j = sc.nextInt();

        int paths = countpath(i, j, n, m);
        System.out.println(paths);
    }
}
