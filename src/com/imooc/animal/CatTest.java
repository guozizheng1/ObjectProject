package com.imooc.animal;

public class CatTest {

	public static void main(String[] args) {
		//对象实例化
		Cat one = new Cat();
		//调用方法
		one.run();
		one.eat();
		one.name = "花花";
		one.month = 4;
		one.weight = 1000;
		one.speices = "英国短毛猫";
		System.out.println("年龄:" + one.month);
		System.out.println("姓名:" + one.name);
		System.out.println("品种:" + one.speices);
		System.out.println("体重:" + one.weight);
		one.run(one.name);
	}

}
