import java.util.Scanner;
public class Exception04 {
	static void check(int num) throws NumberFormatException{
		if(num<0)
			throw new NumberFormatException("0���� �۽��ϴ�.");
		else
			System.out.println(num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.");
		int num=input.nextInt();
		try {
			if(num>0)
				throw new NumberFormatException("0���� �۽��ϴ�.");
			else
				System.out.println(num);
			check(num);
		}catch(NumberFormatException e) {
			System.out.println("���� �߻�"+e);
		}

	}

}
