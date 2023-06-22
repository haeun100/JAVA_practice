package ch09_2;

import java.util.Scanner;
public class Bird implements Fly{

	Bird(){
		System.out.print("Bird 종류: ");
		Scanner input=new Scanner(System.in);
		String name=input.next();
		fly(name);
		eat(name);
	}
	
	public void fly(String name) {
		System.out.println(name+"는 하늘을 난다.");
	}
	
	public void eat(String name) {
		System.out.println(name+"는 먹이를 먹는다.");
	}
}
