package com.imooc.animal;
/**
 * ����è��
 * @author admin
 *
 */

public class Cat {

	//���ԣ��ǳơ����䡢���ء�Ʒ��
	//�޸����ԵĿɼ���--private �޶�ֻ�ڵ�ǰ���ڷ���
	private String name;//�ǳ� Ĭ��ֵΪnull
	private int month;//����  Ĭ��ֵΪ 0
	private double weight;//���� Ĭ��ֵΪ0.0
	private String speices;//Ʒ�� Ĭ��ֵΪnull
	//��ʾһ����̬�� ��̬��Ա ���Ա
	//static+��̬���� -->>��̬���ԡ�������
	public static int price;//�۸�
	
	static{
		System.out.println("���Ǿ�̬�����1");
	}//��̬�����
	
	public Cat(){
		//static+�ֲ������ǲ����ڵ�
		//static int temp =14;
		System.out.println("���ǳ���è~~");
	}
	
	{
		name = "����";
		price = 12;
		System.out.println("���ǹ�������1");
	}//��������
	
	static{
		Cat tmp = new Cat();
		tmp.name = "";
		price = 800;
		System.out.println("���Ǿ�̬�����2");
	}//��̬�����
	
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
	//����get/set����
	//get/set��������Ӷ����Ե��޶�
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return "����һֻ�У�" + this.name + "��";
	}
	
	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month<=0){
			System.out.println("������Ϣ���󣬳���è������������0");
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

	//�������ܶ����Զ���
	//�ܶ��ķ���
	public void run() {
		eat();
		this.name = "��";
		this.price = 20;
		System.out.println("�ۼ�Ϊ"+Cat.price+"��"+this.name+"Сè����");
	}
	
	public void run(String name) {
		{
			System.out.println("������ͨ�����1");
		}//��ͨ�����1
		System.out.println(name + "Сè����");
		{
			System.out.println("������ͨ�����2");
		}//��ͨ�����2
	}
	//�Զ����ķ���
	//static+����--���෽������̬����
	public static void eat() {
		//��̬�������в���ֱ�ӷ���ͬһ�����еķǾ�̬��Ա��ֻ��ֱ�ӵ���ͬһ�����еľ�̬��Ա
		//�����Ҫ���ã�ֻ��ͨ������ʵ�����ķ�����������.��Ա/���� �ķ�ʽ�����÷��ʷǾ�̬��Ա
		Cat temp = new Cat();
		temp.run();
		temp.name = "С��";//��̬�����в���ʹ��this�ؼ���
		temp.name = "";//
		System.out.println("Сè����");
	}

}


