package ch07;

public class Example03 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat cat1=new Cat();
		Cat cat2=new Cat("샴");
		Cat cat3=new Cat("러시안블루", "회색");
		
		System.out.println("첫 번째 고양이 품종: "+cat1.breed);
		System.out.println("두 번째 고양이 품종: "+cat2.breed);
		System.out.println("세 번째 고양이 품종: "+cat3.breed);
	}

}
