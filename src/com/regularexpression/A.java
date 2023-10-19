package com.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("[abc]");
		Matcher m = p.matcher("a6$b#ec");
		while(m.find())
		{
			System.out.println(m.group()+"...."+m.start());
		}

	}

}
