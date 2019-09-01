package com.jjy.dp.filter.filterClass;

import com.jjy.dp.filter.Filter;

public class FaceFilter implements Filter{

	@Override
	public String doFilter(String str) {
		
		return str.replace(":)","^V^");
	}
	

}
