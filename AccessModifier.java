package ch07_3;

public class AccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog obj=new Dog("���޶�Ͼ�","����",10);
		
		System.out.println(obj.breed+"�� "+obj.getName()+"�� "+obj.getAge()+"�� �������� "+obj.color+" ���� ������ �ְ�");
		System.out.print(obj.getName()+"�� ");
		obj.sleep();
		obj.run();
		obj.bowwow();
	}

}
