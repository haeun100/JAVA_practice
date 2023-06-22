import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
public class Example06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file=new File("example03.txt");
		
		try {
			if(!file.exists()) {
				System.out.println("���� ����");
				System.exit(0);
			}
			
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String str;
			while((str=br.readLine())!=null) {
				System.out.println(str);
			}
			fr.close();
			System.out.println("���� �б� ����");
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
