import java.io.*;
public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File fileObj=new File("example01.txt");
		try {
			boolean success=fileObj.createNewFile();
			if(success) {
				System.out.println("���� ���� ����");
			}
			else {
				System.out.println("���� ���� ����");
			}
		}catch(IOException e) {
			System.out.println(e);
		}
		
	}

}
