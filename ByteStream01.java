import java.io.*;
import java.util.Scanner;
public class ByteStream01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		String name,number,email;
		String str1,str2,str3;
		System.out.print("�̸�: ");
		name=input.next();
		str1="�̸�: "+name+"\n";
		System.out.print("�й�: ");
		number=input.next();
		str2="�й�: "+number+"\n";
		System.out.print("�̸���: ");
		email=input.next();
		str3="�̸���: "+email;
		
		try {
			File file=new File("Ewha.txt");
			if(!file.exists())
				file.createNewFile();
			
			FileOutputStream fos=new FileOutputStream(file);
			
			byte[] b1=str1.getBytes();
			byte[] b2=str2.getBytes();
			byte[] b3=str3.getBytes();
			fos.write(b1);
			fos.write(b2);
			fos.write(b3);
			
			fos.close();
			System.out.println("Ewha.txt ���� ���Ⱑ �ϼ��Ǿ����ϴ�.");
		}catch(Exception e) {
			e.getMessage();
		}

	}

}
