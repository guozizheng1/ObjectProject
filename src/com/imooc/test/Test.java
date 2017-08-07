package com.imooc.test;//定义包
//import com.imooc.animal.*;//加载com.imooc.animal下面所有的类
import com.imooc.animal.Cat;//加载com.imooc.animal下面指定的Cat类
//import com.imooc.mechanics.*;
//import com.imooc.*;

public class Test {

	public static void main(String[] args) {
		Cat one = new Cat();
		Cat two = new Cat();
		//one.run("花花");
//		one.setName("花花");
//		one.setMonth(2);
//		one.setSpeices("英国短毛猫");
//		//静态成员访问方式：1、对象.成员。2、类.成员	
//		one.price = 1000;
//		Cat.price = 2000;
//		//one.eat();
//		//Cat.eat();
//		one.run();
////		Cat two = new Cat();
////		two.setName("凯特");
////		two.setMonth(3);
////		two.setSpeices("中华田园猫");
////		two.price = 200;
//		
//		System.out.println(one.getName() + "的售价" + one.price);
//		//System.out.println(two.getName() + "的售价" + two.price);
//		//com.imooc.mechanics.Cat one = new com.imooc.mechanics.Cat();
//		//直接加载com.imooc.animal.CatTest
//		com.imooc.animal.CatTest ct = new com.imooc.animal.CatTest();
	}

}
