package com.epam.tddjunit;

public class Remove {
	public  String remove(String string) 
	{
		String res = "";
		char ch[] = string.toCharArray();
		for(int pos=0;pos<ch.length;pos++)
		{
			if(pos==0 || pos==1)
			{
				if(ch[pos]!='A')
				{
					res = res + ch[pos];
				}
			}
			else
			{
				res = res + ch[pos];
			}
		}
		return res;
	}
}
