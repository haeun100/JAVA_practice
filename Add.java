package ch07_2;

public class Add {
	//������ �޼��� 7�� ����. �޼��� �����ε�.
	Add(int a, int b){
		System.out.println("�Ϲ� ������ Add(int a, int b) ȣ��");
		System.out.println(a+"+"+b+"="+(a+b));
	}
	
	Add(double a, double b){
		System.out.println("�Ϲ� ������ Add(double a, double b) ȣ��");
		System.out.println(a+"+"+b+"="+(a+b));
	}
	
	Add(int a, double b){
		System.out.println("�Ϲ� ������ Add(int a, double b) ȣ��");
		System.out.println(a+"+"+b+"="+(a+b));
	}
	
	Add(int a, int b, int c){
		System.out.println("�Ϲ� ������ Add(int a, int b, int c) ȣ��");
		System.out.println(a+"+"+b+"+"+c+"="+(a+b+c));
	}
	
	Add(double a, double b, double c){
		System.out.println("�Ϲ� ������ Add(double a, double b, double c) ȣ��");
		System.out.println(a+"+"+b+"+"+c+"="+(a+b+c));
	}
	
	Add(double a, int b){
		System.out.println("�Ϲ� ������ Add(double a, int b) ȣ��");
		System.out.println(a+"+"+b+"="+(a+b));
	}
	
	Add(int a, double b, int c){
		System.out.println("�Ϲ� ������ Add(int a, double b, int c) ȣ��");
		System.out.println(a+"+"+b+"+"+c+"="+(a+b+c));
	}

}
