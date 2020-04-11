package com.maven.sample.app;

public class Tdd_Junit {

	public String processing(String string) {
		String result=string;
		if(string.length()==1)
		{
			if(string.charAt(0)=='A')
				result="";
		}
		if(string.length()>=2)
		{
			if(string.charAt(0)=='A')
			{
				if(string.charAt(1)=='A')
					result = string.substring(2, string.length());
				else
					result = string.substring(1, string.length());
			}
			else
			{
				if(string.charAt(1)=='A')
					result = string.charAt(0)+string.substring(2,string.length());
				
			}
		}
		return result;
		
		
	}

}
