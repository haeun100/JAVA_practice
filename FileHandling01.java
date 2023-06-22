import java.io.*;
public class FileHandling01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file=new File("Ewha_바이트스트림.txt");
		try {
			if(!file.exists()) {
				System.out.println("파일 없음");
				System.exit(0);
			}
			
			FileInputStream fis=new FileInputStream(file);
			System.out.println("Ewha_바이트스트림.txt 파일에서 읽기를 시작합니다.");
			int i=0;
			while((i=fis.read())!=-1) {
				System.out.print((char)i);
			}
			fis.close();
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
