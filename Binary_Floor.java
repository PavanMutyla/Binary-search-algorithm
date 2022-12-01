public class Binary_Floor {
    public static void main(String[] args) {
        //it is the greatest number that is smaller or equal to target number
        int[] a = {1,2,3,5,6};
        int target = 4;
      int x =  floor(a, target);
        System.out.println(x);
    }
    static  int floor(int[] a, int target)
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
        return end;
    }
}
