import java.util.Scanner;
public class Chapter3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		//#1
		System.out.print("����� �̸��� �Է��ϼ���: ");
		String name=input.nextLine();
		System.out.println("����� �̸�: "+name);
		
		//#2
		System.out.println();
		System.out.print("������ �Է��ϱ�: ");
		int n=input.nextInt();
		System.out.print("�Ǽ��� �Է��ϱ�: ");
		double db=input.nextDouble();
		System.out.println("������: "+n);
		System.out.println("�Ǽ���: "+db);
		
		System.out.println();
		System.out.print("���� 1: ");
		int n1=input.nextInt();
		System.out.print("���� 2: ");
		int n2=input.nextInt();
		System.out.println(n1+"+"+n2+"="+(n1+n2));
		System.out.println(n1+"-"+n2+"="+(n1-n2));
		System.out.println(n1+"*"+n2+"="+(n1*n2));
		System.out.println(n1+"/"+n2+"="+(n1/n2));
		System.out.println(n1+"%"+n2+"="+(n1%n2));
		
		System.out.println();
		System.out.print("�Ǽ� 1: ");
		double db1=input.nextDouble();
		System.out.print("�Ǽ� 2: ");
		double db2=input.nextDouble();
		System.out.println(db1+"+"+db2+"="+(db1+db2));
		System.out.println(db1+"-"+db2+"="+(db1-db2));
		System.out.println(db1+"*"+db2+"="+(db1*db2));
		System.out.println(db1+"/"+db2+"="+(db1/db2));
		
		//#3
		System.out.println();
		System.out.print("�б�: ");
		String sch=input.next();
		System.out.print("�а�: ");
		String major=input.next();
		System.out.print("�̸�: ");
		String myName=input.next();
		System.out.println(sch+" "+major+" "+myName+"�Դϴ�.");

	}

}
