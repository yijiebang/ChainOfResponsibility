package com.jjy.dp.filter;

import com.jjy.dp.filter.filterClass.FaceFilter;
import com.jjy.dp.filter.filterClass.HTMLFilter;

public class Main {

	public static void main(String[] args) {
       
	 String msg="大家好：:)<script>,敏感";
     MsgProcessor mp=new MsgProcessor();
     mp.setMsg(msg);
     
     //定义需要调用的规则
     FilterChain fc=new FilterChain();
     fc.addFilter(new HTMLFilter())  //规则链加入规则
       .addFilter(new FaceFilter());//规则链加入规则
     
     mp.setFc(fc);//使用规则链
     
     String result=mp.process();
     System.out.println(result);
    
	}

}
