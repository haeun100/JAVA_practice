package ch09_1;

import java.util.Scanner;
public class EwhaCar extends Car{
	EwhaCar(){
		printUserName();
		Scanner input=new Scanner(System.in);
		String name=input.next();
		printType(name);
		printBrand();
		printPrice();
	}
	
	public void printPrice() {
		System.out.println("����: 150,000,000");
	}
	
	public void printType(String name) {
		System.out.println("�̰��� "+name+"�� ��ȭ�ڵ����Դϴ�.");
	}
	
	public void printBrand() {
		System.out.println("�귣��: EwhaKorea");
	}
	
	public void printUserName() {
		System.out.print("����� �Է�: ");
	}
}
