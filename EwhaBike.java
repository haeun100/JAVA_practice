package ch09_1;

import java.util.Scanner;
public class EwhaBike extends Bike{
	EwhaBike(){
		printUserName();
		Scanner input=new Scanner(System.in);
		String name=input.next();
		printType(name);
		printBrand();
		printPrice();
	}
	
	public void printPrice() {
		System.out.println("����: 250,000");
	}
	
	public void printType(String name) {
		System.out.println("�̰��� "+name+"�� ��ȭ�������Դϴ�.");
	}
	
	public void printBrand() {
		System.out.println("�귣��: ��ȭ����");
	}
	public void printUserName() {
		System.out.print("����� �Է�: ");
	}
}
