package com.jjy.dp.filter;

/**
 * ��Ϣ������
 * ר�Ŵ���msg
 * @author Administrator
 *
 */
public class MsgProcessor {
	private String msg;
	
	FilterChain fc;//���˹���
	
   //��Ҫ�������
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
