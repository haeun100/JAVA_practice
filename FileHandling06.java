import java.io.*;
public class FileHandling06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file=new File("member.txt");
		
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
