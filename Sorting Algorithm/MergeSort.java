sort the array using Merge Sort technique 



	
public class MergeSort
{
	
	public static void merge(int s, int e, int arr[])
	{
		int mid = (s + e) / 2;
		int mainIndex = s;
		int len1 = mid - s + 1;
		int len2 = e - mid;
		int first[] = new int[len1];
		int second[] = new int[len2];
		
		for(int i=0;i<len1;i++)
		{
			first[i] = arr[mainIndex++];
		}
		mainIndex = mid + 1;
		for(int i=0;i<len2;i++)
		{
			second[i] = arr[mainIndex++];
		}
		
		int i=0;
		int j=0;
		mainIndex = s;
		
		while(i<len1 && j<len2)
		{
			if(first[i] < second[j])
			{
				arr[mainIndex++] = first[i++];
			}
			else
			{
				arr[mainIndex++] = second[j++];
			}
		}
		while(i<len1)
		{
			arr[mainIndex++] = first[i++];
		}
		
		while(j<len2)
		{
			arr[mainIndex++] = second[j++];
		}
		
	}
	
	public static void mergeSort(int s, int e,int arr[])
	{
		int mid = (s + e) / 2;
		if(s >= e)
		{
			return;
		}
		else
		{
			mergeSort(s,mid,arr);
			mergeSort(mid+1, e, arr);
			merge(s,e,arr);
		}
	}
	public static void main(String args[])
	{
		int arr[] = {10,3,1,5,2,9,8};
		int n = arr.length;
		mergeSort(0,n-1,arr);
		for(int ele: arr)
			System.out.print(ele+ " ");
	}
}
