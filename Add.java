package ch07_2;

public class Add {
	//생성자 메서드 7개 만듦. 메서드 오버로딩.
	Add(int a, int b){
		System.out.println("일반 생성자 Add(int a, int b) 호출");
		System.out.println(a+"+"+b+"="+(a+b));
	}
	
	Add(double a, double b){
		System.out.println("일반 생성자 Add(double a, double b) 호출");
		System.out.println(a+"+"+b+"="+(a+b));
	}
	
	Add(int a, double b){
		System.out.println("일반 생성자 Add(int a, double b) 호출");
		System.out.println(a+"+"+b+"="+(a+b));
	}
	
	Add(int a, int b, int c){
		System.out.println("일반 생성자 Add(int a, int b, int c) 호출");
		System.out.println(a+"+"+b+"+"+c+"="+(a+b+c));
	}
	
	Add(double a, double b, double c){
		System.out.println("일반 생성자 Add(double a, double b, double c) 호출");
		System.out.println(a+"+"+b+"+"+c+"="+(a+b+c));
	}
	
	Add(double a, int b){
		System.out.println("일반 생성자 Add(double a, int b) 호출");
		System.out.println(a+"+"+b+"="+(a+b));
	}
	
	Add(int a, double b, int c){
		System.out.println("일반 생성자 Add(int a, double b, int c) 호출");
		System.out.println(a+"+"+b+"+"+c+"="+(a+b+c));
	}

}
