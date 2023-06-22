import java.io.*;
import java.util.Scanner;
public class ByteStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file=new File("Ewha_바이트스트림.txt");
		
		try {
			if(!file.exists())
				file.createNewFile();
			
			FileOutputStream fos=new FileOutputStream(file);
			Scanner input=new Scanner(System.in);
			
			boolean quit=false;
			while(!quit) {
				System.out.print("이름: ");
				String name=input.next();
				String nameStr=name+"\n";
				byte[] b1=nameStr.getBytes();
				fos.write(b1);
				
				System.out.print("학번: ");
				String number=input.next();
				String numberStr=number+"\n";
				byte[] b2=numberStr.getBytes();
				fos.write(b2);
				
				System.out.print("이메일: ");
				String email=input.next();
				String emailStr=email+"\n";
				byte[] b3=emailStr.getBytes();
				fos.write(b3);
				
				System.out.print("계속 진행? Y | N ");
				String yOrN=input.next();
				System.out.println();
				
				if(yOrN.toUpperCase().equals("N"))
					quit=true;
			}
			fos.close();
			System.out.println("Ewha_바이트스트림.txt 파일 쓰기가 완성되었습니다.");
		}catch(Exception e) {
			e.getMessage();
		}

	}

}
