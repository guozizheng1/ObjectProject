package com.imooc.animal;
//单一职责原则
public class CatTest {

	public static void main(String[] args) {
		//对象实例化
		Cat one = new Cat(3);
	
		//one.setName("花花");
		//one.setMonth(-3);
//		one.weight = 1000;
//		one.speices = "英国短毛猫";
//		
		if( one.getMonth()==0){
			return;
		}
		System.out.println("年龄:" + one.getMonth());
		//System.out.println("姓名:" + one.getName());
//		System.out.println("品种:" + one.speices);
//		System.out.println("体重:" + one.weight);
		
		//one.run();
	}

}