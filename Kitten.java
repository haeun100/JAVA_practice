package ch08;

import java.util.Scanner;
public class Kitten extends Cat{
	
	Scanner input=new Scanner(System.in);
	
	Kitten(){
		System.out.print("����� �̸�: ");
		String name=input.next();
		System.out.print("���� ����� "+name+"�� ");
		meow();
		meow();
		eat();
	}

}
