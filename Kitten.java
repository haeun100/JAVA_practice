package ch08;

import java.util.Scanner;
public class Kitten extends Cat{
	
	Scanner input=new Scanner(System.in);
	
	Kitten(){
		System.out.print("고양이 이름: ");
		String name=input.next();
		System.out.print("새끼 고양이 "+name+"가 ");
		meow();
		meow();
		eat();
	}

}
