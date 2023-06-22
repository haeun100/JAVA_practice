package ch08;

import java.util.Scanner;
public class Poppy extends Dog{
	
	Scanner input=new Scanner(System.in);
	
	Poppy(){
		System.out.print("강아지 이름: ");
		String name=input.next();
		System.out.print("새끼 강아지 "+name+"이가 ");
		bark();
		bark();
		eat();
	}

}
