import java.io.*;
import java.util.Scanner;
public class CharacterStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file=new File("Ewha_���ڽ�Ʈ��.txt");
		
		try {
			if(!file.exists())
				file.createNewFile();
			
			FileWriter fw=new FileWriter(file);
			Scanner input=new Scanner(System.in);
			
			boolean quit=false;
			while(!quit) {
				System.out.print("�̸�: ");
				String userName=input.next();
				fw.write(userName+"\n");
				System.out.print("�й�: ");
				String userNumber=input.next();
				fw.write(userNumber+"\n");
				System.out.print("�̸���: ");
				String userEmail=input.next();
				fw.write(userEmail+"\n");
				
				System.out.print("��� ����? Y | N ");
				String str=input.next();
				System.out.println();
				
				if(str.toUpperCase().equals("N"))
					quit=true;
			}
			fw.close();
			System.out.println("Ewha_���ڽ�Ʈ��.txt ���� ���Ⱑ �ϼ��Ǿ����ϴ�.");
		}catch(Exception e) {
			e.getMessage();
		}

	}

}
