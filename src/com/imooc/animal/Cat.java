package com.imooc.animal;
/**
 * ����è��
 * @author admin
 *
 */

public class Cat {

	//���ԣ��ǳơ����䡢���ء�Ʒ��
	String name;//�ǳ� Ĭ��ֵΪnull
	int month;//����  Ĭ��ֵΪ 0
	double weight;//���� Ĭ��ֵΪ0.0
	String speices;//Ʒ�� Ĭ��ֵΪnull
	
	//�������ܶ����Զ���
	//�ܶ��ķ���
	public void run() {
		System.out.println("Сè����");
	}
	//��������
	public void run(String name) {
		System.out.println(name + "Сè����");
	}
	//�Զ����ķ���
	public void eat() {
		System.out.println("Сè����");
	}

}
