public class BinarySearch
{
    public static void main(String[] args)
    {
        //sorted array
        int[] arr={-18,-4,12,13,15,16,22,24,35,56};
        int target=90;
        int ans=search(arr,target);
        System.out.println(ans);
    }

    //return index
    //return -1 if does not exist
    static int search(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            //int mid=(start+end)/2;
            //int has fixed size and after some amount of value yo cannot input value in integer.
            //might be possible that (start+end) exceeds the range of integer in java so we get error
            //so better to write ..
            int mid= start+(end-start)/2;

            if(target<arr[mid])
            {
                end=mid-1;
            }
            else if(target>arr[mid])
            {
                start=mid+1;
            }
            else
            {
                //element found at mid
                return mid;
            }

        }
        return -1;
    }
}
