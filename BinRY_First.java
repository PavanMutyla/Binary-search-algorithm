public class BinRY_First {
    public static void main(String[] args) {
    int[] a = {1,2,3,4,4,4,4,4,4,5};
    int[] ans = {-1,-1};
    int start = fun(a, 4, true);
    int end = fun(a, 4, false);
    a[0] = start;
    a[1] = end;
        System.out.println(start + "  "+end);
    }
   static int fun (int[] a, int target, boolean startind)
    {
        int start = 0;
        int end = a.length-1;
        int ans = -1;
        while (start<=end)
        {
            //int mid = (start+end)/2; we can use this, it may exceed  size of int
            int mid = start+(end-start)/2;
            if (target>a[mid])
            {
                start = mid+1;
            } else if (target<a[mid])
            {
                end = mid-1;
            }
            else
            {
                ans = mid;
                if(startind)
                {
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
        }
        return ans;
    }

}
