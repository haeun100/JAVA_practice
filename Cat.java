package ch07;

public class Cat{
	
	String breed;
	String color;
	
	Cat(){
		System.out.println("Cat() ������ ȣ���մϴ�.");
	}
	
	Cat(String pBreed){
		System.out.println("Cat(...) ������ ȣ���մϴ�.");
		breed=pBreed;
	}
	
	Cat(String pBreed, String pColor){
		System.out.println("Cat(..., ...) ������ ȣ���մϴ�.");
		breed=pBreed;
		color=pColor;
	}
	
	void eat() {
		System.out.println("���̸� �Դ�.");
	}
	void meow() {
		System.out.println("�߿��ϰ� ���.");
	}
	void scratch() {
		System.out.println("�������� ������.");
	}
}
