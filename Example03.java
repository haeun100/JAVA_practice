package ch07;

public class Example03 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat cat1=new Cat();
		Cat cat2=new Cat("��");
		Cat cat3=new Cat("���þȺ��", "ȸ��");
		
		System.out.println("ù ��° ����� ǰ��: "+cat1.breed);
		System.out.println("�� ��° ����� ǰ��: "+cat2.breed);
		System.out.println("�� ��° ����� ǰ��: "+cat3.breed);
	}

}
