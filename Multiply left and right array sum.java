// { Driver Code Starts
//Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

int multiply(int arr[], int n);


int main() {
	//code
	int t;
	cin>>t;
	while (t--)
	{
	    int n,sum1=0,sum2=0;
	    cin>>n;
	    int a[n];
	    for(int i=0;i<n;i++)
	        cin>>a[i];
	    
	    cout << multiply(a, n) << endl;
	    
	}
	return 0;
}// } Driver Code Ends


//User function Template for C++

int multiply(int arr[], int n)
{
    if(n == 2)
    {
        return arr[0] * arr[1];
    }
    int sum1 = 0;
    int sum2 = 0;
    int mult = 0;
    for(int i = 0 ; i < n ; i++)
    {
        if(i < n/2)
        {
            sum1 = sum1 +arr[i];
        }
        else
        {
            sum2 = sum2 + arr[i];
        }
        
    }
    return sum1 * sum2;
}
