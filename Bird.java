package ch09_2;

import java.util.Scanner;
public class Bird implements Fly{

	Bird(){
		System.out.print("Bird ����: ");
		Scanner input=new Scanner(System.in);
		String name=input.next();
		fly(name);
		eat(name);
	}
	
	public void fly(String name) {
		System.out.println(name+"�� �ϴ��� ����.");
	}
	
	public void eat(String name) {
		System.out.println(name+"�� ���̸� �Դ´�.");
	}
}
