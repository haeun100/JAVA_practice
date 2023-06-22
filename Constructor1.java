package ch07;

public class Constructor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stObj1=new Student();
		stObj1.insertRecord(20221004, "È«±æ¼ø");
		stObj1.printInfo();
		
		Student stObj2=new Student(20221005, "È«±æµ¿");
		stObj2.printInfo();

	}

}
