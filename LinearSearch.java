public class LinearSearch
{
    public static void main(String[] args)
    {
        int[] arr={12,15,20,89};
        int target=15;
        int ans=search(arr,target);
        System.out.println("element "+target+" found at index "+ans);
    }

    static int search(int[] arr, int target)
    {
        if(arr.length==0)
        {
            return -1;
        }

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                return i;
            }
        }

        //if target not found
        return -1;

        //when a case that element -1 is in array then return as
        //return Integer.MAX_VALUE;
    }
}
