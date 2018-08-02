class test8
{
static int[] arrs(int[] arr)
{
int n=arr.length;
	int j=n-1;
for(int i=0;i<n/2;i++)
{
int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
	j--;
	System.out.print("\n");
	}
return arr;
}
public static void main(String a[])
{
	int[] arr1=new int[]{50,40,30,20,10};
	//System.out.println(arr1);
	int[] rev=arrs(arr1);
	for(int i:rev)
	{
		System.out.print("\t"+i);
	}

}
}