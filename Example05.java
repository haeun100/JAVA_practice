import java.io.File;
import java.io.FileReader;
public class Example05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file=new File("example03.txt");
		
		try {
			if(!file.exists()) {
				System.out.println("파일 없음");
				System.exit(0);
			}
			FileReader fr=new FileReader(file);
			int i=0;
			while((i=fr.read())!=-1) {
				System.out.print((char)i);
			}
			fr.close();
			System.out.println("파일 읽기 성공");
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
