package ch08;

import java.util.Scanner;
public class Poppy extends Dog{
	
	Scanner input=new Scanner(System.in);
	
	Poppy(){
		System.out.print("������ �̸�: ");
		String name=input.next();
		System.out.print("���� ������ "+name+"�̰� ");
		bark();
		bark();
		eat();
	}

}
