import java.util.Scanner;
public class Ch04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		boolean t=true;
		while(t) {
			int n1=(int)(Math.random()*100);
			int n2=(int)(Math.random()*100);
			System.out.print(n1+"+"+n2+"=");
			Scanner input=new Scanner(System.in);
			int result=input.nextInt();
			if((n1+n2)==result) {
				System.out.println("���߾��!!");
				System.out.println();
			}
			else {
				System.out.println("Ʋ�Ⱦ��. ������ ���������� ���� �� ����?");
				break;
			}
		}
		
	}

}
