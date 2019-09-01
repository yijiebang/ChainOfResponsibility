package com.jjy.dp.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
	//存放一系列
	List<Filter> filters=new ArrayList<Filter>();
	
	/**
	 * 添加Filter
	 * @param f
	 * @return
	 */
	public FilterChain addFilter(Filter f) {
		this.filters.add(f);
		return this;
	}
	/**
	 * 将存好的FIlter调用Filter处理消息
	 * @param str
	 * @return
	 */
	public String doFilter(String str) {
		   String r=str; 
		   for (Filter f:filters) {
	 		r=f.doFilter(r);
		   }
		return r;
	}

}
