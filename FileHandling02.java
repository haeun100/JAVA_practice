import java.io.*;
public class FileHandling02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file=new File("Ewha_문자스트림.txt");
		try {
			if(!file.exists()) {
				System.out.println("파일 없음");
				System.exit(0);
			}
			
			System.out.println("Ewha_문자스트림.txt 파일에서 읽기를 시작합니다.");
			FileReader fis=new FileReader(file);
			BufferedReader br=new BufferedReader(fis);
			
			String str;
			while((str=br.readLine())!=null) {
				System.out.println(str);
			}
			fis.close();
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
