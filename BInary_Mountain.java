public class BInary_Mountain {
    public static void main(String[] args) {
        // mountain or bitonic array is an array that increses first snd decreases
        //{1,3,5,2,0}
        int[] arr = {1,2,3,4,5,0};
        int start = 0;
        int end = arr.length-1;
        while(start<end)
        {
            int mid = start+(end-start)/2;
            if(arr[mid]<arr[mid+1])
            {
                start = mid+1;
            }
            else
            {
                end = mid;
            }
        }
        // here the start nad end are pointing ti the same number which is the maximum
        System.out.println(start);
    }
}
