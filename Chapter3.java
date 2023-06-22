import java.util.Scanner;
public class Chapter3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		//#1
		System.out.print("당신의 이름을 입력하세요: ");
		String name=input.nextLine();
		System.out.println("당신의 이름: "+name);
		
		//#2
		System.out.println();
		System.out.print("정숫값 입력하기: ");
		int n=input.nextInt();
		System.out.print("실숫값 입력하기: ");
		double db=input.nextDouble();
		System.out.println("정숫값: "+n);
		System.out.println("실숫값: "+db);
		
		System.out.println();
		System.out.print("정수 1: ");
		int n1=input.nextInt();
		System.out.print("정수 2: ");
		int n2=input.nextInt();
		System.out.println(n1+"+"+n2+"="+(n1+n2));
		System.out.println(n1+"-"+n2+"="+(n1-n2));
		System.out.println(n1+"*"+n2+"="+(n1*n2));
		System.out.println(n1+"/"+n2+"="+(n1/n2));
		System.out.println(n1+"%"+n2+"="+(n1%n2));
		
		System.out.println();
		System.out.print("실수 1: ");
		double db1=input.nextDouble();
		System.out.print("실수 2: ");
		double db2=input.nextDouble();
		System.out.println(db1+"+"+db2+"="+(db1+db2));
		System.out.println(db1+"-"+db2+"="+(db1-db2));
		System.out.println(db1+"*"+db2+"="+(db1*db2));
		System.out.println(db1+"/"+db2+"="+(db1/db2));
		
		//#3
		System.out.println();
		System.out.print("학교: ");
		String sch=input.next();
		System.out.print("학과: ");
		String major=input.next();
		System.out.print("이름: ");
		String myName=input.next();
		System.out.println(sch+" "+major+" "+myName+"입니다.");

	}

}
