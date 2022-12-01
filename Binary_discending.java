public class Binary_discending {
    public static void main(String[] args) {
        int[] a = {5,4,3,2,1,0};
        int x = bin(a, 4);
        System.out.println(x);
    }
    static  int bin(int[] a, int target)
    {
        int start = 0;
        int end = a.length-1;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if (target>a[mid])
            {
                end = mid-1;
            }
            else if (target<a[mid])
            {
                start = mid+1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }

}
