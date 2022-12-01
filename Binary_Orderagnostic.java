public class Binary_Orderagnostic {
    public static void main(String[] args) {
        // Orderagnostic is that we are given an array but we dont know if it is sorted in which order
        // the function works for the both orders
        int[] a = {5,4,3,2,1};
      int x =  order(a, 2);
        System.out.println(x);
    }
    static int order(int[] a, int target)
    {
        int start = 0;
        int end = a.length-1;
        boolean ascen = a[start]<a[end];
        while (start<=end)
        {
            int mid = start+(end-start)/2;
            if (a[mid]==target)
            {
                return mid;
            }
            if (ascen)
            {
                if (target<a[mid])
                {
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
            else
            {
                if (target>a[mid])
                {
                    end = start-1;
                }
                else
                {
                    start = mid+1;
                }
            }
        }
        return -1;
    }

}
