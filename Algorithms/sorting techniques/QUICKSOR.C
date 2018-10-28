#include<stdio.h>
#include<conio.h>
int arr[]={99,88,55,66,77,22,10,6,100};
int size=sizeof(arr)/sizeof(arr[0]);
void swap(int x, int y)
{
	int temp=arr[x];
	arr[x]=arr[y];
	arr[y]=temp;
}
void Quicksort(int left, int right)
{
	if(left>=right)
		return;
	else
	{
		int pivot = arr[right];
		int partitionPoint = partition(left,right,pivot);
		Quicksort(left,partitionPoint-1);
		Quicksort(partitionPoint+1,right);

	}
}
int partition(int left, int right, int pivot)
{
	int leftptr = left-1;
	int rightptr = right;
	while(1)
	{
		while(arr[++leftptr]<pivot);
		while(rightptr>0 && arr[--rightptr]>pivot);
		if(leftptr>=rightptr)
			break;
		else
			swap(leftptr,rightptr);
	}
	swap(leftptr,right);
	return leftptr;
}

int main()
{
	int i;
	Quicksort(0,size-1);
	for(i=0;i<size;printf("%d ",arr[i++]));
	return 0;
}