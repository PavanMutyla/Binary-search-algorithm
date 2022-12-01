public class Binary_al {
    public static void main(String[] args) {
         char[] a = {'a','b','d'};
         char target = 'c';
       char x =   al(a, target);
        System.out.println(x);
    }
    static char al(char[] a, char target)
    {
        int start = 0;
        int end = a.length-1;
        while (start<=end)
        {
            int mid = start+(end-start)/2;
            if(target>a[mid])
            {
                start= mid+1;
            }
            else {
                end = mid-1;
            }
        }

        return a[start % a.length];
    }
}
