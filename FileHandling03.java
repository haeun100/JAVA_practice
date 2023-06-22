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
				System.out.print("아이디: ");
				String userID=input.next();
				fw.write("아이디: "+userID+"\n");
				
				System.out.print("이름: ");
				String userName=input.next();
				fw.write("이름: "+userName+"\n");
				
				System.out.print("계속 진행? Y | N ");
				String str=input.next();
				if(str.toUpperCase().equals("N"))
					quit=true;
			}
			fw.close();
			System.out.println("파일 쓰기 성공");
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
