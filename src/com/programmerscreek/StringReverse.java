package com.programmerscreek;

import java.util.Collections;
import java.util.List;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string ="the sky is blue";
		//reverse1(string); //reverse by chars
		//reverse2(string); //reverse by string
		reverse3(string); //using library functions
		reverse4(string); //using library functions

	}
	
	public static void reverse1(String string) //reverse by chars
	{
		StringBuilder sb =new StringBuilder();
		char[] charArr = string.toCharArray();
		for(int i=charArr.length-1;i>=0;i--)
		{
			sb.append(charArr[i]);
		}
		
		System.out.println(sb.toString());
	}
	
	public static void reverse2(String string) //reverse by string
	{
		char[] charArr= string.toCharArray();
		int i=0;
		for(int j=0;j<charArr.length;j++)
		{
			if(charArr[j]==' ')
			{
				reverse2sub(charArr, i, j-1);        
	            i=j+1;
	        }
	    }
	 
	    reverse2sub(charArr, i, charArr.length-1);
	 
	    reverse2sub(charArr, 0, charArr.length-1);
	    
	    StringBuilder sb = new StringBuilder();
	    for(char c: charArr)
	    	sb.append(c);
	    
	    System.out.println(sb.toString());
	}
	
	public static void reverse2sub(char[] charArr, int i, int j)
	{
		while(i<j)
		{
			char temp = charArr[i];
			charArr[i] = charArr[j];
			charArr[j] = temp;
			i++;
			j--;
		}
		
		StringBuilder sb = new StringBuilder();
	    for(char c: charArr)
	    	sb.append(c);
	    System.out.println(sb.toString());
		
	}
	
	public static void reverse3(String str)
	{
		String[] strArr = str.split("\\s");
		StringBuilder sb = new StringBuilder();
		for(int i =strArr.length-1;i>=0;i--)
		{
			sb.append(strArr[i]);
			sb.append(" ");
		}
		
		System.out.println(sb.toString());
	}
	
	public static void reverse4(String str)
	{
		String[] strArr = str.split(" ");
		int left = 0;
		int right = strArr.length-1;
		while(left < right)
		{
			String temp = strArr[left];
			strArr[left] = strArr[right];
			strArr[right] = temp;
			left++;
			right--;
		}
		
		StringBuilder sb =new StringBuilder();
		for(String s: strArr)
		{
			sb.append(s+" ");
		}
		System.out.println(sb.toString());
	}
	

}
