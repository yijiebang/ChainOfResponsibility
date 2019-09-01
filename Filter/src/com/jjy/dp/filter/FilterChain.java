package com.jjy.dp.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
	//���һϵ��
	List<Filter> filters=new ArrayList<Filter>();
	
	/**
	 * ���Filter
	 * @param f
	 * @return
	 */
	public FilterChain addFilter(Filter f) {
		this.filters.add(f);
		return this;
	}
	/**
	 * ����õ�FIlter����Filter������Ϣ
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
