import java.io.*;
import java.util.Scanner;
public class CharacterStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file=new File("Ewha_문자스트림.txt");
		
		try {
			if(!file.exists())
				file.createNewFile();
			
			FileWriter fw=new FileWriter(file);
			Scanner input=new Scanner(System.in);
			
			boolean quit=false;
			while(!quit) {
				System.out.print("이름: ");
				String userName=input.next();
				fw.write(userName+"\n");
				System.out.print("학번: ");
				String userNumber=input.next();
				fw.write(userNumber+"\n");
				System.out.print("이메일: ");
				String userEmail=input.next();
				fw.write(userEmail+"\n");
				
				System.out.print("계속 진행? Y | N ");
				String str=input.next();
				System.out.println();
				
				if(str.toUpperCase().equals("N"))
					quit=true;
			}
			fw.close();
			System.out.println("Ewha_문자스트림.txt 파일 쓰기가 완성되었습니다.");
		}catch(Exception e) {
			e.getMessage();
		}

	}

}
