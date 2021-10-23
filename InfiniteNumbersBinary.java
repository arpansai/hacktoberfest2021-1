class InfiniteNumbersBinary
{
    public static void main(String[]args)    {
     int[] arr={3,5,7,9,10,90,100,130,140,160,170};
     int target=10;
     System.out.println(findingRange(arr,target));

    }
    static int findingRange(int []arr,int target)
    {
        //find the range
        //start with the box of size 2 and go to infinite
        int start =0;
        int end =1;
        //condition for the target to lie in the range that is the target should be less than end 
        //if the target is greater than the end then keep on doubling the range
        while(target>arr[end]){
            int newstart=end+1;
            //double the box value. end = prev end +size of box *2
            end = end +(end-start+1)*2;
            start=newstart;
        }
        return binarysearch(arr,target,start,end);
    }
    static int binarysearch(int [] arr,int target,int start,int end)
{ 
    int mid;
    
    while(start<=end)
    {
        mid = start+(end-start)/2;
        if (target<arr[mid])
        {
            end=mid-1;
        }
       else if (target>arr[mid])
        {
            start=mid+1;
        }
        else
        {
            return mid;
        }
        }
        return -1;
        
    }
}