class Solution
{
	int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        int n=arr.length;
        for(int j=i+1; j < n; j++){
            //loop through the subarray
            if(arr[j] < arr[i]){//compare to swap if value is larger
                i=j; //to set j as its larger value to be swapped
            }
        }
        return i;//the index to be returned for swapping
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    
	    for(int i=0; i < n-1; i++){
	        //send the subarray to the select func to retrieve the value we need
	        int tmp_index=select(arr, i);
	        int tmp= arr[tmp_index];//retrieve value to be swapped
	        arr[tmp_index]=arr[i]; //swapping for the value
	        arr[i]=tmp; //swapping for the larger
	    }
	}
}
