import java.util.Scanner;
public class Ch03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		int choice=1;
		while (choice==1) {
			int a;
			
			System.out.println("���ڸ� �Է��ϼ���: ");
			a=input.nextInt();
			
			if(a%2==0) {
				System.out.println("¦���Դϴ�.");
			}
			else {
				System.out.println("Ȧ���Դϴ�.");
			}
			System.out.println("����ϰ� �ʹٸ� �� 1, �׸��ϰ� �ʹٸ� �ƴϿ� 0�� �Է��ϼ���.");
		
			choice=input.nextInt();
		}
		System.out.println("��� ���ڸ� Ȯ���߽��ϴ�.");
		
		
		
	}

}