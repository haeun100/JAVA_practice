import java.io.*;
import java.util.Scanner;
public class ByteStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file=new File("Ewha_����Ʈ��Ʈ��.txt");
		
		try {
			if(!file.exists())
				file.createNewFile();
			
			FileOutputStream fos=new FileOutputStream(file);
			Scanner input=new Scanner(System.in);
			
			boolean quit=false;
			while(!quit) {
				System.out.print("�̸�: ");
				String name=input.next();
				String nameStr=name+"\n";
				byte[] b1=nameStr.getBytes();
				fos.write(b1);
				
				System.out.print("�й�: ");
				String number=input.next();
				String numberStr=number+"\n";
				byte[] b2=numberStr.getBytes();
				fos.write(b2);
				
				System.out.print("�̸���: ");
				String email=input.next();
				String emailStr=email+"\n";
				byte[] b3=emailStr.getBytes();
				fos.write(b3);
				
				System.out.print("��� ����? Y | N ");
				String yOrN=input.next();
				System.out.println();
				
				if(yOrN.toUpperCase().equals("N"))
					quit=true;
			}
			fos.close();
			System.out.println("Ewha_����Ʈ��Ʈ��.txt ���� ���Ⱑ �ϼ��Ǿ����ϴ�.");
		}catch(Exception e) {
			e.getMessage();
		}

	}

}
