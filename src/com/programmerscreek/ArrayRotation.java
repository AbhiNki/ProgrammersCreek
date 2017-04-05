package com.programmerscreek;


public class ArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,5,6,7,8,9};
		int order = 4;
		
		//reverse1(array, order);
		//reverse2(array, order);
		reverse3(array, order);

	}
	
	public static void reverse1(int[] array, int order) //O[n]
	{
		if(array == null)
		{
			System.out.println("Not a valid array");
			System.exit(0);
		}
		int[] result = new int[array.length];
		for(int i=0;i<order;i++)
		{
			result[i]=array[array.length-order+i];
		}
		
		for(int i=0;i<array.length-order;i++)
		{
			result[order+i]= array[i];
		}
		for(int r:result)
		{
			System.out.print(r+" ");
		}
		System.out.println();
	}
	public static void reverse2(int[] array, int order) //bubble 
	{
		for(int i=0;i<order;i++)
		{
			for(int j=array.length-1;j>0;j--)
			{
				int temp = array[j];
				array[j]= array[j-1];
				array[j-1]=temp;
			}
		}
		for(int i : array)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static void reverse3(int[] array, int order)
	{
		if(array==null || array.length == 0 || order < 0)
		{
			System.out.println("Illegal argument");
		}
		
		if(order > array.length)
		{
			order = order % array.length;
		}
		
		int a = array.length-order;
		divideAndReverse(array, 0, a-1);
		divideAndReverse(array, a, array.length-1);
		divideAndReverse(array, 0, array.length-1);
		
		for(int i: array)
		{
			System.out.print(i+" ");
		}
	}
	public static void divideAndReverse(int[] array, int leftIndex, int rightIndex)
	{
		if(array == null || array.length == 1)
		{
			return;
		}
		while(leftIndex < rightIndex)
		{
			int temp = array[leftIndex];
			array[leftIndex] = array[rightIndex];
			array[rightIndex] = temp;
			leftIndex++;
			rightIndex--;
			
		}
		
		//for(int i: array)
		//	System.out.print(i+" ");
		//System.out.println();
		
	}

}
