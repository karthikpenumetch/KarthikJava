public class karthik
{
	public static void main(String[] args)
	{
		int array[] = new int[5];
        	for(int i = 0; i < array.length; i++)
        	{
            		array[i] = (int)(Math.random()*5)+1;
            		System.out.print(array[i] + " ");
        	}
        	System.out.println();
        	int sum = 0;
        	int arr[] = new int[5];
        	for(int j = 0; j < arr.length; j++)
        	{
            		if(j > 1)
            		{
                		sum = array[j-2] + array[j-1];
                		array[j] = sum;
            		}
            		else
            		{
                		arr[j] = array[j];
            		}
            		if(j >= 2)
            		{
                		arr[j] = sum;
            		}
            		System.out.print(arr[j] + " ");
        	}
        	System.out.println();	
	}
}
