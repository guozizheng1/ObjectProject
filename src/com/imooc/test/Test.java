package com.imooc.test;//�����
//import com.imooc.animal.*;//����com.imooc.animal�������е���
import com.imooc.animal.Cat;//����com.imooc.animal����ָ����Cat��
//import com.imooc.mechanics.*;
//import com.imooc.*;

public class Test {

	public static void main(String[] args) {
		Cat one = new Cat();
		one.setName("����");
		one.setMonth(2);
		one.setSpeices("Ӣ����ëè");
		one.price = 1000;
		Cat.price = 2000;
//		Cat two = new Cat();
//		two.setName("����");
//		two.setMonth(3);
//		two.setSpeices("�л���԰è");
//		two.price = 200;
		
		System.out.println(one.getName() + "���ۼ�" + one.price);
		//System.out.println(two.getName() + "���ۼ�" + two.price);
		//com.imooc.mechanics.Cat one = new com.imooc.mechanics.Cat();
		//ֱ�Ӽ���com.imooc.animal.CatTest
		com.imooc.animal.CatTest ct = new com.imooc.animal.CatTest();
	}

}
