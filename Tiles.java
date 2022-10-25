import java.util.*;

public class Tiles {
    public static int placmemntTiles(int n, int m) {

        if(n==m) {
            return 2;
        }
        if(n<m) {
            return 1;
        }

        //vertical placement
        int vertical= placmemntTiles(n-m, m);

        //horizontal placement
        int horizontal =placmemntTiles(n-1, m);

        return vertical + horizontal;
    }

    public static void main(String args[]) {
    System.out.println("Enter size of floor :");
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int m = sc.nextInt();
       
       int totplacement = placmemntTiles(n, m);

       System.out.println("The total ways to fill the floor = "+totplacement);
    }
}
