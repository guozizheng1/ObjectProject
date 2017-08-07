package com.imooc.animal;
/**
 * 宠物猫类
 * @author admin
 *
 */

public class Cat {

	//属性：昵称、年龄、体重、品种
	//修改属性的可见性--private 限定只在当前类内访问
	private String name;//昵称 默认值为null
	private int month;//年龄  默认值为 0
	private double weight;//体重 默认值为0.0
	private String speices;//品种 默认值为null
	//表示一个静态的 静态成员 类成员
	//static+静态属性 -->>静态属性、类属性
	public static int price;//价格
	
	static{
		System.out.println("我是静态代码块1");
	}//静态代码块
	
	public Cat(){
		//static+局部变量是不存在的
		//static int temp =14;
		System.out.println("我是宠物猫~~");
	}
	
	{
		name = "兽兽";
		price = 12;
		System.out.println("我是构造代码块1");
	}//构造代码块
	
	static{
		Cat tmp = new Cat();
		tmp.name = "";
		price = 800;
		System.out.println("我是静态代码块2");
	}//静态代码块
	
	public Cat(int month){
		//this.month = month;
		this.setMonth(month);
	}
	
	public Cat(String name, int month, double weight, String speices){
		this.name = name;
		this.month = month;
		this.weight = weight;
		this.speices = speices;
	}
	//创建get/set方法
	//get/set方法中添加对属性的限定
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return "我是一只叫：" + this.name + "的";
	}
	
	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month<=0){
			System.out.println("输入信息错误，宠物猫的年龄必须大于0");
		}else{
			this.month = month;
		}
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getSpeices() {
		return speices;
	}

	public void setSpeices(String speices) {
		this.speices = speices;
	}

	//方法：跑动、吃东西
	//跑动的方法
	public void run() {
		eat();
		this.name = "妞妞";
		this.price = 20;
		System.out.println("售价为"+Cat.price+"的"+this.name+"小猫快跑");
	}
	
	public void run(String name) {
		{
			System.out.println("我是普通代码块1");
		}//普通代码块1
		System.out.println(name + "小猫快跑");
		{
			System.out.println("我是普通代码块2");
		}//普通代码块2
	}
	//吃东西的方法
	//static+方法--》类方法、静态方法
	public static void eat() {
		//静态方法当中不能直接访问同一个类中的非静态成员，只能直接调用同一个类中的静态成员
		//如果非要调用，只有通过对象实例化的方法，对象名.成员/方法 的方式来调用访问非静态成员
		Cat temp = new Cat();
		temp.run();
		temp.name = "小胖";//静态方法中不能使用this关键字
		temp.name = "";//
		System.out.println("小猫吃鱼");
	}

}


