public class Binary_Search {
    public static void main(String[] args) {
      int[] ar = {1,2,3,4,5,6,7,8,9};
      int b = binar(ar, 8);
        System.out.println(b);
    }
    static int binar(int[] a, int target)
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
        return -1;
    }

}
