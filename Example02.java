import java.io.*;
public class Example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String str="Hello! Java Programming";
			
			File file=new File("example02");
			if(!file.exists())
				file.createNewFile();
			
			FileOutputStream fos=new FileOutputStream(file);
			
			byte[] b=str.getBytes();
			fos.write(b);
			fos.close();
			
			System.out.println("파일 쓰기 성공");
		}catch(Exception e) {
			e.getMessage();
		}
		
	}

}
