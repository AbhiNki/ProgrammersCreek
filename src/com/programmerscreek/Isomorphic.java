package com.programmerscreek;

import java.util.HashMap;

public class Isomorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "add";
		String str2 = "bar";
		
		System.out.println(checkIsomorphic(str1, str2));

	}
	public static boolean checkIsomorphic(String str1, String str2)
	{
		if(str1 == null || str2 == null)
		{
			return false;
		}
		
		if(str1.length()!=str2.length())
		{
			return false;
		}
		HashMap<Character, Character> map =new HashMap<Character, Character>();
		for(int i =0;i<str1.length();i++)
		{
			char c1 = str1.charAt(i);
			char c2 = str2.charAt(i);
			
			if(map.containsKey(c1))
			{
				if(map.get(c1)!=c2)
					return false;				
			}
			else
				if(map.containsValue(c2))
					return false;
			map.put(c1, c2);
		}
		
		return true;
	}

}
