import java.util.Arrays;
public class Binary_2D {
    public static void main(String[] args) {

        int[][] a = {
                {1, 2, 3, 4},
                {11, 22, 33, 44},
                {21, 31, 41, 51},
        };
        System.out.print(Arrays.toString(search(a, 51)));


      }

    static int[] search(int[][] a, int target) {
        int r = 0;
        int c = a.length ;

        while (r < a.length && c > 0) {
            if ( a[r][c] == target)
            {
                return new int[]{r,c};
            }
            else if( a[r][c] > target)
            {
                c--;
            }
            else {
                r++;
            }
        }


   return new int[] {-1,-1};
    }

}