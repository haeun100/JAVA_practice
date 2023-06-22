import java.io.*;
public class FileHandling04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file=new File("gugudan.txt");
		
		try {
			if(!file.exists()) {
				System.out.println("파일 없음");
				System.exit(0);
			}
			
			FileInputStream fis=new FileInputStream(file);
			int i=0;
			while((i=fis.read())!=-1) {
				System.out.print((char)i);
			}
			fis.close();
			System.out.println("파일 읽기 성공");
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
