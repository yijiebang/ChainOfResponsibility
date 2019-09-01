package com.jjy.dp.filter;

import com.jjy.dp.filter.filterClass.FaceFilter;
import com.jjy.dp.filter.filterClass.HTMLFilter;

public class Main {

	public static void main(String[] args) {
       
	 String msg="��Һã�:)<script>,����";
     MsgProcessor mp=new MsgProcessor();
     mp.setMsg(msg);
     
     //������Ҫ���õĹ���
     FilterChain fc=new FilterChain();
     fc.addFilter(new HTMLFilter())  //�������������
       .addFilter(new FaceFilter());//�������������
     
     mp.setFc(fc);//ʹ�ù�����
     
     String result=mp.process();
     System.out.println(result);
    
	}

}
