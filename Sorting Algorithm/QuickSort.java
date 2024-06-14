public class QuickSort
{
	public static int partition(int s, int e, int arr[])
	{
		int pivot = arr[s];
		int count = 0;
		for(int i=s+1;i<=e;i++)
		{
			if(arr[i] <= pivot)
			{
				count++;
			}
		}
		
		int pivotIndex = count + s ;
		
		int temp = arr[pivotIndex];
		arr[pivotIndex] = arr[s];
		arr[s] = temp;
		
		int i=s;
		int j=e;
		while(i<pivotIndex && j > pivotIndex)
		{
			while(arr[i]<=pivot)
			{
				i++;
			}
			while(arr[j] > pivot)
			{
				j--;
			}
			if(i<pivotIndex && j > pivotIndex)
			{
				int temp1 = arr[i];
				arr[i] = arr[j];
				arr[j] = temp1;
				i++;
				j--;
			}
		}
		
		return pivotIndex;
		
		
	}
	public static void quickSort(int s, int e, int arr[])
	{
		if(s >= e)
		{
			return;
		}
		else 
		{
			int p = partition(s,e,arr);
			quickSort(s, p-1, arr);
			quickSort(p+1, e, arr);
		}
		
	}
	public static void main(String args[])
	{
		int arr[] = {5,1,15,6,3,8,11};
		int n = arr.length;
		quickSort(0,n-1,arr);
		for(int e : arr)
			System.out.print(e + " ");
	}
}
