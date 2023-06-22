import java.io.*;
import java.util.Scanner;
public class FileHandling03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file=new File("member.txt");
		
		try {
			if(file.exists())
				file.createNewFile();
			
			FileWriter fw=new FileWriter(file);
			Scanner input=new Scanner(System.in);
			
			boolean quit=false;
			while(!quit) {
				System.out.print("���̵�: ");
				String userID=input.next();
				fw.write("���̵�: "+userID+"\n");
				
				System.out.print("�̸�: ");
				String userName=input.next();
				fw.write("�̸�: "+userName+"\n");
				
				System.out.print("��� ����? Y | N ");
				String str=input.next();
				if(str.toUpperCase().equals("N"))
					quit=true;
			}
			fw.close();
			System.out.println("���� ���� ����");
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
