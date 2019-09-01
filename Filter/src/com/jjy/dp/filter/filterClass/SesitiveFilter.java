package com.jjy.dp.filter.filterClass;

import com.jjy.dp.filter.Filter;

public class SesitiveFilter implements Filter{

	@Override
	public String doFilter(String str) {
		String r=str.replace("√Ù∏–","");
 		return r;
	}

}
