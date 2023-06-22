package ch07_3;

public class Dog {
	
	public String breed;
	public String color;
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	Dog(){
		this("���޶�Ͼ�");
	}
	Dog(String breed){
		this(breed, "����");
	}
	Dog(String breed, String color){
		this(breed, color, 10);
	}
	Dog(String breed, String color, int age){
		this(breed, color, age, "����");
	}
	Dog(String breed, String color, int age, String name){
		this.breed=breed;
		this.color=color;
		this.age=age;
		this.name=name;
		System.out.println("������ ǰ��: "+breed);
		System.out.println("������ ����: "+color);
		System.out.println("������ �̸�: "+name);
		System.out.println("������ ����: "+age);
	}
	
	public void bowwow() {
		System.out.println("�۸� ¢�´�.");
	}
	public void run() {
		System.out.print("�޸��� ");
	}
	public void sleep() {
		System.out.print("���� �ڰ� ");
	}
	
}