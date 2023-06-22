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
		this("포메라니언");
	}
	Dog(String breed){
		this(breed, "갈색");
	}
	Dog(String breed, String color){
		this(breed, color, 10);
	}
	Dog(String breed, String color, int age){
		this(breed, color, age, "나무");
	}
	Dog(String breed, String color, int age, String name){
		this.breed=breed;
		this.color=color;
		this.age=age;
		this.name=name;
		System.out.println("강아지 품종: "+breed);
		System.out.println("강아지 색상: "+color);
		System.out.println("강아지 이름: "+name);
		System.out.println("강아지 나이: "+age);
	}
	
	public void bowwow() {
		System.out.println("멍멍 짖는다.");
	}
	public void run() {
		System.out.print("달리고 ");
	}
	public void sleep() {
		System.out.print("잠을 자고 ");
	}
	
}