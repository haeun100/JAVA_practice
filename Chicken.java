package ch09_2;

import java.util.Scanner;
public class Chicken implements Fly,Walk{
	Chicken(){
		System.out.print("Chicken ����: ");
		Scanner input=new Scanner(System.in);
		String name=input.next();
		see(name);
		fly(name);
		walk(name);
		eat(name);
	}
	
	public void see(String name) {
		System.out.println(name+"�� �� ���� ����.");
	}
	public void fly(String name) {
		System.out.println(name+"�� �ܹ����� ����.");
	}
	public void walk(String name) {
		System.out.println(name+"�� ���� �ɾ�ٴѴ�.");
	}
	public void eat(String name) {
		System.out.println(name+"�� ���̸� �Դ´�.");
	}

}
