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
		System.out.println("가격: 250,000");
	}
	
	public void printType(String name) {
		System.out.println("이것은 "+name+"의 이화자전거입니다.");
	}
	
	public void printBrand() {
		System.out.println("브랜드: 이화만리");
	}
	public void printUserName() {
		System.out.print("사용자 입력: ");
	}
}
