package ch09_2;

import java.util.Scanner;
public class Chicken implements Fly,Walk{
	Chicken(){
		System.out.print("Chicken 종류: ");
		Scanner input=new Scanner(System.in);
		String name=input.next();
		see(name);
		fly(name);
		walk(name);
		eat(name);
	}
	
	public void see(String name) {
		System.out.println(name+"는 눈 앞을 본다.");
	}
	public void fly(String name) {
		System.out.println(name+"는 뜀박질로 난다.");
	}
	public void walk(String name) {
		System.out.println(name+"는 종종 걸어다닌다.");
	}
	public void eat(String name) {
		System.out.println(name+"는 모이를 먹는다.");
	}

}
