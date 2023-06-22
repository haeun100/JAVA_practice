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
		System.out.println("가격: 150,000,000");
	}
	
	public void printType(String name) {
		System.out.println("이것은 "+name+"의 이화자동차입니다.");
	}
	
	public void printBrand() {
		System.out.println("브랜드: EwhaKorea");
	}
	
	public void printUserName() {
		System.out.print("사용자 입력: ");
	}
}
