package com.jjy.dp.filter;

/**
 * 消息处理器
 * 专门处理msg
 * @author Administrator
 *
 */
public class MsgProcessor {
	private String msg;
	
	FilterChain fc;//过滤规则
	
   //需要处理规则
   public String process() {
	    
	return  fc.doFilter(msg);
   }

   
	public FilterChain getFc() {
		return fc;
	}
	
	
	public void setFc(FilterChain fc) {
		this.fc = fc;
	}

	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
   
}
