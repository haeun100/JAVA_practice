import java.util.Scanner;
public class Exception01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���: ");
		int num1=s.nextInt();
		
		try {
			int num2=10/num1;
			System.out.println(num2);
		}catch(Exception e) {
			System.out.println("�ùٸ� ���ڸ� �Է��ϼ���.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("try~catch ������ �ܺ� �����Դϴ�.");

	}

}