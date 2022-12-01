public class Binary_cieling {
    public static void main(String[] args) {
        // ceilling is smallest number that is greater than or equal to target
        int[] a = {1,2,3,5,6,7};
        int targert = 4;
        int x = gt(a, targert);
        System.out.println(x);

    }
    static  int gt(int[] a, int target)
    {
        int start = 0;
        int end = a.length-1;
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
                return mid;
            }
        }
        return start;
    }

}
