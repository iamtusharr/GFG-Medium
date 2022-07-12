// { Driver Code Starts
import java.util.*;

class Magic
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
                  arr[i] = sc.nextInt();
            
            GfG gfg = new GfG();  
            System.out.println(gfg.binarySearch(arr, 0, n-1));
        }
    }
}
// } Driver Code Ends


class GfG
{
    public static int binarySearch(int arr[], int low, int high)
    {
       
        while( low <= high)
        {
        int mid = (low + high) / 2;
        if(mid < arr[mid])
        {
            high = mid - 1;
        }
        else if(mid > arr[mid])
        {
            low =  mid + 1;
        }
        else
        {
            return mid;
        }
    }
    return -1;
        // your code here
    }
}
