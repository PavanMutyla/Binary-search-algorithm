import java.util.Arrays;
//import java.util.Scanner;

public class Binary_2D_2 {
    public static void main(String[] args){
        // here int his array the elements are sorted strictly
        //i.e the elements are continues numbers
        int[][] a = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
        };
        System.out.println(Arrays.toString(search(a, 10)));
    }
    static int[] search(int[][] a, int target)
    {
        int row = a.length;
        int col = a[0].length;
        if(row == 0)
        {
            return single(a, 0, 0, col-1, target);

        }
        int rs = 0;
        int re = a.length-1;
        int cm = col/2;
        while(rs<(re-1))
        {
            int mid = rs+(re-rs)/2;
            if(a[mid][cm] == target)
            {
                return new int[]{mid,cm};
            }
            else if(target > a[mid][cm])
            {
                rs = mid+1;
            }
            else {
                re = mid;
            }
        }
        // now there are two rows
        // check if tar is in the middle column of two rows
        if(target == a[rs][cm])
        {
            return new int[]{rs,cm};
        }
        else if(target ==a[rs+1][cm])
        {
            return new int[]{rs+1,cm};
        }
        // check in first part
        if(target <= a[rs][cm-1])
        {
           return single(a, rs, 0, cm-1, target);
        }
        // second part
        if(target >= a[rs][cm+1] && target <= a[rs+1][col-1])
        {
            return single(a, rs, cm+1, col-1, target);

        }
        // third part
        if(target <= a[rs+1][cm-1])
        {
            return single(a, rs+1, 0, cm-1, target);
        }
        // fourth part
        else
        {
            return single(a, rs+1, cm+1, col-1, target);
        }


    }

    static int[] single(int[][] a, int row, int cs, int ce, int target )
    {
        // here the search is in single row it searches for the target in a specific row with in the column limits
        // cs is column start
        // ce is column end
        while (cs<ce)
        {
            int mid = cs+(ce-cs)/2;
            if(a[row][mid] == target)
            {
                return new int[]{row, mid};
            }
            else if(target > a[row][mid])
            {
                cs = mid-1;
            }
            else {
                ce  = mid+1;
            }
        }
        return new int[]{-1,-1};
    }

}
