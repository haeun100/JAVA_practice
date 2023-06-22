package ch07_3;

public class AccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog obj=new Dog("포메라니언","갈색",10);
		
		System.out.println(obj.breed+"인 "+obj.getName()+"는 "+obj.getAge()+"살 강아지로 "+obj.color+" 털을 가지고 있고");
		System.out.print(obj.getName()+"는 ");
		obj.sleep();
		obj.run();
		obj.bowwow();
	}

}
